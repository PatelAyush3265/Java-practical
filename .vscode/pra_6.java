import java.util.*;

public class test {
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String str;;
int num;

System.out.println("Enter the string : ");
str=sc.nextLine();

System.out.println("Enter the number : ");
num=sc.nextInt();
int size=str.length();
if(size>num){
for(int i=0;i<num;i++){
    System.out.println(str.substring(0, num));
}
}
else if(size<num){
    for(int i=0;i<num;i++){
        System.out.println(str);
    }
}
    }
}
