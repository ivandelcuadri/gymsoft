package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUser;
	private JPasswordField passwordField;

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
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(33, 51, 96, 32);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblUsuario);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(161, 48, 315, 35);
		textFieldUser.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setBounds(10, 126, 141, 32);
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblContrasenia);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 123, 315, 35);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(passwordField);
		
		JButton btnButton = new JButton("ENTRAR");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingresar();
			}
		});
		btnButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnButton.setBounds(65, 213, 158, 47);
		panel.add(btnButton);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnSalir.setBounds(290, 213, 158, 47);
		panel.add(btnSalir);
	}

	protected void ingresar() {
		
	}
	
}
