package com.company;

import javax.sound.midi.Soundbank;

class Library {
    String [] books;
    int nbooks;
    Library(){
        this.books = new String[100];
        this.nbooks = 0 ;
    }
    void AddBook(String book) {
        this.books[nbooks] = book;
        nbooks++;
        System.out.println(book + " has been added");
    }
        void availableBook () {
            System.out.println("Available Books are ");
            for (String item : books) {
                if (item == null)
                    break;
                System.out.println("* " + item);
            }
        }
        void issueBook(String book){
            for (int i = 0 ; i <this.books.length;i++){
                if (this.books[i].equals(book)) {
                    System.out.println("Books has been issued");
                    this.books[i] = null;
                    return;
                }
            }
            System.out.println("This "+book+" does not exist");
        }
        void returnBook(String book){
        this.books[nbooks] = book ;
        }
    }
public class LibrarySum{
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.AddBook("Rich Dad vs Poor Dad");
        centralLibrary.AddBook("Amazon Fibre");
        centralLibrary.AddBook("One cup tea");
        centralLibrary.issueBook("One cup tea");
        centralLibrary.availableBook();
    }
}

