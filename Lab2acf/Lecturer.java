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
import java.util.List;

/**
 *
 * @author cc@armcloud.eu
 */
public class Lecturer extends Person {
    
    /**
     * Each lecturer has also a capacity constraint regarding how many students is he/she willing to supervise.
     */
    final private int LID;
    private int cap;
    private int capMax=0;
    List<Project> projectList;
    List<Student> studentList;
    
    //Student[] listaPreferinteStudent;
    //Student[] listaStudentiSelectati;

//    public Lecturer(String name, int capMax, Student[] listaPreferinteStudent) {
//        this.projectList = new ArrayList<Project>();
//        Lecturer.id= Person.id++;
//        this.name = name;
//        this.capMax = capMax;
//        this.listaPreferinteStudent = listaPreferinteStudent;
//    }
    
    public Lecturer(String name, int capMax) {
        //this(name,capMax,null);
        this.LID = Person.id;
        this.name = name;
        this.capMax = capMax;
        this.projectList = new ArrayList<Project>();
        this.studentList = new ArrayList<Student>();
    }
    
    public Lecturer(String name) {
        this(name,0);
        //this.projectList = new ArrayList<Project>();
    } 
    
    public Lecturer() {
        this("Unknown");
        //this.projectList = new ArrayList<Project>();
    }
            
    public void addProject(Project p) {
        projectList.add(p);
        cap++;
    }
    
    public void addStudent(Student s) {
        studentList.add(s);
    }
    
    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

//    public Student[] getListaPreferinteStudent() {
//        return listaPreferinteStudent;
//    }
//
//    public void setListaPreferinteStudent(Student[] listaPreferinteStudent) {
//        this.listaPreferinteStudent = listaPreferinteStudent;
//    }
  
    public int getCapacitate() {
        return cap;
    }

    public void setCapacitate(int cap) {
        this.cap = cap;
    }
    
      
    /**
     * Getter for id from Lecturer class 
     * 
     * @return the integer value of id
     */
    @Override
    public int getId() {
        return this.LID;
    }

    /**
     * --- a lecturer is free if its capacity has not been reached 
     * Each lecturer has also a capacity constraint regarding how many students is he/she willing to supervise
     * 
     * @return boolean
     */
    @Override
    public boolean isFree() {
        return this.cap < this.capMax;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "Lecturer "+name+" with capacity "+capMax+" and id "+this.LID+" Projects "+projectList+" Students "+studentList;
    }

    @Override
    public boolean equals(Person obj) {
        if (obj == null) return false;
        if (!(obj instanceof Lecturer)) return false;
        
        Lecturer comp = (Lecturer) obj;
        return ( comp.name.equals(name) && comp.cap == cap) ;
        
    }

    
    
    
}
