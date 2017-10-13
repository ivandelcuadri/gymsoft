package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main {

	private JFrame frmGymSoft;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGymSoft.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGymSoft = new JFrame();
		frmGymSoft.setTitle("Gym SOFT");
		frmGymSoft.setBounds(100, 100, 468, 311);
		frmGymSoft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGymSoft.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 452, 21);
		frmGymSoft.getContentPane().add(menuBar);
		
		JMenu menuSocios = new JMenu("Socios");
		menuBar.add(menuSocios);
		
		JMenuItem mItemNuevoSocio = new JMenuItem("Nuevo");
		menuSocios.add(mItemNuevoSocio);
		
		JMenuItem mItemVerSocios = new JMenuItem("Ver");
		menuSocios.add(mItemVerSocios);
		
		JMenu menuAsistencias = new JMenu("Asistencias");
		menuBar.add(menuAsistencias);
		
		JMenu menuVencimientos = new JMenu("Vencimientos");
		menuBar.add(menuVencimientos);
		
		JMenu menuEstadisticas = new JMenu("Estadisticas");
		menuBar.add(menuEstadisticas);
		
		JMenu menuProfesores = new JMenu("Profesores");
		menuBar.add(menuProfesores);
		
		JMenu menuConfiguracion = new JMenu("Configuracion");
		menuBar.add(menuConfiguracion);
		
		JMenu menuSalir = new JMenu("Salir");
		menuBar.add(menuSalir);
	}
}
