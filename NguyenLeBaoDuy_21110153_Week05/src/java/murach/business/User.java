package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String date;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date ="";
    }

    public User(String firstName, String lastName, String email ,String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date=date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDate()
    {
        return date;
        
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    
}