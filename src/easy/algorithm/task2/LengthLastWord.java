package easy.algorithm.task2;

public class LengthLastWord {

    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' & lengthOfLastWord > 0) {
                break;
            }

            if (s.charAt(i) != ' ') {
                lengthOfLastWord++;
            }
        }
        return lengthOfLastWord;
    }
}
