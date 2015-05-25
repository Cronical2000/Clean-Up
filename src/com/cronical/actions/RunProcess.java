package com.cronical.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class RunProcess {

	public void Prozess() {

		String command = "taskkill /f /fi \"status eq running\" /fi \"imagename ne explorer.exe\" /fi \"imagename ne javaw.exe\" /fi \"imagename ne Teamviewer.exe\" /fi \"imagename ne Skype.exe\" /fi \"imagename ne eclipse.exe\" /fi \"imagename ne Teamviewer_Service.exe\" /fi \"imagename ne Teamviewer_Desktop.exe\" /fi \"imagename ne tv_w32.exe\" /fi \"imagename ne tv_x64.exe\" /fi \"imagename ne cmd.exe\" /fi \"imagename ne conhost.exe";

		try {

			String prozessbeendet = "";
			Process nep = Runtime.getRuntime().exec("cmd /c " + command);
			Reader r = new InputStreamReader(nep.getInputStream());
			BufferedReader in = new BufferedReader(r);
			while ((prozessbeendet = in.readLine()) != null)
				System.out.println(prozessbeendet);
			in.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
