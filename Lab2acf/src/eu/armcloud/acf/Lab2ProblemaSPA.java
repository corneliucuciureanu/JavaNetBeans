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
 * http://profs.info.uaic.ro/~acf/java/labs/lab_02.html
 * @author cc@armcloud.eu
 */
public class Lab2ProblemaSPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Problema SPA");
    }
    
    /***
     * initialize with problem data
     *  7 students, 3 lecturers, 8 projects,
     * project capacities: c(P1) = 2, c(P2) = c(P3) = ... = c(P8) = 1,
     * lecturer capacities: c(L1) = 3, c(L2) = 2, c(L3) = 2
     */
    public static void initializare(){
        
        Project p1 = new Project("P1",2,"L1");
        Project p2 = new Project("P2",1,"L1");
        Project p3 = new Project("P3",1,"L1");
        
        Project p4 = new Project("P4",1,"L2");
        Project p5 = new Project("P5",1,"L2");
        Project p6 = new Project("P6",1,"L2");
        
        Project p7 = new Project("P7",1,"L3");
        Project p8 = new Project("P8",1,"L3");
        
        //Lecturer L1 = new Lecturer("L1",3, (new Student("S1"),new Student("S2")));
        
    }
    
}
