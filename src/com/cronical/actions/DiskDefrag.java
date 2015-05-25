package com.cronical.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class DiskDefrag {

	public void defrag() {

		String command = "%windir%\\system32\\dfrgui.exe";

		try

		{
			String scan;
			Process nep = Runtime.getRuntime().exec("cmd /c " + command);
			Reader r = new InputStreamReader(nep.getInputStream());
			BufferedReader in = new BufferedReader(r);
			while ((scan = in.readLine()) != null)
				System.out.println(scan);
			in.close();
			for (int i = 0; i < 2; i++)
				System.out.println(i);

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
