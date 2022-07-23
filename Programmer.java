//extends is Inheritance
/*It's means class Programmer (Child) have same 
    Attribute of Employee (Mother)
*/
class Programmer extends Employee{
    
    /* Inheritance
    public String skill = "JAVA";
    public Programmer(String name, Double salary){
        super(name,salary);
        System.out.println("I'm a Programmer have Coding Skill");
    }
    //Method
    public void showProgrammer(){    
        setSalary(40000.0); //Method From class Employee
    }
    */
    
    //overloading method
    public void skill(){
        System.out.println("No Skill");
    }
    public void skill(String...language){
        for(int i=0;i<language.length;i++){
            System.out.println("Skill = "+language[i]);
        }
        
    }

    //Overriding
    public void bonus() {
        
        System.out.println("Bonus = 20%");
    }
    
    
}
