public class TryCatchFinallyReturnFlow {

    public static int m1() {
        try {
            System.out.println("1");
            return 1;
        } catch (Exception ex) {
            System.out.println("2");
            return 2;
        }finally {
            System.out.println("3");
            System.exit(0);
            return  3;
        }
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }
}