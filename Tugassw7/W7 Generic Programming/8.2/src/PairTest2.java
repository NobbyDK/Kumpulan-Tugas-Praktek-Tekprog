/**
 * <Praktek Generic Programming>
 * Nama     : Nobby Dharma Khaulid
 * Kelas    : 1A - TIF4
 * NIM      : 231524020
 */

/**
 * @version 1.02 2015-06-21
 * @author Cay Horstmann
 */
import java.time.*;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9), // G. Hopper
                LocalDate.of(1815, 12, 10), // A. Lovelace
                LocalDate.of(1903, 12, 3), // J. von Neumann
                LocalDate.of(1910, 6, 22), // K. Zuse
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}


