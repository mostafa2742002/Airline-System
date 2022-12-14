
package Airline;

import java.io.Serializable;
import java.io.*;
public class Customer implements Serializable{
      int id;
      String name;
      int phone;
      Airline i;

    public Customer(int id, String name, int phone, Airline i) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.i = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Airline getI() {
        return i;
    }

    public void setI(Airline i) {
        this.i = i;
    }

   
 
    
}
