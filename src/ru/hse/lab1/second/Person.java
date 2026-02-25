package ru.hse.lab1.second;

/**
 * Класс Person — представляет человека с именем и возрастом.
 *
 * @author Марков Олег Дмитриевич
 * @version 1.0
 * @since 2026
 */
public class Person {

    private String name;
    private int age;

    /**
     * Конструктор для создания объекта Person.
     *
     * @param name имя человека
     * @param age  возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Возвращает имя человека.
     *
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает возраст человека.
     *
     * @return возраст
     */
    public int getAge() {
        return age;
    }
}
