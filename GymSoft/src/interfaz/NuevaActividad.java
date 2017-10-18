package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Actividad;
import modelo.GestionActividad;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaActividad extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaActividad frame = new NuevaActividad();
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
	public NuevaActividad() {
		setResizable(false);
		setTitle("Nueva Actividad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripcion:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(32, 70, 165, 32);
		panel.add(lblNewLabel);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(192, 70, 191, 32);
		panel.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				altaActividad();
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnAgregar.setBounds(123, 171, 137, 41);
		panel.add(btnAgregar);
	}
	
	protected void altaActividad(){
		String descripcion= txtDescripcion.getText();
		boolean nonulo =!(descripcion.length()<=0);
		if (nonulo){
			GestionActividad gestionactividad= new GestionActividad();
			Actividad act = new Actividad(descripcion);
			Actividad act2 = gestionactividad.obtenerActividad(act);
			if (act2 == null){
				gestionactividad.guardarActividad(act);
				JOptionPane.showMessageDialog(contentPane, "Actividad guardada");
				this.dispose();
			}
			else{
				JOptionPane.showMessageDialog(contentPane, "Ya existe esta actividad", "Error", JOptionPane.ERROR_MESSAGE);
				txtDescripcion.setText("");
			}
		}
		else{
			JOptionPane.showMessageDialog(contentPane, "El campo es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
