/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hp
 */
public class faculty {
    public static String facultyid;
    public static String facultyName;
    public faculty(){}
    
    public faculty(String facultyid,String facultyname){
    
        this.facultyid=facultyid;
        this.facultyName=facultyname;
       
    }
       
        public String getfacultyid() {
            return facultyid;
    }
         
        public void setfacultyidid(String facultyid) {
            this.facultyid= facultyid;
    }

        
        public String getfacultyFname() {
            return facultyName;
    }
        
        public String toString() {
             return facultyName;
    }
         
        public void setfacultyName(String facultyname) {
             this.facultyName=facultyname;
    }
        
}
