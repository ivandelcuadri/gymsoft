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
		
		JMenuItem mntmSocios = new JMenuItem("Socios");
		menuBar.add(mntmSocios);
		
		JMenuItem mntmAsistencia = new JMenuItem("Asistencia");
		menuBar.add(mntmAsistencia);
		
		JMenuItem mntmVencimientos = new JMenuItem("Vencimientos");
		menuBar.add(mntmVencimientos);
		
		JMenuItem mntmEstadsticas = new JMenuItem("Estad\u00EDsticas");
		menuBar.add(mntmEstadsticas);
		
		JMenuItem mntmProfesores = new JMenuItem("Profesores");
		menuBar.add(mntmProfesores);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		menuBar.add(mntmPerfil);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
