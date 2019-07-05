package ro.mirodone;

import java.util.stream.Collectors;

public class PlayPass2 {

    // same solution using Lambdas

    private  int count = 0;

    public  String playPass(final String s, final int n) {
        count = 0;

        return new StringBuilder()
                .append(
                        s.toUpperCase()
                                .chars()
                                .map(i -> Character.isDigit(i) ? 57 - Character.getNumericValue(i) : i)
                                .mapToObj(c -> (char) c)
                                .map(c -> (c <= 90 && c >= 65) ? (char) (c + (n % 26)) : c)
                                .map(c -> c > 90 ? (char) ((c % 91) + 65) : c)
                                .map(i -> i.toString())
                                .map(i -> (count++ % 2) == 0 ? i.toUpperCase() : i.toLowerCase())
                                .collect(Collectors.joining("")))
                .reverse()
                .toString();
    }

}
