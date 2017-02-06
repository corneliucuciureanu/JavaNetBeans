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
 * Project class is where we store the informations about 
 * project available for students supervise by Lecturer
 * Each project has a Lecturer supervising it.
 * 
 * @author cc@armcloud.eu
 */
public class Project {

    private String name = "";
    /**
     * Project capacity as how many students can work in one project
     */
    private int cap=0;
    
    /**
     * Name of the lecturer supervising this project .
     * Each project has one Lecturer.
     */    
    //String nameLecturer =""; 

    /**
     * Default constructor for Project class 
     * This perform initialization of the class but no information 
     * are given .
     *  Use setter to fill the class data after this.
     */
    public Project() {
        this("Unknown",0);
    }
    
    /**
     * Class constructor with 1 argument
     * 
     * @param name of the project 
     */
    public Project(String name) {
        this(name,0);
    }
    
    /**
     * Class constructor with 2 argument name and capacity
     * 
     * @param name of the project
     * @param cap capacity of the project 
     */
    public Project(String name,int cap) {
        //this(name,cap,"");
        this.name = name;
        this.cap = cap;
       // System.out.println("constructed "+this.toString());
    }
    
    /**
     * Class constructor with 2 arguments, name of String type and nameLecturer
     * of String type. 
     * Usually each project has capacity of 1. 
     * 
     * @param name - name of the project
     * @param nameLecturer - name of the supervising Lecturer
     */
//    public Project(String name,String nameLecturer) {
//        this(name,1,nameLecturer);
//    }
    
    /**
     * Class constructor with 3 arguments 
     * 
     * @param name - name of the project 
     * @param cap - capacity of the project 
     * @param nameLecturer - name of supervising Lecturer
     */
//    public Project(String name, int cap, String nameLecturer) {
//        this.name = name;
//        this.cap = cap;
//        this.nameLecturer=nameLecturer;
//    }
    
     
    /**
     * Getter for project name
     * 
     * @return the name of the project
     */
    public String getNume() {
        return name;
    }    

    /**
     * Setter for project name
     * 
     * @param name of the project
     */
    public void setNume(String name) {
        this.name = name;
    }

    /**
     * Getter for capacity of this project 
     * 
     * @return capacity of this project as int
     */
    public int getCapacitate() {
        return cap;
    }
    
    /**
     * Setter for capacity of this project
     * 
     * @param cap capacity member variable of this project
     */
    public void setCapacitate(int cap) {
        this.cap = cap;
    }
    
    /**
     * Setter for name of lecturer supervising this project
     * 
     * @param nameLecturer name of lecturer as String
     */
//    public void setNameLecturer(String nameLecturer) {
//        this.nameLecturer = nameLecturer;  
//    }
    
    /**
     * Getter for supervising Lecturer name
     * 
     * @return name of this project supervising Lecturer as String
     */
//    public String getLecturer() {
//        return nameLecturer;
//    }
    
    /**
     * Return the name, capacity and name of the Lecturer as String.
     * 
     * @return Return the name, capacity and name of the Lecturer as String
     */
    @Override
    public String toString(){
        return "Project "+name+" with capacity "+cap; // +" supervise by "+nameLecturer;
    }
    
    
}
