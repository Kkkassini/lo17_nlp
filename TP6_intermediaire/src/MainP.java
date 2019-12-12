import javax.naming.PartialResultException;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.SQLException;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;


public class MainP {
    private static List<String> stopwords = new ArrayList<String>();

    public static void main(String args[]) throws SQLException {
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
                ArrayList<String> words_split_list = new ArrayList<String>(Arrays.asList(words_split));

                //Step 1: Delete words that appear in stoplist
                Iterator<String> it = words_split_list.iterator();
                while(it.hasNext()) {
                	String str = it.next();
                	if(stopwords.contains(str)) {
                		it.remove();
                	}
                }

                //Step 2: Transform each word into its class (with structure.txt)
                for(int index =0; index < words_split_list.size(); index++){
                    words_split_list.set(index, stc.transforme(words_split_list.get(index)));
                    //System.out.println(words_split_list.get(index));
                }

                //Step 3: Lemme and Force begin the request with "vouloir"
                ArrayList<String> lemma;
                Lexique lex = new Lexique();
                lemma = lex.Lemmetisation(words_split_list);
                if(lemma.contains("vouloir ")){
                    lemma.subList(0,lemma.indexOf("vouloir ")).clear();
                }else{
                    lemma.add(0,"vouloir ");
                    System.out.println("Doesn't contain vouloir");}
                /*for(int i=0; i<lemma.size(); i++){
                    System.out.println(lemma.get(i));
                }*/

                //Step 4: Generate SQL request
                String lemma_to_string = String.join(" ",lemma);
                Talsql ts = new Talsql(lemma_to_string);
                String sql = ts.toSql();

                //Step 5: Remove all parenthesis and 2 or more spaces
                String sql_without_par = sql.replaceAll("[()]","");
                sql = sql_without_par.trim().replaceAll(" +", " ");

                //Step 6: Add parenthesis after SELECT COUNT
                String str[] = sql.split(" ");
                List<String> sql_to_list =new ArrayList<String>();
                sql_to_list = Arrays.asList(str);
                if(sql_to_list.contains("count")){
                    sql_to_list.set(sql_to_list.indexOf("count")+1,
                            "("+sql_to_list.get(sql_to_list.indexOf("count")+1)+")");
                    sql = String.join(" ",sql_to_list);
                }

                System.out.println(sql);

                //String requete="select distinct count (fichier) from public.titretexte tt where tt.mot = 'focus'";
                interrogPostgresql psql = new interrogPostgresql(sql);
                psql.query();

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
