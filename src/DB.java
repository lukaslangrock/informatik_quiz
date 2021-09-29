import lib.DatabaseConnector;

public class DB {

	private DatabaseConnector dbConn;
	private final int retries = 10;
	public DB()
	{
		for (int i=0; i<retries; i++)
		{
			if(dbConn == null || dbConn.getErrorMessage() != null)
				dbConn = new DatabaseConnector("db.langrock.info", "3306", "informatik", "lwilzer2", "task-bats-uncoated");
			else
				break;
		}
	}

	public String getPassword(String pBenutzername)
	{
		String password = null;
		dbConn.executeStatement("select Passwort from Spieler where Benutzername = " + '\'' +pBenutzername + '\'');
		lib.QueryResult qr = dbConn.getCurrentQueryResult();
		if(qr.getColumnCount()==1)
		{
			return null;
		}
		else if (qr.getRowCount()==1)
		{
			return null;
		}
		else
		{
			password = qr.getData()[0][0];
			return password;
		}
	}

	public String getRichtig(int pAID)
	{
		String password = null;
		dbConn.executeStatement("select KorrekteAntwort from Aufgabe where AufgabeID = " + '\'' +pAID+ '\'');
		lib.QueryResult qr = dbConn.getCurrentQueryResult();
		if(qr.getColumnCount()==1)
		{
			return null;
		}
		else if (qr.getRowCount()==1)
		{
			return null;
		}
		else
		{
			password = qr.getData()[0][0];
			return password;
		}
	}
}