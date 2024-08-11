import java.util.*;
public class practical5 {

    public static void main(String [] args){
  Random rn=new Random();
  Scanner sc=new Scanner(System.in);
  int chance=5;
  while(chance>0){
int random=rn.nextInt(100);
System.out.println("Choose any number between 1 to 100 : ");
int num=sc.nextInt();
if(num>random){
    System.out.println("Your number is very high..... ");
}
else if(num<random){
    System.out.println("Your number is very low..... ");
}
else{
    System.out.println("Congratulation.... ");
}

    --chance;
  }
  System.out.println("....................................................................................");

    }
}
