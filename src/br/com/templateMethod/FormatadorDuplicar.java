package br.com.templateMethod;

public class FormatadorDuplicar extends FormatadorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
