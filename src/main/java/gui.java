import java.awt.EventQueue;
import org.farmsim.*;
import org.farmsim.animals.Animal;
import org.farmsim.animals.Chicken;
import org.farmsim.animals.Cow;
import org.farmsim.animals.Sheep;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtFarmerName;
	public JTextField txtFarmName;
    public JTextField txtDuration;
    private Farm bd_farm;
    private Farm ul_farm;
    private Farm dl_farm;
    private Farm av_farm;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 54, 593, 196);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		final JPanel Details = new JPanel();
		Details.setBackground(Color.RED);
		layeredPane.add(Details, "name_1038316804179000");
		Details.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("Enter Famer Name:");
		lblNewLabel.setBounds(230, 49, 162, 14);
		Details.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("Enter Farm Name:");
		lblNewLabel_1.setBounds(230, 87, 185, 14);
		Details.add(lblNewLabel_1);
		
		final JLabel lblEnterDuration = new JLabel("Enter Duration:");
		lblEnterDuration.setBounds(230, 140, 151, 14);
		Details.add(lblEnterDuration);
		
		
		final JLabel lblNewLabel_2 = new JLabel("Welcome to the Farm Simulator");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(173, 11, 242, 14);
		Details.add(lblNewLabel_2);
		
		
		txtFarmerName = new JTextField();
		txtFarmerName.setBounds(423, 46, 86, 20);
		Details.add(txtFarmerName);
		txtFarmerName.setColumns(10);
		
		txtFarmName = new JTextField();
		txtFarmName.setColumns(10);
		txtFarmName.setBounds(423, 84, 86, 20);
		Details.add(txtFarmName);
		
		txtDuration = new JTextField();
		txtDuration.setColumns(10);
		txtDuration.setBounds(423, 137, 86, 20);
		Details.add(txtDuration);
		
		final JPanel animalPanel = new JPanel();
		animalPanel.setBackground(Color.GREEN);
		layeredPane.add(animalPanel, "name_1038319494741300");
		animalPanel.setLayout(null);
		
		this.bd_farm = new Farm(txtFarmName.getText(), 1, 1, 1, 1);
		final Animal bd_sheep = new Sheep();
		final Animal bd_chicken = new Chicken();
        final Animal bd_cow = new Cow();
        
		this.dl_farm = new Farm(txtFarmName.getText(), 25, 25, 25, 25);
		final Animal dl_sheep = new Sheep();
		final Animal dl_chicken = new Chicken();
        final Animal dl_cow = new Cow();
        
		this.ul_farm = new Farm(txtFarmName.getText(), 50, 50, 50, 50);
		final Animal ul_sheep = new Sheep();
		final Animal ul_chicken = new Chicken();
        final Animal ul_cow = new Cow();
        
		this.av_farm = new Farm(txtFarmName.getText(), 5, 5, 5, 5);
		final Animal av_sheep = new Sheep();
		final Animal av_chicken = new Chicken();
		final Animal av_cow = new Cow();
	
		
		final JLabel lblNewLabel_6 = new JLabel("Cash:");
		lblNewLabel_6.setBounds(163, 15, 46, 14);
		animalPanel.add(lblNewLabel_6);
		
		final JLabel lblcash = new JLabel("New label");
		lblcash.setBounds(219, 15, 46, 14);
		animalPanel.add(lblcash);
		
		
		final JLabel lblNewLabel_8 = new JLabel("Animal Happiness");
		lblNewLabel_8.setBounds(459, 15, 124, 14);
		animalPanel.add(lblNewLabel_8);
		
		final JLabel lblNewLabel_9 = new JLabel("Sheep:");
		lblNewLabel_9.setBounds(442, 45, 46, 14);
		animalPanel.add(lblNewLabel_9);
		
		final JLabel lblNewLabel_10 = new JLabel("Chicken:");
		lblNewLabel_10.setBounds(442, 94, 64, 14);
		animalPanel.add(lblNewLabel_10);
		
		final JLabel lblNewLabel_11 = new JLabel("Cow:");
		lblNewLabel_11.setBounds(442, 136, 46, 14);
		animalPanel.add(lblNewLabel_11);
		
		final JLabel lblsheepStat = new JLabel("New label");
		lblsheepStat.setBounds(509, 45, 46, 14);
		animalPanel.add(lblsheepStat);
		
		final JLabel lblchickenStat = new JLabel("New label");
		lblchickenStat.setBounds(509, 94, 46, 14);
		animalPanel.add(lblchickenStat);
		
		final JLabel lblcowStat = new JLabel("New label");
		lblcowStat.setBounds(509, 136, 46, 14);
		animalPanel.add(lblcowStat);
		
		
		final JPanel farmPanel = new JPanel();
		farmPanel.setBackground(Color.CYAN);
		layeredPane.add(farmPanel, "name_1038321406219800");
		farmPanel.setLayout(null);
		
		
		final JLabel lblNewLabel_12 = new JLabel("Farm Details");
		lblNewLabel_12.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_12.setBounds(464, 11, 103, 14);
		farmPanel.add(lblNewLabel_12);
		
		final JLabel lblNewLabel_13 = new JLabel("Farm Health:");
		lblNewLabel_13.setBounds(376, 44, 80, 14);
		farmPanel.add(lblNewLabel_13);
		
		final JLabel lblNewLabel_14 = new JLabel("Water Quality:");
		lblNewLabel_14.setBounds(376, 83, 93, 14);
		farmPanel.add(lblNewLabel_14);
		
		final JLabel lblNewLabel_15 = new JLabel("Soil Quality:");
		lblNewLabel_15.setBounds(376, 131, 80, 14);
		farmPanel.add(lblNewLabel_15);
		
		final JLabel lblNewLabel_16 = new JLabel("Crop Level:");
		lblNewLabel_16.setBounds(375, 166, 81, 14);
		farmPanel.add(lblNewLabel_16);
		
		final JLabel lblfarmHealth = new JLabel("New label");
		lblfarmHealth.setBounds(492, 44, 46, 14);
		farmPanel.add(lblfarmHealth);
		
		final JLabel lblwater = new JLabel("New label");
		lblwater.setBounds(492, 83, 46, 14);
		farmPanel.add(lblwater);
		
		final JLabel lblsoil = new JLabel("New label");
		lblsoil.setBounds(492, 131, 46, 14);
		farmPanel.add(lblsoil);
		
		final JLabel lblcrop = new JLabel("New label");
		lblcrop.setBounds(492, 166, 46, 14);
		farmPanel.add(lblcrop);
		
		final JLabel lblNewLabel_17 = new JLabel("Cash:");
		lblNewLabel_17.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		lblNewLabel_17.setBounds(185, 33, 46, 14);
		farmPanel.add(lblNewLabel_17);
		
		final JLabel lblcashFarm = new JLabel("New label");
		lblcashFarm.setBounds(241, 33, 46, 14);
		farmPanel.add(lblcashFarm);
		
		final JButton btnTendToFarmland = new JButton("Tend To Farmland");
		btnTendToFarmland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblfarmHealth.getText());
				int p = a += 20;
				lblfarmHealth.setText(Integer.toString(p));
				int d = Integer.parseInt(lblwater.getText());
				// int c = d += 20; // What was this for?
				lblwater.setText(Integer.toString(d));
			}
		});
		btnTendToFarmland.setBounds(10, 162, 152, 23);
		farmPanel.add(btnTendToFarmland);
		
		final JButton btncrops = new JButton("Tend To Crops");
		btncrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblcrop.getText());
				int d = a += 20;
				lblcrop.setText(Integer.toString(d));
				int l = Integer.parseInt(lblfarmHealth.getText());
				int p = l += 20;
				lblfarmHealth.setText(Integer.toString(p));
			}
		});
		btncrops.setBounds(10, 29, 152, 23);
		farmPanel.add(btncrops);
		
		final JButton btnharvest = new JButton("Sell Harvest");
		btnharvest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblcash.getText());
				int d = a += 500;
				lblcash.setText(Integer.toString(d));
				lblcashFarm.setText(Integer.toString(d));
				int l = Integer.parseInt(lblfarmHealth.getText());
				int p = l -= 20;
				lblfarmHealth.setText(Integer.toString(p));
				int f = Integer.parseInt(lblsoil.getText());
				int q = f -= 20;
				lblsoil.setText(Integer.toString(q));
				int s = Integer.parseInt(lblcrop.getText());
				int v = s -= 20;
				lblcrop.setText(Integer.toString(v));
			}
		});
		btnharvest.setBounds(10, 95, 152, 23);
		farmPanel.add(btnharvest);
		
		final JButton btnSellWool = new JButton("Sell Wool");
		btnSellWool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(lblcash.getText());
				int d = a += 30;
				lblcash.setText(Integer.toString(d));
				lblcashFarm.setText(Integer.toString(d));
				int l = Integer.parseInt(lblsheepStat.getText());
				int f = l -= 5;
				lblsheepStat.setText(Integer.toString(f));
			}
		});
		btnSellWool.setBounds(310, 162, 89, 23);
		animalPanel.add(btnSellWool);
		
		final JButton btnSellMilk = new JButton("Sell Milk");
		btnSellMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(lblcash.getText());
				int d = a += 50;
				lblcash.setText(Integer.toString(d));
				lblcashFarm.setText(Integer.toString(d));
				int l = Integer.parseInt(lblcowStat.getText());
				int f = l -= 5;
				lblcowStat.setText(Integer.toString(f));
			}
		});
		btnSellMilk.setBounds(163, 162, 89, 23);
		animalPanel.add(btnSellMilk);
		
		final JButton btnSellEggs = new JButton("Sell Eggs");
		btnSellEggs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(lblcash.getText());
				int d = a += 20;
				lblcash.setText(Integer.toString(d));
				lblcashFarm.setText(Integer.toString(d));
				int l = Integer.parseInt(lblchickenStat.getText());
				int f = l -= 5;
				lblchickenStat.setText(Integer.toString(f));
			}
		});
		btnSellEggs.setBounds(10, 162, 113, 23);
		animalPanel.add(btnSellEggs);
		
		final JPanel gamePanel = new JPanel();
		gamePanel.setBackground(Color.YELLOW);
		layeredPane.add(gamePanel, "name_1038323819769800");
		gamePanel.setLayout(null);
		
		final JLabel lblNewLabel_3 = new JLabel("Day No.");
		lblNewLabel_3.setBounds(33, 34, 46, 14);
		gamePanel.add(lblNewLabel_3);
		
		final JLabel lblDaysNo = new JLabel("New label");
		lblDaysNo.setBounds(89, 34, 100, 14);
		gamePanel.add(lblDaysNo);
		
		final JLabel lblNewLabel_5 = new JLabel("Farmer Name:");
		lblNewLabel_5.setBounds(199, 34, 84, 14);
		gamePanel.add(lblNewLabel_5);
		
		final JLabel lblFarmerName = new JLabel("New label");
		lblFarmerName.setBounds(293, 34, 75, 14);
		gamePanel.add(lblFarmerName);
		
		final JLabel lblNewLabel_7 = new JLabel("Farm Name:");
		lblNewLabel_7.setBounds(378, 34, 75, 14);
		gamePanel.add(lblNewLabel_7);
		
		final JLabel lblFarmName = new JLabel("New label");
		lblFarmName.setBounds(463, 34, 84, 14);
		gamePanel.add(lblFarmName);
		
		final JButton btnUltimateFarm = new JButton("Ultimate Farm");
		
		btnUltimateFarm.setBackground(Color.RED);
		btnUltimateFarm.setBounds(242, 103, 126, 23);
		gamePanel.add(btnUltimateFarm);
		
		final JButton btnDeluxeFarm = new JButton("Deluxe Farm");
		
		btnDeluxeFarm.setBackground(Color.RED);
		btnDeluxeFarm.setBounds(38, 162, 126, 23);
		gamePanel.add(btnDeluxeFarm);
		
		final JButton btnAverageFarm = new JButton("Average Farm");
		btnAverageFarm.setBackground(Color.RED);
		
		btnAverageFarm.setBounds(242, 162, 126, 23);
		gamePanel.add(btnAverageFarm);
		
		final JButton btnsheep = new JButton("Play-Feed Sheep");
		btnsheep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Gui.this.bd_farm != null & Gui.this.ul_farm != null & Gui.this.dl_farm != null) {
					int a = Integer.parseInt(lblsheepStat.getText());
					int d = a += 20;
					lblsheepStat.setText(Integer.toString(d));
				}
			}
		});
		btnsheep.setBounds(10, 11, 143, 23);
		animalPanel.add(btnsheep);
		
		final JButton btncow = new JButton("Play-Feed Cow");
		btncow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Gui.this.bd_farm != null & Gui.this.ul_farm != null & Gui.this.dl_farm != null) {
					int a = Integer.parseInt(lblcowStat.getText());
					int d = a += 20;
					lblcowStat.setText(Integer.toString(d));
				}
			}
		});
		btncow.setBounds(10, 107, 143, 23);
		animalPanel.add(btncow);
		
		final JButton btnchicken = new JButton("Play-Feed Chicken");
		btnchicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Gui.this.bd_farm != null & Gui.this.ul_farm != null & Gui.this.dl_farm != null) {
					int a = Integer.parseInt(lblchickenStat.getText());
					int d = a += 20;
					lblchickenStat.setText(Integer.toString(d));
				}
			}
		});
		btnchicken.setBounds(10, 61, 143, 23);
		animalPanel.add(btnchicken);
		
		final JButton btnBadFarm = new JButton("Bad Farm");
		btnBadFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Gui.this.av_farm = null;
				Gui.this.ul_farm = null;
				Gui.this.dl_farm = null;
				bd_cow.happiness = 10;
				bd_sheep.happiness = 10;
				bd_chicken.happiness = 10;
				lblchickenStat.setText(Integer.toString(bd_chicken.getHappy()));
				lblcowStat.setText(Integer.toString(bd_cow.getHappy()));
				lblsheepStat.setText(Integer.toString(bd_sheep.getHappy()));
				lblwater.setText(Integer.toString(bd_farm.waterQuality));
				lblsoil.setText(Integer.toString(bd_farm.soilQuality));
				lblfarmHealth.setText(Integer.toString(bd_farm.farmHealth));
				lblcrop.setText(Integer.toString(bd_farm.cropLevel));
				gamePanel.remove(btnAverageFarm);
				gamePanel.remove(btnUltimateFarm);
				gamePanel.remove(btnDeluxeFarm);
				gamePanel.repaint();
				gamePanel.revalidate();
			}
		});
		btnBadFarm.setBackground(Color.RED);
		btnBadFarm.setBounds(458, 162, 89, 23);
		gamePanel.add(btnBadFarm);
		
		
		btnDeluxeFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gui.this.av_farm = null;
				Gui.this.ul_farm = null;
				Gui.this.bd_farm = null;
				dl_cow.happiness = 50;
				dl_sheep.happiness = 50;
				dl_chicken.happiness = 50;
				lblchickenStat.setText(Integer.toString(dl_chicken.getHappy()));
				lblcowStat.setText(Integer.toString(dl_cow.getHappy()));
				lblsheepStat.setText(Integer.toString(dl_sheep.getHappy()));
				lblwater.setText(Integer.toString(dl_farm.waterQuality));
				lblsoil.setText(Integer.toString(dl_farm.soilQuality));
				lblfarmHealth.setText(Integer.toString(dl_farm.farmHealth));
				lblcrop.setText(Integer.toString(dl_farm.cropLevel));
				gamePanel.remove(btnBadFarm);
				gamePanel.remove(btnUltimateFarm);
				gamePanel.remove(btnAverageFarm);
				gamePanel.repaint();
				gamePanel.revalidate();
			}
		});
		
		btnUltimateFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gui.this.av_farm = null;
				Gui.this.bd_farm = null;
				Gui.this.dl_farm = null;
				ul_cow.happiness = 100;
				ul_sheep.happiness = 100;
				ul_chicken.happiness = 100;
				lblchickenStat.setText(Integer.toString(ul_chicken.getHappy()));
				lblcowStat.setText(Integer.toString(ul_cow.getHappy()));
				lblsheepStat.setText(Integer.toString(ul_sheep.getHappy()));
				lblwater.setText(Integer.toString(ul_farm.waterQuality));
				lblsoil.setText(Integer.toString(ul_farm.soilQuality));
				lblfarmHealth.setText(Integer.toString(ul_farm.farmHealth));
				lblcrop.setText(Integer.toString(ul_farm.cropLevel));
				gamePanel.remove(btnBadFarm);
				gamePanel.remove(btnDeluxeFarm);
				gamePanel.remove(btnAverageFarm);
				gamePanel.repaint();
				gamePanel.revalidate();
			}
		});
		
		btnAverageFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gui.this.bd_farm = null;
				Gui.this.ul_farm = null;
				Gui.this.dl_farm = null;
				av_cow.happiness = 20;
				av_sheep.happiness = 20;
				av_chicken.happiness = 20;
				lblchickenStat.setText(Integer.toString(av_chicken.getHappy()));
				lblcowStat.setText(Integer.toString(av_cow.getHappy()));
				lblsheepStat.setText(Integer.toString(av_sheep.getHappy()));
				lblwater.setText(Integer.toString(av_farm.waterQuality));
				lblsoil.setText(Integer.toString(av_farm.soilQuality));
				lblfarmHealth.setText(Integer.toString(av_farm.farmHealth));
				lblcrop.setText(Integer.toString(av_farm.cropLevel));
				gamePanel.remove(btnBadFarm);
				gamePanel.remove(btnUltimateFarm);
				gamePanel.remove(btnDeluxeFarm);
				gamePanel.repaint();
				gamePanel.revalidate();
			}
		});
		
		final JLabel lblNewLabel_4 = new JLabel("Choose Your Farm Type");
		lblNewLabel_4.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(209, 59, 254, 14);
		gamePanel.add(lblNewLabel_4);
		
		final JButton btnNextDay = new JButton("Next Day");
		btnNextDay.setBackground(Color.RED);
		btnNextDay.setBounds(23, 59, 89, 23);
		gamePanel.add(btnNextDay);
		
		final JPanel itemPanel = new JPanel();
		itemPanel.setBackground(Color.ORANGE);
		layeredPane.add(itemPanel, "name_1038326610564000");
		itemPanel.setLayout(null);
		
		final JButton btnGamePanel = new JButton("Game");
		btnGamePanel.setBackground(Color.YELLOW);
		btnGamePanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(gamePanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnGamePanel.setBounds(126, 20, 89, 23);
		contentPane.add(btnGamePanel);
		
		final JButton btnStartGame = new JButton("Start Game!");
		btnStartGame.setBackground(Color.MAGENTA);
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Have fun " + txtFarmerName.getText() + " you have " + txtDuration.getText() + " days.", "Welcome", JOptionPane.PLAIN_MESSAGE); 

				layeredPane.removeAll();
				layeredPane.add(gamePanel);
				layeredPane.repaint();
				layeredPane.revalidate();
				if ((txtFarmerName.getText() != null && !txtFarmerName.getText().isEmpty())) {
					lblFarmerName.setText(txtFarmerName.getText());
					
				} else {
					lblFarmerName.setText("choose Farmer Name");
				}
				
				if ((txtFarmName.getText() != null && !txtFarmName.getText().isEmpty())) {
					lblFarmName.setText(txtFarmName.getText());
					
				} else {
					lblFarmName.setText("choose Farm Name");
				}
				
				if ((txtDuration.getText() != null && !txtDuration.getText().isEmpty())) {
					lblDaysNo.setText(txtDuration.getText());
					
				} else {
					lblDaysNo.setText("choose Duration");
				}
				
				GameEnv game = new GameEnv(txtFarmerName.getText(), Integer.parseInt(txtDuration.getText()));
				lblcash.setText(Integer.toString(game.defaultStartingCash));
				lblcashFarm.setText(Integer.toString(game.defaultStartingCash));;
			}
		});
		btnStartGame.setBounds(21, 162, 124, 23);
		Details.add(btnStartGame);
		
		
		final JButton btnAnimalsPanel = new JButton("Animals");
		btnAnimalsPanel.setBackground(Color.YELLOW);
		btnAnimalsPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(animalPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnAnimalsPanel.setBounds(240, 20, 89, 23);
		contentPane.add(btnAnimalsPanel);
		
		final JButton btnFarm = new JButton("Farm");
		btnFarm.setBackground(Color.YELLOW);
		btnFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(farmPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnFarm.setBounds(367, 20, 89, 23);
		contentPane.add(btnFarm);
		
		final JButton btnItems = new JButton("Items");
		btnItems.setBackground(Color.YELLOW);
		btnItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(itemPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnItems.setBounds(500, 20, 89, 23);
		contentPane.add(btnItems);
		
		final JButton btnStartPanel = new JButton("Details");
		btnStartPanel.setBackground(Color.YELLOW);
		btnStartPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(Details);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnStartPanel.setBounds(10, 20, 89, 23);
		contentPane.add(btnStartPanel);
	}
}
