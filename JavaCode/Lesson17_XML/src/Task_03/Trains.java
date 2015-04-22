package Task_03;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "trains")
public class Trains {

    @XmlElement(name = "train")
    private List<Train> trains = new ArrayList<Train>();

    public void add(Train train) {
        trains.add(train);
    }

    // метод доставания поезда по заданому промежутку времени
    public void findTrain(String timeFrom, String timeTo) {
        for (int i = 0; i < trains.size(); i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            try {
                Date dtFrom = sdf.parse(timeFrom);

                Date dtTo = sdf.parse(timeTo);

                Date dtTrain = sdf.parse(trains.get(i).getDeparture());

                if (dtTrain.after(dtFrom) && dtTrain.before(dtTo)) {
                    System.out.println(trains.get(i).toString());
                }

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(trains.toArray());
    }
}

