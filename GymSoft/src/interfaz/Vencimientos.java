package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import clases.Socio;
import modelo.GestionSocio;

import javax.swing.JLabel;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;

public class Vencimientos extends JFrame {

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
					Vencimientos frame = new Vencimientos();
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
	public Vencimientos() {
		setTitle("Vencimientos");
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
		
		JLabel lblDa = new JLabel("D\u00EDa");
		lblDa.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDa.setBounds(38, 40, 85, 32);
		panel.add(lblDa);
		
		// Esto habría que armar con los deudores, o algún criterio...
		GestionSocio gestionsocio = new GestionSocio();
		List<Socio> socios = gestionsocio.obtenerSocios();
		Vector<Vector<String>> filass = new Vector<Vector<String>>();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		for (Socio soc : socios) {
			Vector<String> fila = new Vector<String>();
			fila.add(String.valueOf(soc.getId_socio()));
			fila.add(soc.getDni());
			fila.add(soc.getApellido());
			fila.add(soc.getNombre());
			String ingreso = df.format(soc.getFecha_ingreso());
			fila.add(ingreso);
            filass.add(fila);
		}
		
		Vector<String> header = new Vector<String>();
		header.add("Nº Socio");
		header.add("DNI");
		header.add("Apellido");
		header.add("Nombre");
		header.add("Ingreso");
		
		TableModel model = new DefaultTableModel(filass, header);
        table = new JTable(model);
        JScrollPane tabla2 = new JScrollPane(table);
        tabla2.setBounds(38, 109, 812, 395);
		
		
		panel.add(tabla2);
	}
}
