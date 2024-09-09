public class Palindrome{
    public static void main(String[] args){
        for(int i = 0; i< args.length; i++){
            String s = args[i];
            System.out.println("Word: " + args[i]);
            System.out.println("Reversed: " + reverseString(args[i]));
            System.out.println("Is it a palindrome?: " + isPalindrome(args[i]));
            System.out.println();

        }
    }
    public static String reverseString(String s){
        String newS = "";
        for(int i = s.length()-1; i>=0; i--){
            newS = newS + s.charAt(i);
        }
        return newS;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
}