package Task_07;


public class TeamLead extends Developer {

    public TeamLead(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary * 5 + experience > 0 ? basicSalary * experience * 0.2 : 0;
    }
}


