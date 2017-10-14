package interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Actividad;
import modelo.GestionActividad;

import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class NuevoSocio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoSocio frame = new NuevoSocio();
					frame.setLocationRelativeTo(null);
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
	public NuevoSocio() {
		setTitle("Nuevo Socio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 513, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNombre.setBounds(32, 45, 178, 32);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblApellido.setBounds(32, 95, 178, 32);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblDni.setBounds(32, 145, 178, 32);
		panel.add(lblDni);
		
		JLabel lblFechaIngreso = new JLabel("Fecha ingreso:");
		lblFechaIngreso.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblFechaIngreso.setBounds(32, 195, 178, 32);
		panel.add(lblFechaIngreso);
		
		JLabel lblActividades = new JLabel("Actividad/es:");
		lblActividades.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblActividades.setBounds(32, 245, 178, 32);
		panel.add(lblActividades);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldNombre.setBounds(220, 45, 236, 32);
		panel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(220, 95, 236, 32);
		panel.add(textFieldApellido);
		
		textFieldDni = new JTextField();
		textFieldDni.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldDni.setColumns(10);
		textFieldDni.setBounds(220, 145, 236, 32);
		panel.add(textFieldDni);
		
		JButton button = new JButton("AGREGAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 26));
		button.setBounds(163, 363, 178, 47);
		panel.add(button);
		
		/*JComboBox<Actividad> comboBox = new JComboBox<Actividad>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 26));
		comboBox.setBounds(220, 245, 236, 32);
		panel.add(comboBox);
		comboBox.removeAllItems();
		GestionActividad gestionactividad = new GestionActividad();
		List<Actividad> actividades;
		actividades = gestionactividad.obtenerActividades();
		for(Actividad a : actividades){
			comboBox.addItem(a);
		}*/
		
		JComboBox<JCheckBox> comboBox = new JComboBox<JCheckBox>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 26));
		comboBox.setBounds(220, 245, 236, 32);
		panel.add(comboBox);
		comboBox.removeAllItems();
		
		/*ComboCheckBox cbc= new ComboCheckBox();
		panel.add(cbc);
		*/
	}
}