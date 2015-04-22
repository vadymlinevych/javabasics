package Task_03;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Scanner;

/**
 3. Есть список поездов, представленный с виде XML. Вывести на экран информацию о тех поездах, которые отправляются сегодня с 15:00 до 19:00.
 Написать код для добавления новых поездов в существующий XML.
 */
public class Demo {

    public static void main(String[] args) {

        Trains trains = new Trains();

        try {

            File f = new File("E:\\JAVA\\Projects\\JavaCode\\Lesson17_XML\\src\\Task_03\\example.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains) unmarshaller.unmarshal(f);

            // выводим на экран содержимое
            System.out.println(trains);

            System.out.println();

            String timeFrom = "15:00";
            String timeTo = "19:00";

            //1
            trains.findTrain(timeFrom, timeTo);


            //
            Scanner scan = new Scanner(System.in);
            System.out.println("ID:");
            String id = scan.nextLine();
            System.out.println("Input train from:");
            String trainFrom = scan.nextLine();
            System.out.println("Input train to:");
            String trainTo = scan.nextLine();
            System.out.println("Input date departure (dd.mm.yyyy):");
            String date = scan.nextLine();
            System.out.println("Input time departure:");
            String timeDep = scan.nextLine();

            trains.add(new Train(id, trainFrom, trainTo, date, timeDep));


            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(trains, f);


        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
