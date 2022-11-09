import java.util.Arrays;

public class Main {
    private static void space() {
        System.out.println();
    }

    private static Employee[] employees = new Employee[11];

    public static void main(String[] args) {
        employees[0] = new Employee("Агафонов Николай", 1, 45_000);
        employees[1] = new Employee("Смоленцев Максим", 2, 25_000);
        employees[2] = new Employee("Баязитов Ильгиз", 3, 21_000);
        employees[3] = new Employee("Казыев Рустам", 4, 39_000);
        employees[4] = new Employee("Алиев Максим", 5, 50_000);
        employees[5] = null;
        employees[6] = new Employee("Соколов Глеб", 5, 57_000);
        employees[7] = new Employee("Исламов Ильнар", 4, 22_000);
        employees[8] = new Employee("Нуруллин Ильназ", 3, 43_000);
        employees[9] = new Employee("Ивлиев Дмитрий", 2, 50_000);
        employees[10] = new Employee("Ланкин Денис", 1, 50_000);
        printListOfEmployees();
        space();
        System.out.println(findMaxEmployeesSalary());
        System.out.println(findMinEmployeesSalary());
        space();
        System.out.println("Общая сумма затрат на зарплаты работникам составила: " + findTotalConsumption() + "руб.");
        System.out.println("Среднее значение трат на зарплаты составило: " + findAverageSalary() + "руб.");
        space();
        System.out.println("Список всех сотрудников:");
        printFullNameEmployees();
    }

    public static void printListOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static int findTotalConsumption() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static String findMaxEmployeesSalary() {
        Employee employeeWithMaxSalary = employees[0];
        int salaryMax = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] != null && employee.getSalary() > salaryMax) {
                salaryMax = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        return "Сотрудник с самой высокой зарплатой: " + employeeWithMaxSalary;
    }

    public static String findMinEmployeesSalary() {
        Employee employeeWithMinSalary = employees[0];
        int salaryMin = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] != null && employee.getSalary() < salaryMin) {
                salaryMin = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        return "Сотрудник с самой низкой зарплатой: " + employeeWithMinSalary;
    }

    public static int findAverageSalary() {
        int notNull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                notNull++;
            }
        }
        return findTotalConsumption() / notNull;
    }

    public static void printFullNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}