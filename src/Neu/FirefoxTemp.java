package Neu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FirefoxTemp {

	public void FirefoxTemplöschen() {

		String command = "taskkill /f /IM Firefox.exe";
		String command2 = "RD /S / Q \"C:\\Users\\%USERNAME%\\AppData\\Local\\Mozilla\\Firefox\\Profiles";

		try

		{
			String Firefoxbeenden;
			Process nep = Runtime.getRuntime().exec("cmd /c " + command);
			Reader r = new InputStreamReader(nep.getInputStream());
			BufferedReader in = new BufferedReader(r);
			while ((Firefoxbeenden = in.readLine()) != null)
				System.out.println(Firefoxbeenden);
			in.close();

			String FirefoxTemplöschen;
			Process nep2 = Runtime.getRuntime().exec("cmd /c " + command2);
			Reader r2 = new InputStreamReader(nep2.getInputStream());
			BufferedReader in2 = new BufferedReader(r2);
			while ((FirefoxTemplöschen = in2.readLine()) != null)
				System.out.println(FirefoxTemplöschen);
			in.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
