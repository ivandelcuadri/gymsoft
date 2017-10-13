package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class NuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDni;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoUsuario frame = new NuevoUsuario();
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
	public NuevoUsuario() {
		setTitle("Nuevo Profesor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblContrasenia.setBounds(32, 195, 178, 32);
		panel.add(lblContrasenia);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 195, 236, 32);
		panel.add(passwordField);
		
		JLabel lblConfirmContrasenia = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblConfirmContrasenia.setBounds(32, 245, 178, 32);
		panel.add(lblConfirmContrasenia);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(220, 245, 236, 32);
		panel.add(passwordField2);
		
	}
}
