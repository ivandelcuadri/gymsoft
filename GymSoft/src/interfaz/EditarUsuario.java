package interfaz;

import java.awt.BorderLayout;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class EditarUsuario extends JFrame {

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
	 * Create the frame.
	 */
	public EditarUsuario(Usuario usu2) {
		GestionUsuario gestionusuario = new GestionUsuario();
		Usuario usu = gestionusuario.obtenerUsuario(usu2);
		
		setResizable(false);
		setTitle("Editar Profesor");
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
		txtNombre.setText(usu.getNombre());
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtApellido.setColumns(10);
		txtApellido.setBounds(220, 95, 236, 32);
		txtApellido.setText(usu.getApellido());
		panel.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtDni.setText(usu.getDni());
		txtDni.setColumns(10);
		txtDni.setBounds(220, 145, 236, 32);
		panel.add(txtDni);
		
		JButton agregarProfesor = new JButton("ACTUALIZAR");
		agregarProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editarUsuario(usu);
			}
		});
		agregarProfesor.setFont(new Font("Tahoma", Font.BOLD, 26));
		agregarProfesor.setBounds(163, 363, 178, 47);
		panel.add(agregarProfesor);
		
		JLabel lblContrasenia = new JLabel("Nueva contrase\u00F1a:");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblContrasenia.setBounds(32, 245, 178, 32);
		panel.add(lblContrasenia);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(220, 245, 236, 32);
		txtPassword.setText(usu.getContrasenia());
		txtPassword.setToolTipText("La contraseña debe tener al menos 4 caracteres");
		panel.add(txtPassword);
		
		JLabel lblConfirmContrasenia = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblConfirmContrasenia.setBounds(32, 295, 178, 32);
		panel.add(lblConfirmContrasenia);
		
		txtPassword2 = new JPasswordField();
		txtPassword2.setBounds(220, 295, 236, 32);
		txtPassword2.setText(usu.getContrasenia());
		txtPassword2.setToolTipText("La contraseña debe tener al menos 4 caracteres");
		panel.add(txtPassword2);
		
		lblContrasenia.setVisible(false);
		lblConfirmContrasenia.setVisible(false);
		txtPassword.setVisible(false);
		txtPassword2.setVisible(false);
		
		JLabel lblChangePass = new JLabel("Cambiar contraseña");
		lblChangePass.setForeground(Color.BLUE);
		lblChangePass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChangePass.setBounds(32, 195, 178, 32);
		Font font = lblChangePass.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblChangePass.setFont(font.deriveFont(attributes));
		lblChangePass.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	lblContrasenia.setVisible(true);
				lblConfirmContrasenia.setVisible(true);
				txtPassword.setVisible(true);
				txtPassword2.setVisible(true);
		    }  
		}); 
		panel.add(lblChangePass);
		
		contentPane.getRootPane().setDefaultButton(agregarProfesor);
	}

	// Controlador
	protected void editarUsuario(Usuario usuViejo) {
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
					Usuario usu2 = new Usuario(nombre, apellido, dni, contrasenia, usuViejo.getTipo_usuario());
					usu2.setId_usuario(usuViejo.getId_usuario());
					
					gestionusuario.actualizarUsuario(usu2);
					JOptionPane.showMessageDialog(contentPane, "Usuario actualizado");
					this.dispose();
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