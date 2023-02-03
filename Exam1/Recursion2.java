public class Recursion2 {

    public static void main(String[] args) {

        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to
        // remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters

        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "juliann alonzo m grulla";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {

        removeVowels(str, 0, "");

    }

    public static String removeVowels(String word, int index, String previous) { 
        if (index >= word.length()) {
            return previous;
        }
        char c = word.charAt(index);
        if (c == 'a' || c == 'e' || c == 'o' || c == 'u'){
            String newWord = word.substring(0, index) + word.substring(index + 1);
            if (!newWord.equals(previous)){
                System.out.println(newWord);
                removeVowels(newWord, index, word);
            } else {
                removeVowels(newWord, index + 1, previous);
            }
        } else {
            removeVowels(word, index + 1, previous);
        }
        return previous;
        }
    }