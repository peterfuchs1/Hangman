package name;

/**
 * Das Model des Programms<br>
 * zuständig für den Speicher und die Logarithmen
 * 
 * @author name
 * @version ?
 * 
 * @see {@link #Model() Model()}
 */
public class Model {
	private int index;
	
	/**
	 * Die Konstante für einen ungültigen Input
	 */
	public static final int INVALID_INPUT = -1;
	
	/**
	 * Die Konstante für keinen Input
	 */
	public static final int NO_INPUT = -2;
	
	/**
	 * Konstruktor<br>
	 * <br>
	 * setzt den {@link #index Index} standardmäßig auf {@link #NO_INPUT NO_INPUT}
	 */
	public Model() {
		setIndex(Model.NO_INPUT);
	}
	
	/**
	 * Die Methode um den Inhalt des TextFields zu überprüfen
	 * 
	 * @param input der zu überprüfende String
	 */
	public void checkText(String input) {

	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return 0;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {

	}
}
