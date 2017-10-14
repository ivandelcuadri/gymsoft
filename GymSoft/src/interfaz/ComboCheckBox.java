package interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;



public class ComboCheckBox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboCheckBox frame = new ComboCheckBox();
					frame.setSize(350,350);
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
	public ComboCheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Vector v =new Vector();
		JCheckBox cb1 = new JCheckBox("Check 1",false);
		JCheckBox cb2 = new JCheckBox("Check 2",false);
		v.add(cb1);
		v.add(cb2);
		getContentPane().add(new CustomComboCheck(v));
	}

	class CustomComboCheck extends JComboBox{
		public CustomComboCheck(Vector v){
			super(v);
		 //SET RENDERER
		setRenderer(new Comborenderer());	
		//SET LISTENER
		addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ourItemSelectedd();
			}
		});
		}
		private void ourItemSelectedd(){
			Object selected= getSelectedItem();
			if (selected instanceof JCheckBox ){
				JCheckBox ck= (JCheckBox) selected;
				ck.setSelected(!ck.isSelected());
				repaint();
				Object[] selections = ck.getSelectedObjects();
				if (selections != null ){
					for (Object lastItem : selections){
						JOptionPane.showMessageDialog(null, lastItem.toString());
					}
				}
			}
		}
	}
	
	class Comborenderer implements ListCellRenderer{
		private JLabel label;
		@Override
		public Component getListCellRendererComponent(JList list, Object val, int index, boolean selected, boolean focused) {
			if (val instanceof Component){
				Component c = (Component) val;
				if(selected){
					c.setBackground(list.getSelectionBackground());
					c.setForeground(list.getSelectionForeground());
				} else {
					c.setBackground(list.getBackground());
					c.setForeground(list.getForeground());
				}
				return c;
			} else {
				if(label == null){
					label= new JLabel(val.toString());
				} else {
					label.setText(val.toString());
				}
				return label;
			}
		}
	}
	

}
