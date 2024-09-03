public class Register {

    public Purse makeChange(double amt) {
        Purse purse = new Purse();
        while (amt >= 100) {
            purse.add(Denomination.hundredNote, 1);
            amt -= 100;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 50) {
            purse.add(Denomination.fiftyNote, 1);
            amt -= 50;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 20) {
            purse.add(Denomination.twentyNote, 1);
            amt -= 20;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 10) {
            purse.add(Denomination.tenNote, 1);
            amt -= 10;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 5) {
            purse.add(Denomination.fiveNote, 1);
            amt -= 5;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 1) {
            purse.add(Denomination.dollar, 1);
            amt -= 1;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 0.25) {
            purse.add(Denomination.quarter, 1);
            amt -= 0.25;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 0.10) {
            purse.add(Denomination.dime, 1);
            amt -= 0.10;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 0.05) {
            purse.add(Denomination.nickel, 1);
            amt -= 0.05;
            System.out.println(amt + " " + purse);
        }
        while (amt >= 0.005) {
            purse.add(Denomination.penny, 1);
            amt -= 0.005;
            System.out.println(amt + " " + purse);
        }
        return purse;
    }
    public static void main(String[] args) {
        double amt = 237.75;
        Register register = new Register();
        Purse purse = new Purse();
        purse = register.makeChange(amt);
        System.out.println(purse);
    }
}
