package com.walking.intensive.chapter1.task1;

/**
 * Реализуйте метод getAgeString(), который будет принимать параметром целое число (возраст) и возвращать строку
 * вида: "Вам N лет". Программа должна учитывать правила русского языка.
 *
 * <p>Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 *
 * <p>Также необходимо учесть негативные сценарии. Например, попытку передать в метод невалидное значение - например,
 * отрицательное число. В таких случаях ожидается, что метод вернет строку "Некорректный ввод".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */


public class Task1 {
    public static void main(String[] args) {

        int age = 79;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age <= 0) {
            return "Некорректный ввод";
        }
        String ending;
        int Digit = age % 10;
        int secondDigit = (age / 10) % 10;

        if (secondDigit == 1) {
            ending = " лет";
        } else if (Digit == 1) {
            ending = " год";
        } else if (Digit >= 2 && Digit <= 4) {
            ending = " года";
        } else {
            ending = " лет";
        }

        return "Вам " + age + ending;
    }

}