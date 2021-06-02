package grafos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JTextField;

import application.Application;

public class conjuntDominanteMinimo {

	//static Grafo g = new Grafo(6);
	//static Grafo g_aux = new Grafo(6);
	static String resultadoFinal = "";
	static ArrayList<Integer> conjuntoDomMinimo = new ArrayList<Integer>();
	static boolean g_aux_vacio = false;
	static Set<Integer> aux = new HashSet<Integer>();

	public static String cDM(ArrayList<JTextField> vertexList, String vertexAmount) {
		
		Grafo g = new Grafo(Integer. parseInt(vertexAmount));
		//add the vertexList data to the graph----------------------------------------

		int counter = 0;
		int temporal = 0;
		for (JTextField textField : vertexList) {

			if(counter%2==0) {
				temporal = Integer.parseInt(textField.getText());
				counter++;
			}else {
				g.agregarArista(temporal, Integer.parseInt(textField.getText()));
				//g_aux.agregarArista(temporal, Integer.parseInt(textField.getText()));
				counter++;
			}

		}
		
		//apply algoritmo goloso----------------------------------------
		
	 
		 while(!g_aux_vacio) {
				//Arrancamos con un conjunto vacio, nuestro caso es conjuntoDomMinimo
				
				//Agarrar el vertice de mayor grado que no esté en el conjunto
				//Eso lo hacemos con g.verticeMayorGrado(conjuntoDomMinimo)
				
				//Agregarlo al conjunto
				//Eso lo hacemos con conjuntoDomMinimo.add
				conjuntoDomMinimo.add(g.verticeMayorGrado(conjuntoDomMinimo));
				
				//Preguntar si todos los vertices que no son parte del conjunto son vecinos de alguno del conjunto
				
				//Por cada elemento del conjunto preguntar sus vecinos
				//ir a la copia del grafo, apagar los vertices del conjunto y sus vecinos
				//si la copia del grafo está vacia quiere decir que todos los vertices son vecinos de mi conjunto
				 for (Integer a : conjuntoDomMinimo) {
		        	 
					 for (Integer b : g.vecinos(a)) {
						 aux.add(b);
					 }
					 //aux = g.vecinos(a);
					 //aux.addAll(g.vecinos(a));
				 }
				
				 if(aux.size()==g.tamano()) {
					 g_aux_vacio = true;
				 }
				 //Set<Integer> aux1 = g.vecinos(1);
				 
				 
		 }
		 
		 
		 resultadoFinal = conjuntoDomMinimo.toString();
		 
		
		return resultadoFinal;
	}

	public static void main(String[] args) {

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

		
		
		System.out.println(cDM(textFields, "6"));
		
	}

}
