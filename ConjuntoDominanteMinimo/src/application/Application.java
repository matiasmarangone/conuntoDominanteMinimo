package application;

import java.awt.EventQueue;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import grafos.conjuntDominanteMinimo;

public class Application extends JFrame implements ActionListener {

	private JFrame frame;
	JLayeredPane layeredPane = new JLayeredPane();
	private JTextField textField;
	int xPlacement = 36;
	int yPlacement = 100;
	int yPlacementLabel = 77;
	
	static ArrayList<JTextField> textFields = new ArrayList<JTextField>();
	//JTextField[] arrayValores =
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}
	
	public static ArrayList<JTextField> getTextField() {
		return textFields;
	}
	
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		layeredPane.setBounds(10, 77, 764, 473);
		frame.getContentPane().add(layeredPane);
		
		JPanel panelData = new JPanel();
		panelData.setBounds(0, 0, 764, 473);
		layeredPane.add(panelData);
		panelData.setLayout(null);
		
		JLabel lblAddVertex = new JLabel("Cuantos vertices tendra su grafo?");
		lblAddVertex.setBounds(36, 15, 312, 14);
		panelData.add(lblAddVertex);
		
		textField = new JTextField();
		textField.setBounds(332, 12, 86, 20);
		panelData.add(textField);
		textField.setColumns(10);
		
		JButton btnAddVertex = new JButton("Generar CDM");
		btnAddVertex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 int[] intArray = new int[textFields.size()];
				 System.out.println("Contents of fields:");
	             for (JTextField textField : textFields) {
	            	 
	                    System.out.println("  input:"+textField.getText());
	             }
	             
	             conjuntDominanteMinimo.cDM(textFields);
	             
				
			}
		});
		btnAddVertex.setBounds(621, 439, 133, 23);
		panelData.add(btnAddVertex);
		
		JButton btnAddEdge = new JButton("Agregar arista");
		btnAddEdge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  //JButton btnEdgeInput = new JButton("Button added");
				  //btnEdgeInput.setSize(150, 150);
				  
				  JLabel lblEdgeOrigin = new JLabel("Origen");
				  lblEdgeOrigin.setBounds(xPlacement, yPlacementLabel, 86, 20);
				  panelData.add(lblEdgeOrigin);
				  
				  JTextField textField_1 = new JTextField();
				  textField_1.setBounds(xPlacement, yPlacement, 86, 20);
				  panelData.add(textField_1);
				  textField_1.setColumns(10);
				  textFields.add(textField_1);
				  
				  
				  JLabel lblEdgeDestiny = new JLabel("Destino");
				  lblEdgeDestiny.setBounds(xPlacement+100, yPlacementLabel, 86, 20);
				  panelData.add(lblEdgeDestiny);
				  
				  JTextField textField_2 = new JTextField();
				  textField_2.setBounds(xPlacement+100, yPlacement, 86, 20);
				  panelData.add(textField_2);
				  textField_2.setColumns(10);
				  
				  textFields.add(textField_2);
				  
				  //btnEdgeInput.setBounds(xPlacement, yPlacement, 100, 20);
				  yPlacement += 40;
				  yPlacementLabel += 40;
				  //panelData.add(btnEdgeInput); //panelData.repaint(); panelData.validate();
				  panelData.repaint();
				  
				
				
			}
		});
		
		
		btnAddEdge.setBounds(37, 51, 133, 23);
		panelData.add(btnAddEdge);
				
		
		JPanel panelResults = new JPanel();
		panelResults.setBounds(0, 0, 764, 473);
		layeredPane.add(panelResults);
		
		JLabel lblTestResultsPanel = new JLabel("Panel resultados");
		panelResults.add(lblTestResultsPanel);
		
		JButton btnDataInput = new JButton("Ingreso de datos");
		btnDataInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelData);
			}
		});
		btnDataInput.setBounds(41, 27, 201, 23);
		frame.getContentPane().add(btnDataInput);
		
		JButton btnResults = new JButton("Ver resultados");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panelResults);
			}
		});
		btnResults.setBounds(391, 27, 223, 23);
		frame.getContentPane().add(btnResults);
		
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
