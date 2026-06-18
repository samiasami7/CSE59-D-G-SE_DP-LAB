class Sensor {

  String name;
  int bl;
  void charge() {
    bl=100;
    System.out.println("Sensor fully charged");
  }
}

public class Main4 {

  public static void main(String[] args) {
    Sensor sensor = new Sensor();
    sensor.charge();
    
    System.out.println("Battery Level: " +sensor.bl);

  }
} 
