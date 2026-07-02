class Teammem {
    protected String name;

    public Teammem(String name) {
      this.name = name;
    }

    public void displayInfo() {
      System.out.println("Name: "+ name);
    }
}

interface BonusEligible {
  void calculatebonus ();
}

class Employee extends Teammem implements BonusEligible {
   public Employee(String name){
    super(name);
   }


@Override
public void calculatebonus(){
  System.out.println("Calculating standard employee bonus...");

  }
}

class Contractor extends Teammem {
  public Contractor(String name) {
    super (name);
  }

  public void work(){
    System.out.println(name + " is working on a contract.");
  }
}

public class Main1 {
  public static void main(String[] args) {

    Employee employee = new Employee("Samia");
    Contractor contractor = new Contractor("Adnan");

    employee.displayInfo();
    employee.calculatebonus();

    contractor.displayInfo();
    contractor.work();
  }
}

