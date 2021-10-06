/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import entity.Reader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    Book[] books = new Book[10];
    Scanner scanner = new Scanner(System.in);

    public App() {
    }
    public void run(){
        String repeat = "y";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("Выйти с программы: 0");
            System.out.println("Добавить книгу: 1");
            System.out.println("Вывести список книг: 2");
            int task = scanner.nextInt();
            scanner.nextLine();
            
            switch(task) {
                case 0:
                    repeat="q";
                    System.out.println("Программа закончена");
                    break;
                case 1:
                    System.out.println("Добавление книги");
                    for (int i = 0; i < books.length; i++) {
                            if(books[i] == null){
                                books[i] = addBook();
                            }
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Список книг: ");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null){
                        System.out.println(books[i].toString());
                        }
                        
                    }
                    break;
            }
        }while("y".equals(repeat));
        
        
        
    }
    
    private Book addBook(){
        Book book = new Book();
      
        System.out.print("Введите название книги: ");
        book.setCaption(scanner.nextLine());
        System.out.print("Введите год издания: ");
        book.setPublishedYear(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Сколько авторов у книги: ");
        int countAuthors=scanner.nextInt();
        scanner.nextLine();
        Author[] authors = new Author[countAuthors];
        for (int i = 0; i < authors.length; i++) {
            System.out.print("Добавление автора "+(i+1));
            Author author = new Author();
            System.out.print("Имя автора: ");
            author.setName(scanner.nextLine());
            System.out.print("Фамилия автора: ");
            author.setLastname(scanner.nextLine());
            System.out.print("Год рождения автора: ");
            author.setYear(scanner.nextInt());
            System.out.print("День рождения автора: ");
            author.setDay(scanner.nextInt());
            System.out.print("Месяц рождения автора: ");
            author.setMonth(scanner.nextInt());
            scanner.nextLine();
            authors[i]=author;
            
        }
        book.setAuthor(authors);
        return book;
    }
        //System.out.println("Hello");
//        Book book1 = new Book();
//        book1.setCaption("Voina i Mir");
//        Author author1 = new Author();
//        author1.setName("Lev");
//        author1.setLastname("Tolstoy");
//        author1.setYear(1828);
//        author1.setDay(9);
//        author1.setMonth(9);
//        Author[] authors = new Author[1];
//        authors[0]=author1;
//        book1.setAuthor(authors);
//        book1.setPublishedYear(2005);
//        Book book2 = new Book();
//        book2.setCaption("Otsi i deti");
//        Author author2 = new Author();
//        author2.setName("Ivan");
//        author2.setLastname("Turgenev");
//        author2.setDay(9);
//        author2.setMonth(11);
//        author2.setYear(1818);
//        Author[] authors2 = new Author[1];
//        authors2[0]=author2;
//        book2.setAuthor(authors2);
//        book2.setPublishedYear(2007);
//        Reader reader1 = new Reader();
//        reader1.setFirstname("Ivan");
//        reader1.setLastname("Ivanov");
//        reader1.setPhone("4564545345");
//        
//        History history1 = new History();
//        history1.setBook(book1);
//        history1.setReader(reader1);
//        Calendar c = new GregorianCalendar();
//        history1.setGivenDate(c.getTime());
//        
//        history1.setReturnDate(c.getTime());
//        System.out.println("history1 - "+history1.toString());
    
    
    
    
}
