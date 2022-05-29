package ese4CinfJAVAvisu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;

public class calcolatriceext {
	double a=0,b=0,tot=0;
	double mem;
	String tott;

	private JFrame frame;
	private JTextField textFieldcampo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcolatriceext window = new calcolatriceext();
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
	public calcolatriceext() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.setBounds(100, 100, 492, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitolo = new JLabel("CALCOLATRICE");
		lblTitolo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitolo.setBounds(124, 11, 113, 14);
		frame.getContentPane().add(lblTitolo);
		
		
		
		JButton btnnum1 = new JButton("1");
		btnnum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"1");
			}
		});
		btnnum1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum1.setBounds(46, 107, 89, 23);
		frame.getContentPane().add(btnnum1);
		
		JButton btnnum2 = new JButton("2");
		btnnum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"2");
			}
		});
		btnnum2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum2.setBounds(134, 107, 89, 23);
		frame.getContentPane().add(btnnum2);
		
		JButton btnnum3 = new JButton("3");
		btnnum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"3");
			}
		});
		btnnum3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum3.setBounds(219, 107, 89, 23);
		frame.getContentPane().add(btnnum3);
		
		
		
		
		JButton btnnum4 = new JButton("4");
		btnnum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"4");
			}
		});
		btnnum4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum4.setBounds(46, 140, 89, 23);
		frame.getContentPane().add(btnnum4);
		
		JButton btnnum5 = new JButton("5");
		btnnum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					textFieldcampo.setText(textFieldcampo.getText()+"5");
				
			}
		});
		btnnum5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum5.setBounds(134, 141, 89, 23);
		frame.getContentPane().add(btnnum5);
		
		JButton btnnum6 = new JButton("6");
		btnnum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"6");

			}
		});
		btnnum6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum6.setBounds(219, 140, 89, 23);
		frame.getContentPane().add(btnnum6);
		
		JButton btnnum7 = new JButton("7");
		btnnum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"7");

			}
		});
		btnnum7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum7.setBounds(46, 174, 89, 23);
		frame.getContentPane().add(btnnum7);
		
		JButton btnnum8 = new JButton("8");
		btnnum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"8");

			}
		});
		btnnum8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum8.setBounds(134, 175, 89, 23);
		frame.getContentPane().add(btnnum8);
		
		JButton btnnum9 = new JButton("9");
		btnnum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"9");

			}
		});
		btnnum9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum9.setBounds(219, 174, 89, 23);
		frame.getContentPane().add(btnnum9);
		
		JButton btnnum0 = new JButton("0");
		btnnum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+"0");

			}
		});
		btnnum0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnnum0.setBounds(134, 208, 89, 23);
		frame.getContentPane().add(btnnum0);
		
		JButton btncanc = new JButton("C");
		btncanc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText("");
			}
		});
		btncanc.setFont(new Font("Tahoma", Font.BOLD, 12));
		btncanc.setBounds(46, 208, 89, 23);
		frame.getContentPane().add(btncanc);
		DefaultListModel lista = new DefaultListModel();
		JList listaOpe = new JList();
		listaOpe.setBounds(340, 91, 118, 240);
		frame.getContentPane().add(listaOpe); 
		JButton btnuguale = new JButton("=");
		btnuguale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ope=null;
				b=Double.parseDouble(textFieldcampo.getText());
				if(tott=="+")
				{
					tot=a+b;
					ope=a+"+"+b;
					
				}
				if(tott=="-")
				{
					tot=a-b;
					ope=a+"-"+b;
				}
				if(tott=="x")
				{
					tot=a*b;
					ope=a+"x"+b;
				}
				if(tott=="/")
				{
					tot=a/b;
					ope=a+"/"+b;
				}
				if(tott=="%")
				{
					tot=a%b;
					ope=a+"%"+b;
				}
				textFieldcampo.setText(""+tot);
				
				lista.addElement(ope);
				listaOpe.setModel(lista);
				
				tot=0;
			}
		});
		btnuguale.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnuguale.setBounds(134, 276, 89, 23);
		frame.getContentPane().add(btnuguale);
		
		JButton btnpiu = new JButton("+");
		btnpiu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textFieldcampo.getText());
				tott="+";
				textFieldcampo.setText("");
			}
		});
		btnpiu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnpiu.setBounds(46, 329, 89, 23);
		frame.getContentPane().add(btnpiu);
		
		JButton btnmeno = new JButton("-");
		btnmeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textFieldcampo.getText());
				tott="-";
				textFieldcampo.setText("");
			}
		});
		btnmeno.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnmeno.setBounds(134, 329, 89, 23);
		frame.getContentPane().add(btnmeno);
		
		JButton btndiviso = new JButton("x");
		btndiviso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textFieldcampo.getText());
				tott="x";
				textFieldcampo.setText("");
			}
		});
		btndiviso.setFont(new Font("Tahoma", Font.BOLD, 12));
		btndiviso.setBounds(46, 363, 89, 23);
		frame.getContentPane().add(btndiviso);
		
		JButton btnmoltiplicazione = new JButton("/");
		btnmoltiplicazione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textFieldcampo.getText());
				tott="/";
				textFieldcampo.setText("");
			}
		});
		btnmoltiplicazione.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnmoltiplicazione.setBounds(134, 363, 89, 23);
		frame.getContentPane().add(btnmoltiplicazione);
		
		textFieldcampo = new JTextField();
		textFieldcampo.setBounds(46, 50, 262, 46);
		frame.getContentPane().add(textFieldcampo);
		textFieldcampo.setColumns(10);
		
		JButton btnESC = new JButton("ESCI");
		btnESC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnESC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnESC.setBounds(219, 363, 89, 23);
		frame.getContentPane().add(btnESC);
		
		JButton btnmodulo = new JButton("m");
		btnmodulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				a=Double.parseDouble(textFieldcampo.getText());
				tott="%";
				textFieldcampo.setText("");
			
			}
		});
		btnmodulo.setFont(new Font("Symbol", Font.PLAIN, 11));
		btnmodulo.setBounds(219, 329, 94, 23);
		frame.getContentPane().add(btnmodulo);
		
		JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+".");
			}
		});
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnpoint.setBounds(46, 242, 89, 23);
		frame.getContentPane().add(btnpoint);
		
		JButton btnRecallMem = new JButton("RM");
		btnRecallMem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcampo.setText(textFieldcampo.getText()+mem);
			}
		});
		btnRecallMem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRecallMem.setBounds(134, 242, 89, 23);
		frame.getContentPane().add(btnRecallMem);
		
		JButton btnCancelMem = new JButton("CM");
		btnCancelMem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mem=0;
			}
		});
		btnCancelMem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelMem.setBounds(219, 243, 89, 23);
		frame.getContentPane().add(btnCancelMem);
		
		JButton btnMem = new JButton("M");
		btnMem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mem=Double.parseDouble(textFieldcampo.getText());
			}
		});
		btnMem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMem.setBounds(219, 209, 89, 23);
		frame.getContentPane().add(btnMem);
		
		JLabel lblNewLabel = new JLabel("AZIONI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(380, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
	
		
		 
		
		
	}
}