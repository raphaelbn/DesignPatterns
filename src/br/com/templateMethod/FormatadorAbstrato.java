package br.com.templateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class FormatadorAbstrato {
	public final void manipularString() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String string = reader.readLine();

		System.out.println("Transformado: " + transformarString(string));
		System.out.println();
	}

	protected abstract String transformarString(String string);
}
