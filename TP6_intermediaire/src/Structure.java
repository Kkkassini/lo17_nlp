import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Structure  {

    private static HashMap <String, String> dict = new HashMap<>();
    private static String mot = "";
	public Structure() {
		//mot = m;
        BufferedReader br=null;
        String chaine;
        try {
              try {	
            	  	
                    br = new BufferedReader(new FileReader("D:/GI05/LO17/TP6_intermediaire-20191205T064650Z-001/TP6_intermediaire/buffers/structure.txt"));
                    while((chaine = br.readLine())!=null){
                    	String[] mot_structure = chaine.split("\t");
                        //System.out.println("s "+mot_lemme[0]+"and"+mot_lemme[1]);
                        dict.put(mot_structure[0], mot_structure[1]);
                    }
                  }
              catch(EOFException e) {
                    br.close();
                  }
         }
         catch(IOException e) {
              System.out.println("IO Exception");
         }
        
	}

   public static String transforme(String mot) {
	    
	
	   for (String name: dict.keySet()){
          String key = name;
          String value = dict.get(name);
          if(mot.equals(key)) {
        	  //System.out.println(key + " " + value);
        	  return value;
          }
	   }
	   return mot;
	}
	   
}








