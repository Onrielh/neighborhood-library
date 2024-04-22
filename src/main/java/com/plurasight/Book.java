package com.plurasight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public void checkOut (String name){
        setCheckedOutTo(name);
        setIsCheckedOut(true);
    }
    public void checkIn(){
        setCheckedOutTo("");
        setIsCheckedOut(false);
    }

    //Constructor

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
    public String toString(){
        return "Book id: " + id +", isbn:" + isbn + "  title:"+ title + " is Checked Out: " + isCheckedOut + "  is checked out to " + checkedOutTo;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}



