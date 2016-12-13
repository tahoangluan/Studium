
public class Login {
	private boolean angemeldet=false;
	
	public void anmelden (String benutzer, String passwort)throws ZugriffUngueltigException{
		if(benutzer.equals("hoangluan")&&passwort.equals("557237")){
			angemeldet=true;
		}
		else {
			throw new ZugriffUngueltigException("Falsche Benutzer oder Passwort.");
		}
	}
	
	public void abmelden(){
		angemeldet=false;
	}
	
	public void bearbeiten()throws KeineBerechtigungException{
		if(angemeldet){
			System.out.println("...Die Bearbeitung läuft...");
			System.out.println("...Die Bearbeitung wurde erfolgreich durchgeführt...");
		}
		else {
			throw new KeineBerechtigungException();
		}
	}
}
