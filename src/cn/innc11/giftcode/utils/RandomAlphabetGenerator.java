package cn.innc11.giftcode.utils;

import java.util.Random;

public class RandomAlphabetGenerator {

    public static String generateRandomString(int length) {
        String source = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(source.length());
            char randomChar = source.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return randomString.toString();
    }
}
