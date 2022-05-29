package ese4CinfJAVAvisu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pilaGui {
	Lista20 p1 = new Lista20() ;
	private JFrame frame;
	private JTextField txtDatoNodo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pilaGui window = new pilaGui();
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
	public pilaGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JList listaPila = new JList();
		listaPila.setBounds(301, 108, 209, 320);
		frame.getContentPane().add(listaPila);
		
		JLabel lblNewLabel = new JLabel("PILA");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel.setBounds(242, 9, 69, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dato Nodo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(34, 82, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtDatoNodo = new JTextField();
		txtDatoNodo.setBounds(34, 106, 108, 20);
		frame.getContentPane().add(txtDatoNodo);
		txtDatoNodo.setColumns(10);
		DefaultListModel lista2 = new DefaultListModel();
		JButton btnInsert = new JButton("Inserisci Nodo");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ss;
				ss=Integer.parseInt(txtDatoNodo.getText());
				Nodo20 ss1 = new Nodo20 (ss);
				p1.insert(ss1);
				lista2.addElement(ss1);
				listaPila.setModel(lista2);
				
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInsert.setBounds(34, 199, 131, 23);
		frame.getContentPane().add(btnInsert);
		
		JButton btnCancel = new JButton("Cancella Nodo");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.delete();
				lista2.remove(listaPila.getLastVisibleIndex());
				listaPila.setModel(lista2);

			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(34, 233, 131, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnSvuota = new JButton("Svuota Lista");
		btnSvuota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.empty();
				lista2.clear();
				listaPila.setModel(lista2);
				
			}
		});
		btnSvuota.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSvuota.setBounds(34, 267, 131, 23);
		frame.getContentPane().add(btnSvuota);
		
		JLabel lblNewLabel_2 = new JLabel("Contenuto Pila");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(339, 82, 138, 14);
		frame.getContentPane().add(lblNewLabel_2);
	
		
		JButton btnLista = new JButton("Lista la Pila");
		btnLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nodo20 corrente=p1.primoNodo();
				lista2.addElement("--------------------------------");
				while(corrente!=null)
				{
					lista2.addElement(""+corrente.dato);
					corrente=p1.getNodoSuccessivo(corrente);
				}
				listaPila.setModel(lista2);
				}
				
				
			
		});
		btnLista.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLista.setBounds(262, 462, 145, 23);
		frame.getContentPane().add(btnLista);
		
		JButton btnSvuotaGui = new JButton("Svuota Lista (GUI)");
		btnSvuotaGui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista2.removeAllElements();
				listaPila.setModel(lista2);
			}
		});
		btnSvuotaGui.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSvuotaGui.setBounds(428, 463, 157, 20);
		frame.getContentPane().add(btnSvuotaGui);
	}
	
}
