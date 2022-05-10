import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class InterrogazioneGui {
	
	private JFrame frame;
	private JTextField textAlunni;
	int[] num= new int [100];
	int cc=0;
	int val=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterrogazioneGui window = new InterrogazioneGui();
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
	public InterrogazioneGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBounds(100, 100, 382, 709);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAgg = new JLabel("");
		lblAgg.setForeground(new Color(255, 51, 51));
		lblAgg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAgg.setBounds(10, 633, 346, 30);
		frame.getContentPane().add(lblAgg);
		
		DefaultListModel listEstrazione = new DefaultListModel();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 160, 312, 319);
		frame.getContentPane().add(scrollPane);
		
		JList listaStorico = new JList();
		scrollPane.setViewportView(listaStorico);
		
		JButton btnEstrai = new JButton("ESTRAI");
		btnEstrai.setBackground(new Color(255, 255, 0));
		btnEstrai.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEstrai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ee=0;
				int ii=0;
				 
				int b=Integer.parseInt(textAlunni.getText());
				
					ee=(int) (Math.random()*b)+1;
					for(int i=0;i<b;i++)
					{
						if(val==b)
						{
							lblAgg.setText("  ESTRATTI TUTTI I NUMERI ");
							btnEstrai.setVisible(false);
							
						}
						if(ee==num[i])
						{
							lblAgg.setText(" NUMERO "+ee+" già ESTRATTO  ");
							
						ii++;
						
						}
						
					}
					
					
						if(ii==0) {

						listEstrazione.addElement("ESTRATTO ALUNNO N°"+ee);	
						
						num[cc]=ee;
						cc++;
						val++;
						}
						ii=0;
				
					
					
				
				listaStorico.setModel(listEstrazione);
				
			}
		});
		btnEstrai.setBounds(26, 490, 140, 60);
		frame.getContentPane().add(btnEstrai);
		
		JButton btnSvuota = new JButton("SVUOTA ");
		btnSvuota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listEstrazione.clear();
				 lblAgg.setText("PULIZIA GUI ");
			}
		});
		btnSvuota.setBackground(new Color(51, 204, 51));
		btnSvuota.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSvuota.setBounds(202, 491, 136, 60);
		frame.getContentPane().add(btnSvuota);
		
		JButton btnEstrai_1 = new JButton("ESCI");
		btnEstrai_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEstrai_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEstrai_1.setBackground(new Color(204, 0, 51));
		btnEstrai_1.setBounds(108, 562, 140, 60);
		frame.getContentPane().add(btnEstrai_1);
		
		
		
		JLabel lblTitle = new JLabel("ESTRAZIONE");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTitle.setBounds(86, 11, 183, 30);
		frame.getContentPane().add(lblTitle);
		
		
		
		JLabel lblNumAlllunni = new JLabel("NUMERO DI ALUNNI");
		lblNumAlllunni.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumAlllunni.setBounds(10, 73, 126, 28);
		frame.getContentPane().add(lblNumAlllunni);
		
		textAlunni = new JTextField();
		textAlunni.setHorizontalAlignment(SwingConstants.CENTER);
		textAlunni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textAlunni.setFont(new Font("Tahoma", Font.BOLD, 13));
		textAlunni.setForeground(new Color(0, 0, 0));
		textAlunni.setBounds(145, 71, 33, 30);
		frame.getContentPane().add(textAlunni);
		textAlunni.setColumns(10);
		textAlunni.setText(""+20);
		JButton btnInsert = new JButton("INSERISCI");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(textAlunni.getText());
				 lblAgg.setText("E' STATA CREATA UNA CLASSE DI "+b+" ALUNNI ");
				 for(int i=0; i<100;i++)
				 {
					 
					 num[i]=0;
				 }
				 listEstrazione.addElement("--------------------------------------------------------------");
				 listEstrazione.addElement("ESTRAZIONE DI "+b+"  ALUNNI"); 
				 listEstrazione.addElement("--------------------------------------------------------------");
				 listaStorico.setModel(listEstrazione);
				 cc=0;
				 val=0;
				 btnEstrai.setVisible(true);
			}
		});
		btnInsert.setBackground(new Color(0, 102, 153));
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInsert.setBounds(202, 73, 136, 28);
		frame.getContentPane().add(btnInsert);
		
		JLabel lblStorico = new JLabel("STORICO");
		lblStorico.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStorico.setHorizontalAlignment(SwingConstants.CENTER);
		lblStorico.setBounds(126, 103, 102, 75);
		frame.getContentPane().add(lblStorico);
		
		
	}
}
