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

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author cc@armcloud.eu
 */
public class Student  extends Person {
    
    /**
     * capacity for a student is 1
     */
     private int cap=0;
     
     /**
      * Capacitatea maxima a unui student este 1 
      * Ori nu are nici un proiect si e liber ori e ocupat avand 1 proiect
      */
     final static private int CAPMAX =1;
     final private int SID;
     
    ArrayList<Project> projectList; 
        
    Project proiectSelectat;

    /**
     * Default constructor for Student class with no argument
     * member variable take a Unknown value 
     * member variable listaPreferinteProiect tale a null value
     */
    public Student(){
        this.projectList = new ArrayList<Project>();
        this.SID = Student.id;
        this.name ="Unknown";
        this.cap = 1;
        Student.id++;
               
    }
    
    /**
     * Constructor for Student class with 1 argument 
     *   member variable listaPreferinteProiect take a null value
     * 
     * @param name of the student as string 
     */
    public Student(String name) {
        this.projectList = new ArrayList<Project>();
        this.name = name;
           //this(name,null);
        this.SID = Person.id;
    }
    
    /**
     * Constructor for Student class with 2 arguments 
     * 
     * 
     * @param name of the student as string
     * @param listaPreferinteProiect preferences list of project for this student
     */
//    public Student(String name, Project[] listaPreferinteProiect) {
//        this.sId = Student.id;
//        this.name = name;
//        this.cap = 1;
//        Student.id++;
//        this.listaPreferinteProiect = listaPreferinteProiect;        
//    }
    
//    public void addListaPreferinteProject(Project aux) {
//        if ( this.listaPreferinteProiect != null ) {
//            this.listaPreferinteProiect = new aux; 
//        } else {
//            listaPreferinteProiect = new listaPreferinteProiect[10];
//         }
//        
//    }

//    public Project[] getListaPreferinteProiect() {
//        return listaPreferinteProiect;
//    }
//
//    public void setListaPreferinteProiect(Project[] listaPreferinteProiect) {
//        this.listaPreferinteProiect = listaPreferinteProiect;
//    }
    
    /**
     * Add a new preference to the project list
     * 
     * @param p of type project 
     */
    public void addProject(Project p) {
        //System.out.println("Adaugam "+p.toString());
        projectList.add(p);
        //cap++;
    }

    
    /**
     * Return the value of type Project of selected project for the student
     * 
     * @return project being selected for this student
     */    
    public Project getProiectSelectat() {
        return proiectSelectat;
    }
    
    /**
     * Set the value of type Project of what was choose from SPA problem
     * 
     * @param proiectSelectat is what was selected for this student 
     */
    public void setProiectSelectat(Project proiectSelectat) {
        this.proiectSelectat = proiectSelectat;
    }
    
    /**
     * Getter for Student class for ID 
     * 
     * @return ID of integer type for Student
     */
     @Override
    public int getId() {
        return this.SID;
    }

    /**
     * --- a student is free if it has no project 
     * 
     * @return boolean
     */
    @Override
    public boolean isFree() {
        return this.cap < Student.CAPMAX;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Return student info as a String
     * 
     * @return student info as a String 
     */
    @Override
    public String toString(){
        return "Student "+name+" with id "+SID+projectList;
                //+" and selected project "+proiectSelectat;  //Arrays.toString(listaPreferinteProiect);
    }

    
    public String selectedProjectToString(){
        return "Student "+name+" with id "+SID+" and selected project "+proiectSelectat;  
    }
    
    /**
     * Test if 2 Student are equals as name value
     * @return boolean value of true if the name are the same
     */
    @Override
    public boolean equals(Person obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        
        Student comp = (Student) obj;
        return ( comp.name.equals(name));// && comp.listaPreferinteProiect == this.listaPreferinteProiect) ;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
