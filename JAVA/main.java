import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int q1,q2,q3,sum1;
            float average;
            String option;
            System.out.println("A. Question 1");
            System.out.println("B. Question 2");
            System.out.println("C. Question 3");
            System.out.println("E. Exit");
            option = sc.next();
         
            if(option.equals("A") || option.equals( "a")){
                System.out.print("Input Quiz 1 score: ");
                q1 = sc.nextInt();
                System.out.print("Input Quiz 2 score: ");
                q2 = sc.nextInt();
                System.out.print("Input Quiz 3 score: ");
                q3 = sc.nextInt();
                sum1 = q1+q2+q3;
                System.out.println("The sum of all quizzes is " + sum1);
                average= sum1/3;
                System.out.printf("%s%.2f", "The average of your three quizzes is ",average);
                System.out.println();
                System.out.println();
            } else if (option.equals( "B") || option.equals("b")){
                int Grades;
                System.out.println("Identify if you PASSED or FAILED, passing GRADES is 75 and above.");
                System.out.print("Enter your grades: ");
                Grades = sc.nextInt();
                if(Grades >= 75){
                    System.out.println("Passed");
                } else {
                    System.out.println("Failed");
                }

            } else if (option.equals( "C") || option.equals("c")) {
                char traffic_lights;
                System.out.println("What is the color of the traffic light? Green = G, Yellow = Y, Red = R."); 
                traffic_lights = sc.next().charAt(0);
                switch(traffic_lights){
                    case 'G':
                    case 'g':
                    System.out.println("The traffic lights signals GO.");
                    break;
                    case 'Y':
                    case 'y':
                    System.out.print("The traffic lights signals Wait.");
                    break;
                    case 'R':
                    case 'r':
                    System.out.println("The traffic lights signals Stop.");
                    break;
                    default:
                    System.out.println("Error. Invalid input. Please try again.");
                }
            } else if(option.equals( "E") || option.equals( "e") ){
                    System.out.println("Exiting..");
                    System.exit(0);
            } else  {
                System.out.print("Invalid Input, Try again: ");
                option = sc.nextLine();
            }
            System.out.print("Do you want to choose again? (Y/N): ");
            option = sc.next();
            if(option.equals( "n") || option.equals( "N")){
                System.out.println("Exiting..");
                System.exit(0);
            } else if(option.equals( "Y") || option.equals( "y")){
                System.out.println("A. Question 1");
                System.out.println("B. Question 2");
                System.out.println("C. Question 3");
                System.out.println("E. Exit");
                option = sc.nextLine();
            }else{
                System.out.print("Invalid Input, Try again: ");
                 option = sc.nextLine();
            }
        }while(true);
    }
}

