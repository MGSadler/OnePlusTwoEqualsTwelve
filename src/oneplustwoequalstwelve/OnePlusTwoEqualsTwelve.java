package oneplustwoequalstwelve;

public class OnePlusTwoEqualsTwelve {

    public static void main(String[] args) {
        String x = "1";
        String y = "2";
        
        System.out.println(x +y);
        
        String firstName = "Matthew";
        String lastName = "Sadler";
        System.out.println(firstName + " " + lastName + "!!!!");
        
        //Convert strings into integers
        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);
        System.out.println(i + j);
        
        //Convert strings into doubles
        String gpa = "3.96";
        double gpa2 = Double.parseDouble(gpa);
        System.out.println(gpa2 - 1.0);
    }
    
}
