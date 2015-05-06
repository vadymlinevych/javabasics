package Task_08;

/**
 * 8. Расширить иерархию классами Person и HR.
 * Для этого придется провести рефакторинг, и выделить общие свойства в суперклассы.
 */
public class Demo {
    public static void main(String args[]) {
        Person[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLead("Robby", 500, 7),
                new HR("Glory", 500, 7)
        };
        StringBuilder sb;

        for (Person d : list) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary());


            System.out.println(sb.toString());
        }
    }
}

