public class Calculator extends SchoolSupply {

  private boolean scientific;

  /*
   * This makes a regular calculator
   * with starting values.
   */
  public Calculator() {
    super(9.99, "Casio");
    scientific = false;
  }

  /*
   * This lets me choose the calculator details.
   */
  public Calculator(double p, boolean s, String c) {
    super(p, c);
    scientific = s;
  }

  /*
   * This lets me choose all the calculator
   * information including the quantity.
   */
  public Calculator(double p, boolean s, String c, int q) {
    super(p, c, q);
    scientific = s;
  }

  /*
   * This returns if the calculator
   * is scientific or not.
   */
  public boolean getScientific() {
    return scientific;
  }

  /*
   * This changes if the calculator
   * is scientific or not.
   */
  public void setScientific(boolean s) {
    scientific = s;
  }

  /*
   * This prints the calculator details
   * and the school supply information.
   */
  public String toString() {
    return "Calculator - " + super.toString()
      + ", Scientific: " + scientific;
  }
}
