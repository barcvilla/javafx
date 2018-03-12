/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.jfx.properties;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author barcvilla
 */
public class Person {
    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final IntegerProperty weight = new SimpleIntegerProperty(this, "weight", 0);
    private DoubleProperty high;
    
    private double _high = 1.72;
    
    public Person()
    {
    }
    
    public Person(String firstName, String lastName, int weight)
    {
        this.firstName.set(lastName);
        this.lastName.set(lastName);
        this.weight.set(weight);
    }
    
    public Person(String firstName, String lastName, int weight, double high)
    {
        this.firstName.set(lastName);
        this.lastName.set(lastName);
        this.weight.set(weight);
        this.high.set(high);
    }
    
    public DoubleProperty highProperty()
    {
        if(this.high == null)
        {
            high = new SimpleDoubleProperty(this, "high", _high);
        }
        return high;
    }
    
    public double getHigh()
    {
        return (high == null) ? _high : high.get();
    }
    
    public void setHigh(double high)
    {
        if(this.high == null)
        {
            _high = high;
        }
        else
        {
            this.high.set(high);
        }
    }
    
    public IntegerProperty weightProperty()
    {
        return weight;
    }
    
    public int getWeight()
    {
        return weight.get();
    }
    
    public void setWeight(int weight)
    {
        this.weight.set(weight);
    }
    
    public StringProperty firstNameProperty()
    {
        return firstName;
    }
    
    public String getFirstName()
    {
        return firstName.get();
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName.set(firstName);
    }
    
    public StringProperty lastNameProperty()
    {
        return lastName;
    }
    
    public String getLastName()
    {
        return lastName.get();            
    }
    
    public void setLastName(String lastName)
    {
        this.lastName.set(lastName);
    }
    
}
