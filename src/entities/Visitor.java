/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author amm6946
 */
public class Visitor extends Person
{
    private Boolean visitor;
    
    public Visitor(String fName, String lName, int age)
    {
        super(fName, lName, age);
        visitor = true;
    }
    
    public String getInfo()
    {
     super.getInfo();
     return(", Visitor: " + this.getVisitor());
    }
    
//    public String getInfo()
//    {
//       return super.getInfo();
//        
//    }

    /**
     * @return the visitor
     */
    public Boolean getVisitor() {
        return visitor;
    }

    /**
     * @param visitor the visitor to set
     */
    public void setVisitor(Boolean visitor) {
        this.visitor = visitor;
    }
}
