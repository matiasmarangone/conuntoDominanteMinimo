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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Application extends JFrame implements ActionListener {

	private JFrame frame;
	JLayeredPane layeredPane = new JLayeredPane();
	private JTextField textField;
	int xPlacement = 36;
	int yPlacement = 100;
	
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
		
		JButton btnAddVertex = new JButton("Agregar");
		btnAddVertex.setBounds(446, 11, 89, 23);
		panelData.add(btnAddVertex);
		
		JButton btnAddEdge = new JButton("Agregar arista");
		btnAddEdge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  JButton btnEdgeInput = new JButton("Button added");
				  //btnEdgeInput.setSize(150, 150);
				
				  btnEdgeInput.setBounds(xPlacement, yPlacement, 100, 20);
				  yPlacement += 40;
				  panelData.add(btnEdgeInput); //panelData.repaint(); panelData.validate();
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
