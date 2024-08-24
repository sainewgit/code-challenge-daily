package quee;

public class Quue {

    int start;
    int end;
    int currentSize;
    int maxsize;
    int[] arr;

    public Quue(int maxsize) {
        this.maxsize = maxsize;
        arr = new int[maxsize];
        this.start = -1;
        this.end = -1;
        this.currentSize = 0;
    }

    public void push(int data) {
        if (currentSize == maxsize) {
            System.err.println("full");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxsize;
        }
        arr[currentSize] = data;
        currentSize++;
    }
}
