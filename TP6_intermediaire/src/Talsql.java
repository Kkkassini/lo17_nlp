import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import output.tal_sqlLexer;
import output.tal_sqlParser;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Talsql {
    public String sentence;

    public Talsql(String s){
        sentence = s;
    }

    public String toSql (){
        //ArrayList<String> res = new ArrayList<String>();
        try{
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(sentence)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tal_sqlParser parser = new tal_sqlParser(tokens);
            String arbre = parser.listerequetes();
            return arbre;
            //System.out.println(arbre);
        } catch(Exception e) { return "toSql failed";}
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Texte : ");
        String s = scanner.nextLine();
        System.out.println(s);
        while (!s.equals("*")) {
            try{
                tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tal_sqlParser parser = new tal_sqlParser(tokens);
                String arbre = parser.listerequetes();
                System.out.println(arbre);
            } catch(Exception e) {  }
            System.out.print("Texte : ");
            s = scanner.nextLine();
        }
    }
}
