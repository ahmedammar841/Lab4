/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * @author Ammar Ahmed
 */
public class ReclamationProject {
    /**
     *@param a a word
     *@param b a word
     *@return r
     */
    static String doit(final String a, final String b) {
        String word1 = a;
        String word2 = b;
        if (a.length() > b.length()) {
            word1 = b;
            word2 = a;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < word1.length(); i++) {
            for (int j = word1.length() - i; j > 0; j--) {
                for (int k = 0; k < word2.length() - j; k++) {
                    if (word1.regionMatches(i, word2, k, j) && j > r.length()) {
                        r = word1.substring(i, i + j);
                    }
                 }
            }
        } return r; }
}
