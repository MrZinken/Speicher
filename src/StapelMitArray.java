import java.util.NoSuchElementException;
public class StapelMitArray implements Stapel {
    private Integer[] stack;
    private int maxGroesse;

    public StapelMitArray(int maxGroesse) {
        this.maxGroesse = maxGroesse;
        stack = new Integer[maxGroesse];
    }

    @Override
    public boolean isEmpty() {
        for (Integer s : stack)
            if (s != null) {
                return false;
            }
        return true;
    }

    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public int capacity() {
        int counter = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null)
                counter++;
        }
        return counter;

    }

    @Override
    public int top() throws NoSuchElementException {
        boolean a = false;
        for (Integer i : stack) {
            if (i != null) {
                a = true;
            }
        }
        if (a) {
            for (int i = 0; i < stack.length; i++) {
                if (stack[stack.length-1-i] != null) {
                    return stack[stack.length-1-i];
                }
            }
        } else {
            throw new NoSuchElementException();
        }
        return 0;
    }
}
