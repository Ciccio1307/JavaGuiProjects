import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class VeicoloGui {
	Veicolo p[]=new Veicolo [30];
	int cc=0;
	private JFrame frame;
	private JTextField textTarga;
	private JTextField textMarca;
	private JTextField textModel;
	private JTextField textImm;
	private JTextField textCond;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textPow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VeicoloGui window = new VeicoloGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VeicoloGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DefaultListModel listVe = new DefaultListModel();
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.info);
		frame.setBounds(100, 100, 1239, 853);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TASSE VEICOLO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(285, 11, 217, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserisci la targa");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(42, 87, 151, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textTarga = new JTextField();
		textTarga.setBounds(42, 118, 163, 20);
		frame.getContentPane().add(textTarga);
		textTarga.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Inserisci la marca");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(42, 163, 151, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		textMarca.setBounds(42, 194, 163, 20);
		frame.getContentPane().add(textMarca);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Inserisci il modello");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(42, 240, 163, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textModel = new JTextField();
		textModel.setColumns(10);
		textModel.setBounds(42, 271, 163, 20);
		frame.getContentPane().add(textModel);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Inserisci anno immatricolazione");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(42, 320, 259, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textImm = new JTextField();
		textImm.setColumns(10);
		textImm.setBounds(42, 351, 163, 20);
		frame.getContentPane().add(textImm);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.info);
		panel.setBounds(28, 572, 548, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Inserisci il tipo di  alimentazione auto");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 11, 390, 20);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JRadioButton rdbtnTrad = new JRadioButton("Gasolio o Benziona");
		rdbtnTrad.setBounds(10, 52, 151, 23);
		panel.add(rdbtnTrad);
		buttonGroup_1.add(rdbtnTrad);
		rdbtnTrad.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnTrad.setBackground(SystemColor.info);
		
		JRadioButton rdbtnGPL = new JRadioButton("GPL");
		rdbtnGPL.setBounds(166, 52, 63, 23);
		panel.add(rdbtnGPL);
		buttonGroup_1.add(rdbtnGPL);
		rdbtnGPL.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnGPL.setBackground(SystemColor.info);
		
		JRadioButton rdbtnMetano = new JRadioButton("METANO");
		rdbtnMetano.setBounds(231, 52, 95, 23);
		panel.add(rdbtnMetano);
		buttonGroup_1.add(rdbtnMetano);
		rdbtnMetano.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnMetano.setBackground(SystemColor.info);
		
		JRadioButton rdbtnIdro = new JRadioButton("GAS IDROGENO");
		rdbtnIdro.setBounds(328, 52, 121, 23);
		panel.add(rdbtnIdro);
		buttonGroup_1.add(rdbtnIdro);
		rdbtnIdro.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnIdro.setBackground(SystemColor.info);
		
		JRadioButton rdbtnEle = new JRadioButton("ELETTRICA");
		rdbtnEle.setBounds(449, 52, 93, 23);
		panel.add(rdbtnEle);
		buttonGroup_1.add(rdbtnEle);
		rdbtnEle.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnEle.setBackground(SystemColor.info);
		
		JLabel lblAgg = new JLabel("");
		lblAgg.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAgg.setBounds(28, 760, 1169, 43);
		frame.getContentPane().add(lblAgg);
		
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Inserisci numero di passeggeri oltre conducente");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1.setBounds(42, 407, 390, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		textCond = new JTextField();
		textCond.setColumns(10);
		textCond.setBounds(42, 448, 163, 20);
		frame.getContentPane().add(textCond);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Inserisci il tipo di  veicolo");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(42, 502, 390, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JRadioButton rdbtnMoto = new JRadioButton("Moto");
		rdbtnMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
			}
		});
		buttonGroup.add(rdbtnMoto);
		rdbtnMoto.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnMoto.setBackground(SystemColor.info);
		rdbtnMoto.setBounds(42, 544, 109, 23);
		frame.getContentPane().add(rdbtnMoto);
		
		JRadioButton rdbtnAuto = new JRadioButton("Auto");
		rdbtnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAuto.isSelected())
				{
					panel.setVisible(true);
				}
			}
		});
		buttonGroup.add(rdbtnAuto);
		rdbtnAuto.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnAuto.setBackground(SystemColor.info);
		rdbtnAuto.setBounds(171, 544, 109, 23);
		frame.getContentPane().add(rdbtnAuto);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Inserisci la potenza");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_2.setBounds(42, 654, 176, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		textPow = new JTextField();
		textPow.setColumns(10);
		textPow.setBounds(42, 685, 163, 20);
		frame.getContentPane().add(textPow);
		
		JLabel lblNewLabel_2 = new JLabel("GUI");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(791, 87, 259, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(649, 148, 548, 479);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.BOLD, 12));
		scrollPane.setViewportView(list);
		
		JButton btnCalc = new JButton("CALCOLA TASSE");
		btnCalc.setBackground(Color.GREEN);
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String marca=textMarca.getText();
				String targa=textTarga.getText();
				String modello=textModel.getText();
				int anno=Integer.parseInt(textImm.getText());
				int num=Integer.parseInt(textCond.getText());;
				int pote=Integer.parseInt(textPow.getText());
				double tassa=0;
				if(rdbtnMoto.isSelected())
				{
					p[cc]=new MotoVeicoli(targa,marca,modello,anno,num,pote);
					tassa=p[cc].calcTassa();
					JOptionPane.showMessageDialog(null,"IL CALCOLO TASSE DI QUESTA MOTO E'"+tassa+" EURO"  );
					lblAgg.setText("E' STATA CALCOLATA LA TASSA ANNUALE DI UNA MOTO");
					listVe.addElement(p[cc].toString());
					list.setModel(listVe);
					cc++;
					
				}
				if(rdbtnTrad.isSelected())
				{
					p[cc]=new AutoveTrad(targa,marca,modello,anno,num,pote);
					tassa=p[cc].calcTassa();
					JOptionPane.showMessageDialog(null,"IL CALCOLO TASSE DI QUESTA AUTO A GASOLIO O BENZINA E'"+tassa+" EURO"  );
					listVe.addElement(p[cc].toString());
					list.setModel(listVe);
					cc++;
					lblAgg.setText("E' STATA CALCOLATA LA TASSA ANNUALE DI UN AUTO ");
				}
				if(rdbtnGPL.isSelected())
				{
					p[cc]=new AutoVeGas(targa,marca,modello,anno,num,pote,0);
					tassa=p[cc].calcTassa();
					JOptionPane.showMessageDialog(null,"IL CALCOLO TASSE DI QUESTA AUTO A GPL E'"+tassa+" EURO"  );
					lblAgg.setText("E' STATA CALCOLATA LA TASSA ANNUALE DI UN AUTO ");
					listVe.addElement(p[cc].toString());
					list.setModel(listVe);
					cc++;
				}
				if(rdbtnMetano.isSelected())
				{
					p[cc]=new AutoVeGas(targa,marca,modello,anno,num,pote,1);
					tassa=p[cc].calcTassa();
					JOptionPane.showMessageDialog(null,"IL CALCOLO TASSE DI QUESTA AUTO A METANO E'"+tassa+" EURO"  );
					lblAgg.setText("E' STATA CALCOLATA LA TASSA ANNUALE DI UN AUTO ");
					listVe.addElement(p[cc].toString());
					list.setModel(listVe);
					cc++;
				}if(rdbtnIdro.isSelected())
				{
					p[cc]=new AutoVeIdro(targa,marca,modello,anno,num,pote);
					tassa=p[cc].calcTassa();
					JOptionPane.showMessageDialog(null,"IL CALCOLO TASSE DI QUESTA AUTO A GAS IDROGENO E'"+tassa+" EURO"  );
					lblAgg.setText("E' STATA CALCOLATA LA TASSA ANNUALE DI UN AUTO ");
					listVe.addElement(p[cc].toString());
					list.setModel(listVe);
					cc++;
				}
				if(rdbtnEle.isSelected())
				{
					p[cc]=new AutoVeElett(targa,marca,modello,anno,num,pote);
					tassa=p[cc].calcTassa();
					JOptionPane.showMessageDialog(null,"IL CALCOLO TASSE DI QUESTA AUTO ELETTRICA E'"+tassa+" EURO"  );
					lblAgg.setText("E' STATA CALCOLATA LA TASSA ANNUALE DI UN AUTO ");
					listVe.addElement(p[cc].toString());
					list.setModel(listVe);
					cc++;
				}
				textMarca.setText("");
				textTarga.setText("");
				textModel.setText("");
				textImm.setText("");
				textCond.setText("");
				textPow.setText("");
				panel.setVisible(false);
				
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalc.setBounds(42, 726, 151, 23);
		frame.getContentPane().add(btnCalc);
		
		JButton btnEsci = new JButton("ESCI");
		btnEsci.setBackground(Color.RED);
		btnEsci.setForeground(Color.BLACK);
		btnEsci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEsci.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEsci.setBounds(216, 728, 151, 23);
		frame.getContentPane().add(btnEsci);
		
		
		
		

	}
}
