package ru.skypro;

public class Main {

    public static void main(String[] args) {

        {
            //Задача 1
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println(fullName);
        }
        {
            //Задача 2
            String firstName = "Ivan";                                        //Можно удалить
            String middleName = "Ivanovich";                                  //если подставить готовое значение
            String lastName = "Ivanov";                                       // в fullName
            String fullName = lastName + " " + firstName + " " + middleName;  //  String fullName = "Ivanov Ivan Ivanovich"
            fullName = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
        }
        {
            // Задача 3
            //Здесь я убрал строки firstName middleName lastName для минимизации кода
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника - " + fullName);
        }
    }
}