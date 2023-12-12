import org.example.Event;
import org.example.EventApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventAppTest {


    @Test
    public void TestEventApp(){
        EventApp eventApp = new EventApp();
        Event event = new Event("Julafton","Hemma","24/12","13.00");

        eventApp.AddEvent(event);

        String result = eventApp.ListAllEvents();

        assertEquals(event.toString()+"\n",result);

        eventApp.DeleteEvent(event);

        assertEquals("",eventApp.ListAllEvents());

    }


}
