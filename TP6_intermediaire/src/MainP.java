import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;


public class MainP {
    private static List<String> stopwords = new ArrayList<String>();

    public static void main(String args[]) {
                Structure stc = new Structure();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Texte : ");
                String s = scanner.nextLine();
                //System.out.println(s);
                
                BufferedReader br=null;
                String word;
                try {
                	try {
                		br = new BufferedReader(new 
                				FileReader("D:/GI05/LO17/TP6_intermediaire-20191205T064650Z-001/TP6_intermediaire/buffers/stoplist_P16.txt"));
                		while((word = br.readLine())!=null) {
                			stopwords.add(word);
                		}
                	}
                	catch(EOFException e) {
                		br.close();
                	}
                }
                catch(IOException e) {
                	System.out.println("IO Exception");
                }
                String[] words_split = s.split(" "); 
                List<String> words_split_list = new ArrayList<String>(Arrays.asList(words_split));

                Iterator<String> it = words_split_list.iterator();
                while(it.hasNext()) {
                	String str = it.next();
                	if(stopwords.contains(str)) {
                		it.remove();
                	}
                }
                for(int index =0; index < words_split_list.size(); index++){
                    words_split_list.set(index, stc.transforme(words_split_list.get(index)));
                    System.out.println(words_split_list.get(index));
                }
                //words_split = words_split_list.toArray(new String[0]);
//                while (!s.equals("*")) {
//                	try{
//                		tal_interLexer lexer = new tal_interLexer(new ANTLRReaderStream(new StringReader(s)));
//                		CommonTokenStream tokens = new CommonTokenStream(lexer);
//                		tal_interParser parser = new tal_interParser(tokens);
//                		String arbre = parser.listerequetes();
//                		System.out.println(arbre);
//                	} catch(Exception e) {  }
//                	System.out.print("Texte : ");
//                	s = scanner.nextLine();
//                }

    }
}
