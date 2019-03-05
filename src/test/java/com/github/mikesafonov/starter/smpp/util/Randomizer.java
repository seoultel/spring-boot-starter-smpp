package com.github.mikesafonov.starter.smpp.util;

import com.devskiller.jfairy.Fairy;
import lombok.experimental.UtilityClass;

/**
 * @author Mike Safonov
 */
@UtilityClass
public class Randomizer {
    private static final Fairy FAIRY = Fairy.create();

    public static int randomPort() {
        return FAIRY.baseProducer().randomInt(9999);
    }

    public static int randomInt() {
        return FAIRY.baseProducer().randomInt(9999);
    }

    public static boolean randomBoolean() {
        return FAIRY.baseProducer().trueOrFalse();
    }

    public static String randomString() {
        return FAIRY.textProducer().latinWord(10);
    }

    public static String randomIp() {
        return FAIRY.networkProducer().ipAddress();
    }
}
