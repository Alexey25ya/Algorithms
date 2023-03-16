package lesson3;

public class Program {

    public static void main(String[] args) {
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("Cvvss", 25));
        linkedList.addFirst(new Employee("Acsss", 35));
        linkedList.addFirst(new Employee("Нcsss", 34));
        linkedList.addFirst(new Employee("Daaaaa", 12));
        linkedList.addFirst(new Employee("Baaaaa", 40));
        printList(linkedList);
        linkedList.reverseList();
        System.out.println();
        printList(linkedList);

        // linkedList.directSort(new EmployeeNameComparator(SortType.Ascending));
        // printList(linkedList);
        // System.out.println();
        // linkedList.directSort(new EmployeeNameComparator(SortType.Descending));
        // printList(linkedList);
        // System.out.println();

    }

    public static void printList(LinkedList<Employee> list) {
        LinkedList<Employee>.Node node = list.head;
        while (node != null) {
            System.out.printf("%s - %d\n", node.value.getName(), node.value.getAge());
            node = node.next;
        }

    }

}

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
