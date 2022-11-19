
public class Array {
    private int[] items;
    private int count;

    public Array(int size) {
        items = new int[size];
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        // Add the new item at the end
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        int[] leftArray = getSliceOfArray(items, 0, index);
        int[] rightArray = getSliceOfArray(items, index + 1, count);

        items = mergeArrays(leftArray, rightArray);
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    private int[] getSliceOfArray(int[] array, int start, int end) {
        int[] slice = new int[end - start];

        for (int i = 0; i < slice.length; i++) {
            slice[i] = array[start + i];
        }

        return slice;
    }

    private int[] mergeArrays(int[] leftArray, int[] rightArray) {
        int[] mergedArray = new int[leftArray.length + rightArray.length];
        int index = 0;

        for (int left : leftArray) {
            mergedArray[index] = left;
            index++;
        }
        for (int right : rightArray) {
            mergedArray[index] = right;
            index++;
        }

        return mergedArray;
    }
}
