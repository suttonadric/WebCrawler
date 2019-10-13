package client;

import java.util.*;

public class Main
{
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        displayMainMenu();
    }

    public static void displayMainMenu()
    {
        System.out.println("\t\t\tGROCERY SCRAPER");
        System.out.println("1 - My Shopping Lists");
        System.out.println("2 - My Recipes");
        System.out.println("3 - Search");
        System.out.println("Q - Quit");

        switch (keyboard.nextLine().toLowerCase())
        {
            case "1":
                displayShoppingLists();
                break;
            case "2":
                displayRecipes();
                break;
            case "3":
                search();
                break;
            case "q":
                // TODO: check for unsaved changes
                System.out.println("... Goodbye ...");
                break;
            default:
                // user entered wrong menu option, refresh menu
                System.out.println("\n\nERROR - Unrecognized Menu Option\n\n");
                displayMainMenu();
        }
    }

    public static void displayShoppingLists()
    {
        System.out.println("\t\t\tMY SHOPPING LISTS");

        // TODO: fetch user shopping lists from DB
        // TODO: display user shopping lists
        // TODO: display menu options for shopping lists
        System.out.println("R - Return to Main Menu");
        System.out.println("Q - Quit Application");

        switch (keyboard.nextLine().toLowerCase())
        {
            case "r":
                displayMainMenu();
                break;
            case "q":
                // TODO: check for unsaved changes
                System.out.println("... Goodbye ...");
                break;
            default:
                // user entered wrong menu option, refresh menu
                System.out.println("\n\nERROR - Unrecognized Menu Option\n\n");
                displayShoppingLists();
        }
    }

    public static void displayRecipes()
    {
        System.out.println("\t\t\tMY RECIPES");

        // TODO: fetch user recipes from DB
        // TODO: display user recipes
        // TODO: display menu options for recipes
        System.out.println("R - Return to Main Menu");
        System.out.println("Q - Quit Application");

        switch (keyboard.nextLine().toLowerCase())
        {
            case "r":
                displayMainMenu();
                break;
            case "q":
                // TODO: check for unsaved changes
                System.out.println("... Goodbye ...");
                break;
            default:
                // user entered wrong menu option, refresh menu
                System.out.println("\n\nERROR - Unrecognized Menu Option\n\n");
                displayRecipes();
        }
    }

    public static void search()
    {
        System.out.println("\t\t\tSEARCH");

        // TODO: do web crawling API call
        // TODO: display menu options
        System.out.println("R - Return to Main Menu");
        System.out.println("Q - Quit Application");

        switch (keyboard.nextLine().toLowerCase())
        {
            case "r":
                displayMainMenu();
                break;
            case "q":
                // TODO: check for unsaved changes
                System.out.println("... Goodbye ...");
                break;
            default:
                // user entered wrong menu option, refresh menu
                System.out.println("\n\nERROR - Unrecognized Menu Option\n\n");
                search();
        }
    }
}