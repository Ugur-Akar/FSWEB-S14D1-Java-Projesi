public class JuniorDeveloper extends Employee{
    private final double salary = 200;

    public JuniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " started work as Jr Developer");
        super.setSalary(salary);
        System.out.println(super.getName() + " salary is: " + super.getSalary());
    }

    @Override
    public String toString() {
        return "JuniorDeveloper{" +
                "name= " + super.getName() +
                "id= " + super.getId() +
                "salary=" + salary +
                '}';
    }
}
