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
        System.out.println("--- Problema SPA ---");
        
        initializare();
    }
    
    /***
     * initialize with problem data
     *  7 students, 3 lecturers, 8 projects,
     * project capacities: c(P1) = 2, c(P2) = c(P3) = ... = c(P8) = 1,
     * lecturer capacities: c(L1) = 3, c(L2) = 2, c(L3) = 2
     */
    public static void initializare(){
        
     //projectArray   
     Project[] projectArray ;
     projectArray = createProjectArray();
     
     printPorjectArray(projectArray);
     
     Student[] studentArray;
     studentArray = createStudentArray();
     printStudentArray(studentArray);
        
  
        
     
        
    }
    
    public static Project[] createProjectArray() {
        Project[] projectArray = new Project[8];
        for(int i=0; i<projectArray.length;i++) {
            String auxName;
            int capacity;
            auxName = (String) ("P"+(i+1));
            capacity =1;
                  
            switch(i) {
                
                case 0: 
                    projectArray[i]= new Project(auxName,2,"L1");
                    break;                
                case 1: 
                    projectArray[i]= new Project(auxName,capacity,"L1");
                    break;
                case 2: 
                    projectArray[i]= new Project(auxName,capacity,"L1");
                    break;
                case 3: 
                    projectArray[i]= new Project(auxName,capacity,"L2");
                    break;
                case 4:
                    projectArray[i]= new Project(auxName,capacity,"L2");
                    break;
                case 5: 
                    projectArray[i]= new Project(auxName,capacity,"L2");
                    break;
                case 6: 
                    projectArray[i]= new Project(auxName,capacity,"L3");
                    break;
                case 7:
                    projectArray[i]= new Project(auxName,capacity,"L3");
                    break;
                case 8: 
                    projectArray[i]= new Project(auxName,capacity,"L3");
                    break;
                default:
                    projectArray[i]= new Project(auxName,capacity);
            
            }
                    
        } 
        
        
        //return an array of type Problem
        return projectArray;
    }
       
    
    private static void printPorjectArray(Project[] projectArray) {
        System.out.println("---------------Project-------------------");
        for(int i=0;i<projectArray.length;i++) {
            System.out.println(projectArray[i].toString());
        }
       
    }

    private static Student[] createStudentArray() {
        Student[] studentArray = new Student[7];
        for(int i=0;i<studentArray.length;i++) {
            String auxName;
            auxName = (String) ("P"+(i+1));
            
                  
            
            switch(i) {
                case 0: {
                    Project[] preferinteProiect; 
                    preferinteProiect = crearePreferinte("P1","P7");
                    studentArray[i]= new Student(auxName,preferinteProiect);
                } break;
                case 1: { 
                    Project[] preferinteProiect; 
                    preferinteProiect = crearePreferinte("P1","P2","P3","P4","P5","P6");
                    studentArray[i]= new Student(auxName,preferinteProiect);
                } break;
                case 2: 
                    studentArray[i]= new Student(auxName);
                    break;
                case 3: 
                    studentArray[i]= new Student(auxName);
                    break;
                case 4:
                    studentArray[i]= new Student(auxName);
                    break;
                case 5: 
                    studentArray[i]= new Student(auxName);
                    break;
                case 6: 
                    studentArray[i]= new Student(auxName);
                    break;
                case 7:
                    studentArray[i]= new Student(auxName);
                    break;
                case 8: 
                    studentArray[i]= new Student(auxName);
                    break;
                default:
                    studentArray[i]= new Student(auxName);
            
            }
        }
        
        
        // return an array of type student
        return studentArray;
    }

    private static void printStudentArray(Student[] studentArray) {
        System.out.println("---------------Student-------------------");
        for(int i=0;i<studentArray.length;i++) {
            System.out.println(studentArray[i].toString());
        }
    }

    private static Project[] crearePreferinte(String... args) {
        Project[] preferinteProiect = new Project[args.length]; 
        if (args.length == 0) 
            return null;
        else {
        for (int i=0;i< args.length;i++) {
            preferinteProiect[i] = new Project(args[i]);
        }
        
        return preferinteProiect;
        }
    }
    
}
