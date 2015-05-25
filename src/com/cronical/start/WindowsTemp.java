package com.cronical.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class WindowsTemp {

	public void WindowsTemploeschen() {

		String command = "RD /S / Q \"%homepath%\\AppData\\Local\\Temp";
		String command2 = "RD /S / Q \"%windir%\\TEMP";

		try

		{
			String Temploeschen;
			Process nep = Runtime.getRuntime().exec("cmd /c " + command);
			Reader r = new InputStreamReader(nep.getInputStream());
			BufferedReader in = new BufferedReader(r);
			while ((Temploeschen = in.readLine()) != null)
				System.out.println(Temploeschen);
			in.close();

			String Temploeschen2;
			Process nep2 = Runtime.getRuntime().exec("cmd /c " + command2);
			Reader r2 = new InputStreamReader(nep2.getInputStream());
			BufferedReader in2 = new BufferedReader(r2);
			while ((Temploeschen2 = in2.readLine()) != null)
				System.out.println(Temploeschen2);
			in2.close();
		}

		catch (IOException e)

		{
			e.printStackTrace();
		}

	}

}