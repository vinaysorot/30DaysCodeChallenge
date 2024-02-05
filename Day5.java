public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 1; i <= 10; ++i) {
            if (i == 1) {
                System.out.print(n1 + ", ");
                continue;
            }
            if (i == 2) {
                System.out.print(n2 + ", ");
                continue;
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + ", ");
        }
    }
}
