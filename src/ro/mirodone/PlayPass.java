package ro.mirodone;

public class PlayPass {

    public  String playPass (String str, int n) {
        return reverseString(
                alternateCase(
                        replaceDigitsWithComplements(
                                shiftLetters(str.toLowerCase(), n)
                        )
                )
        );
    }


     private String reverseString (String str) {
        StringBuilder result = new StringBuilder();
        char[] vals = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(vals[i]);
        }
        return result.toString();
    }

    private  String alternateCase (String str) {
        StringBuilder result = new StringBuilder(str);
        char[] vals = str.toCharArray();
        for (int i = 0; i < vals.length; i++) {
            if (i % 2 == 0) {
                result.replace(i, i + 1, String.valueOf(vals[i]).toUpperCase());
            }
        }
        return result.toString();
    }

    private  String replaceDigitsWithComplements (String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char newDigit = ch;
            if (isDigit(ch)) {
                newDigit = (char) ((57 - ch) + 48);
            }
            result.append(newDigit);
        }
        return result.toString();
    }

    private static String shiftLetters (String str, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char newLetter = ch;
            if (isLetter(ch)) {
                if ((newLetter = (char) (ch + shift)) > 'z') {
                    newLetter = (char) (ch - (26 - shift));
                }
            }
            result.append(newLetter);
        }
        return result.toString();
    }

    private static boolean isLetter (char ch) {
        return (ch >= 'a' && ch <= 'z');
    }

    private static boolean isDigit (char ch) {
        return (ch >= '0' && ch <= '9');
    }

}
