package com.company;

import com.company.UI.InterfaceUi;
import com.company.workClass.Book;
import com.company.workClass.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List users = new ArrayList<>();
        Arrays.asList("Sanya","Sveta","Nikita","Kirill").forEach(name -> {                      //Создпние массива пользователей
            users.add(new User(name,true,false));
        });
        List books = new ArrayList<>();
        Arrays.asList("Горе от ума","Челюсти","Братья Карамазовы","Ревизор").forEach(name -> {  //Создание массива книг
            books.add(new Book(name,"Книга", true));
        });
        InterfaceUi ui = new InterfaceUi();
        ui.interfaceUI(users, books);
    }
}
