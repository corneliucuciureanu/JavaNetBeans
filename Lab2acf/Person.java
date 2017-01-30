/*
 * Copyright (C) 2016 cc@armcloud.eu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.armcloud.acf;

/**
 *
 * @author cc@armcloud.eu
 */
public abstract class Person {
    
    /**
     * id - protected 
     * Variabila de clasa 
     * numarul de identificare a unei persoane
     * modificare doar prin constructorul subclaselor 
     */
    protected static int id=0; //personal identifier - codul personal 
    
    /**
     * name - package
     * 
     * numele unei persoane 
     */    
    String name;
    
    /**
     * email - package
     * 
     * adresa email a unei persoane 
     */
    String email;    
    
    /**
     * Setter pentru variabila membera name 
     * 
     * @param name change the member value 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter for member variable name 
     * 
     * @return name String value of the Person 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter for member variable email
     * 
     * @param email to change String value of member variable 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Getter for member variable email
     * 
     * @return email String value of member variable 
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Getter for static variable id
     * 
     * @return id int value of the readonly protected static class variable 
     */
    public int getId() {
        return id;
    }


    /**
     * return a string form of the information in the class
     * 
     * @return String - convert local variable value tot a string value
     */
    @Override
    public abstract String toString(); 
    
    /**
     *  If 2 Person object are equal return true
     * 
     * @param obj to compare with
     * @return boolean true if value in the object are equals 
     */
    public abstract boolean equals(Person obj); 
    
    /**
     * --- a student is free if it has no project 
     * --- a lecturer is free if its capacity has not been reached 
     * 
     * 
     * @return boolean if maximum capacity is not reach 
     */
    public abstract boolean isFree();
    //@param cap capacity to test with local variable 
    
}
