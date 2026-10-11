public class Binder extends SchoolSupply {

  private int rings;

  /*
   * This makes a binder with regular values.
   */
  public Binder() {
    super(4.99, "Five Star");
    rings = 3;
  }

  /*
   * This lets me choose the binder information.
   */
  public Binder(double p, int r, String c) {
    super(p, c);
    rings = r;
  }

  /*
   * This lets me choose all the binder details
   * including the quantity.
   */
  public Binder(double p, int r, String c, int q) {
    super(p, c, q);
    rings = r;
  }

  /*
   * This returns the number of rings.
   */
  public int getRings() {
    return rings;
  }

  /*
   * This changes the number of rings.
   */
  public void setRings(int r) {
    rings = r;
  }

  /*
   * This prints the binder information
   * and the school supply information.
   */
  public String toString() {
    return "Binder - " + super.toString()
      + ", Rings: " + rings;
  }
}
