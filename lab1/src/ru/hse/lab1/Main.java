package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * @author Марков Олег Дмитриевич
 * @version 1.0
 * @since 2026
 */
public class Main {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        Person person = new Person("Олег", 18);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}
