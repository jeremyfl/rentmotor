/**
 * Antrian
 */
public class Antrian {

    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    Antrian(int s) {
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    void enqueue(String j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queArray[++rear] = j;

        nItems++;
    }

    String dequeue() {
        String temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }

        nItems--;

        return temp;
    }

    boolean isEmpty() {
        return (nItems == 0);
    }
}