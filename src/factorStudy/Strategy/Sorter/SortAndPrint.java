package factorStudy.Strategy.Sorter;

import myTools.printToWindow;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    printToWindow ptw = new printToWindow("Sorter Demo");

    public SortAndPrint(Comparable[] data,Sorter sorter){
        this.data = data;
        this.sorter = sorter;
    }

    public void execute(){
        print();
        sorter.sort(data);
        print();
    }

    public void print(){
        for(int i=0;i<data.length;i++){
            printToWindow.print(data[i] + ", ");
        }
        printToWindow.println("");
    }
}
