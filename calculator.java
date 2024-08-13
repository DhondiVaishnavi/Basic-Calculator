import java.util.*;

public class calculator
{   

    public static void main(String args[ ])
    {
       int operator,n1,n2;

       System.out.println("1 - addition \n 2 - substraction \n 3 - multiplication \n 4 - divison");

       System.out.print("choose operator: ");

       Scanner sc = new Scanner(System.in);

       operator = sc.nextInt();

       System.out.print("Enter first number : ");

       n1 = sc.nextInt();

       System.out.print("Enter second number : "); 

       n2 = sc.nextInt();

       int result = 0;

       switch(operator)
         {
            case 1:
                result = n1+n2;
                break;

            case 2:
                result = n1-n2;
                break;
            
            case 3:
                result = n1*n2;
                break;
            
            case 4:
                result = n1/n2;
                break;

            default :
                System.out.println("Entered operator is not valid");

         }
            System.out.println("Result is : " + result);
    }

}




   