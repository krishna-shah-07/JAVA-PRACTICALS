import java.util.*;

// Triplet class
class Triplet<U, V, T> {
    public final U first; // the first field of a triplet
    public final V second; // the second field of a triplet
    public final T third; // the third field of a triplet

    // Constructs a new triplet with the given values
    private Triplet(U first, V second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    // Factory method for creating a typed immutable instance of triplet
    public static <U, V, T> Triplet<U, V, T> of(U a, V b, T c) {
        return new Triplet<>(a, b, c);
    }
}

// Program to implement Triplet class in Java
class Pr11{
    public static void main(String[] args) throws Exception {
        Triplet<String, Integer, Character> p1 = Triplet.of("KRUNAL", 22, 'M');
        Triplet<String, Integer, Character> p2 = Triplet.of("MOHIT", 19, 'M');
        Triplet<String, Integer, Character> p3 = Triplet.of("KRISHNA", 18, 'F');

        //storing the values in triplet
        List<Triplet<String, Integer, Character>> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);

        System.out.println(pairs);

        //Sorting pf the Triplet
        Set<Triplet<String, Integer, Character>> distinctTriplets = new HashSet<>(pairs);
        System.out.println(distinctTriplets);
    }
}