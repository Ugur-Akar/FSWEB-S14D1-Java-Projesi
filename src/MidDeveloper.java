public class MidDeveloper extends Employee{
    private final double salary = 300;

    public MidDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " started work as Mid Developer");
        super.setSalary(salary);
        System.out.println(super.getName() + " salary is: " + super.getSalary());
    }
}
