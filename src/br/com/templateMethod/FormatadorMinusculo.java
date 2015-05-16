package br.com.templateMethod;

public class FormatadorMinusculo extends FormatadorAbstrato {
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
