import java.io.*;
import java.util.*;
import java.lang.*;

class Lexique{
      private static HashMap <String, String> dict = new HashMap<>();
      private static int seuil_min = 3;
      private static int seuil_max = 10;
      public Lexique(){
            BufferedReader br=null;
            String chaine;
            try {
                  try {
                        br = new BufferedReader(new FileReader("/voletu/user1x/users/zhouxing/LO17/P3/java/filtreCorpus_P16.txt"));
                        //System.out.print("saisie : ");
                        while((chaine = br.readLine())!=null){
                              String[] mot_lemme = chaine.split(" \t");
                              //System.out.println("s "+mot_lemme[0]+"and"+mot_lemme[1]);
                              dict.put(mot_lemme[0], mot_lemme[1]);
                        }
                        //System.out.println("j'ai saisi "+chaine);
                      }
                  catch(EOFException e) {
                        br.close();
                      }
             }
             catch(IOException e) {
                  System.out.println("IO Exception");
             }
             /*
             for (String name: dict.keySet()){
                  String key = name;
                  String value = dict.get(name);
                  System.out.println(key + " " + value);
            }*/
      }
      public static String toLowerCase(String phrase){
            return phrase.toLowerCase();
      }

      public static String findInDict(String mot){
            return dict.get(mot);
      }

      public static  float prefixe(String m1, String m2){
          int seuilMax = 4;
          int seuilMin = 4;
          int seuilLC = 5;
          float prox = 0;
          int length1 = m1.length();
          int length2 = m2.length();
          if(length1 < seuilMax || length2 < seuilMax ){
            prox = 0;
          }else if (Math.abs(length1 - length2) > seuilMin) {
            prox = 0;
            int p = (Math.abs(length1 - length2));
          }else{
            int i = 1;
            while(i < Math.min(length1,length2) && m1.charAt(i-1) == m2.charAt(i-1)){
              i ++;
            }
            if(i < seuilLC){
              prox = 0;
            }else{
              prox = 100.0F*i/Math.max(length1,length2);
            }
          }
          return prox;
        }


        public static List<String> lemmes_prefixe(String data, Map<String, String> map){
          Iterator iterator = map.keySet().iterator();
          float max_prox = 0;
          List<String>  lemmes_grand =  new ArrayList<String>();
          List<String>  lemmes_meilleur =  new ArrayList<String>();
          while (iterator.hasNext()){
            String key = (String)iterator.next();
            float prox = prefixe(data,key);
            if (prox > 60 ) {
              //System.out.println("j'ai saisi "+data+" pas dans la dict, avec prox = " + prox + " > 60");
              lemmes_grand.add(map.get(key));

              if(!lemmes_meilleur.isEmpty()){
                if(max_prox < prox){
                  max_prox = prox;
                  lemmes_meilleur.clear();
                  lemmes_meilleur.add(map.get(key));
                }else if(max_prox == prox && (!lemmes_meilleur.contains(map.get(key)))){
                  lemmes_meilleur.add(map.get(key));
                }
              }else{
                lemmes_meilleur.add(map.get(key));
              }
            }
          }

          return lemmes_meilleur;
        }
      private static int TestLevenshtein(String MotOrigin, String MotDic) {
          int d[][];
          int n = MotOrigin.length();
          int m = MotDic.length();
          int i, j;
          Character mot_org_i, mot_dic_j;
          int cost;
          if (n == 0) { return m; }
          if (m == 0) { return n; }
          d = new int[n+1][m+1];
          for (i = 0; i <= n; i++) {
              d[i][0] = i;
          }
          for (j = 0; j <= m; j++) {
              d[0][j] = j;
          }
          for (i = 1; i <= n; i++) {
              mot_org_i = MotOrigin.charAt(i - 1);
              for (j = 1; j <= m; j++) {
                  mot_dic_j = MotDic.charAt(j - 1);
                  if (mot_org_i == mot_dic_j) { cost = 0; }
                  else { cost = 1; }
                  d[i][j] = Math.min(Math.min(d[i-1][j]+1, d[i][j-1]+1), d[i-1][j-1] + cost);
              }
          }
          return d[n][m];
      }

      public static ArrayList<String> Levenshtein(String MotOrigin) {
          int Distance,DistanceMin = 100;
          int DistanceMax = 2;
          ArrayList<String> MotFinal = new ArrayList<String>();
          String MotDic;
          for (Map.Entry<String, String> entry : dict.entrySet()) {
              MotDic = entry.getKey();
              Distance = TestLevenshtein(MotOrigin,MotDic);
              if(Distance <= DistanceMax && Distance < DistanceMin) {
                  DistanceMin = Distance;
                  MotFinal.clear();
                  MotFinal.add(entry.getValue());
              }else if(Distance == DistanceMin){
                  MotFinal.add(entry.getValue());
              }
          }
          return MotFinal;
      }

      public static void deleteDuplicates(ArrayList a){
            Set<String> set = new HashSet<>(a);
            a.clear();
            a.addAll(set);
      }

      public static void main(String[] args) {
            Lexique test = new Lexique();
            BufferedReader br=null;
            String chaine;
            String token;
            String lemme;
            int Distance_test;
            ArrayList<String> levenMots = new ArrayList<String>();
            try {
                 try {
                     Distance_test = TestLevenshtein("mnager","manager");
                     System.out.println("test:"+ Distance_test);
                     br = new BufferedReader(new InputStreamReader(System.in));
                     System.out.print("saisie : ");
                     chaine=br.readLine();
                     StringTokenizer st = new StringTokenizer(chaine," ");
                     while (st.hasMoreTokens()) {
                          //System.out.println(st.nextToken());
                          token = st.nextToken();
                          token = toLowerCase(token);
                         // token.toLowerCase();
                          lemme = findInDict(token);

                          if(lemme!=null){
                                System.out.println("Exist dans le dict: "+ token);
                                System.out.println("Lemme: "+ lemme);
                          }
                          else {
                              List<String>  lemmes_meilleur =  lemmes_prefixe(token, dict);
                              if(!lemmes_meilleur.isEmpty()){
                                 System.out.println("Prefix: "+ token);
                                 lemmes_meilleur.forEach(System.out::println);

                            }else{
                                  levenMots = Levenshtein(token);
                                  deleteDuplicates(levenMots);
                                  if(!levenMots.isEmpty()){
                                      System.out.println("Levenshtein: "+ token);
                                      levenMots.forEach(System.out::println);
                                      //affichier("Levenshtein", CurrentMot, LevenMots);
                                  }else{
                                      System.out.println("On ne trouve pas : "+ token);}
                              }
                          }
                     }
                     //System.out.println("j'ai saisi "+chaine);
                     }
                 catch(EOFException e) {
                      br.close();
                      }
                 }
            catch(IOException e) {
                 System.out.println("IO Exception");
                 }
        }


}
