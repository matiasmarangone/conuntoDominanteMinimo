package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Application {

	private JFrame frame;
	JLayeredPane layeredPane = new JLayeredPane();
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
		
		JLabel lblTestDataPanel = new JLabel("Panel Datos");
		lblTestDataPanel.setBounds(287, 154, 217, 14);
		lblTestDataPanel.setHorizontalAlignment(SwingConstants.CENTER);
		panelData.add(lblTestDataPanel);
		
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
	


}
