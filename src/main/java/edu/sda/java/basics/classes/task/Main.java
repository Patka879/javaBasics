package edu.sda.java.basics.classes.task;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * Write an application that consists of few classes:
 * a. Author class, representing an author – poem writer, which consists of fields surname
 * and nationality (both of type String)
 * b. Poem class, representing poem, which consists of fields creator (type Author) and
 * stropheNumbers (type int – numbers of strophes in poem)
 * c. Main class, with main method, inside which you will:
 *    Create three instances of Poem class, fill them with data (using constructor and/or setters) and store them in array
 *    Write a surname of an author, that wrote a longest poem (let your application calculate it!)
 *  * Print authors born between 1975 and 1995
 *  * Print title and year of poem of authors born in 1980's
 * Add a class Review
 * It should store Poem and score - score between 0 and 100
 * Add a class Publication
 * It should contain date of publication, number of books printed (within this publication) and Poem
 * Add reviews for Poems
 * Add publications for Poems - create an array for that, consider several publications of same poems but with different dates
 * Print poem titles that get review over 60
 * Print poem titles, authors and total number of books published for that title, and review score for that title
 */

public class Main {
    public static void main(String[] args) {
        LocalDate author1DateOfBirth = LocalDate.of(1980, 1, 1);
        LocalDate poem1DateOfCreation = LocalDate.of(1845, 4, 23);
        LocalDate author2DateOfBirth = LocalDate.of(1977, 5, 5);
        LocalDate poem2DateOfCreation = LocalDate.of(1878, 9, 19);
        LocalDate author3DateOfBirth = LocalDate.of(1830, 12, 10);
        LocalDate poem3DateOfCreation = LocalDate.of(1845, 6, 20);

        // Author and poem 1
        Author author1 = new Author( "Edgar Allan Poe", "american", author1DateOfBirth );
        Poem poem1 = new Poem("Raven", author1, 134, poem1DateOfCreation, 30443);
        // Author and poem 2
        Author author2 = new Author( "Robert Frost", "american", author2DateOfBirth );
        Poem poem2 = new Poem("Fire and Ice", author2, 93, poem2DateOfCreation, 5954);
        // Author and poem 3
        Author author3 = new Author( "Emily Dickinson" , "american", author3DateOfBirth);
        Poem poem3 = new Poem("Hope", author3, 233, poem3DateOfCreation, 84746);

        Review review1 = new Review(76, poem1);
        Review review2 = new Review(55, poem2);
        Review review3 = new Review(90, poem3);

        Publication publ1poem1 = new Publication(LocalDate.of(1845, 4, 23), 575, poem1);
        Publication publ2poem1 = new Publication(LocalDate.of(1846, 7, 3), 544, poem1);
        Publication publ3poem1 = new Publication(LocalDate.of(1845, 4, 23), 232, poem1);

        Publication publ1poem2 = new Publication(LocalDate.of(1833, 5, 12), 175, poem2);
        Publication publ2poem2 = new Publication(LocalDate.of(1812, 2, 3), 244, poem2);
        Publication publ3poem2 = new Publication(LocalDate.of(1849, 1, 1), 432, poem2);

        Publication publ1poem3 = new Publication(LocalDate.of(1923, 4, 23), 875, poem3);
        Publication publ2poem3 = new Publication(LocalDate.of(1921, 12, 3), 144, poem3);
        Publication publ3poem3 = new Publication(LocalDate.of(1912, 11, 23), 432, poem3);

        Poem[] poems = {poem1, poem2, poem3};
        Arrays.sort(poems, (p1, p2) -> Integer.compare(p1.getBooksSold(), p2.getBooksSold()));

        String authorOfLongestPoem = "";
        int maxStrophes = 0;
        for (Poem poem : poems) {
            if (poem.getStropheNumber() > maxStrophes) {
                maxStrophes = poem.getStropheNumber();
                authorOfLongestPoem = poem.getAuthor().getSurname();
            }
        }

        Author[] authors = {author1, author2, author3};
        Arrays.sort(authors, (a1, a2) -> a1.getDateOfBirth().compareTo(a2.getDateOfBirth()));

        String authorsBornBetween = "";
        for (Author author : authors) {
            if (author.getDateOfBirth().isAfter(LocalDate.of(1975, 1, 1)) && author.getDateOfBirth().isBefore(LocalDate.of(1995, 12, 31)) ) {
                authorsBornBetween = author.getSurname();
            }
        }

        String poemsInYear = "";
        for (Author author : authors) {
            if (author.getDateOfBirth() == LocalDate.of(1980, 1, 1)) {
                poemsInYear = author.getSurname() + poem1.getTitle();
            }
        }

        Publication[] publications = {publ1poem1, publ2poem1, publ3poem1,
                                        publ1poem2, publ2poem2, publ3poem2,
                                        publ1poem3, publ2poem3, publ3poem3};

        Review[] reviews = {review1, review2, review3};

        System.out.println(poem1.poemInfo());
        System.out.println("===============");
        System.out.println(poem2.poemInfo());
        System.out.println("===============");
        System.out.println(poem3.poemInfo());
        System.out.println("===============");
        System.out.println("Author of the longest poem is: " + authorOfLongestPoem);
        System.out.println("===============");
        System.out.println("Authors from oldest to youngest:");
        for (Author author : authors) {
            System.out.println("Name: " + author.getSurname() + ", Date of Birth: " + author.getDateOfBirth());
        }
        System.out.println("===============");
        System.out.println("Books from least to most sold:");
        for (Poem poem : poems) {
            System.out.println("Poem: " + poem.getTitle() + ", Books sold: " + poem.getBooksSold());
        }
        System.out.println("Authos born between 1975-1995: " + authorsBornBetween);
        System.out.println("Poems of authors born in 1980: " + authorsBornBetween);
        System.out.println("Publications:");
        for (Publication publication : publications) {
            System.out.println("Time of publication: " + publication.getLocalDate() + "\n" +
                                "Number of publication: " + publication.getNumberOfPublications() +  "\n"+
                                "Poem title: " + publication.poem().getTitle());
        }
        System.out.print("-----------REVIEWS-------------");
        for (Review review : reviews) {
            System.out.println("Title: " + review.poem().getTitle() + "\n" +
                                "Books published: " + review.poem().getBooksSold() + "\n" +
                                "Reviews: " + review.getScore());
        }


    }
}
