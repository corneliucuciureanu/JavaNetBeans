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
public class Project {

    String nume;
    private int capacitate;
    //Lecturer 
    String numeProfesor; 

    public Project(String nume, int capacitate, String numeProfesor) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.numeProfesor=numeProfesor;
        
    }
    
    public String getNume() {
        return nume;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    
}
