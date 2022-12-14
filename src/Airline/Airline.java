
package Airline;

import java.io.Serializable;
import java.io.*;

public class Airline implements Serializable{
    int id;
    int salary;
    String time;
    String airport_name;
    String to;
    String date;

    public Airline(int id, int salary, String time, String airport_name, String to, String date) {
        this.id = id;
        this.salary = salary;
        this.time = time;
        this.airport_name = airport_name;
        this.to = to;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
    
}
