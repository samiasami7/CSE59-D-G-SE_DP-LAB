class Printer {

  void printdata(String text) {
    System.out.println("Text: "+text);

  }

  void printdata(int number) {
    System.out.println("Number: "+number);
  }
}

public class Main5 {

  public static void main(String[] args){

    Printer printer = new Printer();

    printer.printdata("Hello, World!");
    printer.printdata(100);
  }
}
