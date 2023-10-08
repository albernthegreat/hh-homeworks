import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Burger", "Fries", "Soda", "Chicken Nuggets", "Ice Cream", "Spaghetti", "Donut", "Pizza", "Siomai", "Carbonara"};
        String newItem = "";
        int itemNumber = 0;
        // Print out the initial menu
        System.out.println("Welcome to the Fast Food Restaurant!");
        System.out.println("Here's our menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }

        // Ask the user if they want to add or delete an item
        System.out.println("What would you like to do?");
        System.out.println("1. Add an item");
        System.out.println("2. Delete an item");
        System.out.println("3. Search an item");
        System.out.println("4. Update an item");
        int choice = input.nextInt();
        
        

        if (choice == 1) {
            // Add an item
            System.out.println("What item would you like to add?");
            newItem = input.next();
            String[] newMenu = new String[menu.length + 1];
            for (int i = 0; i < menu.length; i++) {
                newMenu[i] = menu[i];
            }
            newMenu[newMenu.length - 1] = newItem;
            menu = newMenu;

            // Print out the updated menu
            System.out.println("Here's our updated menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ". " + menu[i]);
            }
        } else if (choice == 2) {
            // Delete an item
            System.out.println("What item would you like to delete?");
            itemNumber = input.nextInt();
            String[] newMenu = new String[menu.length - 1];
            int j = 0;
            for (int i = 0; i < menu.length; i++) {
                if (i != itemNumber - 1) {
                    newMenu[j] = menu[i];
                    j++;
                }
            }
            menu = newMenu;

            // Print out the updated menu
            System.out.println("Here's our updated menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ". " + menu[i]);
            }
        }else if(choice == 3){
              System.out.print("Search The name of Item: ");
              newItem = input.next();
              for(int i=0;i<menu.length;i++){
                //   System.out.println(menu[i]);
                  if(menu[i].toLowerCase().equals(newItem.toLowerCase())){
                      System.out.println("Item: "+ newItem+" exist in the list!");
                      break;
                  }
              }
            //  System.out.println("Item Not Found!");
            
        }else if(choice == 4){
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ". " + menu[i]);
            }
            System.out.print("Choose what number: ");
            itemNumber = input.nextInt();
            System.out.println("You chose "+ menu[itemNumber-1] + " to update");
            System.out.print("Input New Name: ");
            input.nextLine();
            newItem = input.nextLine();
            String temp = newItem;
            menu[itemNumber-1] = temp;
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ". " + menu[i]);
            }
            
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}
