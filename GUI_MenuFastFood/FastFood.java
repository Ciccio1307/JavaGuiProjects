import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class FastFood {
	float totale=0;
	int cont=0;
	String scontrino=""; 
	private JFrame frmFastfoodorder;
	private JTextField textQauntchckbxMenu1;
	private JTextField textquanchckbxMenu2;
	private JTextField textQuantchckbxMenu3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textQuantBirra;
	private JTextField textQuantCoke;
	private JTextField textTot;
	private JTextField textAcqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FastFood window = new FastFood();
					window.frmFastfoodorder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FastFood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFastfoodorder = new JFrame();
		frmFastfoodorder.setForeground(new Color(0, 0, 0));
		frmFastfoodorder.setBackground(new Color(255, 0, 0));
		frmFastfoodorder.setTitle("FastFoodOrder");
		frmFastfoodorder.getContentPane().setFont(new Font("Showcard Gothic", Font.PLAIN, 11));
		frmFastfoodorder.getContentPane().setBackground(new Color(255, 235, 205));
		frmFastfoodorder.setBounds(100, 100, 845, 721);
		frmFastfoodorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFastfoodorder.getContentPane().setLayout(null);
		
		DefaultListModel listFood = new DefaultListModel();
		
		JLabel lblTitle = new JLabel("FAST FOOD");
		lblTitle.setForeground(Color.RED);
		lblTitle.setFont(new Font("Showcard Gothic", Font.BOLD, 32));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(303, 11, 240, 43);
		frmFastfoodorder.getContentPane().add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(26, 93, 377, 157);
		frmFastfoodorder.getContentPane().add(panel);
		panel.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(446, 93, 373, 394);
		frmFastfoodorder.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.BOLD, 10));
		scrollPane.setViewportView(list);
		
		JLabel lblSubTitle = new JLabel("SCELGA COSA MANGIARE");
		lblSubTitle.setBounds(80, 11, 183, 23);
		panel.add(lblSubTitle);
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		
		JCheckBox chckbxMenu1 = new JCheckBox("Men\u00F9_1");
		chckbxMenu1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		chckbxMenu1.setBounds(10, 41, 97, 23);
		panel.add(chckbxMenu1);
		chckbxMenu1.setBackground(new Color(245, 222, 179));
		
		JCheckBox chckbxMenu2 = new JCheckBox("Men\u00F9_2");
		chckbxMenu2.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		chckbxMenu2.setBackground(new Color(245, 222, 179));
		chckbxMenu2.setBounds(10, 78, 97, 23);
		panel.add(chckbxMenu2);
		
		JCheckBox chckbxMenu3 = new JCheckBox("Men\u00F9_3");
		chckbxMenu3.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		chckbxMenu3.setBackground(new Color(245, 222, 179));
		chckbxMenu3.setBounds(6, 116, 97, 23);
		panel.add(chckbxMenu3);
		
		JLabel lblNewLabel = new JLabel("\u20AC5");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(161, 43, 46, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u20AC6");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(161, 80, 46, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u20AC7");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(161, 118, 46, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("quantita'");
		lblNewLabel_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(217, 41, 73, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("quantita'");
		lblNewLabel_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(217, 80, 73, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("quantita'");
		lblNewLabel_3_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(217, 118, 73, 14);
		panel.add(lblNewLabel_3_2);
		
		textQauntchckbxMenu1 = new JTextField();
		textQauntchckbxMenu1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textQauntchckbxMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		textQauntchckbxMenu1.setBounds(300, 32, 52, 28);
		panel.add(textQauntchckbxMenu1);
		textQauntchckbxMenu1.setColumns(10);
		
		textquanchckbxMenu2 = new JTextField();
		textquanchckbxMenu2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textquanchckbxMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		textquanchckbxMenu2.setColumns(10);
		textquanchckbxMenu2.setBounds(300, 71, 52, 28);
		panel.add(textquanchckbxMenu2);
		
		textQuantchckbxMenu3 = new JTextField();
		textQuantchckbxMenu3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textQuantchckbxMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		textQuantchckbxMenu3.setColumns(10);
		textQuantchckbxMenu3.setBounds(300, 109, 52, 28);
		panel.add(textQuantchckbxMenu3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 222, 179));
		panel_1.setBounds(26, 251, 377, 168);
		frmFastfoodorder.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblScelgaCosaBere = new JLabel("SCELGA COSA BERE");
		lblScelgaCosaBere.setBounds(87, 11, 183, 23);
		panel_1.add(lblScelgaCosaBere);
		lblScelgaCosaBere.setHorizontalAlignment(SwingConstants.CENTER);
		lblScelgaCosaBere.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		
		JCheckBox chckbxBirra = new JCheckBox("BIRRA");
		chckbxBirra.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		chckbxBirra.setBackground(new Color(245, 222, 179));
		chckbxBirra.setBounds(6, 55, 97, 23);
		panel_1.add(chckbxBirra);
		
		JCheckBox chckbxCocaCola = new JCheckBox("COCA COLA");
		chckbxCocaCola.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		chckbxCocaCola.setBackground(new Color(245, 222, 179));
		chckbxCocaCola.setBounds(6, 100, 97, 23);
		panel_1.add(chckbxCocaCola);
		
		JLabel lblNewLabel_5 = new JLabel("\u20AC2");
		lblNewLabel_5.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_5.setBounds(163, 57, 46, 16);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u20AC1");
		lblNewLabel_6.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_6.setBounds(163, 102, 46, 16);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_3 = new JLabel("quantita'");
		lblNewLabel_3_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(219, 57, 73, 14);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("quantita'");
		lblNewLabel_3_4.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_4.setBounds(219, 102, 73, 14);
		panel_1.add(lblNewLabel_3_4);
		
		textQuantBirra = new JTextField();
		textQuantBirra.setFont(new Font("Tahoma", Font.BOLD, 14));
		textQuantBirra.setHorizontalAlignment(SwingConstants.CENTER);
		textQuantBirra.setColumns(10);
		textQuantBirra.setBounds(302, 41, 52, 28);
		panel_1.add(textQuantBirra);
		
		textQuantCoke = new JTextField();
		textQuantCoke.setFont(new Font("Tahoma", Font.BOLD, 14));
		textQuantCoke.setHorizontalAlignment(SwingConstants.CENTER);
		textQuantCoke.setColumns(10);
		textQuantCoke.setBounds(302, 93, 52, 28);
		panel_1.add(textQuantCoke);
		
		JCheckBox chckbxAcqua = new JCheckBox("ACQUA");
		chckbxAcqua.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		chckbxAcqua.setBackground(new Color(245, 222, 179));
		chckbxAcqua.setBounds(6, 138, 97, 23);
		panel_1.add(chckbxAcqua);
		
		JLabel lblNewLabel_6_1 = new JLabel("\u20AC 0,5");
		lblNewLabel_6_1.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(163, 140, 46, 16);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("quantita'");
		lblNewLabel_3_4_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_4_1.setBounds(219, 140, 73, 14);
		panel_1.add(lblNewLabel_3_4_1);
		
		textAcqua = new JTextField();
		textAcqua.setHorizontalAlignment(SwingConstants.CENTER);
		textAcqua.setFont(new Font("Tahoma", Font.BOLD, 14));
		textAcqua.setColumns(10);
		textAcqua.setBounds(302, 132, 52, 28);
		panel_1.add(textAcqua);
		
		JButton btnNewButton = new JButton("ESCI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Showcard Gothic", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(26, 573, 89, 23);
		frmFastfoodorder.getContentPane().add(btnNewButton);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 222, 179));
		panel_2.setBounds(26, 430, 248, 103);
		frmFastfoodorder.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDomicilio = new JLabel("DOMICILIO");
		lblDomicilio.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomicilio.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		lblDomicilio.setBounds(27, 11, 183, 23);
		panel_2.add(lblDomicilio);
	
		
		JLabel lblNewLabel_4 = new JLabel("\u20AC3");
		lblNewLabel_4.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_4.setBounds(121, 37, 46, 16);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("GRATIS");
		lblNewLabel_4_1.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(121, 75, 69, 16);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblListaComanda = new JLabel("LISTA COMANDA");
		lblListaComanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaComanda.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		lblListaComanda.setBounds(539, 65, 183, 23);
		frmFastfoodorder.getContentPane().add(lblListaComanda);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("TOTALE DA PAGARE");
		lblNewLabel_3_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 12));
		lblNewLabel_3_3_1.setBounds(446, 533, 120, 14);
		frmFastfoodorder.getContentPane().add(lblNewLabel_3_3_1);
		
		textTot = new JTextField();
		textTot.setFont(new Font("Tahoma", Font.BOLD, 14));
		textTot.setEditable(false);
		textTot.setHorizontalAlignment(SwingConstants.CENTER);
		textTot.setColumns(10);
		textTot.setBounds(577, 528, 125, 28);
		frmFastfoodorder.getContentPane().add(textTot);
		
		JLabel lblNewLabel_4_2 = new JLabel("\u20AC");
		lblNewLabel_4_2.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(712, 535, 46, 16);
		frmFastfoodorder.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblAgg = new JLabel("");
		lblAgg.setForeground(new Color(255, 69, 0));
		lblAgg.setFont(new Font("Showcard Gothic", Font.BOLD, 15));
		lblAgg.setBounds(26, 629, 793, 42);
		frmFastfoodorder.getContentPane().add(lblAgg);
		
		JRadioButton rdbtnSi = new JRadioButton("SI");
		buttonGroup.add(rdbtnSi);
		rdbtnSi.setFont(new Font("Showcard Gothic", Font.BOLD, 11));
		rdbtnSi.setBackground(new Color(245, 222, 179));
		rdbtnSi.setBounds(6, 35, 109, 23);
		panel_2.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBackground(new Color(245, 222, 179));
		rdbtnNo.setFont(new Font("Showcard Gothic", Font.BOLD, 11));
		rdbtnNo.setBounds(6, 73, 109, 23);
		panel_2.add(rdbtnNo);
		
		
		JButton btnCalcola = new JButton("CALCOLA");
		btnCalcola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int menu;
				
				if(chckbxMenu1.isSelected())
				{
					menu=Integer.parseInt(textQauntchckbxMenu1.getText());
					totale=totale+(5*menu);
					scontrino=scontrino+("MENU' 1 NUM "+menu);
				}
				if(chckbxMenu2.isSelected())
				{
					menu=Integer.parseInt(textquanchckbxMenu2.getText());
					totale=totale+(6*menu);
					scontrino=scontrino+(" MENU' 2 NUM "+menu);
				}
				if(chckbxMenu3.isSelected())
				{
					menu=Integer.parseInt(textQuantchckbxMenu3.getText());
					totale=totale+(7*menu);
					scontrino=scontrino+(" MENU' 3 NUM "+menu);
				}
				if(chckbxBirra.isSelected())
				{
					menu=Integer.parseInt(textQuantBirra.getText());
					totale=totale+(2*menu);
					scontrino=scontrino+(" BIRRA  NUM "+menu);
				}
				if(chckbxCocaCola.isSelected())
				{
					menu=Integer.parseInt(textQuantCoke.getText());
					totale=totale+(1*menu);
					scontrino=scontrino+(" COCA COLA  NUM "+menu);
				}
				if(chckbxAcqua.isSelected())
				{
					menu=Integer.parseInt(textAcqua.getText());
					totale=(float) (totale+(0.5*menu));
					scontrino=scontrino+(" ACQUA  NUM "+menu);
				}
				if(rdbtnSi.isSelected())
				{
		
					totale=totale+3;
					scontrino=scontrino+(" CONSEGNA A DOMICILIO ");
				}
				if(rdbtnSi.isSelected())
				{
		
					
					scontrino=scontrino+(" ORDINE RITIRATO IN LOCO ");
				}
				textTot.setText(""+totale);
				
				lblAgg.setText("E' STATO EFFETTUATO UN ORDINE ");
				listFood.addElement((cont+1)+" ) ordine "+" TOTALE IMPORTO "+totale+" € E' STATO SELEZIONATO "+ scontrino);
				list.setModel(listFood);
				totale=0;
				
				textQauntchckbxMenu1.setText("");
				textquanchckbxMenu2.setText("");
				textQuantchckbxMenu3.setText("");
				textQuantBirra.setText("");
				textQuantCoke.setText("");
				textAcqua.setText("");
				chckbxMenu1.setSelected(false);
				chckbxMenu2.setSelected(false);
				chckbxMenu3.setSelected(false);
				chckbxBirra.setSelected(false);
				chckbxCocaCola.setSelected(false);
				rdbtnSi.setSelected(false);
				rdbtnNo.setSelected(false);
				
			}
		});
		btnCalcola.setFont(new Font("Showcard Gothic", Font.BOLD, 11));
		btnCalcola.setBackground(new Color(0, 255, 0));
		btnCalcola.setBounds(269, 573, 89, 23);
		frmFastfoodorder.getContentPane().add(btnCalcola);
		
		JButton btnCancella = new JButton("CANCELLA");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTot.setText("");
				textQauntchckbxMenu1.setText("");
				textquanchckbxMenu2.setText("");
				textQuantchckbxMenu3.setText("");
				textQuantBirra.setText("");
				textQuantCoke.setText("");
				textAcqua.setText("");
				chckbxAcqua.setSelected(false);
				chckbxMenu1.setSelected(false);
				chckbxMenu2.setSelected(false);
				chckbxMenu3.setSelected(false);
				chckbxBirra.setSelected(false);
				chckbxCocaCola.setSelected(false);
				rdbtnSi.setSelected(false);
				rdbtnNo.setSelected(false);
				
				lblAgg.setText(" ORDINE IN CORSO ELIMINATO ");
			}
		});

		btnCancella.setFont(new Font("Showcard Gothic", Font.BOLD, 11));
		btnCancella.setBackground(new Color(127, 255, 212));
		btnCancella.setBounds(145, 573, 89, 23);
		frmFastfoodorder.getContentPane().add(btnCancella);
		
		JButton btnSvuotaGui = new JButton("SVUOTA GUI");
		btnSvuotaGui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listFood.clear();
				cont=0;
				lblAgg.setText(" ORDINI ELIMINATI ");
			}
		});
		btnSvuotaGui.setFont(new Font("Showcard Gothic", Font.BOLD, 11));
		btnSvuotaGui.setBackground(new Color(128, 0, 0));
		btnSvuotaGui.setBounds(377, 573, 109, 23);
		frmFastfoodorder.getContentPane().add(btnSvuotaGui);
		
		
	}
}
