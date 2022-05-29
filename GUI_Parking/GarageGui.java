package esJavaList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;

public class GarageGui {
	private Garage veicoli= new  Garage();
	int c=0;
	int ora,minuto;
	private JFrame frame;
	private JTextField textM;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GarageGui window = new GarageGui();
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
	public GarageGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 767, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultListModel listGarage = new DefaultListModel();
		
		JLabel lblTitolo = new JLabel("GARAGE");
		lblTitolo.setForeground(Color.RED);
		lblTitolo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblTitolo.setBounds(167, 5, 220, 54);
		frame.getContentPane().add(lblTitolo);
		
		JLabel lblOrologio = new JLabel("OROLOGIO");
		lblOrologio.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOrologio.setBounds(576, 118, 109, 33);
		frame.getContentPane().add(lblOrologio);
		
		JTextField textH = new JTextField();
		textH.setHorizontalAlignment(SwingConstants.CENTER);
		textH.setEditable(false);
		textH.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		textH.setForeground(Color.GREEN);
		textH.setBackground(Color.BLACK);
		textH.setBounds(548, 162, 54, 47);
		frame.getContentPane().add(textH);
		textH.setColumns(10);
		textH.setText(""+8);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(614, 170, 18, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textM = new JTextField();
		textM.setHorizontalAlignment(SwingConstants.CENTER);
		textM.setEditable(false);
		textM.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textM.setForeground(Color.GREEN);
		textM.setColumns(10);
		textM.setBackground(Color.BLACK);
		textM.setBounds(633, 162, 54, 47);
		frame.getContentPane().add(textM);
		textM.setText(""+00);
		JButton btnESC = new JButton("ESCI");
		btnESC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnESC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnESC.setBounds(570, 663, 89, 33);
		frame.getContentPane().add(btnESC);
		
		JLabel lblPrezzi = new JLabel("Furgone = 2\u20AC ora ///  Autovettura = 1,5 \u20AC ora /// Motocicletta = 1 \u20AC ora");
		lblPrezzi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrezzi.setBounds(45, 569, 415, 24);
		frame.getContentPane().add(lblPrezzi);
		
		JRadioButton rdbtnFurgone = new JRadioButton("Furogone");
		rdbtnFurgone.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(rdbtnFurgone);
		rdbtnFurgone.setBounds(47, 614, 109, 23);
		frame.getContentPane().add(rdbtnFurgone);
		
		JRadioButton rdbtnMoto = new JRadioButton("Motocicletta");
		rdbtnMoto.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(rdbtnMoto);
		rdbtnMoto.setBounds(323, 614, 141, 23);
		frame.getContentPane().add(rdbtnMoto);
		
		JRadioButton rdbtnAuto = new JRadioButton("Autovettura");
		rdbtnAuto.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnAuto.setBounds(167, 614, 109, 23);
		frame.getContentPane().add(rdbtnAuto);
		
		JButton btnEnter = new JButton("ENTRATA");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ora=Integer.parseInt(textH.getText());
				minuto=Integer.parseInt(textM.getText());
				if(rdbtnFurgone.isSelected())
				{
					veicoli[c]= new VeicoloInGarage(ora,minuto,Furgone);
				}
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEnter.setBounds(45, 661, 126, 38);
		frame.getContentPane().add(btnEnter);
		
		JButton btnCambia = new JButton("CAMBIA");
		btnCambia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s=0;
				s=Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'ora da lei richiesta"));
				textH.setText(""+s);
				s=Integer.parseInt(JOptionPane.showInputDialog("Inserisci i minuti da lei richiesti"));
				textM.setText(""+s);

			}
		});
		btnCambia.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCambia.setBounds(558, 458, 117, 47);
		frame.getContentPane().add(btnCambia);
		
		JLabel lblNewLabel_1 = new JLabel("CAMBIA ORARIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(564, 419, 111, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnView = new JButton("VISUALIZZA PARCHEGGIO");
		btnView.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnView.setBounds(505, 244, 228, 47);
		frame.getContentPane().add(btnView);
		
		JButton btnEscCicle = new JButton("USCITA");
		btnEscCicle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEscCicle.setBounds(250, 662, 126, 36);
		frame.getContentPane().add(btnEscCicle);
		
		JButton btnFreePlace = new JButton("VISUALIZZA POSTI LIBERI");
		btnFreePlace.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFreePlace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFreePlace.setBounds(505, 304, 228, 38);
		frame.getContentPane().add(btnFreePlace);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 485, 485);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Segoe UI Historic", Font.ITALIC, 11));
		scrollPane.setViewportView(list);
		list.setForeground(Color.WHITE);
		list.setBackground(Color.DARK_GRAY);
		
		JButton btnOccupetedPlace = new JButton("VISUALIZZA POSTI OCCUPATI");
		btnOccupetedPlace.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOccupetedPlace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOccupetedPlace.setBounds(505, 353, 228, 42);
		frame.getContentPane().add(btnOccupetedPlace);
	}
}