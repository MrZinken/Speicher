import java.util.NoSuchElementException;

public class SchlangeMitArray implements Schlange{
    private Integer[] stack;
    private int maxGroesse;

    public SchlangeMitArray(int maxGroesse) {
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
    public Integer front()throws NoSuchElementException {
        if(stack[0]!=null){
            return stack[0];
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
