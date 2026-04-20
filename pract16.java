public class pract16 {
    private int[] data;
    private int size;

    public pract16() {
        data = new int[10];
        size = 0;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }

        if (size == data.length) {
            resize();
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }
}