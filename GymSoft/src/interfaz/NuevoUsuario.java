package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;
import modelo.GestionUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class NuevoUsuario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JPasswordField txtPassword;
	private JPasswordField txtPassword2;

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
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNombre.setBounds(220, 45, 236, 32);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtApellido.setColumns(10);
		txtApellido.setBounds(220, 95, 236, 32);
		panel.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtDni.setColumns(10);
		txtDni.setBounds(220, 145, 236, 32);
		panel.add(txtDni);
		
		JButton agregarProfesor = new JButton("AGREGAR");
		agregarProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				altaUsuario();
			}
		});
		agregarProfesor.setFont(new Font("Tahoma", Font.BOLD, 26));
		agregarProfesor.setBounds(163, 363, 178, 47);
		panel.add(agregarProfesor);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblContrasenia.setBounds(32, 195, 178, 32);
		panel.add(lblContrasenia);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(220, 195, 236, 32);
		txtPassword.setToolTipText("La contraseña debe tener al menos 4 caracteres");
		panel.add(txtPassword);
		
		JLabel lblConfirmContrasenia = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblConfirmContrasenia.setBounds(32, 245, 178, 32);
		panel.add(lblConfirmContrasenia);
		
		txtPassword2 = new JPasswordField();
		txtPassword2.setBounds(220, 245, 236, 32);
		txtPassword2.setToolTipText("La contraseña debe tener al menos 4 caracteres");
		panel.add(txtPassword2);
		
	}

	// Controlador
	protected void altaUsuario() {
		String nombre = txtNombre.getText();
		String apellido = txtApellido.getText();
		String dni = txtDni.getText();
		String contrasenia = String.valueOf(txtPassword.getPassword());
		String contrasenia2 = String.valueOf(txtPassword2.getPassword());
		boolean nonulo = !(nombre.length()<=0 || apellido.length()<=0 || dni.length()<=0);
		if (nonulo) {
			if(contrasenia.equals(contrasenia2)) {
				if (!(contrasenia.length()<=3 || contrasenia2.length()<=3)) {
					GestionUsuario gestionusuario = new GestionUsuario();
					Usuario usu2 = gestionusuario.obtenerUsuarioConDni(dni);
					Usuario usu = new Usuario(nombre, apellido, dni, contrasenia, 2);
					
					if (usu2 == null) {
						gestionusuario.guardarUsuario(usu);
						JOptionPane.showMessageDialog(contentPane, "Usuario guardado");
						this.dispose();
					}
					else { // usu != null, existe usuario
						JOptionPane.showMessageDialog(contentPane, "Ya existe este usuario", "Error", JOptionPane.ERROR_MESSAGE);
						txtPassword.setText("");
						txtPassword2.setText("");
					}
				}
				else { // contraseñas menos de 3 caracteres
					JOptionPane.showMessageDialog(contentPane, "La contraseña debe tener al menos 4 caracteres", "Error", JOptionPane.WARNING_MESSAGE);
					txtPassword.setText("");
					txtPassword2.setText("");
				}
			}
			else { // contraseñas distintas
				JOptionPane.showMessageDialog(contentPane, "La contraseña no coincide", "Error", JOptionPane.ERROR_MESSAGE);
				txtPassword.setText("");
				txtPassword2.setText("");
			}
		}
		else {
			JOptionPane.showMessageDialog(contentPane, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
			txtPassword.setText("");
			txtPassword2.setText("");
		}
	}
	
}
