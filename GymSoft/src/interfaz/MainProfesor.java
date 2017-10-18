package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainProfesor extends JFrame {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProfesor frame = new MainProfesor();
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
	public MainProfesor() {
		setTitle("Gym Soft - Profesor");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSocios = new JMenu("Socios");
		menuBar.add(mnSocios);
		
		JMenuItem mntmNuevoSocio = new JMenuItem("Nuevo socio");
		mntmNuevoSocio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agregarSocio();
			}

		});
		mnSocios.add(mntmNuevoSocio);
		
		JMenuItem mntmAsistencia = new JMenuItem("Asistencia");
		mnSocios.add(mntmAsistencia);
		
		JMenuItem mntmPago = new JMenuItem("Pago");
		mnSocios.add(mntmPago);
		
		JMenuItem mntmListado = new JMenuItem("Listado");
		mnSocios.add(mntmListado);
		
		JMenu mnVencimientos = new JMenu("Vencimientos");
		menuBar.add(mnVencimientos);
		
		JMenuItem mntmListado_2 = new JMenuItem("Listado");
		mnVencimientos.add(mntmListado_2);
		
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmEditarPerfil = new JMenuItem("Editar perfil");
		mnPerfil.add(mntmEditarPerfil);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar sesi\u00F3n");
		mntmCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrarsesion();
			}
		});
		mnPerfil.add(mntmCerrarSesin);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	protected void agregarSocio() {
		NuevoSocio socionew = new NuevoSocio();
		socionew.setLocationRelativeTo(null);
		socionew.setVisible(true);
		
	}

	protected void agregarUsuario() {
		NuevoUsuario usernew = new NuevoUsuario();
		usernew.setLocationRelativeTo(null);
		usernew.setVisible(true);
	}
	

	protected void cerrarsesion() {
		Object[] options = {"S�", "No"};
		int n = JOptionPane.showOptionDialog(contentPane,
		                "�Est� seguro que quiere cerrar sesi�n?",
		                "Cerrar sesi�n?",
		                JOptionPane.YES_NO_OPTION,
		                JOptionPane.QUESTION_MESSAGE,
		                null,
		                options,
		                options[0]);
		if (n == JOptionPane.YES_OPTION) {
			this.dispose();
			Login login = new Login();
			login.setLocationRelativeTo(null);
			login.setVisible(true);
		} else if (n == JOptionPane.NO_OPTION) {
			
		} else {
			
		}
	}

}
