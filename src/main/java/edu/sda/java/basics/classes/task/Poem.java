package edu.sda.java.basics.classes.task;

import java.time.LocalDate;

public class Poem {
        private String title;
        private Author author;
        private int stropheNumber;
        private LocalDate dateOfCreation;

        private int booksSold;

        public Poem(String title, Author author, int stropheNumber, LocalDate dateOfCreation, int booksSold) {
            this.title = title;
            this.author = author;
            this.stropheNumber = stropheNumber;
            this.dateOfCreation = dateOfCreation;
            this.booksSold = booksSold;
        }

        public String getTitle() {
            return title;
        }


        public Author getAuthor() {
                return author;
            }


        public int getStropheNumber() {
            return stropheNumber;
        }

        public LocalDate dateOfCreation() {
            return dateOfCreation;
        }

        public int getBooksSold() {
            return booksSold;
        }

        public LocalDate getDateOfCreation() {
            return dateOfCreation;
        }

    public String poemInfo() {
            return "Title: " + title + "\n" +
                    "Author name: " + author.getSurname() + "\n" +
                    "Author nationality: " + author.getNationality() + "\n" +
                    "Date of birth: " + author.getDateOfBirth() + "\n" +
                    "Strophe number: " + stropheNumber + "\n" +
                    "Date of creation: " + dateOfCreation + "\n" +
                    "Books sold: " + booksSold + "\n" ;

        }

}
