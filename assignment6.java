import java.util.Scanner;

public class codingAssignment6 {

  public static void main(String[] args)
  {
    // START PART A
    
    //scanner to get user input
    Scanner keyboard = new Scanner(System.in);
     
    int answer = 1;
      while(answer == (1))
      {
        //Gets inputs from user
        System.out.println("Enter starting number:");
        int startValue = keyboard.nextInt();
        System.out.println("Enter end number:");
        int endValue = keyboard.nextInt();
        System.out.println("Enter jump number:");
        int jumpValue = keyboard.nextInt();

        System.out.println("Fetching answer...");
          //iHateMonday is the variable to add up all of the values
          int iHateMonday = 0;
          for(int i = startValue; i<= endValue; i+=jumpValue)
          {
            System.out.println("Value:" + i);
             iHateMonday+= i; // gets the final answer
          }
          System.out.println("Answer is:" + iHateMonday);


          System.out.println("");
          System.out.println("Choose an Option:\n[1] - Part A\n[2] - Part B\n[3] - End the program");
          answer=keyboard.nextInt();
    }


  // START PART B
  
  int answer1 = 2; 
  while(answer1 == (2))
  {
    System.out.println("Enter starting number:");
    int factorialNumber = keyboard.nextInt();

    System.out.println("Finding Factorial of:" + factorialNumber);

    int i,fact=1;   
    for(i=1;i<=factorialNumber;i++){    
        fact=fact*i;    
    }    
    System.out.println(fact);

    System.out.println("");
    System.out.println("Choose an Option:\n[1] - Part A\n[2] - Part B\n[3] - End the program");
    answer=keyboard.nextInt();

  }

  }
    
  
}

