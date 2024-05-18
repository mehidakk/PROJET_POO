package app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


 public class Immobilier {
    private int id;
    private String description;
    private String localisation;
    private float surface;
    private int prix;
    private Client owner;
    private boolean deleted;

    private static int nb = 0;
    protected static ArrayList<Immobilier> imob_list = new ArrayList<>();

    public Immobilier(String description, String localisation, float surface, int prix, Client owner) throws Exception{
    	
        this.id = nb++;
        this.description = description;
        this.localisation = localisation;
        this.surface = surface;
        this.prix = prix;
        this.owner = owner;
        this.deleted = false;
    	
    		
    	
    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }


    static void add_immobilier() throws Exception{}

    static void remove_immobilier(int id) throws myException{
        Immobilier imob = Immobilier.search_by_id(id);
        try {
            imob.deleted = true;
        } catch (Exception e) {
            throw new myException("Immobilier introuvable");
        }
    }

    static boolean modify(int id, String description, String localisation, String surface, String prix, String owner_id) throws Exception{
        Immobilier imob = Immobilier.search_by_id(id);

        if(imob!=null){
            if(!owner_id.equals("")){
                Client new_owner = Client.search_by_id(Integer.parseInt(owner_id));
                if(new_owner!=null && new_owner instanceof Owner){
                    Owner old_owner = (Owner) imob.owner;
                    old_owner.owned_imob.remove(imob);
                    imob.owner = new_owner;
                    ((Owner)new_owner).owned_imob.add(imob);
                }else{
                    System.err.println("user is a Buyer or doesnt exist");
                    return false;
                }
            } 
            if(!description.equals("")){
                imob.description = description;
            }
            if(!localisation.equals("")){
                imob.localisation = localisation;
            }
            if(!surface.equals("")){
                imob.surface = Float.parseFloat(surface);
            }
            if(!prix.equals("")){
                imob.prix = Integer.parseInt(prix);
            }
            return true;
        }else{
            return false;
        }
    }


    static Immobilier search_by_id(int id){
        for(int i=0;i<imob_list.size();i++){
            if(imob_list.get(i).id==id){
                return imob_list.get(i);
            }
        }
        System.err.println("imob doesnt exist");
        return null;
    }

    static Object[][] search_by_ID(int id) throws Exception{
        ArrayList<Immobilier> res_list = new ArrayList<>();
        for(int i=0;i<imob_list.size();i++){
            if(id==imob_list.get(i).id){
                if(imob_list.get(id).deleted){
                    return null;
                }
                res_list.add(imob_list.get(i));
            }
        }
        Object[][] res = new Object[res_list.size()][5];
        for (int i = 0; i < res_list.size(); i++) {
            Immobilier imob = res_list.get(i); // Update imob inside the loop to access different elements
            
            res[i][0] = imob.id;
            res[i][1] = imob.localisation;
            res[i][2] = imob.prix;
            res[i][3] = imob.getOwner().getId();
            if(imob instanceof Appartement) {
            	res[i][4]="Appartement";
            }else if(imob instanceof Maison) {
            	res[i][4]="Maison";
            }else if(imob instanceof Magasin) {
            	res[i][4]="Magasin";
            }else if(imob instanceof Terain) {
            	res[i][4]="Terain";
            }else if(imob instanceof Autre){
            	res[i][4]="Autre";
            }else{
            	res[i][4]="undifined";
            }
        }
        return res;
    }

    

    static Object[][] search_by_price(int min, int max) throws Exception{
        ArrayList<Immobilier> res_list = new ArrayList<>();
        for (int i = 0; i < imob_list.size(); i++) {
            if (imob_list.get(i).prix <= max && imob_list.get(i).prix >= min && !imob_list.get(i).deleted) {
                res_list.add(imob_list.get(i));
            }
        }

        Object[][] res = new Object[res_list.size()][5]; // Initialize inner arrays with fixed length
        
        for (int i = 0; i < res_list.size(); i++) {
            Immobilier imob = res_list.get(i); // Update imob inside the loop to access different elements
            
            res[i][0] = imob.id;
            res[i][1] = imob.localisation;
            res[i][2] = imob.prix;
             res[i][3] = imob_list.get(i).getOwner().getId();
            if(imob instanceof Appartement) {
            	res[i][4]="Appartement";
            }else if(imob instanceof Maison) {
            	res[i][4]="Maison";
            }else if(imob instanceof Magasin) {
            	res[i][4]="Magasin";
            }else if(imob instanceof Terain) {
            	res[i][4]="Terain";
            }else if(imob instanceof Autre){
            	res[i][4]="Autre";
            }else{
            	res[i][4]="undifined";
            }
        }
        return res;
    }


    static Object[][] search_by_location(String location) throws Exception{
        ArrayList<Immobilier> res_list = new ArrayList<>();
        for(int i=0;i<imob_list.size();i++){
            if(location.equals(imob_list.get(i).localisation) && !imob_list.get(i).deleted){
                res_list.add(imob_list.get(i));
            }
        }
        Object[][] res = new Object[res_list.size()][5];
        for (int i = 0; i < res_list.size(); i++) {
            Immobilier imob = res_list.get(i); // Update imob inside the loop to access different elements
            
            res[i][0] = imob.id;
            res[i][1] = imob.localisation;
            res[i][2] = imob.prix;
             res[i][3] = imob_list.get(i).getOwner().getId();
            if(imob instanceof Appartement) {
            	res[i][4]="Appartement";
            }else if(imob instanceof Maison) {
            	res[i][4]="Maison";
            }else if(imob instanceof Magasin) {
            	res[i][4]="Magasin";
            }else if(imob instanceof Terain) {
            	res[i][4]="Terain";
            }else if(imob instanceof Autre){
            	res[i][4]="Autre";
            }else{
            	res[i][4]="undifined";
            }
        }
        return res;
    }
    
    
    static Object[][] search_by_surface(int min, int max) throws Exception{
        ArrayList<Immobilier> res_list = new ArrayList<>();
        for(int i=0;i<imob_list.size();i++){
            if(imob_list.get(i).surface<=max && imob_list.get(i).surface>=min && !imob_list.get(i).deleted){
                res_list.add(imob_list.get(i));
            }
        }
        Object[][] res = new Object[res_list.size()][5];
        for (int i = 0; i < res_list.size(); i++) {
            Immobilier imob = res_list.get(i); // Update imob inside the loop to access different elements
            
            res[i][0] = imob.id;
            res[i][1] = imob.localisation;
            res[i][2] = imob.prix;
             res[i][3] = imob_list.get(i).getOwner().getId();
            if(imob instanceof Appartement) {
            	res[i][4]="Appartement";
            }else if(imob instanceof Maison) {
            	res[i][4]="Maison";
            }else if(imob instanceof Magasin) {
            	res[i][4]="Magasin";
            }else if(imob instanceof Terain) {
            	res[i][4]="Terain";
            }else if(imob instanceof Autre){
            	res[i][4]="Autre";
            }else{
            	res[i][4]="undifined";
            }
        }
        return res;
    }


    static Object[][] search_all() throws Exception{

        ArrayList<Immobilier> res_list = new ArrayList<>();
        for (int i = 0; i < imob_list.size(); i++) {
            if(!imob_list.get(i).deleted){
                res_list.add(imob_list.get(i));
            }
        }

        Object[][] res = new Object[res_list.size()][5];
        for (int i = 0; i < res_list.size(); i++) {
            Immobilier imob = res_list.get(i); // Update imob inside the loop to access different elements
            
            res[i][0] = imob.id;
            res[i][1] = imob.localisation;
            res[i][2] = imob.prix;
             res[i][3] = imob_list.get(i).getOwner().getId();
            if(imob instanceof Appartement) {
            	res[i][4]="Appartement";
            }else if(imob instanceof Maison) {
            	res[i][4]="Maison";
            }else if(imob instanceof Magasin) {
            	res[i][4]="Magasin";
            }else if(imob instanceof Terain) {
            	res[i][4]="Terain";
            }else if(imob instanceof Autre){
            	res[i][4]="Autre";
            }else{
            	res[i][4]="undifined";
            }
        }
        return res;
    }
  

}




 class Appartement extends Immobilier {
    private int nombre_chambre;
    private boolean meuble;
    public Appartement(String description, String localisation, float surface, int prix, Client owner, int nombre_chambre, boolean meuble) throws Exception{
        super(description, localisation, surface, prix, owner);
        this.nombre_chambre = nombre_chambre;
        this.meuble = meuble;
    }


    public int getNombre_chambre() {
        return nombre_chambre;
    }
    public void setNombre_chambre(int nombre_chambre) {
        this.nombre_chambre = nombre_chambre;
    }
    public boolean isMeuble() {
        return meuble;
    }
    public void setMeuble(boolean meuble) {
        this.meuble = meuble;
    }








    static void add_immobilier(String description, String localisation, float surface, int prix, int owner_id, int nombre_chambre, boolean meuble) throws Exception{
        Client oner = Client.search_by_id(owner_id);
        if(oner instanceof Owner){
            Appartement imob = new Appartement(description, localisation, surface, prix, Client.search_by_id(owner_id), nombre_chambre, meuble);
            ((Owner)oner).owned_imob.add(imob);
            Immobilier.imob_list.add(imob);
        }else{
            System.err.println("adding imob to a buyer");
        }
    };



    static boolean modify(int id, String description, String localisation, String surface, String prix, String owner_id, String nombre_chambre, String meuble) throws Exception{
        if(Immobilier.modify(id, description, localisation, surface, prix, owner_id)){
            Appartement imob = (Appartement) Immobilier.search_by_id(id);
    
            if(!nombre_chambre.equals("")){
                imob.nombre_chambre = Integer.parseInt(nombre_chambre);
            }
            if(!meuble.equals("")){
                imob.meuble = Boolean.parseBoolean(meuble);
            }
            return true;
        }else{
            return false;
        }

    }


}

 class Maison extends Immobilier{
    private int nombre_chambre;
    private int nombre_etage;
    private boolean garage;
    private boolean jardin;
    private boolean picine;
    
    public Maison(String description, String localisation, float surface, int prix, Client owner, int nombre_chambre, int nombre_etage, boolean garage, boolean jardin, boolean picine) throws Exception{
        super(description, localisation, surface, prix, owner);
        this.nombre_chambre = nombre_chambre;
        this.nombre_etage = nombre_etage;
        this.garage = garage;
        this.jardin = jardin;
        this.picine = picine;
    }

    public int getNombre_chambre() throws Exception{
        return nombre_chambre;
    }

    public void setNombre_chambre(int nombre_chambre) throws Exception{
        this.nombre_chambre = nombre_chambre;
    }

    public int getNombre_etage() throws Exception{
        return nombre_etage;
    }

    public void setNombre_etage(int nombre_etage) throws Exception{
        this.nombre_etage = nombre_etage;
    }

    public boolean isGarage() throws Exception{
        return garage;
    }

    public void setGarage(boolean garage) throws Exception{
        this.garage = garage;
    }

    public boolean isJardin() throws Exception{
        return jardin;
    }

    public void setJardin(boolean jardin) throws Exception{
        this.jardin = jardin;
    }

    public boolean isPicine() throws Exception{
        return picine;
    }

    public void setPicine(boolean picine) {
        this.picine = picine;
    }

    static void add_immobilier(String description, String localisation, float surface, int prix, int owner_id, int nombre_chambre, int nombre_etage, boolean garage, boolean jardin, boolean picine) throws Exception{
        Client oner = Client.search_by_id(owner_id);
        if(oner instanceof Owner){
            Maison imob = new Maison(description, localisation, surface, prix, Client.search_by_id(owner_id), nombre_chambre, nombre_etage, garage, jardin, picine);
            ((Owner)oner).owned_imob.add(imob);
            Immobilier.imob_list.add(imob);
        }else{
            System.err.println("adding imob to a buyer");
        }
    };


    static boolean modify(int id, String description, String localisation, String surface, String prix, String owner_id, String nombre_chambre, String nombre_etage, String garage, String jardin, String picine) throws Exception{
        if(Immobilier.modify(id, description, localisation, surface, prix, owner_id)){
            Maison imob = (Maison) Immobilier.search_by_id(id);
            if(!nombre_chambre.equals("")){
                imob.nombre_chambre = Integer.parseInt(nombre_chambre);
            }
            if(!nombre_etage.equals("")){
                imob.nombre_etage = Integer.parseInt(nombre_etage);
            }
            if(!garage.equals("")){
                imob.garage = Boolean.parseBoolean(garage);
            }
            if(!jardin.equals("")){
                imob.jardin = Boolean.parseBoolean(jardin);
            }
            if(!picine.equals("")){
                imob.picine = Boolean.parseBoolean(picine);
            }
           

            return true;
        }else{
            return false;
        }

    }

    
    
}



 class Magasin extends Immobilier{
    public Magasin(String description, String localisation, float surface, int prix, Client owner) throws Exception{
        super(description, localisation, surface, prix, owner);
    }


    static void add_immobilier(String description, String localisation, float surface, int prix, int owner_id) throws Exception{
        Client oner = Client.search_by_id(owner_id);
        if(oner instanceof Owner){
            Magasin imob = new Magasin(description, localisation, surface, prix, Client.search_by_id(owner_id));
            ((Owner)oner).owned_imob.add(imob);
            Immobilier.imob_list.add(imob);
        }else{
            System.err.println("adding imob to a buyer");
        }

    };

    static boolean modify(int id, String description, String localisation, String surface, String prix, String owner_id) throws Exception{
        return Immobilier.modify(id, description, localisation, surface, prix, owner_id);
    }
}



 class Terain extends Immobilier{
    public Terain(String description, String localisation, float surface, int prix, Client owner) throws Exception{
        super(description, localisation, surface, prix, owner);
    }
    
    static void add_immobilier(String description, String localisation, float surface, int prix, int owner_id) throws Exception{
        Client oner = Client.search_by_id(owner_id);
        if(oner instanceof Owner){
            Terain imob = new Terain(description, localisation, surface, prix, Client.search_by_id(owner_id));
            ((Owner)oner).owned_imob.add(imob);
            Immobilier.imob_list.add(imob);
        }else{
            System.err.println("adding imob to a buyer");
        }
    }

    static boolean modify(int id, String description, String localisation, String surface, String prix, String owner_id) throws Exception{
        return Immobilier.modify(id, description, localisation, surface, prix, owner_id);
    }
}



 class Autre extends Immobilier{
    String plus_detail;


    public Autre(String description, String localisation, float surface, int prix, Client owner, String plus_detail) throws Exception{
        super(description, localisation, surface, prix, owner);
        this.plus_detail = plus_detail;
    }


    public String getPlus_detail() {
        return plus_detail;
    }

    public void setPlus_detail(String plus_detail) {
        this.plus_detail = plus_detail;
    }


    static void add_immobilier(String description, String localisation, float surface, int prix, int owner_id, String plus_detail) throws Exception{
        Client oner = Client.search_by_id(owner_id);
        if(oner instanceof Owner){
            Autre imob = new Autre(description, localisation, surface, prix, Client.search_by_id(owner_id), localisation);
            ((Owner)oner).owned_imob.add(imob);
            Immobilier.imob_list.add(imob);
        }else{
            System.err.println("adding imob to a buyer");
        }
    }

    static boolean modify(int id, String description, String localisation, String surface, String prix, String owner_id, String plus_detail) throws Exception{
        if(Immobilier.modify(id, description, localisation, surface, prix, owner_id)){
            Autre imob = (Autre) Immobilier.search_by_id(id);
            if(!plus_detail.equals("")){
                imob.plus_detail = plus_detail;
            }

            return true;
        }else{
            return false;
        }

    }
    
}












 class Client {
    private int id;
    private String nom;
    private String prenom;
    private String num_tlfn;
    private boolean deleted;
    
    private static int nb = 0;
    protected static ArrayList<Client> client_list = new ArrayList<>();






    public Client(String nom, String prenom, String num_tlfn) throws Exception{
        this.id = nb++;
        this.nom = nom;
        this.prenom = prenom;
        this.num_tlfn = num_tlfn;
        this.deleted = false;
    }

    public int getId() throws Exception{
        return id;
    }

    public String getNom() throws Exception{
        return nom;
    }

    public void setNom(String nom) throws Exception{
        this.nom = nom;
    }

    public String getPrenom() throws Exception{
        return prenom;
    }

    public void setPrenom(String prenom) throws Exception{
        this.prenom = prenom;
    }

    public String getNum_tlfn() throws Exception{
        return num_tlfn;
    }

    public void setNum_tlfn(String num_tlfn) throws Exception{
        this.num_tlfn = num_tlfn;
    }





    static void add_client(){};

    static boolean remove_client(int id) throws Exception{
        for(int i=0;i<client_list.size();i++){
            if(client_list.get(i).id==id){
                client_list.get(i).deleted = true;
                if(client_list.get(i) instanceof Owner){
                    Owner own = (Owner) client_list.get(i);
                    for(i=0;i<own.owned_imob.size();i++){
                        Immobilier.remove_immobilier(own.owned_imob.get(i).getId());;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static Client search_by_id(int id) throws Exception{
        for(int i=0;i<client_list.size();i++){
            if(client_list.get(i).getId()==id){
                return client_list.get(i);
            }
        }
        System.err.println("client doesnt exist");
        return null;
    }

    static Object[][] search_by_ID(int id) throws Exception{
        for(int i=0;i<client_list.size();i++){
            if(client_list.get(i).getId()==id){
                if(client_list.get(i).deleted){
                    return null;
                }
                Object[][] res = new Object[1][5];
                Client cl = client_list.get(i);
                res[0][0] = cl.id;
                res[0][1] = cl.nom;
                res[0][2] = cl.prenom;
                res[0][3] = cl.num_tlfn;
                if(cl instanceof Buyer) {
                    res[i][4]="Buyer";
                }else if(cl instanceof Owner) {
                    res[i][4]="Owner";
                }else{
                    res[i][4]="undifined";
                }
                return res;
            }
        }
        return null;
    }

    static Object[][] search_by_name(String nom, String prenom) throws Exception{
        ArrayList<Client> res_list = new ArrayList<>();
        for(int i=0;i<client_list.size();i++){
            if(client_list.get(i).getNom()==nom && client_list.get(i).getPrenom()==prenom && !client_list.get(i).deleted){
                res_list.add(client_list.get(i));
            }
        }
        Object[][] res = new Object[res_list.size()][5];
        for (int i = 0; i < res_list.size(); i++) {
            Client cl = res_list.get(i);
            
            res[i][0] = cl.id;
            res[i][1] = cl.nom;
            res[i][3] = cl.prenom;
            res[i][4] = cl.num_tlfn;
            if(cl instanceof Buyer) {
            	res[i][4]="Buyer";
            }else if(cl instanceof Owner) {
            	res[i][4]="Owner";
            }else{
            	res[i][4]="undifined";
            }
        }
        return res;
    }

    static Object[][] search_all() throws Exception{

        ArrayList<Client> res_list = new ArrayList<>();
        for (int i = 0; i < client_list.size(); i++) {
            if(!client_list.get(i).deleted){
                res_list.add(client_list.get(i));
            }
        }

        Object[][] res = new Object[res_list.size()][5];
        for (int i = 0; i < res_list.size(); i++) {
            Client cl = res_list.get(i);
            res[i][0] = cl.id;
            res[i][1] = cl.nom;
            res[i][2] = cl.prenom;
            res[i][3] = cl.num_tlfn;
            if(cl instanceof Buyer) {
                res[i][4]="Buyer";
            }else if(cl instanceof Owner) {
                res[i][4]="Owner";
            }else{
                res[i][4]="undifined";
            }
        }
        return res;
    }


    static boolean modify(int id, String nom, String prenom, String num_tlfn) throws Exception{
        Client imob = Client.search_by_id(id);

        if(imob!=null){
            if(!nom.equals("")){
            imob.nom = nom;
            }
            if(!prenom.equals("")){
                imob.prenom = prenom;
            }
            if(!num_tlfn.equals("")){
                imob.num_tlfn = num_tlfn;
            }
            return true;
        }else{
            return false;
        }
    }

    
    

}

 class Buyer extends Client{

    private String dem_typ_imob;
    private int dem_prix_max;
    private int dem_prix_min;
    private int dem_surface_max;
    private int dem_surface_min;




    public Buyer(String nom, String prenom, String num_tlfn) throws Exception{
        super(nom, prenom, num_tlfn);
        this.dem_typ_imob = "undifined";
        this.dem_prix_max = 1000000;
        this.dem_prix_min = 0;
        this.dem_surface_max = 1000000;
        this.dem_surface_min = 0;
    }




    static void add_client(String nom, String prenom, String num_tlfn) throws Exception{
    	
        Client.client_list.add(new Buyer(nom, prenom, num_tlfn));
    };


      static void set_demand(int id, String dem_typ_imob, String dem_prix_max, String dem_prix_min,  String dem_surface_max, String dem_surface_min) throws Exception{
          
        	  Client c;
        	  c=Client.search_by_id(id);
        	  if(c instanceof Buyer) {
              ((Buyer)c).dem_typ_imob = dem_typ_imob;
              ((Buyer)c).dem_prix_max = Integer.parseInt(dem_prix_max);
              ((Buyer)c).dem_prix_min = Integer.parseInt(dem_prix_min);
              ((Buyer)c).dem_surface_max = Integer.parseInt(dem_surface_max);
              ((Buyer)c).dem_surface_min = Integer.parseInt(dem_surface_min);}
        	  else {
        		  throw new myException("Un Proprietere ne peut pas avoir une demande");
        	  }
          
          
      }









    public String getDem_typ_imob() throws Exception{
        return dem_typ_imob;
    }


    public int getDem_prix_max() throws Exception{
        return dem_prix_max;
    }


    public int getDem_prix_min() throws Exception{
        return dem_prix_min;
    }


    public int getDem_surface_max() throws Exception{
        return dem_surface_max;
    }


    public int getDem_surface_min() throws Exception{
        return dem_surface_min;
    }

    

}


 class Owner extends Client{
    protected ArrayList<Immobilier> owned_imob;

    public Owner(String nom, String prenom, String num_tlfn) throws Exception{
        super(nom, prenom, num_tlfn);
        owned_imob = new ArrayList<>();
    }







    public void add_imob(Immobilier imobi) throws Exception{
        owned_imob.add(imobi);
    }
    
    static void add_client(String nom, String prenom, String num_tlfn) throws Exception{
    	
        Client.client_list.add(new Owner(nom, prenom, num_tlfn));
    };


    

    
}




















 class Transaction {
    private int id;
    private LocalDate date;
    private Immobilier imob;
    private Buyer receiver;
    private String vent; //kria wla bi3a
    private LocalDate date_fin; //cas ta3 kria
    


    private static int nb = 0;
    protected static ArrayList<Transaction> tran_list = new ArrayList<>();




    public Transaction(LocalDate date, Immobilier imob, Buyer receiver, String vent, LocalDate date_fin) throws Exception{
        this.id = nb++;
        this.date = date;
        this.imob = imob;
        this.receiver = receiver;
        this.vent = vent;
        this.date_fin = date_fin;
    }





    public LocalDate getDate() throws Exception{
        return date;
    }




    public void setDate(LocalDate date) throws Exception{
        this.date = date;
    }

    public Immobilier getImob() {
        return imob;
    }

    public void setImob(Immobilier imob) throws Exception{
        this.imob = imob;
    }

    public Buyer getReceiver() throws Exception{
        return receiver;
    }

    public void setReceiver(Buyer receiver) throws Exception{
        this.receiver = receiver;
    }


    public LocalDate getDate_fin() throws Exception{
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) throws Exception{
        this.date_fin = date_fin;
    }








    static void add_transaction(LocalDate date, String imo, String receiver, String vent, LocalDate date_fin) throws Exception{
        if(!vent.equals("Vent") && !vent.equals("Location")){
            System.err.println("wrong value for vent in Transaction but objuct is added");
        }

        Immobilier imob = Immobilier.search_by_id(Integer.parseInt(imo));
        Client byr = Client.search_by_id(Integer.parseInt(receiver));
        if(!(byr instanceof Buyer)){throw new myException("reciver is not a buyer");}
        tran_list.add(new Transaction(date, imob, (Buyer) byr, vent, date_fin));
        Immobilier.remove_immobilier(imob.getId());
    };


    static void remove_transaction(int id) throws Exception{
        tran_list.remove(Transaction.search_by_id(id));
    };


    static Transaction search_by_id(int id) throws Exception{
        for(int i=0;i<tran_list.size();i++){
            if(tran_list.get(i).id==id){
                return tran_list.get(i);
            }
        }
        throw new myException("transaction doesnt exist");
    }

    static Object[][] search_by_ID(int id) throws Exception{
        Transaction tran = search_by_id(id);
        Object[][] obj = new Object[1][6];
        try {
            obj[0][0] = tran.id;
            obj[0][1] = tran.date;
            obj[0][2] = tran.imob.getId();
            obj[0][3] = tran.receiver.getId();
            if((tran.vent).equals("vente")){
                obj[0][5] = "vente";
            }else{
                obj[0][4] =  tran.date_fin;
                obj[0][5] = "Location";
            }
        } catch (Exception e) {
            throw new myException("transaction doesnt exist");
        }


        return obj;
    }

    static Object[][] search_all() throws Exception{
        Object[][] res = new Object[tran_list.size()][6];
        for (int i = 0; i < tran_list.size(); i++) {
            Transaction tran = tran_list.get(i); // Update imob inside the loop to access different elements
            
            res[i][0] = tran.id;
            res[i][1] = tran.date;
            res[i][2] = tran.imob.getId();
            res[i][3] = tran.receiver.getId();
            if((tran.vent).equals("vente")){
                res[i][5] = "vente";
            }else{
                res[i][4] =  tran.date_fin;
                res[i][5] = "Location";
            }

       
        }
        return res;
    }

    
    static Object[][] historique_de_client(int id) throws Exception{
        ArrayList<Transaction> tr_list = new ArrayList<>();
        for(int i=0;i<tran_list.size();i++){
            if(tran_list.get(i).getReceiver().getId()==id){
                tr_list.add(tran_list.get(i));
            }
        }
        Object[][] res = new Object[tr_list.size()][6];
        for (int i = 0; i < tr_list.size(); i++) {
            Transaction tran = tr_list.get(i);
            res[i][0] = tran.id;
            res[i][1] = tran.date;
            res[i][2] = tran.imob.getId();
            res[i][3] = tran.receiver.getId();
            if((tran.vent).equals("vente")){
            	res[i][5] = "vente";
            }else{
                res[i][4] =  tran.date_fin;
                res[i][5] = "Location";
            }
        }

        return res;
    }


    
}






 class Render_vous{
    private int id;
    private Buyer receiver;
    private Immobilier imob;
    private LocalDate date;
    private static int nb = 0;

    protected static ArrayList<Render_vous> rv_list = new ArrayList<>();
    
    
    public Render_vous(Buyer receiver, Immobilier imob, LocalDate date) throws Exception{
        this.id = nb++;
        this.receiver = receiver;
        this.imob = imob;
        this.date = date;
    }


    static void add_rv(String receiver, String imob, String date) throws Exception{
        try {
            Buyer byr = (Buyer) Client.search_by_id(Integer.parseInt(receiver));
            Immobilier imo = Immobilier.search_by_id(Integer.parseInt(imob));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            rv_list.add(new Render_vous(byr, imo, LocalDate.parse(date, formatter)));

        } catch (Exception e) {
            throw new myException("cant add rv");
        }
    }


    static Render_vous search_by_id(int id) throws Exception{
        for(int i=0;i<rv_list.size();i++){
            if(rv_list.get(i).id==id){
                return rv_list.get(i);
            }
        }
        return null;
    }

    static Object[][] search_by_ID(int id) throws Exception{
        Render_vous rv = search_by_id(id);
        Object[][] obj = new Object[1][5];
        try {
            obj[0][0] = rv.id;
            obj[0][1] = rv.receiver.getId();
            obj[0][2] = rv.imob.getId();
            obj[0][3] = rv.date;
            System.out.println(rv.date);
        } catch (Exception e) {
            throw new myException("render-vous doesnt exist");
        }


        return obj;
    }


    static void remove_rv(int id) throws Exception{
        for(int i=0;i<rv_list.size();i++){
            if(rv_list.get(i).id==id){
                rv_list.remove(i);
                break;
            }
        }
    }



    static Object[][] search_all() throws Exception{
        Object[][] res = new Object[rv_list.size()][4];
        for (int i = 0; i < rv_list.size(); i++) {
            Render_vous rv = rv_list.get(i);
            res[i][0] = rv.id;
            res[i][1] = rv.receiver.getId();
            res[i][2] = rv.imob.getId();
            res[i][3] = rv.date;
        }
        return res;
    }







}











 class projet {


    public static void main(String[] args) throws Exception{
        
        
        // ArrayList<Transaction> tran_list = new ArrayList<>();
        
        
        Owner.add_client("Matouk", "Akram", "56468165198");
        Buyer.add_client("akkouche", "Mehdi", "136463451");
        Buyer.add_client("kara", "adem", "87997");
        Owner.add_client("akkouche", "Akram", "651");
        
        
        Appartement.add_immobilier("null", "null", 876f, 46, 0, 2, false);
        Appartement.add_immobilier("chaba", "bbz", 50f, 220, 3, 2, false);
        Appartement.add_immobilier("chaba", "bbz", 50f, 220, 3, 2, false);

        Maison.add_immobilier("chaba bzf", "sourikal", 55f, 456, 3, 0, 0, false, false, false);
        Maison.add_immobilier("chaba chwia", "sourikal", 555f, 4556, 3, 0, 0, true, false, false);


        Transaction.remove_transaction(0);
        Transaction.remove_transaction(0);
        
        
        
        System.out.println(Immobilier.modify(3, "", "", "", "", "0"));        
        System.out.println("'khh'");

    }
 }
