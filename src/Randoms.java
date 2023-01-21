import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;
    int i;

    public Randoms(int min, int max) {
        random = new Random();
        this.max = max;
        this.min = min;
        i = (int) (Math.random() * ((max - min) + 1) + min);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                if (i != 100) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    i = (int) (Math.random() * ((max - min) + 1) + min);
                }
                return i;
            }
        };
    }
}