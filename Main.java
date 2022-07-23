

public class Main{
    public static void main(String[] args) {
    /*  //Create Object + Print Attribute

        Employee e1 = new Employee(); //Create Object
        e1.setId("1");
        e1.setName("Passakorn");
        e1.setSalary(30000.0);
        // e1.displayEmployee();
        System.out.println(""+e1.getName());
        System.out.println(""+e1.getSalary());

        Employee e2 = new Employee(); //Create Object
        e2.setId("2");
        e2.setName("Athit");
        e2.setSalary(50000.0);
        // e2.displayEmployee();
        System.out.println(""+e2.getName());
        System.out.println(""+e2.getSalary());
        
    */ 
    
    /* Parameter Setting & Static
        Employee e1 = new Employee("1","Passakorn",30000.0); //Create Object
        e1.displayEmployee();
        
        //Static Example
        int result = Employee.minSalary;
        System.out.println(result);

        System.out.println(Company.name);
        System.out.println(Company.create_at);

        Company.service(); 
        
    */
    /* Inheritance Mother&Child
    Programmer p1 = new Programmer("John",30000.0);

    Accounting a1 = new Accounting("Anan",25000.0);
    */

    /*//Overloading Method
    Programmer e1 = new Programmer();
    e1.skill("Java");

    Programmer e2 = new Programmer();
    e2.skill("C","C#","Python");
    */

    //Overriding
    Programmer e1 = new Programmer();
    e1.bonus();
    Accounting a1 = new Accounting();
    a1.bonus();

    }

}