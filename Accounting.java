class Accounting extends Employee{
    public String skill="Manage Money";
    public Accounting(){
        
    }
    public Accounting(String name, Double salary){
        super(name,salary);
        System.out.println("I'm a Accounting have Calculate Skill");
    }

    public void bonus() {
        
        System.out.println("Bonus = 10%");
    }
    
}
