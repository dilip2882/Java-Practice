package in.dilip.challenge89;

public class VarArgs {
    public static void main(String[] args) {
        // Concatenate and print single string
        System.out.println(concatenate("Dilip"));

        System.out.println(concatenate("Dilip", "Patel"));

        System.out.println(concatenate("Dilip", "Patel", "Hoooo"));
    }

    // Concatenate variable arguments (varargs) into a single string
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
