/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.jfx.properties;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author barcvilla
 */
public class Main 
{
    private static Person person = new Person("John", "Alvarez", 67);
    
    public static void createPerson()
    {
        System.out.println("First Nane: " + person.firstNameProperty().get());
        System.out.println("Last Name: " + person.lastNameProperty().get());
        System.out.println("Weight: " + person.weightProperty().get());
    }
    
    public static void invalidatioProperty()
    {
        person.weightProperty().addListener(new InvalidationListener()
        {
            @Override
            public void invalidated(javafx.beans.Observable o) 
            {
                System.out.println("invalidation");
            }
        });
        
        person.weightProperty().setValue(33);
        person.weightProperty().setValue(33);
        person.weightProperty().setValue(67);
    }
    
    public static void changeListenerProperty()
    {
        person.weightProperty().addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) 
            {
                System.out.println("changed");
            }
        });
        
        person.weightProperty().setValue(33);
        person.weightProperty().setValue(33);
        person.weightProperty().setValue(67);
    }
    
    public static void main(String[] args) 
    {
        //invalidatioProperty();
        changeListenerProperty();
    }
}
