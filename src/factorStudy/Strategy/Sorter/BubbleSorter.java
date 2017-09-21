package factorStudy.Strategy.Sorter;

public class BubbleSorter implements Sorter{

    public void sort(Comparable[] data) {
        for(int j = 1;j<data.length;j++) {
            for (int i = 0; i < data.length - j; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    Comparable temp = data[i];
                    data[i] = data[i +1];
                    data[i + 1] = temp;
                }
            }
        }
    }
}
