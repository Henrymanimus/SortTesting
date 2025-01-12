//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ISort sort = new BubbleSort();
        ISort sort2 = new InsertionSort();
        ISort sort3 = new SelectionSort();

        int[] array = {2, 7, 5, 3, 6, 4, 1};
        int[] sortedArray = sort3.sort(array);


        for(int num: array){
            System.out.print(num+" ");
        }
    }
}