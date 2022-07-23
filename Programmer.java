//extends is Inheritance
/*It's means class Programmer (Child) have same 
    Attribute of Employee (Mother)
*/
class Programmer extends Employee{
    public String skill = "JAVA C#";
    public Programmer(){
        System.out.println("I'm a Programmer have Coding Skill");
    }
    //Method
    public void showProgrammer(){    
        setSalary(40000.0); //Method From class Employee
    }
    
}
