public class Main {
    public static void main(String[] args) {

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Данные ФИО сотрудника  - " + fullName.replace("ё", "е"));


    }
}