public class StoreRunner {
  public static void main(String[] args) {

    SchoolSupply supply1 = new SchoolSupply();
    SchoolSupply supply2 = new SchoolSupply(1.99, "Staples", 25);

    NoteBook notebook1 = new NoteBook();
    NoteBook notebook2 = new NoteBook(5.99, 200, "Five Star");
    NoteBook notebook3 = new NoteBook(7.99, 300, "Mead", 15);

    Binder binder1 = new Binder();
    Binder binder2 = new Binder(7.99, 3, "Staples");
    Binder binder3 = new Binder(9.99, 5, "Five Star", 20);

    Calculator calculator1 = new Calculator();
    Calculator calculator2 = new Calculator(19.99, true, "Casio");
    Calculator calculator3 = new Calculator(29.99, true, "TI", 8);

    System.out.println("WELCOME TO THE STORE OF SCHOOL SUPPLIES!!");
    System.out.println();

    System.out.println("GENERAL SUPPLIES");
    System.out.println(supply1);
    System.out.println(supply2);

    System.out.println();
    System.out.println("NOTEBOOKS");
    System.out.println(notebook1);
    System.out.println(notebook2);
    System.out.println(notebook3);

    System.out.println();
    System.out.println("BINDERS");
    System.out.println(binder1);
    System.out.println(binder2);
    System.out.println(binder3);

    System.out.println();
    System.out.println("CALCULATORS");
    System.out.println(calculator1);
    System.out.println(calculator2);
    System.out.println(calculator3);

    System.out.println();
    System.out.println("UPDATED PRODUCTS");

    notebook1.setPrice(3.99);
    notebook1.setPages(150);

    binder1.setQuantity(5);

    calculator1.setScientific(true);
    calculator1.setPrice(14.99);

    System.out.println(notebook1);
    System.out.println(binder1);
    System.out.println(calculator1);

    System.out.println();
    System.out.println("Notebook price: $" + notebook1.getPrice());
    System.out.println("Binder quantity: " + binder1.getQuantity());
    System.out.println("Calculator scientific: " + calculator1.getScientific());

  }
}
