class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        if (s.length() != t.length()) {
            return false;
        } else if (Arrays.equals(sArr, tArr)){
            return true;
        } else {
            return false;
        }
    }
}
