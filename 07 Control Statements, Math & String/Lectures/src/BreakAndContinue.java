public class BreakAndContinue {
    public static void main(String[] args) {
        Continue();
        for (int i = 0; i < 1000; i++) {
            if (i == 101) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }

    public static void Continue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("Out of loop");
    }
}
