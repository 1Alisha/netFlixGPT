public class goodStr {
    public static boolean isGoodString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPossibleToMakeGood(String s, String t) {
        if (!isGoodString(t)) {
            return false; 
        }

        for (int i = 0; i <= s.length(); i++) {
            StringBuilder strS = new StringBuilder(s);
            strS.insert(i, t);
            if (isGoodString(strS.toString())) {
                return true; 
            }
        }

        return false; 
    }



    public static void main(String[] args) {
        String s = "101101";
        String t = "010";

        boolean result = isPossibleToMakeGood(s, t);
        System.out.println(result); 
    }
}
