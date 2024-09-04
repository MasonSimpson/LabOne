import java.util.*;

public class Purse {
    public HashMap<Denomination, Integer> cash = new HashMap<>();
    public void add(Denomination type, int num) {
        if (cash.containsKey(type))
            cash.put(type, cash.get(type)+num);
        else
            cash.put(type, num);
    }
    public void remove(Denomination type, int num) {
        if (cash.containsKey(type))
            cash.put(type, cash.get(type)-num);
        else
            cash.remove(type);
    }
    public double getValue() {
        double contents = 0.0;
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            contents += (entry.getValue() * entry.getKey().amt());
        }
        return contents;
    }
    public String toString() {
        if (cash.isEmpty()) {
            return "Empty Purse";
        }
        String results = "A purse containing: \n";
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            results += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return results;
    }
}
