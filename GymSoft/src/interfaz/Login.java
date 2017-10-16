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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtContrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Ingresar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("DNI:");
		lblUsuario.setBounds(33, 51, 96, 32);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblUsuario);
		
		txtUser = new JTextField();
		txtUser.setBounds(161, 48, 315, 35);
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setBounds(10, 126, 141, 32);
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblContrasenia);
		
		txtContrasenia = new JPasswordField();
		txtContrasenia.setBounds(161, 123, 315, 35);
		txtContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(txtContrasenia);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingresar();
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnEntrar.setBounds(287, 212, 158, 47);
		panel.add(btnEntrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSalir.setBounds(51, 212, 158, 47);
		panel.add(btnSalir);
		
		contentPane.getRootPane().setDefaultButton(btnEntrar);
	}

	protected void ingresar() {

		String usuario = txtUser.getText();
		String contrasenia = String.valueOf(txtContrasenia.getPassword());
		
		GestionUsuario gestionusuario = new GestionUsuario();
		Usuario usu2 = new Usuario();
		usu2.setDni(usuario);
		usu2.setContrasenia(contrasenia);
		
		Usuario usu = gestionusuario.obtenerUsuario(usu2);
		
		if(usu != null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido al sistema");
			this.dispose();
			MainAdmin mainAdmi = new MainAdmin();
			mainAdmi.setLocationRelativeTo(null);
			mainAdmi.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
