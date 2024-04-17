/**
 * <Praktek Generic Programming>
 * Nama     : Nobby Dharma Khaulid
 * Kelas    : 1A - TIF4
 * NIM      : 231524020
 */

 
/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
