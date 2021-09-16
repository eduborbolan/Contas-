import java.util.Scanner;
public class LetraB {



    public static void main(String[] args) {

        

     char caracter = 'E'; //código relacionado a ela   

     String caracteres="E";

     char a = 'A'; //código relacionado a ela   

     String as ="A";

     char i = 'I'; //código relacionado a ela   

     String is ="I";

     char o = 'O'; //código relacionado a ela   

     String os ="O";

     char u = 'U'; //código relacionado a ela   

     String us ="U";
     


     Scanner ler=new Scanner(System.in);

    System.out.println("Digite uma letra");



    //c = sc.next().charAt(0);

    caracter=ler.next().charAt(0);



     switch(caracter){

         case 'A':

         System.out.println("Você digitou o caracter A");
         break;

         case 'E':

         System.out.println("Você digitou o caracter E");
         break;

         case 'I':

         System.out.println("Você digitou o caracter I");
         break;

         case 'O':

         System.out.println("Você digitou o caracter O");
         break;

         case 'U':

         System.out.println("Você digitou o caracter U");
         break;

         case 'a':

         System.out.println("Você digitou o caracter A");
         break;

         case 'e':

         System.out.println("Você digitou o caracter E");
         break;

         case 'i':

         System.out.println("Você digitou o caracter I");
         break;

         case 'o':

         System.out.println("Você digitou o caracter O");
         break;

         case 'u':

         System.out.println("Você digitou o caracter U");
         break;

         default:
         System.out.println("Você não digitou nem uma vogal");






     }




     }




    }