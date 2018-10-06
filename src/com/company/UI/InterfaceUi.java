package com.company.UI;

import com.company.workClass.Book;
import com.company.workClass.User;

import java.util.List;
import java.util.Scanner;

public class InterfaceUi {

    public static void interfaceUI(List<User> user, List<Book> book){
        System.out.println("Введите имя пользователя" + "\n" + "Или напишите выход для конца программы");
        Scanner scanner = new Scanner(System.in);
        String name;
        User newUser = new User();
        int pult = 0;
        do {                                                                            // Основное меню ввода
            name = scanner.nextLine();
            for(int i = 0; i<user.size();i++){
                newUser = user.get(i);
                if(newUser.getName().equals(name)){
                    System.out.println("Такой пользователь сеществует");
                    while (pult!=4){System.out.println("Выберите и нажмите что вы хотите сделать?");
                    System.out.println("1 - Посмотреть задолженность" + "\n" + "2 - Взять книгу" + "\n" +
                                        "3 - Посмотреть какие есть книги или журналы в наличии" + "\n" + "4 - Закрыть программу");
                    pult=isNumber();
                    menu(newUser,pult,book);                                            //Проверка и работа с введенными данными

                    }return;
                }
            }
                System.out.println("Вы ввели неправельного пользоватеоя");
        } while (!name.equals("выход"));
    }

    public static void menu(User user,int input,List<Book> book){                       //Метод работы библиотекаря
        Book newBook = new Book("","",true);
            switch (input){
            case 1:
                if (user.getDebtor()==false){                                           // Проверка задолженности
                    System.out.println("У вас нет задолженностей");
                    break;
                }else {
                System.out.println("Верните книги:");
                for(int i = 0; i<user.getBooks().size();i++){
                    System.out.println(user.getBooks().get(i).getName());
                }}
                break;
            case 2:                                                                     // Взять книги
                if(user.getDebtor()){
                    System.out.println("Вы должник, верните книги");
                    for(int i = 0; i<user.getBooks().size();i++){
                        System.out.println(user.getBooks().get(i).getName());
                    }break;
                }else {
                System.out.println("Книги в наличии:");
                    for(int i = 0; i<book.size();i++){
                        newBook = book.get(i);
                        if (newBook.getInStock()){
                            System.out.println(i+1 + " Книга " + newBook.getName() + " есть в наличии");
                        }
                    }
                    System.out.println("Выберите номер книги, который бы хотели взять");
                    takingBook(book,user);                                                 // Взять книги метод

                break;}
            case 3: System.out.println("Книги в наличии:");                                 // проверить наличие книг
                for(int i = 0; i<book.size();i++){
                    newBook = book.get(i);
                    if (newBook.getInStock()){
                        System.out.println(i+1 + " Книга " + newBook.getName() + " есть в наличии");
                    }
                }break;
                case 4:                                                                     // Завершение работы программы
                    System.out.println("До свиданья");
                    break;
            default:
                System.out.println("Такого выбора нет");
                break;
        }
    }

    public static void takingBook(List<Book> book,User user){           //Взять книги
        Scanner scanner = new Scanner(System.in);
        int num = isNumber()-1;
        if (num>=0 && num<=book.size()-1){
        if (book.get(num).getInStock()){                                //добавляю книгу, меняю состояния
            user.addBooks(book.get(num));
            book.get(num).setInStock(false);
            user.setDebtor(true);}
        }else {
            System.out.println("Такой книги нет");
        }

    }

    public static int isNumber(){                                       // Проверка, являеться ли ввод числом
        boolean stop = false;
        while (!stop){
            Scanner scanner = new Scanner(System.in);
            boolean rightNum = scanner.hasNextInt();
            if(rightNum){
                stop = true;
                return scanner.nextInt();
            }else {
                System.out.println("Введите число");
                continue;
            }}
        return 0;
}}
