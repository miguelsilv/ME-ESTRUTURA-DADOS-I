
public class CountConcurrence {

    public boolean hasValue(int searchValue, int[] array, int i) {
        if (i >= array.length) {
            return false;
        }

        if (array[i] == searchValue) {
            return true;
        } else {
            return hasValue(searchValue, array, i + 1);
        }
    }

    public int count(int countValue, int[] array, int i) {
        if (!hasValue(countValue, array, i) || i >= array.length) {
            return 0;
        }

        int c = 0;

        if (array[i] == countValue) {
            c++;
        }

        c += count(countValue, array, i);
        return c;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 9, 7, 8, 8, 9};
        CountConcurrence co = new CountConcurrence();
        System.out.println(co.count(5, array, 0));

    }

}
