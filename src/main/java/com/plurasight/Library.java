package com.plurasight;

import java.util.Scanner;

public class Library {
    // creating a library for a user to see what books are available and checkout and check in books based on inventory
    // array holding 20 units and methods
    public static void main(String[] args) {
        Book[] books = new Book[20];
        bookInventory(books);
        backHome(books);
    }

    // book inventory method
    public static void bookInventory(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        books[0] = new Book(0, "10500", "Hunger Games", false, "");
        books[1] = new Book(1, "10501", "Away", false, "");
        books[2] = new Book(2, "10502", "Spirited Away", false, "");
        books[3] = new Book(3, "10503", "Maximus Ride", false, "");
        books[4] = new Book(4, "10504", "Eclipse", false, "");
        books[5] = new Book(5, "10505", "Little People", false, "");
        books[6] = new Book(6, "10506", "Attack on Titans", true, "Timmy");
        books[7] = new Book(7, "10507", "My Hero Academia", false, "");
        books[8] = new Book(8, "10508", "FullMetal Alchemist", false, "");
        books[9] = new Book(9, "10509", "Black Butler", true, "Rafael");
        books[10] = new Book(10, "10510", "Sailor Moon", false, "");
        books[11] = new Book(11, "10511", "Bleach", false, "");
        books[12] = new Book(12, "10512", "Hunter x Hunter", false, "");
        books[13] = new Book(13, "10513", "Haikyui", true, "Onriel");
        books[14] = new Book(14, "10514", "Macbeth", true, "Acton");
        books[15] = new Book(15, "10515", "Romeo and Juliet", true, "Charles");
        books[16] = new Book(16, "10516", "Hunger Games", false, "");
        books[17] = new Book(17, "10517", "Mean Girls", true, "Maddie");
        books[18] = new Book(18, "10518", "The Bible", false, "");
        books[19] = new Book(19, "10519", "The Da Vinci Code", false, "");
    }
// method to return user to home screen
         public static void backHome(Book[] books) {
            Scanner scanner = new Scanner(System.in);
            // get user choices
            System.out.println("Welcome to the Neighborhood Library!");
            System.out.println("Please make a selection");
            System.out.println("Please type 1 to see Available books, 2 to see Checked Out books or 3 to Exit the  program");
            System.out.println("Selection:");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    showAvailable(books);
                    break;
                case 2:
                    showCheckedOut(books);
                    break;
                case 3:
                    exitprogam(books);
                    break;
                default:
                    System.out.println("Error! Please select one of the 3 options");
                    backHome(books);
                    break;
            }
    }
// method to show user what books are currently available
        public static void showAvailable(Book[] books) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\tThese are the Available books");
            for (Book book : books)
                if (book.getIsCheckedOut() == false) {
                    System.out.println("Book Id:" + book.getId() + "\t" + "ISBN:" + book.getIsbn()+"\t" +"Book Title:"+book.getTitle() );
                }
    // switch case to call the user to got to checkout book method or return to home screen
            System.out.println("Select 1 to check out a book, select 2 to go back to the home screen?");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    checkOutBook(books);
                    break;
                case 2:
                    backHome(books);
                    break;
                 }
             }
// checkout method, allows user to choose a book and it shows the user that the book is now checked out to them
        public static void checkOutBook(Book[] books) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Please enter your name ");
            String userName = scanner.nextLine();
            System.out.println("Provide the id of the book you wish to checkout");
            int id = scanner.nextInt();
            if(!books[id].getIsCheckedOut()){
                books[id].checkOut(userName);
                System.out.println("You have Succesfully checked out the following book:\n" + "Book Id:" +books[id].getId() + " ISBN:" + books[id].getIsbn() +
                        " Book Title:" + books[id].getTitle()  + " is checked out to: " + books[id].getCheckedOutTo() );
            }
            System.out.println("Please Select 1 to return to the Home Screen or 2 to Exit the Program");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: backHome(books);
                    break;
                case 2: exitprogam(books);
            }
        }

    // method to show user what books have been checked out
        public static void showCheckedOut( Book[] books) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("These are the books that are currently Checked Out");
            for (Book book : books) {
                if (book.getIsCheckedOut() == true) {

                    System.out.println(book);
                }}
                System.out.println(" Please select C to check in a book or X to return to home screen");
                String selection = scanner.nextLine();
                switch(selection) {
                    case "C":
                        checkInBook(books);
                        break;
                    case "X":
                        backHome(books);
                }
            }
// method to check in a book on the checkout page, allows user to return home or exit the program after making a selection
         public static void checkInBook(Book[] books) {
             Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the ID of the book you would like to Check in");
            int id= scanner.nextInt();
            System.out.println("You have Succesfully checked in the following book:\n" + "Book Id:" +books[id].getId() +
               " Book Title:" + books[id].getTitle() + " ISBN:" + books[id].getIsbn() + " is checked out to: " + books[id].getCheckedOutTo() );
            System.out.println("Please Select 1 to return to the Home Screen or 2 to Exit the Program");
            int choice = scanner.nextInt();
            switch(choice){
                 case 1: backHome(books);
                break;
                case 2: exitprogam(books);
             }
         }
         public static void exitprogam(Book[] books){
             System.out.println("Thank you for visiting the Neighborhood Library, Have a Good Day!");
             }
        }

