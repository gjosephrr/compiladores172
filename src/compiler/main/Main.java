package compiler.main;

import java.io.FileReader;

import compiler.analysis.generated.Lexer;
import compiler.analysis.generated.Parser;
import java_cup.runtime.Symbol;

public class Main {

	public static void main(String[] args) {
		String prog = "files/input.c";

		try {
			Lexer lexer = new Lexer(new FileReader(prog));
			
			System.out.println(">> Successful Lexical Analysis");
			
			Parser p = new Parser(lexer);

			Symbol s = p.parse();
			
			System.out.println(">> Successful Sintatic Analysis");
			
			System.out.println(s.toString());
			
		} catch (Exception e) {
			System.err.println("Processo de Compilacao Falhou!");
			System.err.println(e.getMessage());
		}
	}

}
