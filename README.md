
# School Supply Store

## Description
For my project, I created a **School Supply Store** that sells notebooks, binders, and calculators. My program displays the *price, company, quantity,* and other information about each product. It also updates product information.

I used **object-oriented programming (OOP)** to organize my classes. My superclass is `SchoolSupply`, and my subclasses are `NoteBook`, `Binder`, and `Calculator`.

I used **inheritance** so the subclasses can use variables and methods from the superclass. I also used **private instance variables**, **constructors**, **accessor methods**, and **mutator methods**.

The `toString()` method displays information about each object. I used `super` to call the superclass constructors and `super.toString()` to display the superclass information.

## Class Hierarchy

- **Superclass:** `SchoolSupply`
- **Subclass 1:** `NoteBook`
- **Subclass 2:** `Binder`
- **Subclass 3:** `Calculator`

## UML Diagrams

### SchoolSupply
```text
SchoolSupply
-----------------------------
- price: double
- company: String
- quantity: int
-----------------------------
+ SchoolSupply()
+ SchoolSupply(double, String)
+ SchoolSupply(double, String, int)
+ getPrice(): double
+ getCompany(): String
+ getQuantity(): int
+ setPrice(double): void
+ setCompany(String): void
+ setQuantity(int): void
+ toString(): String
```

### NoteBook extends SchoolSupply
```text
NoteBook
-----------------------------
- pages: int
-----------------------------
+ NoteBook()
+ NoteBook(double, int, String)
+ NoteBook(double, int, String, int)
+ getPages(): int
+ setPages(int): void
+ toString(): String
```

### Binder extends SchoolSupply
```text
Binder
-----------------------------
- rings: int
-----------------------------
+ Binder()
+ Binder(double, int, String)
+ Binder(double, int, String, int)
+ getRings(): int
+ setRings(int): void
+ toString(): String
```

### Calculator extends SchoolSupply
```text
Calculator
-----------------------------
- scientific: boolean
-----------------------------
+ Calculator()
+ Calculator(double, boolean, String)
+ Calculator(double, boolean, String, int)
+ getScientific(): boolean
+ setScientific(boolean): void
+ toString(): String
```

## How My Program Works
1. The program starts in `StoreRunner.java`.
2. It creates different school supply objects using **constructors**.
3. It prints information about each product.
4. It uses **setter methods** to update product information.
5. It prints the updated values using `toString()`.

## What I Learned
I learned how to use **superclasses and subclasses** to organize my code. I also learned how **inheritance** works and how constructors create objects. I practiced using **getters, setters,** and `toString()` methods to display and update information.

## Files
- `StoreRunner.java`
- `SchoolSupply.java`
- `NoteBook.java`
- `Binder.java`
- `Calculator.java`
