package factorStudy.Strategy.Sorter;

public class Main {
    public static void main(String[] args){
        String[] data = {
                "Dumpty","Bowman","Carrorll","Elfland","Alice",
        };
        

        SortAndPrint bap = new SortAndPrint(data, new BubbleSorter());
        bap.execute();
    }
}
