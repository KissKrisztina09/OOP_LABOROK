package labor9_2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company("Company");
        myCompany.hireAll("Labor_9/employees.csv");
        myCompany.printAll(System.out);
        System.out.println();
        System.out.println("Rendezes utan: ");
        System.out.println();
        myCompany.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getFirstName().equals(o2.getFirstName())){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        myCompany.printAll(System.out);
        myCompany.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println("Fizetes szerint rendezve: ");
        myCompany.printAll(System.out);
    }
}
