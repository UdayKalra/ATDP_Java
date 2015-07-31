 

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.text.DecimalFormat;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 * Enter two states to get the flight length and other details.
 * @author Uday
 * @version 1.0
 */
public class MapPrint implements ActionListener{
	static HashMap <String,State>stateList;
	static String[] states = {"Arizona", "California", "Florida", "Georgia", "Idaho", "Kentucky", "Maryland", 
			"Minnesota", "Mississippi", "Montana", "Nebraska", "New York", "Oklahoma", "Oregon", "Texas", "Utah", "Washington",
			"Washington D.C.", "Wyoming"};
	JComboBox depart;
	JComboBox arrive;
	static JFrame window;
	static JTextArea des;
	public static Color fontColor = new Color(68, 121, 143);//Blue
	/**
	 * 
	 * Creates the GUI, Button, and calls DrawMap.
	 * @param a The main argument.
	 */
	public static void main(String[] a) {
		MapPrint mp = new MapPrint();
		stateList = new HashMap<String,State>();

		window = new JFrame("CountryMap");
		window.setLayout(new BorderLayout());
		mp.addData();
		mp.createForm();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, 1920, 1080);
		window.getContentPane().add(new DrawMap());
		window.setVisible(true);

	}

	/**
	 * Creates the GUI. The layout used is GridBagLayout. There are JLabels, JTextAreas, JComboBoxes, and a JButton.
	 */
	private  void createForm(){
		Font font = new Font("Serif", Font.BOLD, 20);
		JPanel pan = new JPanel();
		pan.setPreferredSize(new Dimension(400,50));
		pan.setMaximumSize(new Dimension(400,50));
		pan.setLayout(new GridBagLayout());
		pan.setBorder(BorderFactory.createLineBorder(Color.black));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(2,2,2,2);
		gbc.anchor = GridBagConstraints.PAGE_START;

		JLabel title = new JLabel("Please select Departing and Arriving States: ");
		title.setFont(font);
		depart = new JComboBox(states);
		depart.setEditable(false);
		depart.setFont(font);
		depart.addActionListener(this);
		depart.setActionCommand("reset");
		arrive = new JComboBox(states);
		arrive.setEditable(false);
		arrive.setFont(font);
		arrive.addActionListener(this);
		arrive.setActionCommand("reset");
		JButton butt = new JButton("Go!");
		butt.setActionCommand("Go");
		butt.addActionListener(this);
		butt.setPreferredSize(new Dimension(80,60));
		butt.setFont(font);

		gbc.gridx = 0;gbc.gridy = 0;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		gbc.weightx = gbc.weighty = 0.0;
		pan.add(title,gbc);
		
		gbc.gridx = 0;gbc.gridy = 2;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		gbc.weightx = gbc.weighty = 0.0;
		JLabel from = new JLabel("From: ");
		from.setFont(font);
		pan.add(from,gbc);
		
		gbc.gridx = 0;gbc.gridy = 4;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		gbc.weightx = gbc.weighty = 0.0;
		pan.add(depart,gbc);
		
		gbc.gridx = 0;gbc.gridy = 20;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		gbc.weightx = gbc.weighty = 0.0;
		JLabel to = new JLabel("To: ");
		to.setFont(font);
		pan.add(to,gbc);
		
		gbc.gridx = 0;gbc.gridy = 25;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		gbc.weightx = gbc.weighty = 0.0;
		pan.add(arrive,gbc);
		
		gbc.fill = GridBagConstraints.CENTER;
		gbc.gridx = 0;gbc.gridy = 30;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		gbc.weightx = gbc.weighty = 0.0;
		pan.add(butt,gbc);
		
		gbc.fill = GridBagConstraints.BOTH;
		JPanel extra = new JPanel();
		//extra.setPreferredSize(new Dimension(300,20));
		//extra.setMaximumSize(new Dimension(300,20));
		gbc.gridx = 0;gbc.gridy = 200;
		gbc.gridwidth = 50; gbc.gridheight = 200;
		gbc.weightx = 1; gbc.weighty = 1;
		pan.add(extra,gbc);
		
		
		des = new JTextArea("\n\n\n\nDescription: \n");
		des.setEditable(false);
		des.setFont(font);
		des.setPreferredSize(new Dimension(300,500));
		des.setMaximumSize(new Dimension(300,500));
		des.setMinimumSize(new Dimension(300,200));
		des.setBackground(extra.getBackground());
		des.setForeground(fontColor);
		extra.add(des,gbc);
		
		
		
		window.add(pan, BorderLayout.EAST);
		
	}
	/**
	 *Draws the lines and gives details once the button is pressed.
	 * @param e Button Press.
	 */
	public void actionPerformed(ActionEvent e){
		
		Graphics2D g2 = (Graphics2D) window.getGraphics();
		g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.BLUE);
		if(e.getActionCommand().equals("Go")){
			
			String to = (String) depart.getSelectedItem();
			String from = (String) arrive.getSelectedItem();
			State y = stateList.get(to);
			State x = stateList.get(from);
			double xone = x.getPoint().getX()+9;
			double yone = x.getPoint().getY()+30;
			double xtwo = y.getPoint().getX()+9;
			double ytwo = y.getPoint().getY()+30;
			double distance = Math.sqrt((xone-xtwo)*(xone-xtwo) + (yone-ytwo)*(yone-ytwo));
			final double SCALE = 0.00449274889;
			double flight = distance*SCALE;
			QuadCurve2D.Double curve = new QuadCurve2D.Double(xone, yone,((xone+xtwo)/2),((yone+ytwo)/2)-100, xtwo, ytwo);

			if(to.equals(from)){
				JOptionPane.showMessageDialog(window,"Please enter two different States!","Attention!",JOptionPane.ERROR_MESSAGE);
			}else{
			
			g2.draw(curve);
			}
			DecimalFormat time = new DecimalFormat("#.#");
			time.format(flight);
			String de = (String) arrive.getSelectedItem();
			State data = stateList.get(de);
			des.setText("\n\n\nDescription: \n"+data.getDesc()+"\nFlight Length: "+time.format(flight)+" hours");
			
			
		}else if(e.getActionCommand().equals("reset")){
			
			window.repaint();
		}

	}
	/**
	 */
	private  void addData(){
		
		//California
		
		State california = new State("California");
		Point2D.Double sac = new Point2D.Double(101,390);
		california.setPoint(sac);
		california.setDesc("State: California\nPopulation: 38.8 Million\nBird: California Quail\nFlower: California Poppy"
				+ "\nCapital: Sacramento\nAnimal: Grizzly Bear\nMotto: Eureka\nSong: I Love You,"
				+ " California\nFish: Golden Trout");
		stateList.put("California", california);
		
		//Washington
		
		State washington = new State("Washington");
		Point2D.Double sal = new Point2D.Double(150,96);
		washington.setPoint(sal);
		washington.setDesc("State: Washington\nPopulation: 7.1 Million\nBird: American Goldfinch\nFlower: Pacific Rhododendron"
				+ "\nCapital: Olympia\nAnimal: Olympic Marmot\nMotto: Al-ki\nSong: Washington,"
				+ " My Home\nFish: Rainbow Trout");
		stateList.put("Washington", washington);
		
		//Arizona
		
		State arizona = new State("Arizona");
		Point2D.Double Ariz = new Point2D.Double(317,622);
		arizona.setPoint(Ariz);
		arizona.setDesc("State: Arizona\nPopulation: 6.7 Million\nBird: Cactus Wren\nFlower: Saguaro"
				+ "\nCapital: Phoenix\nAnimal: Arizona Ringtail\nMotto: Ditat Deus\nSong: The Arizona"
				+ " March Song\nFish: Apache Trout");
		stateList.put("Arizona", arizona);
		
		//Texas
		
		State texas = new State("Texas");
		Point2D.Double tex = new Point2D.Double(718,770);
		texas.setPoint(tex);
		texas.setDesc("State: Texas\nPopulation: 27 Million\nBird: Northern Mockingbird\nFlower: Bluebonnet"
				+ "\nCapital: Austin\nAnimal: Armadillo\nMotto: Friendship\nSong: Texas,"
				+ " Our Texas\nFish: Guadalupe bass");
		stateList.put("Texas", texas);
		
		//Florida
		
	    State florida = new State("Florida");
		Point2D.Double flor = new Point2D.Double(1116,733);
		florida.setPoint(flor);
		florida.setDesc("State: Florida\nPopulation: 19.9 Million\nBird: Northern Mockingbird\nFlower: Orange Blossom"
				+ "\nCapital: Tallahassee\nAnimal: Florida Panther\nMotto: In God we trust\nSong: Old Folks at Home"
				+ "\nFish: Florida Largemouth Bass");
		stateList.put("Florida", florida);
			
		//Washington D.C.
		
		State washingtonDC = new State("Washington");
		Point2D.Double dc = new Point2D.Double(1268,412);
		washingtonDC.setPoint(dc);
		washingtonDC.setDesc("State: Washington D.C.\nPopulation: 658,893\nBird: Wood Thrush\nFlower: Rose(red)"
				+ "\nCapital: Washington D.C.\nAnimal: \nMotto: Justia Omnibus\nSong: The Star-Spangle Banner"
				+ "\nFish: American beauty rose");
		stateList.put("Washington D.C.", washingtonDC);
		
		//New York
		
		State newyork = new State("New York");
		Point2D.Double nyo = new Point2D.Double(1319,267);
		newyork.setPoint(nyo);
		newyork.setDesc("State: New York\nPopulation: 19.8 Million\nBird: Eastern bluebird\nFlower: Rose"
				+ "\nCapital: Albany\nAnimal: Beaver\nMotto: Excelsior\nSong: I Love New York"
				+ "\nFish: Brook Trout");
		stateList.put("New York", newyork);

	       //Nebraska

        State nebraska = new State("Nebraska");
        Point2D.Double neb = new Point2D.Double(748,410);
        nebraska.setPoint(neb);
        nebraska.setDesc("State: Nebraska\nPopulation: 1.9 Million\nBird: Western Meadowlark\nFlower: Goldenrod"
                + "\nCapital: Lincoln\nAnimal: White-tailed Deer\nMotto: Equality before the law\nSong: Beautiful Nebraska"
                + "\nFish: Channel Catfish");
        stateList.put("Nebraska", nebraska);

        //Kentucky
        
        State kentucky = new State("Kentucky");
        Point2D.Double ken = new Point2D.Double(1070,476);
        kentucky.setPoint(ken);
        kentucky.setDesc("State: Kentucky\nPopulation: 4.4 Million\nBird: Cardinal\nFlower: Goldenrod"
                + "\nCapital: Frankfort\nAnimal: Eastern Gray Squirrel\nMotto: United we stand, divided we fall\nSong: My Old Kentucky Home"
                + "\nFish: Spotted Bass");
        stateList.put("Kentucky", kentucky);
        
        
        //Idaho
        
        State idaho = new State("Idaho");
        Point2D.Double ida = new Point2D.Double(266,262);
        idaho.setPoint(ida);
        idaho.setDesc("State: Idaho\nPopulation: 1.6 Million\nBird: Mountain bluebird\nFlower: Syringa"
                + "\nCapital: Boise\nAnimal: Potato\nMotto: Esto perpetua\nSong: Here We Have Idaho"
                + "\nFish: Cutthroat trout");
        stateList.put("Idaho", idaho);
        
        //Oregon
        State oregon = new State("Oregon");
        Point2D.Double ore = new Point2D.Double(118,167);
        oregon.setPoint(ore);
        oregon.setDesc("State: Oregon\nPopulation: 4 Million\nBird: Western meadowlark\nFlower: Oregon Grape"
                + "\nCapital: Salem\nAnimal: Beaver\nMotto: Alis volat propriis\nSong: Oregon, My Oregon "
                + "\nFish: Chinook salmon");
        stateList.put("Oregon", oregon);
        
        //Utah
        
        State utah = new State("Utah");
        Point2D.Double uta = new Point2D.Double(360,375);
        utah.setPoint(uta);
        utah.setDesc("State: Utah\nPopulation: 2.9 Million\nBird: Gull\nFlower: Sego Lilly"
                + "\nCapital: Salt Lake City\nAnimal: Elk\nMotto: Industry\nSong: Utah, This is the Place"
                + "\nFish: Bonneville cutthroat trout");
        stateList.put("Utah", utah);
		
		//Oklahoma
		
	    State oklahoma = new State("Oklahoma");
		Point2D.Double okl = new Point2D.Double(726,577);
		oklahoma.setPoint(okl);
		oklahoma.setDesc("State: Oklahoma\nPopulation: 3.9 Million\nBird: Scissor-tailed flycatcher\nFlower: Rosa 'Oklahoma'"
                + "\nCapital: Oklahoma City\nAnimal: Buffalo\nMotto: Labor omnia vincit\nSong: Oklahoma"
                + "\nFish: White bass");
		stateList.put("Oklahoma", oklahoma);
			
		//Wyoming
		
		State wyoming = new State("Wyoming");
		Point2D.Double wyo = new Point2D.Double(531,378);
		wyoming.setPoint(wyo);
		wyoming.setDesc("State: Wyoming\nPopulation: 584,153\nBird: Western Meadowlark\nFlower: Indian Paintbrush"
                + "\nCapital: Cheyenne\nAnimal: Bison\nMotto: Equal Rights\nSong: Wyoming"
                + "\nFish: Cutthroat trout");
		stateList.put("Wyoming", wyoming);
		
		//Georgia
		
		State georgia = new State("Georgia");
		Point2D.Double geo = new Point2D.Double(1094,609);
		georgia.setPoint(geo);
		georgia.setDesc("State: Georgia\nPopulation: 10.1 Million\nBird: Brown Thrasher\nFlower: Cherokee rose"
                + "\nCapital: Atlanta\nAnimal: Right Whale\nMotto: Wisdom, Justice, Moderation\nSong: Georgia on My Mind"
                + "\nFish: Largemouth bass");
		stateList.put("Georgia", georgia);
		
		//Montana
		
		State montana = new State("Montana");
		Point2D.Double mon = new Point2D.Double(387,179);
		montana.setPoint(mon);
		montana.setDesc("State: Montana\nPopulation: 1.0 Million\nBird: Western meadowlark\nFlower: Bitterroot"
                + "\nCapital: Helena\nAnimal: Grizzly Bear\nMotto: Gold and Silver\nSong: Montana"
                + "\nFish: Cutthroat trout");
		stateList.put("Montana", montana);
		
		//Minnesota
		
		State minnesota = new State("Minnesota");
		Point2D.Double min = new Point2D.Double(836,258);
		minnesota.setPoint(min);
		minnesota.setDesc("State: Minnesota\nPopulation: 5.5 Million\nBird: Common Loon\nFlower: Lady's Slipper"
                + "\nCapital: Saint Paul\nAnimal: White-tailed Deer\nMotto: L'toile du Nord\nSong: Northern Star"
                + "\nFish: Walleye");
		stateList.put("Minnesota", minnesota);
		
		//Mississippi
		
		State mississippi = new State("Mississippi");
		Point2D.Double mis = new Point2D.Double(938,682);
		mississippi.setPoint(mis);
		mississippi.setDesc("State: Minnesota\nPopulation: 3 Million\nBird: Nprthern Mockingbird\nFlower: Magnolia"
                + "\nCapital: Jackson\nAnimal: White-tailed Deer\nMotto: Seal of Mississippi\nSong: Go, Mississippi"
                + "\nFish: Largemouth bass");
		stateList.put("Mississippi", mississippi);
		
		//Maryland
		
		State maryland = new State("Maryland");
		Point2D.Double mar = new Point2D.Double(1288,404);
		maryland.setPoint(mar);
		maryland.setDesc("State: Maryland\nPopulation: 6 Million\nBird: Baltimore Oriole\nFlower: Black Eyed, Susan"
                + "\nCapital: Annapolis\nAnimal: Chesapeake Bay Retriever\nMotto: Fatti maschii, parole femine\nSong: Maryland, My Maryland"
                + "\nFish: Rockfish");
		stateList.put("Maryland", maryland);
	}
}