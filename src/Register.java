public class Register {

    public Purse makeChange(double amt) {
        Purse purse = new Purse();
        while (amt >= 100) {
            purse.add(Denomination.hundredNote, 1);
            amt -= 100;
        }
        while (amt >= 50) {
            purse.add(Denomination.fiftyNote, 1);
            amt -= 50;
        }
        while (amt >= 20) {
            purse.add(Denomination.twentyNote, 1);
            amt -= 20;
        }
        while (amt >= 10) {
            purse.add(Denomination.tenNote, 1);
            amt -= 10;
        }
        while (amt >= 5) {
            purse.add(Denomination.fiveNote, 1);
            amt -= 5;
        }
        while (amt >= 1) {
            purse.add(Denomination.dollar, 1);
            amt -= 1;
        }
        while (amt >= 0.25) {
            purse.add(Denomination.quarter, 1);
            amt -= 0.25;
        }
        while (amt >= 0.10) {
            purse.add(Denomination.dime, 1);
            amt -= 0.10;
        }
        while (amt >= 0.05) {
            purse.add(Denomination.nickel, 1);
            amt -= 0.05;
        }
        while (amt >= 0.005) {
            purse.add(Denomination.penny, 1);
            amt -= 0.005;
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
