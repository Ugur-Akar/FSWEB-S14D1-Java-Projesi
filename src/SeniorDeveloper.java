public class SeniorDeveloper extends Employee{
    private final double salary = 400;

    public SeniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " started work as Sr Developer");
        super.setSalary(salary);
        System.out.println(super.getName() + " salary is: " + super.getSalary());
    }
}
