public record Denomination(String name, double amt, String form, String img) {
    public static Denomination penny = new Denomination("Penny", 0.01, "coin", "images/penny.png");
    public static Denomination nickel = new Denomination("Nickel", 0.05, "coin", "images/nickel.png");
    public static Denomination dime = new Denomination("Dime", 0.1, "coin", "images/dime.png");
    public static Denomination quarter = new Denomination("Quarter", 0.25, "coin", "images/quater.png");
    public static Denomination dollar = new Denomination("One Dollar Bill", 1.00, "bill", "images/one_note.png");
    public static Denomination fiveNote = new Denomination("Five Dollar Bill", 5.00, "bill", "images/five_note.png");
    public static Denomination tenNote = new Denomination("Ten Dollar Bill", 10.00, "bill", "images/ten_note.png");
    public static Denomination twentyNote = new Denomination("Twenty Dollar Bill", 20.00, "bill", "images/twenty_note.png");
    public static Denomination fiftyNote = new Denomination("Fifty Dollar Bill", 50.00, "bill", "images/fifty_note.png");
    public static Denomination hundredNote = new Denomination("Hundred Dollar Bill", 100.00, "bill", "images/hundred_note.png");
}
