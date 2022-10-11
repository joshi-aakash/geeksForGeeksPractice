package BasicPrograms;

public class vowelOrConsonant {

    public static char findIt(char v){
        if (v == 'a' || v == 'i' || v == 'o' || v == 'e' || v == 'u'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        return v;
    }
    public static void main(String[] args) {

        char word = findIt('l');
        char word1 = findIt('a');
    }
}
