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
public class ElectiveSubjects {
    public static String subcode;
    public static String subname;
    public static int subcredit;
    private String degree;
    private int yr;
    private int semno;
  
    public ElectiveSubjects(){}
    
    public ElectiveSubjects(String subname){
    
      //  this.subcode=subcode;
        this.subname=subname;
      //  this.subcredit=subcredit;
      //  this.degree=degree;
     //   this.yr=yr;
      //  this.semno=semno;
       
    }
       
    public String getSubcode()
    {
         return subcode;
    }
         
    public void setSid(String subcode) 
    {
           this.subcode=subcode;
    }
           
    public String getSubname() 
    {
            return subcode;
    }
         
        
    public void setSubname(String subname) 
    {
           this.subname=subname;
    }
    
    public int getcredit() 
    {
            return subcredit;
    }
         
        
    public void setSubcredit(int subcredit) 
    {
           this.subcredit=subcredit;
    }
    
    public String getdegree() 
    {
            return degree;
    }
         
        
    public void setDegree(String degree) 
    {
            this.degree=degree;
    }
    
     public int getyear() 
    {
            return yr;
    }
         
        
    public void setYear(int yr) 
    {
            this.yr=yr;
    }
    
     public int getsem() 
    {
            return semno;
    }
         
        
    public void setSem(int semno) 
    {
           this.semno=semno;
    }
}
