import java.util.Scanner;

public class midterm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        String newFlower = "";
        int flowerNumber = 0;
        String[] list = {
            "Daisy", "Orchid", "Calla Lily", "Gardania","Carnat"
        };
        //output the type of flowers
        System.out.println("List of types of flowers:");
        for (int i= 0; i < list.length; i++){
            System.out.println(i + 1 + "." + list[i]);
        }
        
        do{
            //Ask the user to do either add/delete/change/search/ or exit.
            System.out.println("\nChoose a number of which you want to do (1-5).");
            System.out.println("1. Add a flower.");
            System.out.println("2. Delete a flower.");
            System.out.println("3. Change a flower.");
            System.out.println("4. Search a flower.");
            System.out.println("5. Exit.");
            System.out.print("\nEnter a number (1-5): ");
            int option = input.nextInt();

            if (option == 1){
                //Adding a flower in the list(code).
                System.out.print("What flower you want to include? ");
                newFlower = input.next();
                String[] newList = new String[list.length + 1];
                for (int i = 0; i < list.length; i++){
                    newList[i] = list [i];
                }
                newList[newList.length - 1] = newFlower;
                list = newList;

                //Output of list with added flower.
                System.out.println("Updated list of flowers:");
                for (int i = 0; i < list.length; i++) {
                    System.out.println(i + 1 +". " + list[i]);
                }
            
            }else if (option == 2 ){
                //Deleting a flower in the list(code).
                System.out.println("Choose a number of what flower you desire to remove (1-5).");
                System.out.print("What flower you want to remove? ");
                flowerNumber = input.nextInt();
                String[] newList = new String[list.length-1];
                int f = 0;
                for (int i = 0; i < list.length; i++) {
                    if (i != flowerNumber - 1){
                        newList[f] = list[i];
                        f++;
                    }
                }
                list = newList;

                //Output of list with deleted flower.
                System.out.println("Updated list of flowers:");
                for (int i = 0; i < list.length; i++){
                    System.out.println(i + 1 + ". " + list[i]);
                }
            }else if (option == 3){
                //Changing the flower data.
                for (int i = 0; i < list.length; i++){
                    System.out.println( i + 1 +". " + list[i]);
                }
                System.out.print("Choose what number you want to change (1-5): ");
                flowerNumber = input.nextInt();
                System.out.println("You chose \"" + list[flowerNumber-1]+ "\" to change.");
                System.out.print("Input the new flower name: ");
                input.nextLine();
                newFlower = input.nextLine();
                String temp = newFlower;
                list[flowerNumber-1] = temp;
                for (int i = 0; i <list.length; i++){
                    System.out.println(i + 1 +". " + list[i]);
                }
            }else if (option == 4){
                System.out.print("Input the flower name you want to search: ");
                newFlower = input.next();
                for(int i=0; i<list.length;i++){
                    if(list[i].toLowerCase().equals(newFlower.toLowerCase())){
                        System.out.println("The \"" +newFlower+"\" flower is already in the list.");
                    }
                }

            }else if (option == 5){
                System.out.println("Thanks for using the program.");
                System.exit(0);
            } else{
            //Ask the user to delete/add/update/search
            System.out.println("\nInvalid input, please try again. \n");
            option = input.nextInt();
            }
            System.out.print("Do you want to choose again? (Y/N): ");
            choice = input.next();
            if(choice.equals("n") || choice.equals ("N")){
                System.out.println("Thanks for using the Program.");
                System.out.println("Terminating...");
                System.exit(0);
            }
        }while(true);
    }
}