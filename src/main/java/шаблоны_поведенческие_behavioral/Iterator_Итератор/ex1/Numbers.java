package шаблоны_поведенческие_behavioral.Iterator_Итератор.ex1;

public class Numbers {
    public int num[] = {1, 2, 3};

    public Iterator getIterator() {
        return new NumbersIterator();
    }

    private class NumbersIterator implements Iterator {
        int ind;

        @Override
        public boolean hasNext() {
            if (ind < num.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return num[ind++];
            }
            return null;
        }
    }
}
