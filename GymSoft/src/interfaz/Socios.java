package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import clases.Actividad;
import clases.Socio;
import modelo.GestionSocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;

public class Socios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Socios frame = new Socios();
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
	public Socios() {
		setTitle("Socios");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 910, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		GestionSocio gestionsocio = new GestionSocio();
		List<Socio> socios = gestionsocio.obtenerSocios();
		
		//Vector<Vector<String>> filass = new Vector<Vector<String>>();
		Object[][] filas = new Object[socios.size()][8];
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		int i=0;
		for (Socio soc : socios) {
			/*Vector<String> fila = new Vector<String>();
			fila.add(String.valueOf(soc.getId_socio()));
			fila.add(soc.getDni());
			fila.add(soc.getApellido());
			fila.add(soc.getNombre());
			String nacimiento = df.format(soc.getFecha_nacimiento());
			fila.add(nacimiento);
			String ingreso = df.format(soc.getFecha_ingreso());
			fila.add(ingreso);*/
			
			List<Actividad> actividades;
			actividades = gestionsocio.obtenerActividadesDe(soc.getId_socio());
			
			JComboBox<String> combo = new JComboBox<String>();
			for(Actividad a : actividades){
				System.out.println(a.getDescripcion());
				combo.addItem(a.getDescripcion());
			}
			filas[i][0] = soc.getId_socio();
			filas[i][1] = soc.getDni();
			filas[i][2] = soc.getApellido();
			filas[i][3] = soc.getNombre();
			filas[i][4] = soc.getFecha_nacimiento();
			filas[i][5] = soc.getFecha_ingreso();
			filas[i][6] = combo;
			filas[i][7] = null;
			i++;
			//fila.add(combo); <<<================ este no andaba antes porque era vector de String
			// ahora es matriz de objetos y tampoco :F
			
            //filass.add(fila);
		}
		
		//Vector<String> header = new Vector<String>();
		Object[] header = new Object[8];
		header[0] = ("Nº Socio");
		header[1] = ("DNI");
		header[2] = ("Apellido");
		header[3] = ("Nombre");
		header[4] = ("Fecha nacimiento");
		header[5] = ("Ingreso");
		header[6] = ("Actividades");
		header[7] = ("          ");
		
		TableModel model = new DefaultTableModel(filas, header);
        table = new JTable(model);
        JScrollPane tabla2 = new JScrollPane(table);
        tabla2.setBounds(38, 109, 812, 395);
		
		
		panel.add(tabla2);
	}
}
