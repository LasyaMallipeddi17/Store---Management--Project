public class NoteBook extends SchoolSupply {

  private int pages;

  /*
   * This makes a notebook with regular values.
   */
  public NoteBook() {
    super(2.99, "Five Star");
    pages = 100;
  }

  /*
   * This lets me choose the notebook information.
   */
  public NoteBook(double p, int pg, String c) {
    super(p, c);
    pages = pg;
  }

  /*
   * This lets me choose the price, pages,
   * company, and quantity.
   */
  public NoteBook(double p, int pg, String c, int q) {
    super(p, c, q);
    pages = pg;
  }

  /*
   * This returns the number of pages.
   */
  public int getPages() {
    return pages;
  }

  /*
   * This changes the number of pages.
   */
  public void setPages(int pg) {
    pages = pg;
  }

  /*
   * This prints the notebook information
   * along with the school supply information.
   */
  public String toString() {
    return "Notebook - " + super.toString()
      + ", Pages: " + pages;
  }
}
