import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import output.tal_interLexer;
import output.tal_interParser;


public class TalMain3 {

public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Texte : ");
                String s = scanner.nextLine();
                System.out.println(s);
                while (!s.equals("*")) {
                	try{
                  tal_interLexer lexer = new tal_interLexer(new ANTLRReaderStream(new StringReader(s)));
                  CommonTokenStream tokens = new CommonTokenStream(lexer);
                  tal_interParser parser = new tal_interParser(tokens);
                  String arbre = parser.listerequetes();
                  System.out.println(arbre);
                  } catch(Exception e) {  }
                  System.out.print("Texte : ");
                  s = scanner.nextLine();
                }
        }
}
