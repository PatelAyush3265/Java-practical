import java.util.*;
public class practical2 {
    public static void main(String [] arge){
             Scanner sc=new Scanner(System.in);
        String str;

String[] code = { ".-",  "-...", "-.-.", "-..",".","..-.", "--.","....", "..", ".---","-.-",".-..", "--", "-.", "---",".--.", "--.-", ".-.","...","-", "..-","...-", ".--","-..-", "-.--",};
        
    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x','y', 'z' };
        

        System.out.println("Enter the string : ");
        str=sc.nextLine();
int n=str.length();

        for(int i=0;i<n;i++){
            char c=str.charAt(i);
          for(int j=0;j<26;j++){
           
            if(c==letter[j]){
                System.out.print(code[j]);



            }
          }
        }
        System.out.println("");
        System.out.println("23DIT040 Patel Ayush");
    }

}
