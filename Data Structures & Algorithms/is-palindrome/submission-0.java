class Solution {
    public boolean isPalindrome(String s) {
        String sr = s.toLowerCase();
        int i=0;
        int j = sr.length()-1;
        while(i<j){
             while (i < j && !Character.isLetterOrDigit(sr.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(sr.charAt(j))) {
                j--;
            }

            if (sr.charAt(i) != sr.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
