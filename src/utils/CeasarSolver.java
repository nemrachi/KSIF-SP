package utils;

import java.util.TreeMap;

public class CeasarSolver {
    public Integer solve(String text) {
        final Fitness fitness = new Fitness();
        TreeMap<Double, Integer> res = new TreeMap<>();

        for (int i = 0; i < 26; i++) {
            CaesarCipher cc = new CaesarCipher(i);
            String pt = cc.decrypt(text);
            double score = fitness.evaluate(pt);
            res.put(score, i);
        }

        System.out.println("score: " + res.firstEntry().getKey() + ", shift: " + res.firstEntry().getValue());
        return res.firstEntry().getValue(); // smallest key/score -> best
    }
}
