import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

    }

    List<Holiday> holidays = new ArrayList<Holiday>();

    public void generateHolidays() {
        holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
        holidays.add(new Holiday("21/02/2023", "Carnaval"));
        holidays.add(new Holiday("17/04/2023", "Páscoa"));
        holidays.add(new Holiday("21/04/2023", "Tiradentes"));
        holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
        holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
        holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
        holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("02/11/2023", "Finados"));
        holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
        holidays.add(new Holiday("25/12/2023", "Natal"));
    }
    
    public void findHoliday(String date) {
        Iterator<Holiday> list = holidays.iterator();
        while(list.hasNext()) {
            Holiday holiday = list.next();
            if (holiday.getDate() == date) {
                System.out.println(holiday.getName());
                return;
            }
        }

        System.out.println("Não existe feriado nessa data");
    }

    public List<Holiday> getHolidays() {
        return this.holidays;
    }
}
