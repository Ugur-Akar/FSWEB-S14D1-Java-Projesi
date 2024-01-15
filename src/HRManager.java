public class HRManager extends Employee{
    private final double salary = 400;
    private final int arrayLimit = 10;
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[arrayLimit];
    private MidDeveloper[] midDevelopers = new MidDeveloper[arrayLimit];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[arrayLimit];


    public HRManager(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println(super.getName() + " started work as HR Manager");
        super.setSalary(salary);
        System.out.println(super.getName() + " salary is: " + super.getSalary());
    }

    public void addEmployee(JuniorDeveloper dev){
        for(int i = 0; i < arrayLimit; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = dev;
                return;
            }
        }

        System.out.println("Junior Developer cap reached.");
    }
    public void addEmployee(MidDeveloper dev){
        for(int i = 0; i < arrayLimit; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = dev;
                return;
            }
        }

        System.out.println("Mid Developer cap reached.");
    }
    public void addEmployee(SeniorDeveloper dev){
        for(int i = 0; i < arrayLimit; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = dev;
                return;
            }
        }

        System.out.println("Senior Developer cap reached.");

    }

}
