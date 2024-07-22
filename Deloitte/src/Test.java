import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static <employee> void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"pri",23000));
        list.add(new Employee(2,"priya",34000));
        list.add(new Employee(3,"priyank",5000));
        list.add(new Employee(4,"priyan",28000));
        list.add(new Employee(5,"priyanka",98000));

        //Getting 3rd highest salary
        Optional<Double> salary=list.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).findFirst();

        System.out.println("Third highest salary:" + salary.get());

        //fetch salary based on desc order.
        List<Employee> desc=list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();//convert list to stream
        //print the salary in desc order.
        System.out.println("descending order by salary:\n"+desc);

        //fetch top3 employees details

        List<Employee> top3Highest =list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3).toList();

        System.out.println("Highest top3 salary:\n"+top3Highest);

        //fetch all emp having salary less than 3rd highest salary


        List<Employee> lessThanThirdHighestSalary = list.stream()
                .filter(employee -> employee.getSalary() < salary.get())
                .collect(Collectors.toList());

        System.out.println(lessThanThirdHighestSalary);

}
}