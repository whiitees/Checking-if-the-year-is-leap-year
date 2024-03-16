public class Main {
    public static void main(String[] args) {
        int rok = 2024;
        if (czyPrzestepny(rok)) {
            System.out.println(rok + " jest rokiem przestępnym.");
        } else {
            System.out.println(rok + " nie jest rokiem przestępnym.");
        }
    }

    public static boolean czyPrzestepny(int rok) {
        if (rok % 4 == 0) {
            if (rok % 100 == 0) {
                if (rok % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
