package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventsCalendar {
    private Map<LocalDate, Event> eventMap;

    public EventsCalendar() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        this.eventMap.put(date, new Event(name, attraction));
    }

    public void printCalendar() {
        Map<LocalDate, Event> orderedEvents = new TreeMap<>(this.eventMap);
        System.out.println(orderedEvents);
    }
    
    public void getNextEvent() {
        LocalDate currentDate = LocalDate.now();
        Map<LocalDate, Event> orderedEvents = new TreeMap<>(this.eventMap);

        for (Map.Entry<LocalDate, Event> entry : orderedEvents.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                System.out.println("O próximo evento: " +  entry.getValue() + " acontecerá em " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        EventsCalendar eventsCalendar = new EventsCalendar();
        eventsCalendar.addEvent(LocalDate.of(2023, Month.JULY, 15), "Evento 1", "Atração 1");
        eventsCalendar.addEvent(LocalDate.of(2024, 7, 9), "Evento 2", "Atração 2");
        eventsCalendar.addEvent(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        eventsCalendar.addEvent(LocalDate.of(2023, Month.AUGUST, 27), "Evento 4", "Atração 4");
        eventsCalendar.printCalendar();
        eventsCalendar.getNextEvent();
    }
    
}
