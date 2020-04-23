import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Week12 {

    public static Set intersect(Set set1, Set set2){
        set1.retainAll(set2);
        return set1;
    }


    public static Set Difference(Set set1, Set set2){
        set1.removeAll(set2);
        return set1;
    }
    static Scanner input = new Scanner(System.in);
        public static void main(String[] args) throws IOException {
            System.out.println("EX1");

        String A = input.nextLine();
        String B = input.nextLine();
        String [] C= A.split(" ");
        String [] D=  B.split(" ");
            Set<String> FSet1 = new java.util.HashSet<>(Arrays.asList(C));
            Set<String> FSet2 = new java.util.HashSet<>(Arrays.asList(D));

            Set<String> FSet3 = new java.util.HashSet<>(Arrays.asList(C));
            Set<String> FSet4 = new java.util.HashSet<>(Arrays.asList(D));
System.out.println(Difference(FSet1,FSet2));
System.out.println(Difference(FSet4,FSet3));

            System.out.println("EX2");
         String J = input.nextLine();
         String S = input.nextLine();

         String [] MySet = new String[J.length()];
         for(int i=0;i<J.length();i++){
             MySet[i] = "" + J.charAt(i);
         }
         String [] MySet1 = new String[S.length()];
         for(int i=0;i<S.length();i++){
             MySet1[i] = "" + S.charAt(i);
         }



            int Numb = 0;
            for(int i=0;i<J.length();i++){
                for(int j=0;j<S.length();j++){
                    if(MySet[i].equals(MySet1[j])){
                        Numb++;
                    }
                }
            }
            System.out.println(Numb);


System.out.println("Ex3");

            Set<String> MyOwnSet0 = new java.util.HashSet<>(Arrays.asList(D));
            String [] Vowa = {"A","O","I","E","U"};
MyOwnSet0.addAll(Arrays.asList(Vowa));
String FileName = input.nextLine();
File MyFile = new File(FileName);

            FileReader Read = new FileReader(FileName);
            int o=0;
            while((o=Read.read())!=-1)
                System.out.print((char)o);
            Read.close();


        }
}
