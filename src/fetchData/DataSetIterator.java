package fetchData;

public class DataSetIterator implements Iterator {

    public DataSet dataSet;
    int lastYear;
    int pos; // Position of next to return

    public DataSetIterator(DataSet dataSet) {
        this.dataSet = dataSet;
        this.lastYear = dataSet.map.lastKey();
        this.pos = dataSet.map.firstKey();
    }

    public Pair next() {
        if (!hasNext())
            return null;

        int year = this.pos;
        Double value = this.dataSet.map.get(year);
        this.pos += 1;
        return new Pair(year, value);
    }

    @Override
    public boolean hasNext() {
        return (this.pos <= this.lastYear); // Has next, if next to return is less than or equal to final year
    }
}
