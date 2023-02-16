package uf2179;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMultas extends JFrame {

	private JPanel Importe;
	private JTextField textMatricula;
	private JTextField textNombre;
	private JTextField textApellidos;
	private final ButtonGroup Pago = new ButtonGroup();
	private JComboBox ComboSancion;
	private JLabel lblImporte;
	private JLabel lblPrecio;
	private JRadioButton rdbtnPNormal;
	private JRadioButton rdbtnPPago;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMultas frame = new VentanaMultas();
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
	public VentanaMultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 341);
		Importe = new JPanel();
		Importe.setForeground(Color.BLACK);
		Importe.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Importe);
		Importe.setLayout(new MigLayout("", "[66.00][167.00,grow][83.00,grow][83.00,grow][19.00,grow][80.00][53.00][][grow]", "[][][][][23.00][][20.00][grow]"));
		
		JLabel lblNewLabel = new JLabel("  DGT - Infracciones");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setOpaque(true);
		Importe.add(lblNewLabel, "cell 0 0 9 1,growx");
		
	
		
		JLabel lblNewLabel_1 = new JLabel("Matrícula:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		textMatricula = new JTextField();
		Importe.add(textMatricula, "cell 1 1 4 1,growx");
		textMatricula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblNewLabel_2, "cell 6 1,alignx trailing");
		
		textNombre = new JTextField();
		Importe.add(textNombre, "cell 7 1 2 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblNewLabel_3, "cell 0 2,alignx trailing");
		
		textApellidos = new JTextField();
		Importe.add(textApellidos, "cell 1 2 8 1,growx");
		textApellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sanción:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblNewLabel_4, "cell 0 3,alignx trailing");
		
		ComboSancion = new JComboBox();
		ComboSancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarPrecio();
				
			}
			
		});
		ComboSancion.setModel(new DefaultComboBoxModel(new String[] {"No llevar casco", "Conducción temeraria"}));
		ComboSancion.setEditable(true);
		Importe.add(ComboSancion, "cell 1 3 8 1,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Importe:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblNewLabel_5, "cell 0 4,alignx right");
		
		lblPrecio =new JLabel("");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblPrecio, "flowx,cell 1 4 4 1");
		
		rdbtnPNormal = new JRadioButton("Pago Normal");
		Pago.add(rdbtnPNormal);
		rdbtnPNormal.setSelected(true);
		rdbtnPNormal.setFont(new Font("Tahoma", Font.BOLD, 12));
		Importe.add(rdbtnPNormal, "flowx,cell 1 5 4 1");
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDatos();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Importe.add(btnNewButton, "flowy,cell 2 6 3 1,grow");
		
		JScrollPane scrollPane = new JScrollPane();
		Importe.add(scrollPane, "cell 0 7 9 1,grow");
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		rdbtnPPago = new JRadioButton("Pronto Pago");
		Pago.add(rdbtnPPago);
		rdbtnPPago.setFont(new Font("Tahoma", Font.BOLD, 12));
		Importe.add(rdbtnPPago, "cell 3 5 2 1");
		
		textArea_1 = new JTextArea();
		textArea_1.setText("");
		Importe.add(textArea_1, "cell 4 6");
		
		lblImporte = new JLabel("");
		lblImporte.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblImporte, "cell 1 4");
		
		JLabel lblImporte = new JLabel("");
		lblImporte.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Importe.add(lblImporte, "cell 1 4");
	}

	protected void mostrarDatos() {
	
		String conductor= textNombre.getText() +textApellidos.getText();
		String infraccion=(String) ComboSancion.getSelectedItem();
		String importe =lblPrecio.getText();
		String ppago= " ";
		if (rdbtnPPago.isSelected()) {
			
		 
		}
		
		
	}

	protected void actualizarPrecio() {
		String sancion = (String) ComboSancion.getSelectedItem();
		
		if(sancion.equals ("No llevar casco")) {
			lblImporte.setText(" "+200+"€");
			
		} else if (sancion.equals ("Conducción temeraria")) {
			lblImporte.setText(" "+500+"€");
		}
		
	}

}
