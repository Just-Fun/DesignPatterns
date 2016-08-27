package ua.com.serzh;

/**
 * Created by Serzh on 8/27/16.
 */
public class Merger {
    public static void main(String[] args) {
        int[] f = {1, 3, 5};
        int[] s = {2, 4, 6};
        merge(f, s);
    }

    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        for (int i = 0, idxFst = 0, idxSnd = 0; i < result.length; i++) {

            if ((idxFst == fst.length) && (idxSnd < snd.length)) {
                result[i] = snd[idxSnd++];

            } else if ((idxSnd > snd.length) && (idxFst < fst.length)) {
                result[i] = fst[idxFst++];

            } else {
                if (fst[idxFst] > snd[idxSnd]) {
                    result[i] = snd[idxSnd++];
                } else {
                    result[i] = fst[idxFst++];
                }
            }
        }
        return result;
    }
}
