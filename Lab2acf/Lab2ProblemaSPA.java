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
        
        //initializare();
        Project[] projectArray ;
        projectArray = createProjectArray();
     
        printPorjectArray(projectArray);
     
        Student[] studentArray;
        studentArray = createStudentArray(projectArray);
        printStudentArray(studentArray);
        
        Lecturer[] lecturerArray;
        lecturerArray = createLecturerArray(projectArray,studentArray);
        printLecturerArray(lecturerArray);
    
        // apelam rezolvarea problemei 
        studentArray = Problem.problemSPA(projectArray, studentArray, lecturerArray);
        
        printStudentSelected(studentArray);
    }
    
    /***
     * initialize with problem data
     *  7 students, 3 lecturers, 8 projects,
     * project capacities: c(P1) = 2, c(P2) = c(P3) = ... = c(P8) = 1,
     * lecturer capacities: c(L1) = 3, c(L2) = 2, c(L3) = 2
     */
//    public static void initializare(){
//        
//     //projectArray   
//     Project[] projectArray ;
//     projectArray = createProjectArray();
//     
//     printPorjectArray(projectArray);
//     
//    Student[] studentArray;
//    studentArray = createStudentArray(projectArray);
//    printStudentArray(studentArray);
//        
//    Lecturer[] lecturerArray;
//    lecturerArray = createLecturerArray(projectArray,studentArray);
//    printLecturerArray(lecturerArray);
//        
//    
//        
//    }
    
    public static Project[] createProjectArray() {
        Project[] projectArray = new Project[8];
        for(int i=0; i<projectArray.length;i++) {
            String auxName;
            int capacity;
            auxName = (String) ("P"+(i+1));
            capacity =1;
                  
            switch(i) {
                
                case 0: 
                    projectArray[i]= new Project(auxName,2);  //,"L1");
                    break;                
//                case 1: 
//                    projectArray[i]= new Project(auxName,capacity,"L1");
//                    break;
//                case 2: 
//                    projectArray[i]= new Project(auxName,capacity,"L1");
//                    break;
//                case 3: 
//                    projectArray[i]= new Project(auxName,capacity,"L2");
//                    break;
//                case 4:
//                    projectArray[i]= new Project(auxName,capacity,"L2");
//                    break;
//                case 5: 
//                    projectArray[i]= new Project(auxName,capacity,"L2");
//                    break;
//                case 6: 
//                    projectArray[i]= new Project(auxName,capacity,"L3");
//                    break;
//                case 7:
//                    projectArray[i]= new Project(auxName,capacity,"L3");
//                    break;
//                case 8: 
//                    projectArray[i]= new Project(auxName,capacity,"L3");
//                    break;
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

    private static Student[] createStudentArray(Project[] projectArray) {
        Student[] studentArray = new Student[7];
        for(int i=0;i<studentArray.length;i++) {
            String auxName;
            auxName = (String) ("S"+(i+1));
            
                  
            
            switch(i) {
                case 0: {
                    // S1 : P1 P7 
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[0]);
                    studentArray[i].addProject(projectArray[6]);
                } break;
                case 1: { 
                    // S2 : P1 P2 P3 P4 P5 P6
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[0]);
                    studentArray[i].addProject(projectArray[1]);
                    studentArray[i].addProject(projectArray[2]);
                    studentArray[i].addProject(projectArray[3]);
                    studentArray[i].addProject(projectArray[4]);
                    studentArray[i].addProject(projectArray[5]);
                } break;
                case 2: 
                    //S3 : P2 P1 P4 
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[1]);
                    studentArray[i].addProject(projectArray[0]);
                    studentArray[i].addProject(projectArray[3]);
                    break;
                case 3: 
                    // S4 : P2 
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[1]);
                    break;
                case 4:
                    // S5 : P1 P2 P3 P4 
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[0]);
                    studentArray[i].addProject(projectArray[1]);
                    studentArray[i].addProject(projectArray[2]);
                    studentArray[i].addProject(projectArray[3]);
                    break;
                case 5: 
                    //S6 : P2 P3 P4 P5 P6 
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[1]);
                    studentArray[i].addProject(projectArray[2]);
                    studentArray[i].addProject(projectArray[3]);
                    studentArray[i].addProject(projectArray[4]);
                    studentArray[i].addProject(projectArray[5]);
                    break;
                case 6: 
                    //S7 : P5 P3 P8 
                    studentArray[i]= new Student(auxName);
                    studentArray[i].addProject(projectArray[4]);
                    studentArray[i].addProject(projectArray[2]);
                    studentArray[i].addProject(projectArray[7]);
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

    private static Lecturer[] createLecturerArray(Project[] projectArray,Student[] studentArray) {
        Lecturer[] lecturerArray = new Lecturer[3];
        for(int i=0; i<lecturerArray.length; i++) {
            String auxName;
            auxName = (String) ("L"+(i+1));
            
            switch(i) {
                case 0: {
                    //Projects : L1 offers P1, P2, P3 
                    //Student Preferences L1 : S7 S4 S1 S3 S2 S5 S6
                                  
                    lecturerArray[i] = new Lecturer(auxName,3);
                    lecturerArray[i].addProject(projectArray[0]);
                    lecturerArray[i].addProject(projectArray[1]);
                    lecturerArray[i].addProject(projectArray[2]);
                    
                    lecturerArray[i].addStudent(studentArray[6]);
                    lecturerArray[i].addStudent(studentArray[3]);
                    lecturerArray[i].addStudent(studentArray[0]);
                    lecturerArray[i].addStudent(studentArray[2]);
                    lecturerArray[i].addStudent(studentArray[1]);
                    lecturerArray[i].addStudent(studentArray[4]);
                    lecturerArray[i].addStudent(studentArray[5]);


                } break;
                case 1: {
                    //Student Preferences L2 : S3 S2 S6 S7 S5
                    //Projects: L2 offers P4, P5, P6 
                    lecturerArray[i] = new Lecturer(auxName,2);
                    lecturerArray[i].addProject(projectArray[3]);
                    lecturerArray[i].addProject(projectArray[4]);
                    lecturerArray[i].addProject(projectArray[5]);
                    
                    lecturerArray[i].addStudent(studentArray[2]);
                    lecturerArray[i].addStudent(studentArray[1]);
                    lecturerArray[i].addStudent(studentArray[5]);
                    lecturerArray[i].addStudent(studentArray[6]);
                    lecturerArray[i].addStudent(studentArray[4]);
                    
                } break;
                case 2: {
                    //Student Preferences L3 : S1 S7 
                    //L3 offers P7, P8
                    lecturerArray[i] = new Lecturer(auxName,2);
                    lecturerArray[i].addProject(projectArray[6]);
                    lecturerArray[i].addProject(projectArray[7]);
                    
                    lecturerArray[i].addStudent(studentArray[0]);
                    lecturerArray[i].addStudent(studentArray[6]);
                }break;
                
                default:
                    lecturerArray[i] = new Lecturer(auxName);
            }
        }
        
        //return an array of type Lecturer
        return lecturerArray;
    }

    private static void printLecturerArray(Lecturer[] lecturerArray) {
        System.out.println("---------------Lecturer-------------------");
         for(int i=0;i<lecturerArray.length;i++) {
            System.out.println(lecturerArray[i].toString());
        }
        
    }
    
    
    private static void printStudentSelected(Student[] studentArray) {
        System.out.println("----------Student Selected-------------------");
        for(int i=0;i<studentArray.length;i++) {
            System.out.println(studentArray[i].selectedProjectToString());
        }
    }
    
}
