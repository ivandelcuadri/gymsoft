package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainAdmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainAdmin frame = new MainAdmin(int tipousuario);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public MainAdmin(Usuario usu) {   //pruebo con estos parametros, estaria mejor pasar el objeto usuario
		String titulo ="Gym Soft - Administrador " + usu.getNombre(); 
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
		
		JMenu mnEstadsticas = new JMenu("Estad\u00EDsticas");
		menuBar.add(mnEstadsticas);
		
		JMenu mnProfesores = new JMenu("Profesores");
		menuBar.add(mnProfesores);
		
		JMenuItem mntmNuevoProfesor = new JMenuItem("Nuevo profesor");
		mntmNuevoProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agregarUsuario();
			}
		});
		mnProfesores.add(mntmNuevoProfesor);
		
		JMenuItem mntmListado_1 = new JMenuItem("Listado");
		mnProfesores.add(mntmListado_1);
		
		JMenu mnActividades = new JMenu("Actividades");
		menuBar.add(mnActividades);
		
		JMenuItem mntmNuevaActividad = new JMenuItem("Nueva Actividad");
		mntmNuevaActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agregarActividad();
			}
		});
		mnActividades.add(mntmNuevaActividad);
		
		JMenuItem mntmListado_3 = new JMenuItem("Listado");
		mnActividades.add(mntmListado_3);
		
		JMenu mnRegistrarHoras = new JMenu("Registrar Horas");
		menuBar.add(mnRegistrarHoras);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmEditarPerfil = new JMenuItem("Editar perfil");
		mntmEditarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editarUsuario(usu);
			}
		});
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
		
		if (usu.getTipo_usuario() == 2){
			titulo ="Gym Soft - Profesor " + usu.getNombre();
			mntmEditarPerfil.setEnabled(false);
			mnEstadsticas.setEnabled(false);
			mnActividades.setEnabled(false);
			mnProfesores.setEnabled(false);
		}
		setTitle(titulo);
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
	
	protected void editarUsuario(Usuario usu){
		EditarUsuario useredit = new EditarUsuario(usu);
		useredit.setLocationRelativeTo(null);
		useredit.setVisible(true);
	}
	
	protected void agregarActividad(){
		NuevaActividad actividadnew = new NuevaActividad();
		actividadnew.setLocationRelativeTo(null);
		actividadnew.setVisible(true);
	
	}

	protected void cerrarsesion() {
		Object[] options = {"Sí", "No"};
		int n = JOptionPane.showOptionDialog(contentPane,
		                "¿Está seguro que quiere cerrar sesión?",
		                "Cerrar sesión?",
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
