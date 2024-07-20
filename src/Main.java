//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задача 2
        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName);

        //Задача 3
        System.out.println("Задача 3");
        String fullNameS = "Иванов Семён Семёнович";
        String correct = fullNameS.replace('ё', 'е');
        System.out.println("ФИО сотрудника - " + correct);
    }
}