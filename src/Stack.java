public class Stack {
    int size;
    Object[] stackDizi;
    int peak;

    public Stack(int size) {
        this.size = size;
        stackDizi = new Object[size];
        this.peak = -1;
    }

    public void push(Object o) {
        if (peak == size - 1) {
            System.out.println("Stack Full");
            return;
        }
        peak++;
        stackDizi[peak] = o;
    }

    public Object pop() {
        if (peak == -1) {//isEmpty ile yapilabilir
            System.out.println("Stack Empty");
            return null;
        }
        Object o = stackDizi[peak];
        stackDizi[peak] = null;
        peak = peak - 1;
        return o;
    }

    public Object peak() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return null;
        }
        Object o = stackDizi[peak];
        return o;
    }

    public boolean isEmpty() {
        return (peak == -1);
    }

}