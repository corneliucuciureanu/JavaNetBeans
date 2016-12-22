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
public class Student  extends Person {
    
    //String nume;
    Project[] listaPreferinteProiect; 
    Project selectat;

    public Student(){
        this.listaPreferinteProiect= null;
        this.selectat =null;
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(Project[] preferinteProiect, Project selectat) {
        this.listaPreferinteProiect = preferinteProiect;
        this.selectat = selectat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Project getSelectat() {
        return selectat;
    }

    public void setSelectat(Project selectat) {
        this.selectat = selectat;
    }

    @Override
    void isFree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "";
    }
    
}
