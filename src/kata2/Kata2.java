package kata2;

//int... values (le pasamos varios elementos como parametros y lo considea un array)
public class Kata2 {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,1,2,3,4,5,1,1,1,2,5};
        Histogram histogram = new Histogram(array);
        new ConsoleHistogramDisplay().show(histogram);
    }
    
}
