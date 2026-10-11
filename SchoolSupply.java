public class SchoolSupply {

  private double price;
  private String company;
  private int quantity;

  /*
   * This gives a school supply its starting values
   * if nothing is entered.
   */
  public SchoolSupply() {
    price = 0.0;
    company = "Unknown";
    quantity = 10;
  }

  /*
   * This lets me choose the price and company.
   */
  public SchoolSupply(double p, String c) {
    price = p;
    company = c;
    quantity = 10;
  }

  /*
   * This lets me set all the information
   * for a school supply.
   */
  public SchoolSupply(double p, String c, int q) {
    price = p;
    company = c;
    quantity = q;
  }

  /*
   * This returns the price.
   */
  public double getPrice() {
    return price;
  }

  /*
   * This returns the company name.
   */
  public String getCompany() {
    return company;
  }

  /*
   * This returns how many supplies are available.
   */
  public int getQuantity() {
    return quantity;
  }

  /*
   * This changes the price.
   */
  public void setPrice(double p) {
    price = p;
  }

  /*
   * This changes the company.
   */
  public void setCompany(String c) {
    company = c;
  }

  /*
   * This changes the quantity.
   */
  public void setQuantity(int q) {
    quantity = q;
  }

  /*
   * This puts the school supply information
   * together so it can be printed.
   */
  public String toString() {
    return "Price: $" + price
      + ", Company: " + company
      + ", Quantity: " + quantity;
  }
}
