package app;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.Insets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.*;


public class Main {
	
	static void init() throws Exception{
        Owner.add_client("akram", "matouk", "05614851");
        Owner.add_client("mehdi", "akkouche", "045544520");
        Owner.add_client("adem", "kara", "05404542");
        Buyer.add_client("rayan", "belalam", "056148251");
        Buyer.add_client("yacine", "ghimouz", "05641658");
        Appartement.add_immobilier("this is a desc for id = 0", "loc0", 0f, 0, 0, 0, false);
        Maison.add_immobilier("null", "null", 0, 0, 1, 0, 0, false, false, false);
    }

	public static myFrame frame=new myFrame();
public static void main(String[] args){
	try {
	//---------------------------------------declaration------------------------------------------------------------------------------------------------------
	Border border=BorderFactory.createLineBorder(Color.lightGray);
	Color color=new Color(23, 90, 113);
	//Border borderAdd=BorderFactory.createLineBorder(Color.white, 1, true);
	// borderAdd=BorderFactory.createCompoundBorder(border, borderAdd);
	init(); 
	
	JButton bienButton=new JButton();
	JButton clientButton=new JButton();
	JButton transButton=new JButton();
	JButton RDVButton=new JButton(); 
	
	JPanel spanel1=new JPanel();
	JPanel spanel2=new JPanel();
	JPanel spanel3=new JPanel();
    JPanel spanel4=new JPanel();
	ImageIcon icon=new ImageIcon("USTHB.jpg");
	JLabel topLabel=new JLabel();
	Image image=icon.getImage();
	JLabel mainLabel=new JLabel();
	JPanel bluePanel=new JPanel();
	JLabel blueLabel=new JLabel();
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	
	
	
    JPanel top=new JPanel();
    JPanel left=new JPanel();
    JPanel right=new JPanel();
    JPanel bottom=new JPanel();
    JPanel center1=new JPanel();
    JPanel center2=new JPanel();
    JPanel center3=new JPanel();
    JPanel center4=new JPanel();
    JPanel addBien=new JPanel();
    JPanel searchBien=new JPanel();
    myResult searchBienResultat=new myResult();
    JPanel modifierBien=new JPanel();
    JPanel suprimerBien=new JPanel();
    JPanel arrowBienP=new JPanel();
    JPanel arrowClientP=new JPanel();
    JPanel arrowTransP=new JPanel();
    JPanel arrowRDVP=new JPanel();
    
    JPanel Btop=new JPanel();
    JPanel Bright=new JPanel();
    JPanel Bleft=new JPanel();
    JPanel Bbottom=new JPanel();
    JPanel Bcenter=new JPanel();
    
    myResult afficherBien=new myResult();
    
    JButton addButtonB=new JButton();
    JButton searchButtonB=new JButton();
    JButton trashButtonB=new JButton();
    JButton editButtonB=new JButton();
    myButton displayButtonB=new myButton("Afficher les clients",new Color(218, 218, 219),color);
    
    
    
    JButton addButtonC=new JButton();
    JButton hisButtonC=new JButton();
    JButton trashButtonC=new JButton();
    JButton editButtonC=new JButton();
    JButton sendButtonC=new JButton();
    myButton afficherButtonC=new myButton("Afficher les client",new Color(218, 218, 219),color);
    
    myResult afficherClient=new myResult();
    
    myPanel addClient =new myPanel(Color.white);
    myPanel sendClient =new myPanel(Color.white);
    myPanel editClient =new myPanel(Color.white);
    myPanel trashClient =new myPanel(Color.white);
    myPanel hisClient =new myPanel(Color.white);
    
    JButton addButtonT=new JButton();
    JButton editButtonT=new JButton();
    
    JButton addButtonR=new JButton();
    JButton searchButtonR=new JButton();
    JButton afficheButtonR=new JButton();
    JButton annuleButtonR=new JButton();
    
    JButton addBienB=new JButton();
    
    JButton searchBienB=new JButton();
    
    JButton suprimerBienB=new JButton();
    
    JButton modifierBienB=new JButton();
    
    JButton arrowBien=new JButton();
    JButton arrowClient=new JButton();
    JButton arrowTrans=new JButton();
    JButton arrowRDV=new JButton();
    
    myButton addClientB=new myButton("AJOUTER",Color.white,color);
    myButton editClientB=new myButton("MODIFIER",Color.white,color);
    myButton suprimerClientB=new myButton("SUPPRIMER",Color.white,color);
    myButton hisClientB=new myButton("VOIR",Color.white,color);
    myButton sendClientB=new myButton("ENVOYER",Color.white,color);
    
    myButton deleteButtonT=new myButton("Supprimer une transaction",new Color(218, 218, 219),color);
    
    
    
    ImageIcon edit=new ImageIcon("edit.png");
    ImageIcon trash=new ImageIcon("trash.png");
    ImageIcon add=new ImageIcon("add.png");
    ImageIcon search=new ImageIcon("search.png");
    ImageIcon his=new ImageIcon("time.png");
    ImageIcon pop=new ImageIcon("pop.png");
    ImageIcon arrow=new ImageIcon("arrow.png");
    ImageIcon list=new ImageIcon("list.png");
    ImageIcon filter=new ImageIcon("filter.png");
    ImageIcon x=new ImageIcon("x.png");
    
    String[] biens ={"maison","appartement","terrain","magasin","autre"};
    String[] searchBiens ={"Localisation","Prix","ID","Surface"};
    String[] modifierBiens ={"maison","appartement","terrain","magasin","autre"};
    String[] rechBien= {"ID", "Localisation","Prix","Proprieter","Type"};
    String[] affClient= {"ID", "Nom","Prenom","Num-tlph","Type"};
    String[] Clients= {"Proprietere", "Simple Client"};
    String[] STrans= {"Vente", "Louer"};
    String[] SFiltre= {"ID Imob", "ID Client","Date de vente","Date de debut","Date de fin","Type de transaction"};
    String[] SAffiche= {"ID", "Date debut","Immobilier","Client","Date fin","Type"};
    String[] afficheRT= {"ID", "Client","Immobilier","Date "};
    
    myText plusDetail=new myText("Plus de detail :");
    myText nombreEtage=new myText("Nombre d'etage :");
    myText prix=new myText("Prix :");
    myText localisation=new myText("Localisation :");
    myText nombreChambre=new myText("Nombre de Chambre :");
    myText Surface=new myText("Surface :");
    myText proprieter=new myText("Le proprieter :");
    myText des=new myText("Description :");
    myText garage=new myText("Garage (bool) :");
    myText jardin=new myText("Jardin (bool) :");
    myText picine=new myText("Picine (bool) :");
    myText meuble=new myText("meuble (bool) :");
    
    myText searchSurfaceMin=new myText("Surface minimal :");
    myText searchSurfaceMax=new myText("Surface maximal :");
    myText searchPrixMin=new myText("Prix minimal :");
    myText searchPrixMax=new myText("Prix maximal:");
    myText searchLocalisation=new myText("Par localisation :");
    myText searchID=new myText("Par ID :");
    
    myText supClient= new myText("ID duClient");
   
    
    myText suprimerIDB=new myText("ID du bien :");
    
    myText modifierID=new myText("ID :");
    myText modifierPrix=new myText("Prix :");
    myText modifierSurface=new myText("Surface :");
    myText modifierNombreChambre=new myText("Nombre chambre :");
    myText modifierLocalisation=new myText("Localisation :");
    myText modifierJardin=new myText("Jardin :");
    myText modifierOwner=new myText("ID du proprieter:");
    myText modifierDescription=new myText("Description :");
    myText modifierNombreEtage=new myText("Nombre etage :");
    myText modifierGarage=new myText("Garage :");
    myText modifierPicine=new myText("Picine :");
    myText modifierMeuble=new myText("Meublé :");
    myText modifierPlusDtail=new myText("Plus de detail :");
   // myText searchNombreChambre=new myText("par nombre de chambre :");
   
    myText addNom=new myText("Le nom :");
    myText addPrenom=new myText("Le prenom :");
    myText addNum=new myText("Le num-tlph :");
    
    myText hisID=new myText("ID du client :");
    
    myText dem_type_imob=new myText("Type de l'immobilier :");
    myText dem_prix_max=new myText("Prix max :");
    myText dem_prix_min=new myText("Prix min :");
    myText dem_surface_max=new myText("Surface max :");
    myText dem_surface_min=new myText("Surface min :");
    myText dem_ID=new myText("ID :");
    
    
    myCombo type=new myCombo(biens);
    myCombo typeSearchB=new myCombo(searchBiens);
    myCombo typeModifyB=new myCombo(modifierBiens);
    myCombo typeClient=new myCombo(Clients); 
    //******************************************************************************************************
    myPanel addTrans =new myPanel(Color.white);
    myPanel displayTrans =new myPanel(Color.white);
    myPanel supprimerTrans =new myPanel(Color.white);
    myPanel FiltreP =new myPanel(Color.white);
    
    myResult afficheTrans=new myResult();
   
    myCombo typeTrans=new myCombo(STrans);
    myCombo typeFilter=new myCombo(SFiltre);
    
    myButton addTransB=new myButton("AJOUTER",Color.white,color);
    myButton toutTrans=new myButton("Voir tout les transactions",new Color(218, 218, 219),color);
    myButton filtreT=new myButton("Filtrer",new Color(218, 218, 219),color);
    myButton supprimerTransB=new myButton("SUPPRIMER",Color.white,color);
    myButton searchTransB=new myButton("RECHERCHE",Color.white,color);
    
    myText IDImob=new myText("ID de l'imob :");
    myText IDClient=new myText("ID du client :");
    myText debut=new myText("Date de debut (jj-mm-aaaa):");
    myText fin=new myText("Date de fin (jj-mm-aaaa):");
    myText dateT=new myText("Date de vente (jj-mm-aaaa):");
    myText IDSup=new myText("ID de la transaction :");
    
    myText searchIDT=new myText("ID de la transaction :");
    
    myText editNom=new myText("Nouveau nom :");
    myText editPrenom=new myText("Nouveau prenom :");
    myText editNum=new myText("Nouveau num-tlph :");
    myText editID=new myText("ID du Client:");
    
    //******************************************************************************************************RDV*************************************************************************************************
    
    myPanel addRDV =new myPanel(Color.white);
    myPanel searchRDV =new myPanel(Color.white);
    myPanel annuleRDV =new myPanel(Color.white);
    
    myText ImobR=new myText("ID de l'imob :");
    myText ClientR=new myText("ID du client :");
    myText dateR=new myText("Date de RDV (jj-mm-aaaa):");
    myText TsearchRDV=new myText("ID du RDV");
    myText IDRDV=new myText("ID du RDV");
    
    myButton addRB=new myButton("AJOUTER",Color.white,color);
    myButton searchRB=new myButton("RECHERCHER",Color.white,color);
    myButton annuleRB=new myButton("ANNULER",Color.white,color);
    
    myResult afficheRDV=new myResult();
    
    Image orgEdit=edit.getImage();
    Image rcEdit = orgEdit.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    edit=new ImageIcon(rcEdit);
    
    Image orgAdd=add.getImage();
    Image rcAdd = orgAdd.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    add=new ImageIcon(rcAdd);
    
    Image orgSearch=search.getImage();
    Image rcSearch = orgSearch.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    search=new ImageIcon(rcSearch);
    
    Image orgTrash=trash.getImage();
    Image rcTrash = orgTrash.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    trash=new ImageIcon(rcTrash);
    
    Image orgHis=his.getImage();
    Image rcHis = orgHis.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    his=new ImageIcon(rcHis);
    
    Image orgSend=pop.getImage();
    Image rcSend = orgSend.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
    pop=new ImageIcon(rcSend);
    
    Image orgArrow=arrow.getImage();
    Image rcArrow = orgArrow.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    arrow=new ImageIcon(rcArrow);
    
    Image orgList=list.getImage();
    Image rcList = orgList.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    list=new ImageIcon(rcList);
    
    Image orgFilter=filter.getImage();
    Image rcFilter = orgFilter.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    filter=new ImageIcon(rcFilter);
    
    Image orgX=x.getImage();
    Image rcX = orgX.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    x=new ImageIcon(rcX);
   //*********************************************************************side panels***************************************************************************************
     
    
    spanel1.setBackground(new Color(44,119,216));
    spanel2.setBackground(new Color(44,119,216));
    spanel3.setBackground(new Color(44,119,216));
    spanel4.setBackground(new Color(44,119,216));
    
    spanel1.setBounds(0, 60, 6, 40);
    spanel2.setBounds(0, 120, 6, 40);
    spanel3.setBounds(0, 180, 6, 40);
    spanel4.setBounds(0, 240, 6, 40);
    
   
 
    //*******************************************************************button de menu***************************************************************************************
	
    bienButton.setText("Gestion des biens");
    bienButton.setFocusable(false);
    bienButton.setSize(40, 20);
	bienButton.setForeground(Color.white);
	bienButton.setBackground(new Color(14,32,54));
    bienButton.setBounds(10, 60, 175, 40);
    bienButton.setBorder(null);
	
    clientButton.setText("Gestion des clients");
    clientButton.setFocusable(false);
    clientButton.setSize(40, 20);
    clientButton.setForeground(Color.white);
    clientButton.setBackground(new Color(14,32,54));
    clientButton.setBounds(10, 120, 175, 40);
    clientButton.setBorder(null);
    
    transButton.setText("Gestion des transactions");
    transButton.setFocusable(false);
    transButton.setSize(40, 20);
    transButton.setForeground(Color.white);
    transButton.setBackground(new Color(14,32,54));
    transButton.setBounds(10, 180, 175, 40);
    transButton.setBorder(null);
    
    RDVButton.setText("Gestion des rendez-vous");
    RDVButton.setFocusable(false);
    RDVButton.setSize(40, 20);
    RDVButton.setForeground(Color.white);
    RDVButton.setBackground(new Color(14,32,54));
    RDVButton.setBounds(10, 240, 175, 40);
    RDVButton.setBorder(null);
    
	JPanel leftPanel=new JPanel();
	JPanel topPanel=new JPanel();
	JPanel centerPanel = new JPanel();
	JPanel rightPanel=new JPanel();
	
	centerPanel.setLayout(new BorderLayout());
	
	//*******************************************************************main panels*****************************************************************************************
	
	top.setBackground(Color.white);
	bottom.setBackground(Color.white);
	left.setBackground(Color.white);
	right.setBackground(Color.white);
	center1.setBackground(Color.white);
	center2.setBackground(Color.white);
	center3.setBackground(Color.white);
	center4.setBackground(Color.white);
	addBien.setBackground(Color.white);
	
	
	left.setPreferredSize(new Dimension(65,0));
	top.setPreferredSize(new Dimension(0,75));
	right.setPreferredSize(new Dimension(115,0));
	bottom.setPreferredSize(new Dimension(0,75));
	center1.setPreferredSize(new Dimension(50,100));
	center2.setPreferredSize(new Dimension(50,100));
	center3.setPreferredSize(new Dimension(50,100));
	
	
	
	//***************************************************************************button des biens***********************************************************************************
	
	arrowBien.setIcon(arrow);
	arrowBien.setBackground(Color.white);
	arrowBien.setFocusable(false);
	arrowBien.setBorder(null);
	arrowBien.setBounds(65,75,0,0);
	arrowBien.setPreferredSize(new Dimension(50,50));
	
	arrowClient.setIcon(arrow);
	arrowClient.setBackground(Color.white);
	arrowClient.setFocusable(false);
	arrowClient.setBorder(null);
	arrowClient.setBounds(65,75,0,0);
	arrowClient.setPreferredSize(new Dimension(50,50));
	
	arrowTrans.setIcon(arrow);
	arrowTrans.setBackground(Color.white);
	arrowTrans.setFocusable(false);
	arrowTrans.setBorder(null);
	arrowTrans.setBounds(65,75,0,0);
	arrowTrans.setPreferredSize(new Dimension(50,50));
	
	arrowRDV.setIcon(arrow);
	arrowRDV.setBackground(Color.white);
	arrowRDV.setFocusable(false);
	arrowRDV.setBorder(null);
	arrowRDV.setBounds(65,75,0,0);
	arrowRDV.setPreferredSize(new Dimension(50,50));
	
	arrowRDVP.add(arrowRDV);
	arrowBienP.add(arrowBien);
	arrowClientP.add(arrowClient);
	arrowTransP.add(arrowTrans);
	
	arrowBienP.setBackground(Color.white);
	arrowBienP.setBounds(201,101,47,50);
	
	arrowClientP.setBackground(Color.white);
	arrowClientP.setBounds(201,101,47,50);
	
	arrowTransP.setBackground(Color.white);
	arrowTransP.setBounds(201,101,47,50);
	
	arrowRDVP.setBackground(Color.white);
	arrowRDVP.setBounds(201,101,47,50);
	//arrowBienP.add(arrowBien);
	
	addButtonB.setBackground(color);
	trashButtonB.setBackground(color);
	editButtonB.setBackground(color);
	searchButtonB.setBackground(color);
	
	addButtonB.setForeground(new Color(218, 218, 219));
	searchButtonB.setForeground(new Color(218, 218, 219));
	trashButtonB.setForeground(new Color(218, 218, 219));
	editButtonB.setForeground(new Color(218, 218, 219));
	
	addButtonB.setBorder(null);
	trashButtonB.setBorder(null);
	searchButtonB.setBorder(null);
	editButtonB.setBorder(null);
	
	/*addButtonB.setBorder(borderAdd);
	trashButtonB.setBorder(borderAdd);
	searchButtonB.setBorder(borderAdd);
	editButtonB.setBorder(borderAdd);*/
	
	centerPanel.add(top,BorderLayout.NORTH);
	centerPanel.add(right,BorderLayout.EAST);
	centerPanel.add(left,BorderLayout.WEST);
	centerPanel.add(bottom,BorderLayout.SOUTH);
	centerPanel.repaint();
	
	
	center1.setLayout(new GridLayout(3,2,35,25));
	center2.setLayout(new GridLayout(3,2,30,30));
	center3.setLayout(new GridLayout(3,2,30,30));
	center4.setLayout(new GridLayout(0,2,30,30));
	
	addButtonB.setIcon(add);
	editButtonB.setIcon(edit);
	trashButtonB.setIcon(trash);
	searchButtonB.setIcon(search);
	displayButtonB.setIcon(list);
	
	addButtonB.setFocusable(false);
	editButtonB.setFocusable(false);
	trashButtonB.setFocusable(false);
	searchButtonB.setFocusable(false);
	
	addButtonB.setText("Ajouter un bien ou une info");
	editButtonB.setText("Modifier un bien ou une info");
	trashButtonB.setText("Suprimer un bien");
	searchButtonB.setText("Recherche d'un bien");
	
	center1.add(addButtonB);
	center1.add(searchButtonB);
	center1.add(editButtonB);
	center1.add(displayButtonB);
	center1.add(trashButtonB);
	
	//*****************************************************************************boutton des clients*******************************************************************************
	
	addButtonC.setBackground(color);
	trashButtonC.setBackground(color);
	editButtonC.setBackground(color);
	hisButtonC.setBackground(color);
	sendButtonC.setBackground(color);
	
	addButtonC.setForeground(new Color(218, 218, 219));
	hisButtonC.setForeground(new Color(218, 218, 219));
	trashButtonC.setForeground(new Color(218, 218, 219));
	editButtonC.setForeground(new Color(218, 218, 219));
	sendButtonC.setForeground(new Color(218, 218, 219));
	
	addButtonC.setBorder(null);
	trashButtonC.setBorder(null);
	hisButtonC.setBorder(null);
	editButtonC.setBorder(null);
	sendButtonC.setBorder(null);
	
	
	
	
	addButtonC.setIcon(add);
	editButtonC.setIcon(edit);
	trashButtonC.setIcon(trash);
	hisButtonC.setIcon(his);
	sendButtonC.setIcon(pop);
	afficherButtonC.setIcon(list);
	
	addButtonC.setFocusable(false);
	editButtonC.setFocusable(false);
	trashButtonC.setFocusable(false);
	hisButtonC.setFocusable(false);
	sendButtonC.setFocusable(false);
	
	addButtonC.setText("Ajouter un client ou une info");
	editButtonC.setText("Modifier un client");
	trashButtonC.setText("Suprimer un client");
	hisButtonC.setText("L'historique des client");
	sendButtonC.setText("Les demandes des client");
	
	center2.add(addButtonC);
	center2.add(editButtonC);
	center2.add(sendButtonC);
	center2.add(hisButtonC);
	center2.add(trashButtonC);
	center2.add(afficherButtonC);
	
	//*****************************************************************************bouttons des transactions*****************************************************************************
	
	deleteButtonT.setIcon(trash);
	
	addButtonT.setBackground(color);
	editButtonT.setBackground(color);
	
	addButtonT.setForeground(new Color(218, 218, 219));
	editButtonT.setForeground(new Color(218, 218, 219));
	
	addButtonT.setBorder(null);
	editButtonT.setBorder(null);
	
	addButtonT.setIcon(add);
	editButtonT.setIcon(edit);
	
	addButtonT.setFocusable(false);
	editButtonT.setFocusable(false);
	
	addButtonT.setText("Creer une transactions immobilières");
	editButtonT.setText("Suivre transactions immobilières");
	
	center3.add(addButtonT);
	center3.add(editButtonT);
	center3.add(deleteButtonT);
	
	//******************************************************************************boutton des RDV***************************************************************************
	
	
	
	
	addButtonR.setBackground(color);
	addButtonR.setForeground(new Color(218, 218, 219));
	addButtonR.setBorder(null);
	addButtonR.setIcon(add);
	addButtonR.setFocusable(false);
	addButtonR.setText("Prendre un rendez-vous");
	
	searchButtonR.setBackground(color);
	searchButtonR.setForeground(new Color(218, 218, 219));
	searchButtonR.setBorder(null);
	searchButtonR.setIcon(search);
	searchButtonR.setFocusable(false);
	searchButtonR.setText("Rechercher un rendez-vous");
	
	afficheButtonR.setBackground(color);
	afficheButtonR.setForeground(new Color(218, 218, 219));
	afficheButtonR.setBorder(null);
	afficheButtonR.setIcon(list);
	afficheButtonR.setFocusable(false);
	afficheButtonR.setText("Afficher les rendez-vous");
	
	annuleButtonR.setBackground(color);
	annuleButtonR.setForeground(new Color(218, 218, 219));
	annuleButtonR.setBorder(null);
	annuleButtonR.setIcon(x);
	annuleButtonR.setFocusable(false);
	annuleButtonR.setText("Annuler un rendez-vous");
	
	center4.add(addButtonR);
	center4.add(searchButtonR);
	center4.add(afficheButtonR);
	center4.add(annuleButtonR);
	//**************************************************************************add bien panel*************************************************************************************
	
	//addBien.add(null);
	
	
	
	
	
	addBien.setBackground(Color.white);
	//addBien.setBorder(BorderFactory.createLineBorder(Color.white));
    addBien.setLayout(new GridLayout(0,2,20,20));
    
	
	
	addBien.add(localisation.getPanel());
	addBien.add(Surface.getPanel());
	addBien.add(nombreChambre.getPanel());
	addBien.add(garage.getPanel());
	addBien.add(jardin.getPanel());
	addBien.add(picine.getPanel());
	addBien.add(proprieter.getPanel());
	addBien.add(nombreEtage.getPanel());
	//addBien.add(nombreChambre.getPanel());
	//addBien.add(Surface.getPanel());
	addBien.add(prix.getPanel());
	addBien.add(des.getPanel());
	Btop.setBackground(Color.white);
	Bleft.setBackground(Color.white);
	Bright.setBackground(Color.white);
	Bbottom.setBackground(Color.white);
	Bcenter.setBackground(Color.white);
	
	bottom.setLayout(new BorderLayout());
	
	Btop.setPreferredSize(new Dimension(50,20));
	Bright.setPreferredSize(new Dimension(250,50));
	Bleft.setPreferredSize(new Dimension(250,50));
	Bbottom.setPreferredSize(new Dimension(50,20));
	Bcenter.setPreferredSize(new Dimension(0,0));
	Bcenter.setLayout(new GridLayout());
	
	bottom.add(Btop,BorderLayout.NORTH);
	bottom.add(Bleft,BorderLayout.EAST);
	bottom.add(Bright,BorderLayout.WEST);
	bottom.add(Bcenter,BorderLayout.CENTER);
	bottom.add(Bbottom,BorderLayout.SOUTH);
	
	addBienB.setText("AJOUTE");
	addBienB.setBackground(color);
	addBienB.setForeground(Color.white);
	addBienB.setFocusable(false);
	addBienB.setBorder(null);
	addBien.setPreferredSize(new Dimension(100,100));
	
	
	
	//addBien.add(comboBien,BorderLayout.NORTH);
	
	//addBien.add(maisonVoiture);
	
	//***************************************************************************search bien panel************************************************************************************
	
	searchBien.setLayout(null);
	searchBien.setBackground(Color.white);
	
	searchBienB.setText("RECHERHE");
	searchBienB.setBackground(color);
	searchBienB.setForeground(Color.white);
	searchBienB.setFocusable(false);
	searchBienB.setBorder(null);
	
	searchLocalisation.getPanel().setBounds(50, 50, 350, 30);
	searchPrixMin.getPanel().setBounds(50, 40, 350, 30);
	searchPrixMax.getPanel().setBounds(50, 90, 350, 30);
	searchID.getPanel().setBounds(50, 50, 350, 30);
	searchSurfaceMin.getPanel().setBounds(50, 40, 350, 30);
	searchSurfaceMax.getPanel().setBounds(50, 90, 350, 30);
	searchBien.add(searchLocalisation.getPanel());
	
	//*******************************************************************************modifier un bien*********************************************************************************
	
	
	
	modifierBienB.setText("MODIFIER");
	modifierBienB.setBackground(color);
	modifierBienB.setForeground(Color.white);
	modifierBienB.setFocusable(false);
	modifierBienB.setBorder(null);
	
	
	
	
	modifierBien.setBackground(Color.white);
	modifierBien.setLayout(new GridLayout(0,2,10,15));
	
	modifierBien.add(modifierID.getPanel());
	modifierBien.add(modifierOwner.getPanel());
	modifierBien.add(modifierPrix.getPanel());
	modifierBien.add(modifierSurface.getPanel());
	modifierBien.add(modifierLocalisation.getPanel());
	modifierBien.add(modifierDescription.getPanel());
	modifierBien.add(modifierNombreChambre.getPanel());
	modifierBien.add(modifierNombreEtage.getPanel());
	modifierBien.add(modifierJardin.getPanel());
	modifierBien.add(modifierPicine.getPanel());
	modifierBien.add(modifierGarage.getPanel());
	//*********************************************************************************suprimer un bien**********************************************************************************
	
	suprimerBien.setLayout(null);
	suprimerBien.setBackground(Color.white);
	
	suprimerBienB.setBackground(color);
	suprimerBienB.setForeground(Color.white);
	suprimerBienB.setFocusable(false);
	suprimerBienB.setBorder(null);
	
	suprimerBienB.setText("SUPRIMER");
	
	
	suprimerIDB.getPanel().setBounds(50, 50, 350, 30);
	suprimerBien.add(suprimerIDB.getPanel());
	
	//**************************************************************************** client panel******************************************************************************************************************************
	addClient.setLayout(new GridLayout(0,2,10,50));
	
	addClient.add(addNom.getPanel());
	addClient.add(addPrenom.getPanel());
	addClient.add(addNum.getPanel());
	
	toutTrans.setIcon(list);
	filtreT.setIcon(filter);
	
	supClient.getPanel().setBounds(50, 50, 350, 30);
	trashClient.setLayout(null);
	trashClient.add(supClient.getPanel());
	
	hisID.getPanel().setBounds(50, 50, 350, 30);
	hisClient.setLayout(null);
	hisClient.add(hisID.getPanel());
	
	sendClient.setLayout(new GridLayout(0,2,10,50));
	sendClient.add(dem_ID.getPanel());
    sendClient.add(dem_type_imob.getPanel());
    sendClient.add(dem_prix_max.getPanel());
    sendClient.add(dem_prix_min.getPanel());
    sendClient.add(dem_surface_max.getPanel());
    sendClient.add(dem_surface_min.getPanel());
    
    
    editClient.setLayout(new GridLayout(0,2,10,50));
    editClient.add(editID.getPanel());
    editClient.add(editNom.getPanel());
    editClient.add(editPrenom.getPanel());
    editClient.add(editNum.getPanel());
    
    editID.setText("");
	editPrenom.setText("");
	editNum.setText("");
	editNom.setText("");
	//******************************************************************************* transactiopns**************************************************************************************************************************
	addTrans.setLayout(new GridLayout(0,2,10,50));
	
	addTrans.add(IDImob.getPanel());
	addTrans.add(IDClient.getPanel());
	addTrans.add(dateT.getPanel());
	
	displayTrans.setLayout(new GridLayout(3,2,30,30));
	displayTrans.add(toutTrans);
	displayTrans.add(filtreT);
	
	supprimerTrans.setLayout(null);
	IDSup.getPanel().setBounds(50, 50, 350, 30);
	supprimerTrans.add(IDSup.getPanel());
	
	FiltreP.setLayout(null);
	searchIDT.getPanel().setBounds(50, 50, 350, 30);
	FiltreP.add(searchIDT.getPanel());
	//******************************************************************************RDV********************************************************************************************************************************************
	addRDV.setLayout(new GridLayout(0,2,10,50));
	
	addRDV.add(ImobR.getPanel());
	addRDV.add(ClientR.getPanel());
	addRDV.add(dateR.getPanel());
	
	searchRDV.setLayout(null);
	TsearchRDV.getPanel().setBounds(50, 50, 350, 30);
	searchRDV.add(TsearchRDV.getPanel());
	
    annuleRDV.setLayout(null);
	IDRDV.getPanel().setBounds(50, 50, 350, 30);
	annuleRDV.add(IDRDV.getPanel());
	
	//************************************************************************************INIT*****************************************************************************************************************************
	
	centerPanel.add(center1);
	
	//************************************************************************le design general**********************************************************************************************************************************
	
	
	leftPanel.setBackground(new Color(14,32,54));
	topPanel.setBackground(Color.white);
	centerPanel.setBackground(Color.white);
	rightPanel.setBackground(Color.white);
	bluePanel.setBackground(new Color(14,32,54));
	
	p1.setBackground(Color.lightGray);
	p2.setBackground(Color.lightGray);
	p3.setBackground(Color.lightGray);
	
	leftPanel.setBorder(border);
	topPanel.setBorder(border);
	rightPanel.setBorder(border);
	centerPanel.setBorder(border);
	
	leftPanel.setPreferredSize(new Dimension(200,100));
	topPanel.setPreferredSize(new Dimension(100,100));
	rightPanel.setPreferredSize(new Dimension(100,100));
	centerPanel.setPreferredSize(new Dimension(100,100));
	bluePanel.setBounds(0, 0, 200, 102);
	p1.setBounds(0, 0, 1, 102);
	p2.setBounds(199, 0, 2, 102);
	p3.setBounds(0, 0, 201, 1);
	
	leftPanel.setLayout(new GridLayout());
	
	JLabel leftLabel=new JLabel();
	
	//leftLabel.setLayout(new BorderLayout());
	
	leftLabel.add(bienButton );
	leftLabel.add(clientButton );
	leftLabel.add(transButton );
	leftLabel.add(RDVButton );
	leftPanel.add(leftLabel);
	
	leftPanel.repaint();
	
	topPanel.setLayout(new BorderLayout());
	
	topLabel.setBounds(0, 0, 100, 100);
	Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // en a besoin d'une image pour l'affecter a une image

	icon =new ImageIcon(scaledImage);
	
	topLabel.setIcon(icon);
	
	topPanel.add(topLabel,BorderLayout.EAST);
	
	mainLabel.setLayout(new BorderLayout());
    
	mainLabel.add(leftPanel,BorderLayout.WEST);
	mainLabel.add(topPanel,BorderLayout.NORTH);
	mainLabel.add(centerPanel,BorderLayout.CENTER);

	//frame.setLayout(null);
	
    blueLabel.setText("MENU");
    
    blueLabel.setForeground(Color.LIGHT_GRAY);
    blueLabel.setBounds(80,40, 60, 30);
    blueLabel.setFont(new Font("Consolas",Font.PLAIN,20));
    

	
    bluePanel.setLayout(null);
    bluePanel.add(blueLabel);
    leftLabel.add(spanel1);

    frame.add(p1);
    frame.add(p2);
    frame.add(p3);
	frame.add(bluePanel);
	frame.add(mainLabel);
	
	frame.revalidate();
	frame.repaint();
	
	//frame.add(rightPanel,BorderLayout.EAST);
    
	
	//*********************************************************************fonctionment des bouttons *****************************************************************************************
	 bienButton.addActionListener(e -> {leftLabel.add(spanel1);
	 leftLabel.repaint();
	 centerPanel.remove(addClient);
	 centerPanel.remove(sendClient);
	 centerPanel.remove(trashClient);
	 centerPanel.remove(hisClient);
	 centerPanel.remove(editClient);
	 centerPanel.remove(afficherClient);
	 centerPanel.remove(afficheTrans);
	 centerPanel.remove(afficherBien);
	 
	 Bcenter.remove(modifierBienB);
	 top.remove(typeModifyB);
	 top.remove(typeClient);
	 centerPanel.remove(suprimerBien);
	 top.remove(typeSearchB);
	 bottom.remove(addBienB);
	 centerPanel.remove(modifierBien);
	 bottom.revalidate();
	 Bcenter.remove(suprimerBienB);
	 centerPanel.remove(FiltreP);
	 Bcenter.remove(searchTransB);
	 
	 centerPanel.remove(addRDV);
	 centerPanel.remove(searchRDV);
	 centerPanel.remove(afficheRDV);
	 centerPanel.remove(annuleRDV);
	 
	 Bcenter.remove(addRB);
	 Bcenter.remove(searchRB);
	 Bcenter.remove(annuleRB);
	 
	 Bcenter.remove(addClientB);
	 Bcenter.remove(sendClientB);
	 Bcenter.remove(hisClientB);
	 Bcenter.remove(editClientB);
	 Bcenter.remove(suprimerClientB);

	 
	 top.remove(typeTrans);
	 Bcenter.remove(addTransB);
	 centerPanel.remove(addTrans);
	 centerPanel.remove(displayTrans);
	 centerPanel.remove(supprimerTrans);
	 Bcenter.remove(supprimerTransB);
		
	 bottom.repaint();
	 centerPanel.remove(searchBienResultat);
	 Bcenter.remove(searchBienB);
	 leftLabel.remove(spanel2);
	 leftLabel.remove(spanel3);
	 leftLabel.remove(spanel4);
	 centerPanel.remove(searchBien);
	 
	frame.remove(arrowRDVP);
	frame.remove(arrowTransP);
	frame.remove(arrowClientP);
	frame.remove(arrowBienP);
		
		frame.revalidate();
	 centerPanel.add(center1,BorderLayout.CENTER);
	 centerPanel.remove(center2);
	 centerPanel.remove(center3);
	 centerPanel.remove(center4);
	 top.remove(type);
	 Bcenter.remove(addBienB);
	 searchBien.revalidate();
	 searchBien.repaint();
	 centerPanel.repaint();
	 centerPanel.remove(addBien);
	 top.revalidate();
	 }
	 );
	 
	 
	 clientButton.addActionListener(e -> {leftLabel.add(spanel2);
	 leftLabel.repaint();
	 centerPanel.remove(suprimerBien);
	 centerPanel.remove(addClient);
	 centerPanel.remove(sendClient);
	 centerPanel.remove(trashClient);
	 centerPanel.remove(hisClient);
	 centerPanel.remove(editClient);
	 centerPanel.remove(afficherClient);
	 centerPanel.remove(afficheTrans);
	 centerPanel.remove(afficherBien);
	 
	 Bcenter.remove(addClientB);
	 Bcenter.remove(sendClientB);
	 Bcenter.remove(hisClientB);
	 Bcenter.remove(editClientB);
	 Bcenter.remove(suprimerClientB);
	 Bcenter.remove(modifierBienB);
	 top.remove(typeSearchB);
	 top.remove(typeClient);
	 centerPanel.remove(FiltreP);
	 Bcenter.remove(searchTransB);
	 
	 centerPanel.remove(addRDV);
	 centerPanel.remove(searchRDV);
	 centerPanel.remove(afficheRDV);
	 centerPanel.remove(annuleRDV);
	 
	 Bcenter.remove(addRB);
	 Bcenter.remove(searchRB);
	 Bcenter.remove(annuleRB);
	 
	 top.remove(typeTrans);
	 Bcenter.remove(addTransB);
	 centerPanel.remove(addTrans);
	 centerPanel.remove(displayTrans);
	 centerPanel.remove(supprimerTrans);
	 Bcenter.remove(supprimerTransB);
	 
	 centerPanel.remove(modifierBien);
	 top.remove(typeModifyB);
	 bottom.remove(addBienB);
	 Bcenter.remove(suprimerBienB);
	 bottom.revalidate();
	 bottom.repaint();
	 frame.remove(arrowRDVP);
		frame.remove(arrowTransP);
		frame.remove(arrowClientP);
		frame.remove(arrowBienP);
		frame.revalidate();
	 centerPanel.remove(searchBien);
	 Bcenter.remove(searchBienB);
	 centerPanel.remove(searchBienResultat);
		 leftLabel.remove(spanel1);
		 leftLabel.remove(spanel3);
		 leftLabel.remove(spanel4);
		 centerPanel.remove(center1);
		 centerPanel.remove(center4);
		 centerPanel.add(center2,BorderLayout.CENTER);
		 top.remove(type);
		 Bcenter.remove(addBienB);
		 centerPanel.remove(center3);
		 centerPanel.repaint();
		 centerPanel.remove(addBien);
		 top.revalidate();
		 searchBien.revalidate();
		 searchBien.repaint();
	 }
	 );
	 
	 
	 transButton.addActionListener(e -> {leftLabel.add(spanel3);
	 leftLabel.repaint();
	 centerPanel.remove(suprimerBien);
	 top.remove(typeSearchB);
	 centerPanel.remove(addClient);
	 centerPanel.remove(sendClient);
	 centerPanel.remove(trashClient);
	 centerPanel.remove(hisClient);
	 centerPanel.remove(editClient);
	 centerPanel.remove(afficherClient);
	 centerPanel.remove(afficheTrans);
	 centerPanel.remove(afficherBien);
	 
	 Bcenter.remove(addClientB);
	 Bcenter.remove(sendClientB);
	 Bcenter.remove(hisClientB);
	 Bcenter.remove(editClientB);
	 Bcenter.remove(suprimerClientB);
	 Bcenter.remove(modifierBienB);
	 centerPanel.remove(modifierBien);
	 top.remove(typeModifyB);
	 top.remove(typeClient);
	 
	 centerPanel.remove(addRDV);
	 centerPanel.remove(searchRDV);
	 centerPanel.remove(afficheRDV);
	 centerPanel.remove(annuleRDV);
	 
	 Bcenter.remove(addRB);
	 Bcenter.remove(searchRB);
	 Bcenter.remove(annuleRB);
	 
	 top.remove(typeTrans);
	 Bcenter.remove(addTransB);
	 centerPanel.remove(addTrans);
	 centerPanel.remove(displayTrans);
	 centerPanel.remove(supprimerTrans);
	 Bcenter.remove(supprimerTransB);
	 centerPanel.remove(FiltreP);
	 Bcenter.remove(searchTransB);
	 
	 Bcenter.remove(searchBienB);
	 bottom.remove(addBienB);
	 Bcenter.remove(suprimerBienB);
	 bottom.revalidate();
	 bottom.repaint();
	 frame.remove(arrowRDVP);
		frame.remove(arrowTransP);
		frame.remove(arrowClientP);
		frame.remove(arrowBienP);
		frame.revalidate();
	 centerPanel.remove(searchBien);
	 centerPanel.remove(searchBienResultat);
	 leftLabel.remove(spanel2);
	 leftLabel.remove(spanel1);
	 leftLabel.remove(spanel4);
	 centerPanel.remove(center1);
	 centerPanel.remove(center2);
	 centerPanel.remove(center4);
	 centerPanel.add(center3,BorderLayout.CENTER);
	 top.remove(type);
	 Bcenter.remove(addBienB);
	 searchBien.revalidate();
	 searchBien.repaint();
	 centerPanel.repaint();
	 centerPanel.remove(addBien);
	 top.revalidate();
		 }
	 );
	
	 
	 RDVButton.addActionListener(e -> {leftLabel.add(spanel4);
	 top.remove(typeSearchB);
	 centerPanel.remove(suprimerBien);
	 centerPanel.remove(searchBienResultat);
	 leftLabel.repaint();
	 centerPanel.remove(addClient);
	 centerPanel.remove(sendClient);
	 centerPanel.remove(trashClient);
	 centerPanel.remove(hisClient);
	 centerPanel.remove(editClient);
	 centerPanel.remove(afficherClient);
	 centerPanel.remove(afficheTrans);
	 centerPanel.remove(afficherBien);
	 
	 Bcenter.remove(addClientB);
	 Bcenter.remove(sendClientB);
	 Bcenter.remove(hisClientB);
	 Bcenter.remove(editClientB);
	 Bcenter.remove(suprimerClientB);
	 Bcenter.remove(modifierBienB);
	 
	 top.remove(typeTrans);
	 Bcenter.remove(addTransB);
	 centerPanel.remove(addTrans);
	 centerPanel.remove(displayTrans);
	 centerPanel.remove(supprimerTrans);
	 Bcenter.remove(supprimerTransB);
	 centerPanel.remove(FiltreP);
	 Bcenter.remove(searchTransB);
	 
	 centerPanel.remove(addRDV);
	 centerPanel.remove(searchRDV);
	 centerPanel.remove(afficheRDV);
	 centerPanel.remove(annuleRDV);
	 
	 Bcenter.remove(addRB);
	 Bcenter.remove(searchRB);
	 Bcenter.remove(annuleRB);
	 
	 centerPanel.remove(modifierBien);
	 top.remove(typeModifyB);
	 top.remove(typeClient);
	 bottom.remove(addBienB);
	 Bcenter.remove(suprimerBienB);
	 bottom.revalidate();
	 bottom.repaint();
	 arrowBienP.remove(arrowBien);
	 frame.remove(arrowRDVP);
		frame.remove(arrowTransP);
		frame.remove(arrowClientP);
		frame.remove(arrowBienP);
		
		frame.revalidate();
		frame.repaint();
	 centerPanel.remove(searchBien);
	 leftLabel.remove(spanel2);
	 leftLabel.remove(spanel3);
	 leftLabel.remove(spanel1);
	 centerPanel.remove(center1);
	 centerPanel.remove(center2);
	 centerPanel.remove(center3);
	 centerPanel.add(center4);
	 Bcenter.remove(searchBienB);
	 top.remove(type);
	 Bcenter.remove(addBienB);
	 searchBien.revalidate();
	 searchBien.repaint();
	 centerPanel.repaint();
	 centerPanel.remove(addBien);
	 centerPanel.revalidate();
	 top.revalidate();
	 });
	
	 addButtonB.addActionListener(e -> {
		 top.add(type);
		 frame.add(arrowBienP);
		 
		 Bcenter.add(addBienB);
		 Bcenter.remove(searchBienB);
		 centerPanel.remove(center1);
		 centerPanel.add(addBien);
		 searchBien.revalidate();
		 searchBien.repaint();
		 center1.revalidate();
		 center1.repaint();
		 addBien.revalidate();
		 addBien.repaint();
		 top.revalidate();
		 top.repaint();
		 bottom.revalidate();
		 bottom.repaint();
		
			frame.revalidate();
	 });
 addBienB.addActionListener(e -> {
	 if(type.getSelectedItem()=="autre") {try {
		Autre.add_immobilier(des.getText(),localisation.getText(),Float.parseFloat(Surface.getText()),Integer.parseInt(prix.getText()),Integer.parseInt(proprieter.getText()),plusDetail.getText());
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	 des.setText("");
     Surface.setText("");
     prix.setText("");
     proprieter.setText("");
     localisation.setText("");
     plusDetail.setText("");}
		 
	 if(type.getSelectedItem()=="magasin") {try {
			Magasin.add_immobilier(des.getText(),localisation.getText(),Float.parseFloat(Surface.getText()),Integer.parseInt(prix.getText()),Integer.parseInt(proprieter.getText()));
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
		 des.setText("");
	     Surface.setText("");
	     prix.setText("");
	     proprieter.setText("");
	     localisation.setText("");
	     plusDetail.setText("");}
	 
	 if(type.getSelectedItem()=="terrain") {try {
			Terain.add_immobilier(des.getText(),localisation.getText(),Float.parseFloat(Surface.getText()),Integer.parseInt(prix.getText()),Integer.parseInt(proprieter.getText()));
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
		 des.setText("");
	     Surface.setText("");
	     prix.setText("");
	     proprieter.setText("");
	     localisation.setText("");
	     plusDetail.setText("");}
	 
	 if(type.getSelectedItem()=="appartement") {
		 try {
			Appartement.add_immobilier(des.getText(),localisation.getText(),Float.parseFloat(Surface.getText()),Integer.parseInt(prix.getText()),Integer.parseInt(proprieter.getText()),Integer.parseInt(nombreChambre.getText()),Boolean.parseBoolean(meuble.getText()));
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}

	        
	        des.setText("");
	        Surface.setText("");
	        prix.setText("");
	        proprieter.setText("");
	        localisation.setText("");
	        nombreChambre.setText("");
	        meuble.setText("");
	 }
	 
	 if(type.getSelectedItem()=="maison") {try {
		Maison.add_immobilier(des.getText(),localisation.getText(),Float.parseFloat(Surface.getText()),Integer.parseInt(prix.getText()),Integer.parseInt(proprieter.getText()),Integer.parseInt(nombreChambre.getText()),Integer.parseInt(nombreEtage.getText()),Boolean.parseBoolean(garage.getText()),Boolean.parseBoolean(jardin.getText()),Boolean.parseBoolean(picine.getText()));
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	 des.setText("");
     Surface.setText("");
     prix.setText("");
     proprieter.setText("");
     localisation.setText("");}
	 nombreChambre.setText("");
     nombreEtage.setText("");
     picine.setText("");
     jardin.setText("");
     garage.setText("");
	
    centerPanel.remove(addBien);
    centerPanel.add(center1);
    top.remove(type);
    Bcenter.remove(addBienB);
 
    top.revalidate();
    top.repaint();
    
    centerPanel.revalidate();
    centerPanel.repaint();
 
    Bcenter.revalidate();
    Bcenter.repaint();
 });
	 type.addActionListener(e -> {
		 if(type.getSelectedItem()=="autre") {
			 
			 addBien.add(plusDetail.getPanel());
			 addBien.remove(nombreChambre.getPanel());
			 addBien.remove(nombreEtage.getPanel());
			 addBien.remove(garage.getPanel());
			 addBien.remove(picine.getPanel());
			 addBien.remove(jardin.getPanel());
			 addBien.remove(meuble.getPanel());
			 addBien.revalidate();
			 addBien.repaint();
			 top.revalidate();
			 
		 }
		 
if(type.getSelectedItem()=="appartement") {
			 
			 
			 addBien.add(meuble.getPanel());
			 addBien.add(nombreChambre.getPanel());
			 addBien.add(Surface.getPanel());
			 addBien.remove(nombreEtage.getPanel());
			 addBien.remove(garage.getPanel());
			 addBien.remove(picine.getPanel());
			 addBien.remove(jardin.getPanel());
			 addBien.remove(plusDetail.getPanel());
			 addBien.revalidate();
			 addBien.repaint();
			 
		 }
if(type.getSelectedItem()=="maison") {
	 
	addBien.add(nombreEtage.getPanel());
	addBien.add(nombreChambre.getPanel());
	 addBien.add(garage.getPanel());
	 addBien.add(Surface.getPanel());
	 addBien.add(picine.getPanel());
	 addBien.add(jardin.getPanel());
	 addBien.remove(meuble.getPanel());
	 addBien.remove(plusDetail.getPanel());
	 addBien.revalidate();
	 addBien.repaint();
	 
}
if(type.getSelectedItem()=="magasin") {
	 
	 addBien.remove(plusDetail.getPanel());
	 addBien.remove(nombreChambre.getPanel());
	 addBien.remove(nombreEtage.getPanel());
	 addBien.remove(garage.getPanel());
	 addBien.remove(picine.getPanel());
	 addBien.remove(jardin.getPanel());
	 addBien.remove(meuble.getPanel());
	 addBien.revalidate();
	 addBien.repaint();
	 top.revalidate();
	 
}
if(type.getSelectedItem()=="terrain") {
	 
	 addBien.remove(plusDetail.getPanel());
	 addBien.remove(nombreChambre.getPanel());
	 addBien.remove(nombreEtage.getPanel());
	 addBien.remove(garage.getPanel());
	 addBien.remove(picine.getPanel());
	 addBien.remove(jardin.getPanel());
	 addBien.remove(meuble.getPanel());
	 addBien.revalidate();
	 addBien.repaint();
	 top.revalidate();
	 
}
	 }
	 
	 
	);
	 typeSearchB.addActionListener(e -> {
		 if(typeSearchB.getSelectedItem()=="Localisation") {
			 
			 searchBien.remove(searchPrixMin.getPanel());
			 searchBien.remove(searchPrixMax.getPanel());
			 searchBien.remove(searchSurfaceMin.getPanel());
			 searchBien.remove(searchSurfaceMax.getPanel());
			 searchBien.add(searchLocalisation.getPanel());
			 searchBien.remove(searchID.getPanel());
			 
			 
		 }
		 
		 if(typeSearchB.getSelectedItem()=="Surface") {
			 
			 searchBien.remove(searchPrixMin.getPanel());
			 searchBien.remove(searchPrixMax.getPanel());
			 searchBien.add(searchSurfaceMin.getPanel());
			 searchBien.add(searchSurfaceMax.getPanel());
			 searchBien.remove(searchLocalisation.getPanel());
			 searchBien.remove(searchID.getPanel());
			 
			 
		 }
		 
		 if(typeSearchB.getSelectedItem()=="Prix") {
			 
			 searchBien.add(searchPrixMin.getPanel());
			 searchBien.add(searchPrixMax.getPanel());
			 searchBien.remove(searchSurfaceMin.getPanel());
			 searchBien.remove(searchSurfaceMax.getPanel());
			 searchBien.remove(searchLocalisation.getPanel());
			 searchBien.remove(searchID.getPanel());
			 
			 
			 
		 }
if(typeSearchB.getSelectedItem()=="ID") {
			 
			 searchBien.remove(searchPrixMin.getPanel());
			 searchBien.remove(searchPrixMax.getPanel());
			 searchBien.remove(searchSurfaceMin.getPanel());
			 searchBien.remove(searchSurfaceMax.getPanel());
			 searchBien.remove(searchLocalisation.getPanel());
			 searchBien.add(searchID.getPanel());
			 
			 
			 
		 }
		 
		 
		 
		 searchBien.revalidate();
			 searchBien.repaint();
		 
	 });
	 searchButtonB.addActionListener(e -> {
		 
			frame.add(arrowBienP);
		 top.add(typeSearchB);
		 Bcenter.add(searchBienB);
		 centerPanel.remove(center1);
		 centerPanel.add(searchBien);
		 center1.revalidate();
		 center1.repaint();
		 addBien.revalidate();
		 addBien.repaint();
		 top.revalidate();
		 top.repaint();
		 searchBien.revalidate();
		 searchBien.repaint();
		 bottom.revalidate();
		 bottom.repaint();
		
			frame.revalidate();
	 });
	 
	 searchBienB.addActionListener(e ->  {
		if(typeSearchB.getSelectedItem()=="Prix") { try {
			searchBienResultat.setTable (Immobilier.search_by_price(Integer.parseInt(searchPrixMin.getText()),Integer.parseInt(searchPrixMax.getText())),rechBien);
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}}
		if(typeSearchB.getSelectedItem()=="Surface") {  try {
			searchBienResultat.setTable (Immobilier.search_by_surface(Integer.parseInt(searchSurfaceMin.getText()),Integer.parseInt(searchSurfaceMax.getText())),rechBien);
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}}
		if(typeSearchB.getSelectedItem()=="ID") {  try {
			searchBienResultat.setTable (Immobilier.search_by_ID(Integer.parseInt(searchID.getText())),rechBien);
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}}
		if(typeSearchB.getSelectedItem()=="Localisation") { try {
			searchBienResultat.setTable ( Immobilier.search_by_location(searchLocalisation.getText()),rechBien);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}}
		
		 top.remove(typeSearchB);
		 Bcenter.remove(searchBienB);
		 centerPanel.remove(searchBien);
		 centerPanel.add(searchBienResultat);
		 
		 centerPanel.revalidate();
		 centerPanel.repaint();
		 
	 });
	 
	trashButtonB.addActionListener(e -> {
		frame.add(arrowBienP);
		centerPanel.remove(center1);
		centerPanel.add(suprimerBien);
		centerPanel.revalidate();
		centerPanel.repaint();
		Bcenter.add(suprimerBienB);
		
		
		//frame.revalidate();
		
		
	});
	 
	editButtonB.addActionListener(e -> {
		frame.add(arrowBienP);
		centerPanel.remove(center1);
		centerPanel.add(modifierBien);
        top.add(typeModifyB,BorderLayout.CENTER);
		centerPanel.revalidate();
		centerPanel.repaint();
		Bcenter.add(modifierBienB);
		top.revalidate();
		top.repaint();
		
		//frame.revalidate();
		
		
		
	});
	 
	arrowBien.addActionListener(e -> {
		leftLabel.repaint();
		 Bcenter.remove(modifierBienB);
		 top.remove(typeModifyB);
		 centerPanel.remove(suprimerBien);
		 top.remove(typeSearchB);
		 centerPanel.remove(modifierBien);
		 bottom.revalidate();
		 Bcenter.remove(suprimerBienB);
		 bottom.repaint();
		 centerPanel.remove(searchBienResultat);
		 Bcenter.remove(searchBienB);
		 centerPanel.remove(searchBien);
		 arrowBienP.remove(arrowBien);
		 arrowBienP.revalidate();
		 arrowBienP.repaint();
		 frame.revalidate();
		 centerPanel.add(center1,BorderLayout.CENTER);
		 
		 top.remove(type);
		 Bcenter.remove(addBienB);
		 searchBien.revalidate();
		 searchBien.repaint();
		 centerPanel.repaint();
		 centerPanel.remove(addBien);
		 top.revalidate();
		
	}); 
	 
suprimerBienB.addActionListener(e -> {
	try {
		Immobilier.remove_immobilier(Integer.parseInt(suprimerIDB.getText()));
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	suprimerIDB.setText("");
	
});	 

typeModifyB.addActionListener(e -> {
	 if(typeModifyB.getSelectedItem()=="autre") {
		 
	modifierBien.remove(modifierNombreChambre.getPanel());
	modifierBien.remove(modifierNombreEtage.getPanel());
	modifierBien.remove(modifierJardin.getPanel());
	modifierBien.remove(modifierPicine.getPanel());
	modifierBien.remove(modifierGarage.getPanel());
	modifierBien.remove(modifierMeuble.getPanel());
	modifierBien.add(modifierPlusDtail.getPanel());
	modifierBien.revalidate();
	modifierBien.repaint();
	 }
	 if(typeModifyB.getSelectedItem()=="terrain") {
		 
			modifierBien.remove(modifierNombreChambre.getPanel());
			modifierBien.remove(modifierNombreEtage.getPanel());
			modifierBien.remove(modifierJardin.getPanel());
			modifierBien.remove(modifierPicine.getPanel());
			modifierBien.remove(modifierGarage.getPanel());
			modifierBien.remove(modifierMeuble.getPanel());
			modifierBien.remove(modifierPlusDtail.getPanel());
			modifierBien.revalidate();
			modifierBien.repaint();
			 }
	 if(typeModifyB.getSelectedItem()=="magasin") {
		 
			modifierBien.remove(modifierNombreChambre.getPanel());
			modifierBien.remove(modifierNombreEtage.getPanel());
			modifierBien.remove(modifierJardin.getPanel());
			modifierBien.remove(modifierPicine.getPanel());
			modifierBien.remove(modifierGarage.getPanel());
			modifierBien.remove(modifierMeuble.getPanel());
			modifierBien.remove(modifierPlusDtail.getPanel());
			modifierBien.revalidate();
			modifierBien.repaint();
			 }
	 
if(typeModifyB.getSelectedItem()=="appartement") {
	modifierBien.add(modifierNombreChambre.getPanel());
	modifierBien.remove(modifierNombreEtage.getPanel());
	modifierBien.remove(modifierJardin.getPanel());
	modifierBien.remove(modifierPicine.getPanel());
	modifierBien.remove(modifierGarage.getPanel());
	modifierBien.remove(modifierPlusDtail.getPanel());
	modifierBien.add(modifierMeuble.getPanel());
	modifierBien.revalidate();
	modifierBien.repaint();
	 }
if(typeModifyB.getSelectedItem()=="maison") {
	modifierBien.add(modifierNombreChambre.getPanel());
	modifierBien.add(modifierNombreEtage.getPanel());
	modifierBien.add(modifierJardin.getPanel());
	modifierBien.add(modifierPicine.getPanel());
	modifierBien.add(modifierGarage.getPanel());
	modifierBien.remove(modifierPlusDtail.getPanel());
	modifierBien.remove(modifierMeuble.getPanel());
	modifierBien.revalidate();
	modifierBien.repaint();
}
	
	
});
modifierBienB.addActionListener(e -> {
	if(typeModifyB.getSelectedItem()=="maison") {
		try {
			Maison.modify(Integer.parseInt(modifierID.getText()), modifierDescription.getText(), modifierLocalisation.getText(), modifierSurface.getText(), modifierPrix.getText(), modifierOwner.getText(), modifierNombreChambre.getText(), modifierNombreEtage.getText(), modifierGarage.getText(), modifierJardin.getText(), modifierPicine.getText());
			modifierID.setText("");
			modifierDescription.setText("");
			modifierLocalisation.setText("");
			modifierSurface.setText("");
			modifierPrix.setText("");
			modifierNombreChambre.setText("");
			modifierNombreEtage.setText("");
			modifierGarage.setText("");
			modifierJardin.setText("");
			modifierPicine.setText("");
			modifierPrix.setText("");
			
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
	}
	if(typeModifyB.getSelectedItem()=="appartement") {
		try {
			Appartement.modify(Integer.parseInt(modifierID.getText()), modifierDescription.getText(), modifierLocalisation.getText(), modifierSurface.getText(), modifierPrix.getText(), modifierOwner.getText(), modifierNombreChambre.getText(),modifierMeuble.getText());
			modifierID.setText("");
			modifierDescription.setText("");
			modifierLocalisation.setText("");
			modifierSurface.setText("");
			modifierPrix.setText("");
			modifierNombreChambre.setText("");
			modifierNombreEtage.setText("");
			modifierGarage.setText("");
			modifierJardin.setText("");
			modifierPicine.setText("");
			modifierMeuble.setText("");
			modifierPrix.setText("");
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
        
	}
	if(typeModifyB.getSelectedItem()=="autre") {
		try {
			Autre.modify(Integer.parseInt(modifierID.getText()), modifierDescription.getText(), modifierLocalisation.getText(), modifierSurface.getText(), modifierPrix.getText(), modifierOwner.getText(), modifierPlusDtail.getText());
			modifierID.setText("");
			modifierDescription.setText("");
			modifierLocalisation.setText("");
			modifierSurface.setText("");
			modifierPrix.setText("");
			modifierNombreChambre.setText("");
			modifierNombreEtage.setText("");
			modifierGarage.setText("");
			modifierJardin.setText("");
			modifierPicine.setText("");
			modifierMeuble.setText("");
			modifierPrix.setText("");
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
	}
	if(typeModifyB.getSelectedItem()=="magasin") {
		try {
			Magasin.modify(Integer.parseInt(modifierID.getText()), modifierDescription.getText(), modifierLocalisation.getText(), modifierSurface.getText(), modifierPrix.getText(), modifierOwner.getText());
			modifierID.setText("");
			modifierDescription.setText("");
			modifierLocalisation.setText("");
			modifierSurface.setText("");
			modifierPrix.setText("");
			modifierNombreChambre.setText("");
			modifierNombreEtage.setText("");
			modifierGarage.setText("");
			modifierJardin.setText("");
			modifierPicine.setText("");
			modifierMeuble.setText("");
			modifierPrix.setText("");
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
	}
	if(typeModifyB.getSelectedItem()=="terrain") {
		try {
			Terain.modify(Integer.parseInt(modifierID.getText()), modifierDescription.getText(), modifierLocalisation.getText(), modifierSurface.getText(), modifierPrix.getText(), modifierOwner.getText());
		} catch (NumberFormatException e1) {
			myOption option=new myOption(e1);
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
	}
	});

addClientB.addActionListener(e -> {
	
	
	if(typeClient.getSelectedItem()=="Proprietere") {
		try {
			Owner.add_client(addNom.getText(), addPrenom.getText(), addNum.getText());
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
		
	}
	
	if(typeClient.getSelectedItem()=="Simple Client") {
		try {
			Buyer.add_client(addNom.getText(), addPrenom.getText(), addNum.getText());
		} catch (Exception e1) {
			myOption option=new myOption(e1);
		}
		
	}
	addNom.setText("");
	addPrenom.setText("");
	addNum.setText("");
});

suprimerClientB.addActionListener(e -> {
	try {
		Client.remove_client(Integer.parseInt(supClient.getText()));
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	supClient.setText("");
	
});


sendClientB.addActionListener(e -> {
	try {
		Buyer.set_demand(Integer.parseInt(dem_ID.getText()), dem_type_imob.getText(), dem_prix_max.getText(), dem_prix_min.getText(), dem_surface_max.getText(), dem_surface_min.getText());
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	finally {
		dem_ID.setText("");
		dem_type_imob.setText("");
		dem_prix_max.setText("");
		dem_prix_min.setText("");
		dem_surface_max.setText("");
		dem_surface_min.setText("");
	}
	
});
/***************************************************************************************************boutons des clients****************************************************************************************************************/

addButtonC.addActionListener(e -> {
	top.add(typeClient);
	centerPanel.remove(center2);
	centerPanel.add(addClient);
	Bcenter.add(addClientB);
	centerPanel.revalidate();
	centerPanel.repaint();
	Bcenter.revalidate();
	Bcenter.repaint();
	top.revalidate();
	top.repaint();
});
editButtonC.addActionListener(e -> {
	centerPanel.remove(center2);
	centerPanel.add(editClient);
	Bcenter.add(editClientB);
	centerPanel.revalidate();
	centerPanel.repaint();
	Bcenter.revalidate();
	Bcenter.repaint();
});
hisButtonC.addActionListener(e -> {
	centerPanel.remove(center2);
	centerPanel.add(hisClient);
	Bcenter.add(hisClientB);
	centerPanel.revalidate();
	centerPanel.repaint();
	Bcenter.revalidate();
	Bcenter.repaint();
});
trashButtonC.addActionListener(e -> {
	centerPanel.remove(center2);
	centerPanel.add(trashClient);
	Bcenter.add(suprimerClientB);
	centerPanel.revalidate();
	centerPanel.repaint();
	Bcenter.revalidate();
	Bcenter.repaint();
});
sendButtonC.addActionListener(e -> {
	centerPanel.remove(center2);
	centerPanel.add(sendClient);
	Bcenter.add(sendClientB);
	centerPanel.revalidate();
	centerPanel.repaint();
	Bcenter.revalidate();
	Bcenter.repaint();
});

afficherButtonC.addActionListener(e -> {
	try {
		afficherClient.setTable(Client.search_all(), affClient);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	centerPanel.remove(center2);
	centerPanel.add(afficherClient);
	centerPanel.revalidate();
	centerPanel.repaint();
});



addButtonT.addActionListener(e -> {
	centerPanel.remove(center3);
	centerPanel.add(addTrans);
	top.add(typeTrans);
	Bcenter.add(addTransB);

	
	
	
	centerPanel.revalidate();
	centerPanel.repaint();
	top.revalidate();
	top.repaint();
	addTrans.revalidate();
	addTrans.repaint();
});

typeTrans.addActionListener(e -> {
	if(typeTrans.getSelectedItem()=="Vente") {
		addTrans.remove(debut.getPanel());
		addTrans.remove(fin.getPanel());
		addTrans.add(dateT.getPanel());
		addTrans.revalidate();
		addTrans.repaint();
	}
	if(typeTrans.getSelectedItem()=="Louer") {
		addTrans.add(debut.getPanel());
		addTrans.add(fin.getPanel());
		addTrans.remove(dateT.getPanel());
		addTrans.revalidate();
		addTrans.repaint();
	}
	
	
});

editButtonT.addActionListener(e -> {
	centerPanel.remove(center3);
	centerPanel.add(displayTrans);
	
	centerPanel.revalidate();
	centerPanel.repaint();
});

deleteButtonT.addActionListener(e -> {
	centerPanel.remove(center3);
	centerPanel.add(supprimerTrans);
	Bcenter.add(supprimerTransB);
	
	centerPanel.revalidate();
	centerPanel.repaint();
	
});

addTransB.addActionListener(e -> {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");try {
	if(typeTrans.getSelectedItem()=="Vente") {
		
			Transaction.add_transaction( LocalDate.parse(dateT.getText(), formatter), IDImob.getText(), IDClient.getText(), "vente", null);	
			IDImob.setText("");
			debut.setText("");
			fin.setText("");
			dateT.setText("");
			IDClient.setText("");
		} 
	if(typeTrans.getSelectedItem()=="Louer") {
		
		Transaction.add_transaction( LocalDate.parse(debut.getText(), formatter), IDImob.getText(), IDClient.getText(), "Location",  LocalDate.parse(fin.getText(), formatter));	
		
		IDImob.setText("");
		debut.setText("");
		fin.setText("");
		dateT.setText("");
		IDClient.setText("");
	} 
		
	}
	catch (Exception e1) {
			myOption option=new myOption(e1);
		}
	
	
});


supprimerTransB.addActionListener(e -> {
	try {
		Transaction.remove_transaction(Integer.parseInt(IDSup.getText()));
		IDSup.setText("");
	}
	catch (Exception e1){myOption option=new myOption(e1);}
	
	
});

toutTrans.addActionListener(e -> {
	try {
		afficheTrans.setTable(Transaction.search_all(), SAffiche);
		centerPanel.remove(displayTrans);
		centerPanel.add(afficheTrans);
		
		centerPanel.revalidate();
		centerPanel.repaint();
	}
	catch (Exception e1){myOption option=new myOption(e1);}
	
	
});

filtreT.addActionListener(e -> {
	centerPanel.remove(displayTrans);
	centerPanel.add(FiltreP);
	Bcenter.add(searchTransB);
	
	centerPanel.revalidate();
	centerPanel.repaint();
	
});
searchTransB.addActionListener(e -> {
	try {
		
		afficheTrans.setTable(Transaction.search_by_ID(Integer.parseInt(searchIDT.getText())), SAffiche);
		searchIDT.setText("");
		
		centerPanel.add(afficheTrans);
		centerPanel.remove(FiltreP);
		Bcenter.remove(searchTransB);
		
		centerPanel.revalidate();
		centerPanel.repaint();
		Bcenter.revalidate();
		Bcenter.repaint();
	}
	catch (Exception e1){myOption option=new myOption(e1);}
	
	
});

hisClientB.addActionListener(e -> {
	try {
		afficheTrans.setTable(Transaction.historique_de_client(Integer.parseInt(hisID.getText())), SAffiche);
		centerPanel.remove(hisClient);
		centerPanel.add(afficheTrans);
		Bcenter.remove(hisClientB);
		hisID.setText(""); 
		
		centerPanel.revalidate();
		centerPanel.repaint();
	}
	catch (Exception e1){myOption option=new myOption(e1);}
	
	
});

editClientB.addActionListener(e -> {
	try {
		Client.modify(Integer.parseInt(editID.getText()), editNom.getText(), editPrenom.getText(), editNum.getText());
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	
	editID.setText("");
	editPrenom.setText("");
	editNum.setText("");
	editNom.setText("");
});

addButtonR.addActionListener(e -> {
	
	centerPanel.remove(center4);
	centerPanel.add(addRDV);
	
	Bcenter.add(addRB);
	
	centerPanel.revalidate();
	centerPanel.repaint();
	Bcenter.revalidate();
	Bcenter.repaint();
	
	
});

addRB.addActionListener(e ->{
	try {
		Render_vous.add_rv(ClientR.getText(),ImobR.getText(),dateR.getText());
		ImobR.setText("");
		ClientR.setText("");
		dateR.setText("");
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	
	
});

afficheButtonR.addActionListener(e -> {
	
	try {
		afficheRDV.setTable(Render_vous.search_all(), afficheRT);
		centerPanel.add(afficheRDV);
		centerPanel.remove(center4);
		
		centerPanel.revalidate();
		centerPanel.repaint();
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	
});

searchButtonR.addActionListener(e -> {
	centerPanel.remove(center4);
	centerPanel.add(searchRDV);
	
	
	
	Bcenter.add(searchRB);
	
	centerPanel.revalidate();
	centerPanel.repaint();
	
	Bcenter.revalidate();
	Bcenter.repaint();
});

searchRB.addActionListener(e -> {
	try {
		afficheRDV.setTable(Render_vous.search_by_ID(Integer.parseInt(TsearchRDV.getText())), afficheRT);
		TsearchRDV.setText("");
        centerPanel.add(afficheRDV);
        Bcenter.remove(searchRB);
        centerPanel.remove(searchRDV);
		centerPanel.revalidate();
		centerPanel.repaint();
		
		Bcenter.revalidate();
		Bcenter.repaint();
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	
	
	
});

annuleButtonR.addActionListener(e ->{
	centerPanel.remove(center4);
	centerPanel.add(annuleRDV);
	
	
	Bcenter.add(annuleRB);
	
	centerPanel.revalidate();
	centerPanel.repaint();
	
	Bcenter.revalidate();
	Bcenter.repaint();
	
});

annuleRB.addActionListener(e -> {
	try {
		Render_vous.remove_rv(Integer.parseInt(IDRDV.getText()));
		IDRDV.setText("");
	} catch (NumberFormatException e1) {
		myOption option=new myOption(e1);
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	
	
	
});

displayButtonB.addActionListener(e -> {
	
	try {
		afficherBien.setTable(Immobilier.search_all(), rechBien);
		centerPanel.remove(center1);
		centerPanel.add(afficherBien);
		
		frame.add(arrowBienP);
		
		centerPanel.revalidate();
		centerPanel.repaint();
		frame.revalidate();
		frame.repaint();
		
	} catch (Exception e1) {
		myOption option=new myOption(e1);
	}
	
});


	}
	catch(Exception e) { 
		myOption option=new myOption(e);}
}
}
