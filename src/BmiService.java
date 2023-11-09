public class BmiService {
    public int calculate (double HeightInMeters, int weightInKilogramms){
        double bmi = weightInKilogramms / Math.pow(HeightInMeters,2);
        int intbmi = (int) bmi; // приведение типа double к целочисленному int
        return intbmi;
    }
}
