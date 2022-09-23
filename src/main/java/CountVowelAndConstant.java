public class CountVowelAndConstant {
    public static void main(String[] args) {
        String str = "BeginnersBook";
        int VowelCount = 0, ConstantCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                VowelCount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ConstantCount++;
            }
        }
        System.out.println("Number of Vowels: " + VowelCount);
        System.out.println("Number of Consonants: " + ConstantCount);
    }
}
