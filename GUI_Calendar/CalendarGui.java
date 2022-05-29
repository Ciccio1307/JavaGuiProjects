import java.awt.EventQueue;
import javax.swing.*; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class CalendarioGui {

	private JFrame frmDfd;
	private JTextField textInizialeGiorno;
	private JTextField textInizialeMese;
	private JTextField textFinaleGiorno;
	private JTextField textFinaleMese;
	private JTextField textInizialeAnno;
	private JTextField textFinaleAnno;
	private JTextField textCalcolo;
	private JTextField textInizio;
	private JTextField textFinale;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarioGui window = new CalendarioGui();
					window.frmDfd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalendarioGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDfd = new JFrame();
		frmDfd.getContentPane().setBackground(new Color(204, 204, 255));
		frmDfd.setTitle("CalendarioGui");
		frmDfd.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		frmDfd.setBackground(UIManager.getColor("ToolBar.dockingForeground"));
		frmDfd.setBounds(100, 100, 588, 574);
		frmDfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDfd.getContentPane().setLayout(null);
		
		JLabel lblAgg = new JLabel("");
		lblAgg.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAgg.setBounds(29, 461, 514, 63);
		frmDfd.getContentPane().add(lblAgg);
		
		
		JLabel lblNewLabel = new JLabel("CALENDARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Eras Demi ITC", Font.BOLD, 27));
		lblNewLabel.setBounds(161, 12, 222, 43);
		frmDfd.getContentPane().add(lblNewLabel);
		
		JPanel panelFin = new JPanel();
		panelFin.setBackground(Color.GRAY);
		panelFin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelFin.setBounds(46, 254, 222, 56);
		frmDfd.getContentPane().add(panelFin);
		panelFin.setLayout(null);
		
		JPanel panelIni = new JPanel();
		panelIni.setBackground(Color.GRAY);
		panelIni.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelIni.setBounds(39, 137, 229, 56);
		frmDfd.getContentPane().add(panelIni);
		panelIni.setLayout(null);
		
		JRadioButton rdbtnString = new JRadioButton("INSERIMENTO STRINGA");
		rdbtnString.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFin.setVisible(false);
				panelIni.setVisible(false);
				textInizio.setVisible(true);
				textFinale.setVisible(true);
				textCalcolo.setText("");
				lblAgg.setText("ATTIVATO INSERIMENTO DATA DA STRINGA");
			}
		});
		buttonGroup.add(rdbtnString);
		rdbtnString.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnString.setBackground(new Color(153, 204, 255));
		rdbtnString.setBounds(310, 62, 160, 29);
		frmDfd.getContentPane().add(rdbtnString);
		
		
		JRadioButton rdbtnManu = new JRadioButton("INSERIMENTO MANUALE");
		rdbtnManu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFin.setVisible(true);
				panelIni.setVisible(true);
				textInizio.setVisible(false);
				textFinale.setVisible(false);
				textCalcolo.setText("");
				lblAgg.setText("ATTIVATO INSERIMENTO DATA DA MENU'");
			}
		});
		buttonGroup.add(rdbtnManu);
		rdbtnManu.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnManu.setBackground(new Color(153, 204, 255));
		rdbtnManu.setBounds(86, 62, 160, 30);
		frmDfd.getContentPane().add(rdbtnManu);
		
		JButton btnData1 = new JButton("VERIFICA DATA");
		btnData1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				short g=0,m=0,a=0;
						boolean c;
						if(rdbtnString.isSelected())
						{
						g=Short.parseShort(textInizio.getText().substring(0, 2));
						m=Short.parseShort(textInizio.getText().substring(3, 5));
						a=Short.parseShort(textInizio.getText().substring(6, 10));
				DataDiCalendario i = new DataDiCalendario(m,a,g);
				c=i.verifyDate();
				if(c==true)
				{
					JOptionPane.showMessageDialog(null,"LA DATA  E' CORRETTA");
				}else {
					JOptionPane.showMessageDialog(null,"LA DATA NON E' CORRETTA");
				}
			}
						if(rdbtnManu.isSelected())
						{
							g=Short.parseShort(textInizialeGiorno.getText());
							m=Short.parseShort(textInizialeMese.getText());
							a=Short.parseShort(textInizialeAnno.getText());
							DataDiCalendario i = new DataDiCalendario(m,a,g);
							c=i.verifyDate();
							if(c==true)
							{
								JOptionPane.showMessageDialog(null,"LA DATA  E' CORRETTA");
							}else {
								JOptionPane.showMessageDialog(null,"LA DATA NON E' CORRETTA");
							}
							
			}
						lblAgg.setText("VERIFICA DELLA DATA INIZIALE ");
			}
			
		});
		
		
		
	
		
		
		
		btnData1.setBackground(new Color(51, 255, 102));
		btnData1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnData1.setBounds(303, 164, 149, 43);
		frmDfd.getContentPane().add(btnData1);
		
		JButton btnData2 = new JButton("VERIFICA DATA");
		btnData2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				short g=0,m=0,a=0;
				boolean c;
				if(rdbtnString.isSelected())
				{
				g=Short.parseShort(textFinale.getText().substring(0, 2));
				m=Short.parseShort(textFinale.getText().substring(3, 5));
				a=Short.parseShort(textFinale.getText().substring(6, 10));
				DataDiCalendario f = new DataDiCalendario(m,a,g);
				c=f.verifyDate();
				if(c==true)
				{
					JOptionPane.showMessageDialog(null,"LA DATA  E' CORRETTA");
				}else {
					JOptionPane.showMessageDialog(null,"LA DATA  NON E' CORRETTA");
				}
			}
				if(rdbtnManu.isSelected())
				{
					g=Short.parseShort(textFinaleGiorno.getText());
					m=Short.parseShort(textFinaleMese.getText());
					a=Short.parseShort(textFinaleAnno.getText());
					DataDiCalendario f = new DataDiCalendario(m,a,g);
					c=f.verifyDate();
					if(c==true)
					{
						JOptionPane.showMessageDialog(null,"LA DATA  E' CORRETTA");
					}else {
						JOptionPane.showMessageDialog(null,"LA DATA  NON E' CORRETTA");
					}
				}
				lblAgg.setText("VERIFICA DELLA DATA FINALE ");
		
			}
		});
		btnData2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnData2.setBackground(new Color(51, 255, 102));
		btnData2.setBounds(303, 283, 149, 43);
		frmDfd.getContentPane().add(btnData2);
		
		textInizio = new JTextField();
		textInizio.setFont(new Font("Tahoma", Font.BOLD, 17));
		textInizio.setHorizontalAlignment(SwingConstants.CENTER);
		textInizio.setBounds(303, 110, 229, 43);
		frmDfd.getContentPane().add(textInizio);
		textInizio.setColumns(10);
		
		textFinale = new JTextField();
		textFinale.setFont(new Font("Tahoma", Font.BOLD, 17));
		textFinale.setHorizontalAlignment(SwingConstants.CENTER);
		textFinale.setBounds(303, 218, 222, 43);
		frmDfd.getContentPane().add(textFinale);
		textFinale.setColumns(10);
		
		JLabel lblDataIniziale = new JLabel("Data Iniziale");
		lblDataIniziale.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataIniziale.setFont(new Font("Felix Titling", Font.BOLD, 12));
		lblDataIniziale.setBounds(29, 98, 141, 43);
		frmDfd.getContentPane().add(lblDataIniziale);
		
		
		
		textInizialeGiorno = new JTextField();
		textInizialeGiorno.setBounds(21, 15, 38, 30);
		panelIni.add(textInizialeGiorno);
		textInizialeGiorno.setFont(new Font("Tahoma", Font.BOLD, 13));
		textInizialeGiorno.setHorizontalAlignment(SwingConstants.CENTER);
		textInizialeGiorno.setColumns(10);
		
		JLabel lblDataFinale_1_1 = new JLabel("/");
		lblDataFinale_1_1.setBounds(51, 9, 47, 43);
		panelIni.add(lblDataFinale_1_1);
		lblDataFinale_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataFinale_1_1.setFont(new Font("Felix Titling", Font.BOLD, 12));
		
		textInizialeMese = new JTextField();
		textInizialeMese.setBounds(88, 15, 38, 30);
		panelIni.add(textInizialeMese);
		textInizialeMese.setHorizontalAlignment(SwingConstants.CENTER);
		textInizialeMese.setFont(new Font("Tahoma", Font.BOLD, 13));
		textInizialeMese.setColumns(10);
		
		textInizialeAnno = new JTextField();
		textInizialeAnno.setBounds(159, 15, 47, 30);
		panelIni.add(textInizialeAnno);
		textInizialeAnno.setHorizontalAlignment(SwingConstants.CENTER);
		textInizialeAnno.setFont(new Font("Tahoma", Font.BOLD, 13));
		textInizialeAnno.setColumns(10);
		
		JLabel lblDataFinale_1_2_1 = new JLabel("/");
		lblDataFinale_1_2_1.setBounds(119, 9, 47, 43);
		panelIni.add(lblDataFinale_1_2_1);
		lblDataFinale_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataFinale_1_2_1.setFont(new Font("Felix Titling", Font.BOLD, 12));
		
		
		
		textFinaleGiorno = new JTextField();
		textFinaleGiorno.setBounds(10, 11, 38, 30);
		panelFin.add(textFinaleGiorno);
		textFinaleGiorno.setHorizontalAlignment(SwingConstants.CENTER);
		textFinaleGiorno.setFont(new Font("Tahoma", Font.BOLD, 13));
		textFinaleGiorno.setColumns(10);
		
		JLabel lblDataFinale_1 = new JLabel("/");
		lblDataFinale_1.setBounds(42, 5, 47, 43);
		panelFin.add(lblDataFinale_1);
		lblDataFinale_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataFinale_1.setFont(new Font("Felix Titling", Font.BOLD, 12));
		
		textFinaleMese = new JTextField();
		textFinaleMese.setBounds(83, 11, 38, 30);
		panelFin.add(textFinaleMese);
		textFinaleMese.setHorizontalAlignment(SwingConstants.CENTER);
		textFinaleMese.setFont(new Font("Tahoma", Font.BOLD, 13));
		textFinaleMese.setColumns(10);
		
		JLabel lblDataFinale_1_2 = new JLabel("/");
		lblDataFinale_1_2.setBounds(116, 5, 47, 43);
		panelFin.add(lblDataFinale_1_2);
		lblDataFinale_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataFinale_1_2.setFont(new Font("Felix Titling", Font.BOLD, 12));
		
		textFinaleAnno = new JTextField();
		textFinaleAnno.setBounds(165, 11, 47, 30);
		panelFin.add(textFinaleAnno);
		textFinaleAnno.setHorizontalAlignment(SwingConstants.CENTER);
		textFinaleAnno.setFont(new Font("Tahoma", Font.BOLD, 13));
		textFinaleAnno.setColumns(10);
		
		panelFin.setVisible(false);
		panelIni.setVisible(false);
		textInizio.setVisible(false);
		textFinale.setVisible(false);
		
		JLabel lblDataFinale = new JLabel("DATA FINALE");
		lblDataFinale.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataFinale.setFont(new Font("Felix Titling", Font.BOLD, 12));
		lblDataFinale.setBounds(29, 204, 122, 43);
		frmDfd.getContentPane().add(lblDataFinale);
		
		JLabel lblGgmmaaaa = new JLabel("(gg / mm / aaaa)");
		lblGgmmaaaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblGgmmaaaa.setFont(new Font("Felix Titling", Font.BOLD, 12));
		lblGgmmaaaa.setBounds(180, 98, 113, 43);
		frmDfd.getContentPane().add(lblGgmmaaaa);
		
		JLabel lblGgmmaaaa_1 = new JLabel("(gg / mm / aaaa)");
		lblGgmmaaaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGgmmaaaa_1.setFont(new Font("Felix Titling", Font.BOLD, 12));
		lblGgmmaaaa_1.setBounds(161, 204, 113, 43);
		frmDfd.getContentPane().add(lblGgmmaaaa_1);
		
		textCalcolo = new JTextField();
		textCalcolo.setEditable(false);
		textCalcolo.setFont(new Font("Tahoma", Font.BOLD, 17));
		textCalcolo.setForeground(new Color(255, 255, 255));
		textCalcolo.setBackground(new Color(0, 0, 0));
		textCalcolo.setBounds(32, 401, 313, 49);
		frmDfd.getContentPane().add(textCalcolo);
		textCalcolo.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("CALCOLA");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				short g=0,m=0,a=0, c=0;
				if(rdbtnManu.isSelected())
				{
				g=Short.parseShort(textInizialeGiorno.getText());
				m=Short.parseShort(textInizialeMese.getText());
				a=Short.parseShort(textInizialeAnno.getText());
				DataDiCalendario i = new DataDiCalendario(m,a,g);
				g=Short.parseShort(textFinaleGiorno.getText());
				m=Short.parseShort(textFinaleMese.getText());
				a=Short.parseShort(textFinaleAnno.getText());
				DataDiCalendario f = new DataDiCalendario(m,a,g);
				c=i.dateDifference(i, f);
				textCalcolo.setText("Ci sono "+c+" giorni di differenza");
				lblAgg.setText("CALCOLO DELLE DATE IMMESSE DA MENU' ");
			}
				if(rdbtnString.isSelected())
				{
				g=Short.parseShort(textInizio.getText().substring(0, 2));
				m=Short.parseShort(textInizio.getText().substring(3, 5));
				a=Short.parseShort(textInizio.getText().substring(6, 10));
				DataDiCalendario i = new DataDiCalendario(m,a,g);
				g=Short.parseShort(textFinale.getText().substring(0, 2));
				m=Short.parseShort(textFinale.getText().substring(3, 5));
				a=Short.parseShort(textFinale.getText().substring(6, 10));
				DataDiCalendario f = new DataDiCalendario(m,a,g);
				c=i.dateDifference(i, f);
				textCalcolo.setText("Ci sono "+c+" giorni di differenza");
				lblAgg.setText("CALCOLO DELLE DATE IMMESSE DA STRINGA ");
			
			}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(41, 347, 110, 43);
		frmDfd.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ESCI");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(157, 347, 111, 43);
		frmDfd.getContentPane().add(btnNewButton_1);
		
		JButton btnGiorno = new JButton("GIORNO");
		btnGiorno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				short g=0,m=0,a=0;
				boolean c;
				if(rdbtnString.isSelected())
				{
				g=Short.parseShort(textFinale.getText().substring(0, 2));
				m=Short.parseShort(textFinale.getText().substring(3, 5));
				a=Short.parseShort(textFinale.getText().substring(6, 10));
				DataDiCalendario f = new DataDiCalendario(m,a,g);
				JOptionPane.showMessageDialog(null,"IL GIORNO DELLA SETTIMANA ERA "+f.giornoDellaSettimana());	
				}
				lblAgg.setText("CALCOLO DEL GIORNO ESATTO DELLA DATA ");
				if(rdbtnManu.isSelected())
				{
					g=Short.parseShort(textFinaleGiorno.getText());
					m=Short.parseShort(textFinaleMese.getText());
					a=Short.parseShort(textFinaleAnno.getText());
					DataDiCalendario f = new DataDiCalendario(m,a,g);
					JOptionPane.showMessageDialog(null,"IL GIORNO DELLA SETTIMANA ERA "+f.giornoDellaSettimana());	
				}
				lblAgg.setText("CALCOLO DEL GIORNO ESATTO DELLA DATA ");
		
			
				
			}
		});
		btnGiorno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGiorno.setBackground(Color.CYAN);
		btnGiorno.setBounds(462, 283, 100, 43);
		frmDfd.getContentPane().add(btnGiorno);
		
		JButton btnGiorno_1 = new JButton("GIORNO");
		btnGiorno_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				short g=0,m=0,a=0;
				boolean c;
				if(rdbtnString.isSelected())
				{
				g=Short.parseShort(textInizio.getText().substring(0, 2));
				m=Short.parseShort(textInizio.getText().substring(3, 5));
				a=Short.parseShort(textInizio.getText().substring(6, 10));
		DataDiCalendario i = new DataDiCalendario(m,a,g);
		
			JOptionPane.showMessageDialog(null,"IL GIORNO DELLA SETTIMANA ERA "+i.giornoDellaSettimana());
		
	}
				if(rdbtnManu.isSelected())
				{
					g=Short.parseShort(textInizialeGiorno.getText());
					m=Short.parseShort(textInizialeMese.getText());
					a=Short.parseShort(textInizialeAnno.getText());
					DataDiCalendario i = new DataDiCalendario(m,a,g);
					JOptionPane.showMessageDialog(null,"IL GIORNO DELLA SETTIMANA ERA "+i.giornoDellaSettimana());		
					
	}
				lblAgg.setText("CALCOLO DEL GIORNO ESATTO DELLA DATA ");
				
			}
		});
		btnGiorno_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGiorno_1.setBackground(Color.CYAN);
		btnGiorno_1.setBounds(462, 164, 100, 43);
		frmDfd.getContentPane().add(btnGiorno_1);
		
	
		
		
		
		
		
	
		
	}
}
