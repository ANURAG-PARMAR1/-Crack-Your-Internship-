public class PrintAllDuplicateCharactersInString {
    public static void solve (String s) {
        int [] hashArray = new int[27];

        for(int i=0;i<s.length();i++) {
            hashArray[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<27;i++) {
            if(hashArray[i] > 1) System.out.println((char)(i+'a') +", " +"count="+hashArray[i]);
        }
    }
    public static void main(String[] args) {
        solve("geeksforgeeks");
    }
}
