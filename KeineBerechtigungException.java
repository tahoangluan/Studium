
public class KeineBerechtigungException extends Exception {
	KeineBerechtigungException(){
		super("Sie sind nicht angemeldet.");
	}
}
