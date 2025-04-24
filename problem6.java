public class problem6 {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String maxVowelWord = "";
        int maxVowels = 0;
        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};

        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowels) {
                maxVowels = vowelCount;
                maxVowelWord = word;
            }
        }

        System.out.println("String with the most vowels: " + maxVowelWord);
    }
}
