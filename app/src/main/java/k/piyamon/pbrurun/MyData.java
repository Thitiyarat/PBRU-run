package k.piyamon.pbrurun;

/**
 * Created by lap324-06 on 6/13/2016 AD.
 */
public class MyData {

    //Explicit
    private int[] avataInts = new int[] {R.drawable.bird48,
    R.drawable.doremon48,R.drawable.kon48,R.drawable.nobita48,R.drawable.rat48};
    private double latADouble = 13.069937,lngADouble = 99.978201;
    private double[] buildLatDoubles = new double[]{13.069937,99.978201};
    private double[] buildKngDoules = new double[]{99.978201,13.069937};
    private int[] buildIconInts = new int[]{R.drawable.th, R.drawable.sg};

    public int[] getAvataInts(){
        return avataInts;
    }

    public double getLatADouble() {
        return latADouble;
    }

    public double getLngADouble() {
        return lngADouble;
    }


} // Main Class
