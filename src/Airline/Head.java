
package Airline;

import java.io.Serializable;
import java.io.*;

public class Head implements Serializable{
    String user_name = "airline";
    String password = "999999";

    public String getUser_name() {
        return user_name;
    }
    
    public boolean equal(String u,String p)
    {
        return u.equals(this.user_name) && p.equals(this.password);
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

   
    
}
