import org.example.Event;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventTest {

    @Test
    public void TestEvent(){
        Event event = new Event("Julafton","Hemma","24/12-2023","13:00");

        assertEquals("Julafton",event.getName());
        assertEquals("Hemma",event.getLocation());
        assertEquals("24/12-2023",event.getDate());
        assertEquals("13:00",event.getTime());

    }


}
