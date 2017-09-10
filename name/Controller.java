package name;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Der Controller des Programms,
 * sorgt für die Reaktion auf Interaktionselement
 * 
 * 
 * @author name
 * @version ??
 * <br><br>
 * 
 * 
 */
public class Controller implements KeyListener, ChangeListener {
	private Model m;
	private View v;

	/**
	 * Konstruktor
	 * 
	 * erstellt ein Model
	 * und eine View
	 */
	public Controller() {
		this.m = new Model();
		this.v = new View(this, this.m);
	}

	/**
	 * main-Methode zum Starten des Programms
	 * 
	 * erstellt einen {@link #Controller()}
	 */
	public static void main(String[] args) {
		new Controller();
	}

	/**
	 * Methode zum Antworten, wenn eine Taste gerdrückt wird
	 * 
	 * @param e das {@link KeyEvent} des {@link KeyListener KeyListeners}
	 * 
	 * Method not used!
	 */
	public void keyPressed(KeyEvent e) {}

	/**
	 * Methode zum Antworten auf den KeyListener
	 * 
	 * @param e das {@link KeyEvent} des {@link KeyListener KeyListeners}
	 * 
	 */
	public void keyReleased(KeyEvent e) {
		
	}


	/**
	 * Methode zum Antworten, wenn eine Taste gerdrückt wurde
	 * 
	 * @param e das {@link KeyEvent} des {@link KeyListener KeyListeners}
	 * 
	 * Method not used!
	 */
	public void keyTyped(KeyEvent arg0) {}

	/**
	 * Methode zum Antworten auf den ChangeListener
	 * 
	 * @param e das {@link ChangeEvent} des {@link ChangeListener ChangeListeners}
	 */
	public void stateChanged(ChangeEvent e) {
		
	}

}
