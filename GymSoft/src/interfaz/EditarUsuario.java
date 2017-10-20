package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class EditarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarUsuario frame = new EditarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public EditarUsuario(Usuario usu) {
		setResizable(false);
		setTitle("Editar Perfil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nombre:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label.setBounds(0, 0, 178, 32);
		panel.add(label);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtNombre.setColumns(10);
		txtNombre.setBounds(188, 0, 236, 32);
		txtNombre.setText(usu.getNombre());
		panel.add(txtNombre);
		
		JLabel label_1 = new JLabel("Apellido:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_1.setBounds(0, 50, 178, 32);
		panel.add(label_1);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtApellido.setColumns(10);
		txtApellido.setBounds(188, 50, 236, 32);
		txtApellido.setText(usu.getApellido());
		panel.add(txtApellido);
		
		JLabel label_2 = new JLabel("DNI:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_2.setBounds(0, 100, 178, 32);
		panel.add(label_2);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtDNI.setColumns(10);
		txtDNI.setBounds(188, 100, 236, 32);
		txtDNI.setText(usu.getDni());
		panel.add(txtDNI);
		
		JLabel label_3 = new JLabel("Contrase\u00F1a:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_3.setBounds(0, 150, 178, 32);
		panel.add(label_3);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtPassword.setColumns(10);
		txtPassword.setBounds(188, 143, 236, 32);
		txtPassword.setText(usu.getContrasenia());
		panel.add(txtPassword);
		
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnGuardar.setBounds(131, 318, 178, 47);
		panel.add(btnGuardar);
		
		
		
	}
}
