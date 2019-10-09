package kata2;

class ConsoleHistogramDisplay implements HistogramDisplay{


    @Override
    public void show(Histogram histogram) {
        for (int value : histogram) {
            System.out.println(value + " --> " + histogram.getCount(value));            
        }
    }
    
}
