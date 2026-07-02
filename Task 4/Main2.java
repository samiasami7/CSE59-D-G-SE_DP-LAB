interface Printer {
	void printDoc();
}

interface Scanner {
	void scanDoc();
}

interface faxMachine {
	void faxDoc();
}

class MultiFunctionCopier implements Printer,Scanner,faxMachine {
	
	@Override
	public void printDoc() {
		System.out.println("Printing....");
	}
	@Override
	public void scanDoc() {
		System.out.println("Scanning....");
	}
	@Override
	public void faxDoc() {
		System.out.println("Faxing....");
	}
	
}

class BasicPrinter implements Printer {
	
	@Override 
	public void printDoc() {
		System.out.println("Printing...");
	}
}

public class Main2 {
	public static void main(String[] args) {
		
		MultiFunctionCopier copier = new MultiFunctionCopier();
		copier.printDoc();
		copier.scanDoc();
		copier.faxDoc();
		
		System.out.println();
		
		BasicPrinter printer = new BasicPrinter();
		printer.printDoc();
	}
	
}

