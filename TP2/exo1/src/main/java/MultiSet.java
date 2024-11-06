import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MultiSet<T> implements MultisetInterface<T>{

    List<T> elements;

    public MultiSet(Collection<T> elements) {
        this.elements = new ArrayList<>(elements);
    }

    public boolean notEmpty() {
        return !elements.isEmpty();
    }

    public int mult(MultiSet<T> autre) {
        int count = 0;
        for (T element : elements) {
            if (autre.appartient(element)) {
                count++;
            }
        }
        return count;
    }

    public boolean appartient(T element) {
        return elements.contains(element);
    }

    public MultiSet<T> union(MultiSet<T> autre) {
        List<T> union = new ArrayList<>(elements);
        for (T element : autre.elements) {
            if (!union.contains(element)) {
                union.add(element);
            }
        }
        return new MultiSet<>(union);
    }

    public MultiSet<T> inter(MultiSet<T> autre) {
        List<T> inter = new ArrayList<>();
        for (T element : elements) {
            if (autre.appartient(element)) {
                inter.add(element);
            }
        }
        return new MultiSet<>(inter);
    }

    public int sCard() {
        return elements.size();
    }

    public boolean inclus(MultiSet<T> autre) {
        for (T element : autre.elements) {
            if (!elements.contains(element)) {
                return false;
            }
        }
        return true;
    }

    public boolean inclusEq(MultiSet<T> autre) {
        return inclus(autre) && autre.inclus(this);
    }

    public List<T> getElements() {
        return elements;
    }


}
