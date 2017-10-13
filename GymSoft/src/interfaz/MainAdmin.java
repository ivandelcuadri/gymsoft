package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAdmin frame = new MainAdmin();
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
	public MainAdmin() {
		setTitle("Gym Soft - Administrador");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSocios = new JMenu("Socios");
		menuBar.add(mnSocios);
		
		JMenuItem mntmAsistencia = new JMenuItem("Asistencia");
		mnSocios.add(mntmAsistencia);
		
		JMenuItem mntmPago = new JMenuItem("Pago");
		mnSocios.add(mntmPago);
		
		JMenuItem mntmNuevoSocio = new JMenuItem("Nuevo socio");
		mnSocios.add(mntmNuevoSocio);
		
		JMenuItem mntmListado = new JMenuItem("Listado");
		mnSocios.add(mntmListado);
		
		JMenu mnVencimientos = new JMenu("Vencimientos");
		menuBar.add(mnVencimientos);
		
		JMenuItem mntmListado_2 = new JMenuItem("Listado");
		mnVencimientos.add(mntmListado_2);
		
		JMenu mnEstadsticas = new JMenu("Estad\u00EDsticas");
		menuBar.add(mnEstadsticas);
		
		JMenu mnProfesores = new JMenu("Profesores");
		menuBar.add(mnProfesores);
		
		JMenuItem mntmNuevoProfesor = new JMenuItem("Nuevo profesor");
		mnProfesores.add(mntmNuevoProfesor);
		
		JMenuItem mntmListado_1 = new JMenuItem("Listado");
		mnProfesores.add(mntmListado_1);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmEditarPerfil = new JMenuItem("Editar perfil");
		mnPerfil.add(mntmEditarPerfil);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar sesi\u00F3n");
		mnPerfil.add(mntmCerrarSesin);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
