public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задание 2");
        System.out.println();

        String fullNameUpperCase = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
        System.out.println();

        System.out.println("Задание 3");
        System.out.println();

        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника — " + fullName3);
        System.out.println();

        /*String phone = "+7-963-758 89 25";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный!");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий!");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);*/
    }
}