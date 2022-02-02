public class TypeConv_9 {
    public static void main(String[] args) {
        
        int a = 8;
        double b = a;
        System.out.println(a + " " + b); //int to double conversion

        double c = 32.6;
        int d = (int)c;
        System.out.println(c + " " + d); //double to int conversion

        float f = 2.5F;
        int e = (int)f;
        System.out.println(f + " " + e); //float to int conversion

        int m = 199;
        float n = m;
        System.out.println(m + " " + n); //int to float conversion
    }
}
