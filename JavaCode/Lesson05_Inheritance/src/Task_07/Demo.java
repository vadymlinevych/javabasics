package Task_07;

/**
 7. Проект Developers. Написать своего наследника Developer.
 Добавить его в существующий проект.
 */
public class Demo {
 public static void main(String args[]) {

  Developer[] list = {
          new JuniorDeveloper("Mike", 500, 0),
          new JuniorDeveloper("Dima", 500, 1),
          new JuniorDeveloper("Vova", 500, 2),
          new SeniorDeveloper("Jack", 500, 5),
          new TeamLead("Robby", 500, 7)
  };
  StringBuilder sb;

  for (Developer d : list) {
   sb = new StringBuilder() // !!!
           .append(d.getName())
           .append(": ")
           .append(d.getBasicSalary())
           .append(" -> ")
           .append(d.getSalary());

   System.out.println(sb.toString());
  }
 }
}
