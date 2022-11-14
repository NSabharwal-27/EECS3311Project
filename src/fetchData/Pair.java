package fetchData;

public class Pair {

    private int key;
    private Double value;

    public Pair(int key, Double value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return this.key;
    }

    public Double getValue() {
        return this.value;
    }
}
