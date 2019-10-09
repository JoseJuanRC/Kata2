package kata2;

class ConsoleHistogramDisplaya implements HistogramDisplaya{


    @Override
    public void show(Histogram histogram) {
        for (int value : histogram) {
            System.out.println(value + " " + histogram.getCount(value));            
        }
    }
    
}
