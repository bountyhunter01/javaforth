package example;

public class gx4 {
    public static String numBer(int i) {
        if (i == 0) {
            return "shit";
        } else if (i <= 3) {
            return "yes";
        }else 
        return "perpect";
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i:" + i + ", result: " + numBer(i));
        }
    }
}
