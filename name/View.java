package name;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * Die View des Programms
 * 
 * @author name
 * @version ?
 * @see {@link #View(Controller, Model) View(Controller, Model)}, {@link Controller}, {@link Model}
 * @extends {@link JFrame}
 */
public class View extends JFrame {
	//serial ID
	private static final long serialVersionUID = 1L;
	//Attribute
	private Controller c;
	private Model m;
	
	private DrawingPanel panel;
	
	private JTextField f;
	private JSlider slider;
	
	/**
	 * Konstruktor
	 * 
	 * @param c der {@link Controller} des Programms
	 * @param m das {@link Model} des Programms
	 * 
	 * @see {@link DrawingPanel}, {@link JTextField}, {@link JSlider}
	 */
	public View(Controller c, Model m) {
		this.c = c;
		this.m = m;
		
		//setze das Layout, den Titel und die DefaultCloseOperation 
		
		//Add Drawing Panel
		
		//Add TextField und Listener
		
		//Add Slider und Listener
		
		//Set Frame Visible

	}
	
	/**
	 * Ist unser TextField gemeint, dann sollte der Event bearbeitet werden
	 * 
	 * @param o Referenz des zu pruefenden TextFields
	 */
	public void checkTextField(Object o) {

	}
	
	/**
	 * Ist unser Slider gemeint, dann sollte der Event bearbeitet werden
	 * 
	 * @param o Referenz des zu pruefenden Sliderobjekts
	 */
	public void checkSlider(Object o) {

	
	}
}
