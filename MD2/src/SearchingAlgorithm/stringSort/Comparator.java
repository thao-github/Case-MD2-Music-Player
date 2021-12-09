package SearchingAlgorithm.stringSort;

public class Comparator implements java.util.Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o1.compareTo(o2);
    }
}
