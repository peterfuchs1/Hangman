package name;

/**
 * Das Model des Programms<br>
 * zust�ndig f�r den Speicher und die Logarithmen
 * 
 * @author name
 * @version ?
 * 
 * @see {@link #Model() Model()}
 */
public class Model {
	private int index;
	
	/**
	 * Die Konstante f�r einen ung�ltigen Input
	 */
	public static final int INVALID_INPUT = -1;
	
	/**
	 * Die Konstante f�r keinen Input
	 */
	public static final int NO_INPUT = -2;
	
	/**
	 * Konstruktor<br>
	 * <br>
	 * setzt den {@link #index Index} standardm��ig auf {@link #NO_INPUT NO_INPUT}
	 */
	public Model() {
		setIndex(Model.NO_INPUT);
	}
	
	/**
	 * Die Methode um den Inhalt des TextFields zu �berpr�fen
	 * 
	 * @param input der zu �berpr�fende String
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
