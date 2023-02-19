import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;
    int randomNumber;

    public Randoms(int min, int max) {
        random = new Random();
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                    return true;
                }

            @Override
            public Integer next() {
                if (hasNext()) {
                    randomNumber = (int) (Math.random() * ((max - min) + 1) + min);
                }
                return randomNumber;
            }
        };
    }
}