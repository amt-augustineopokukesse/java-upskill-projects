public class Droid {
    // Fields
    int batteryLevel;
    String name;
  
    // constructor
    public Droid(String droidName ) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString() {
      return "Hello, I'm the droid: " + name + ".";
    }
  
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }
    public void energyReport(){
      System.out.println("Battery level is: " + batteryLevel);
    }
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }
    
    // main method
    public static void main(String[] args) {
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("Cleaning");
      Codey.energyReport();
    }
  }