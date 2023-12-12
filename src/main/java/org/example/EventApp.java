package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventApp {


    List<Event> events;

    public EventApp(){
        events = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1) Add event");
        System.out.println("(2) Delete event");
        System.out.println("(3)  List all events");

        //Switch case

            //Användaren vill lägga till event => AddEvent(new Event(...))

    }


    public void AddEvent(Event event){

        events.add(event);
    }

    public void DeleteEvent(Event event){
        events.remove(event);
    }

    public String ListAllEvents(){
        String output = "";

        for (int i = 0; i < events.size(); i++) {
            output+= events.get(i).toString()+"\n";
        }

        return output;
    }


}
