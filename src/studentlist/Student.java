/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;


public class Student 
{
    private String name; // variables private 
    private int sid; // principle "encapsulation"
    private int sem;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
        public String toString() {
            return "Student{" + "name=" + name + ", sid=" + sid + ", sem=" + sem + '}';
        }
    /**
     * @return the sid yuhhh
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the sem
     */
    public int getSem() {
        return sem;
    }

    /**
     * @param sem the sem to set
     */
    public void setSem(int sem) {
        this.sem = sem;
    }
}
