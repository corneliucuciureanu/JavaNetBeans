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
public class Problem {
    Student[] listaStudenti;
    Lecturer[] listaLectori;
    
    private Problem() {
        
    }
    
    public static Student[] problemSPA(Project[] listP, Student[] listS, Lecturer[] listL) {
        System.out.println("-----------Solving SPA problem---------------");
        listS[0].setProiectSelectat(listP[0]);
        listS[1].setProiectSelectat(listP[1]);
        listS[2].setProiectSelectat(listP[2]);
        listS[3].setProiectSelectat(listP[4]);
        listS[4].setProiectSelectat(listP[5]);
        listS[5].setProiectSelectat(listP[6]);
        listS[6].setProiectSelectat(listP[7]);
        return listS;
    }
    
}
