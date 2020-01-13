package Strings;

public class MakingAnagrams {
    static int makeAnagram(String a, String b) {
        int count = 0;
        StringBuilder B = new StringBuilder(b);
        for(int i = 0; i < a.length(); i++){
            int j = 0;
            while(j < B.length()){
                if(a.charAt(i) == B.charAt(j)) {
                    B.delete(j, j + 1);
                    count++;
                    break;
                }
                j++;
            }
        }
        return (a.length() - count) + (b.length() - count);
    }

    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println(makeAnagram(a,b));
    }
}
