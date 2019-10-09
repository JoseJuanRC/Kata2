package kata2;

//int... values (le pasamos varios elementos como parametros y lo considea un array)
public class Kata2 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(1,2,3,4,-4,4,4,4,5,1,4,0,0,1,0,52,-4);
        new ConsoleHistogramDisplaya().show(histogram);
    }
    
}
