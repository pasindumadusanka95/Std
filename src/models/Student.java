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
public class Student {
    
    public static int sid;
    public static String fname;
    private String lname;
    private String nic;
    private String gender;
    private String dob;
    private int contact;
    private String email;
    private String address;
    
    public Student(){}
    
    public Student(int sid,String fname,String lname,String nic,String gender,String dob,int contact,String email,String address){
    
        this.sid=sid;
        this.fname=fname;
        this.lname=lname;
        this.nic=nic;
        this.gender=gender;
        this.dob=dob;
        this.contact=contact;
        this.email=email;
        this.address=address;
    }
       
        public int getSid() {
            return sid;
    }
         
        public void setSid(int sid) {
            this.sid = sid;
    }

        
        public String getFname() {
            return fname;
    }
         
        public void setFname(String fname) {
            this.fname = fname;
    }
        public String setLname(String lname){
            return lname;
        }
        public String getNic(){
            return nic;
        }
        public void setNic(String nic){
            this.nic=nic;
        }
        public String getGender(){
            return gender;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
        public String getDob(){
            return dob;
        }
        public void setDob(String dob){
            this.dob=dob;
        }
        public int getContact(){
            return contact;
        }
        public void setContact(int contact){
            this.contact=contact;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email=email;
        }
        public String getAddress(){
            return address;}
        
        public void setAddress(String address){
            this.address=address;
        }
        
    
    
    
}
    

