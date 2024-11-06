public interface MultisetInterface<T> {
    boolean notEmpty();
    int mult(MultiSet<T> autre);
    boolean appartient(T element);
    MultiSet<T> union(MultiSet<T> autre);
    MultiSet<T> inter(MultiSet<T> autre);
    int sCard();
    boolean inclus(MultiSet<T> autre);
    boolean inclusEq(MultiSet<T> autre);
}