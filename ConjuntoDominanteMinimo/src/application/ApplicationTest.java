package application;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.JTextField;

import org.junit.Before;
import org.junit.Test;

import grafos.Grafo;
import grafos.conjuntDominanteMinimo;

public class ApplicationTest {
	
	@Before
	public void initialize() {
		
		ArrayList<JTextField> textFields = new ArrayList<JTextField>();

		JTextField textField_1 = new JTextField();
		textField_1.setText("0");
		textFields.add(textField_1);

		JTextField textField_2 = new JTextField();
		textField_2.setText("1");
		textFields.add(textField_2);

		JTextField textField_3 = new JTextField();
		textField_3.setText("1");
		textFields.add(textField_3);

		JTextField textField_4 = new JTextField();
		textField_4.setText("2");
		textFields.add(textField_4);

		JTextField textField_5 = new JTextField();
		textField_5.setText("1");
		textFields.add(textField_5);

		JTextField textField_6 = new JTextField();
		textField_6.setText("3");
		textFields.add(textField_6);

		JTextField textField_7 = new JTextField();
		textField_7.setText("2");
		textFields.add(textField_7);

		JTextField textField_8 = new JTextField();
		textField_8.setText("4");
		textFields.add(textField_8);

		JTextField textField_9 = new JTextField();
		textField_9.setText("3");
		textFields.add(textField_9);

		JTextField textField_10 = new JTextField();
		textField_10.setText("4");
		textFields.add(textField_10);

		JTextField textField_11 = new JTextField();
		textField_11.setText("3");
		textFields.add(textField_11);

		JTextField textField_12 = new JTextField();
		textField_12.setText("5");
		textFields.add(textField_12);

		JTextField textField_13 = new JTextField();
		textField_13.setText("4");
		textFields.add(textField_13);

		JTextField textField_14 = new JTextField();
		textField_14.setText("5");
		textFields.add(textField_14);
		
		conjuntDominanteMinimo.cDM(textFields, "6");
	}
	
	
	@Test
	public void conjuntoNoVacio() {
	
		assertTrue(conjuntDominanteMinimo.conjuntoDomMinimo.size()>0);
		
	}
	
	@Test
	public void conjuntoNoContieneGrafoEntero() {
	
		assertTrue(conjuntDominanteMinimo.conjuntoDomMinimo.size() <  6);
		
	}

}
