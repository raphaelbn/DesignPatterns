package br.com.templateMethod;

public class FormatadorMaiusculo extends FormatadorAbstrato {
	protected String transformarString(String string) {
		return string.toUpperCase();
	}
}
