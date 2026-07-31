class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
        return false;
      }
      int[] counts = new int [26];
      for(int i = 0 ;i<s.length();i++){
        counts[s.charAt(i)-'a']++;
      }
      int[] counta = new int [26];
      for(int j=0;j<t.length();j++){
        counta[t.charAt(j)-'a']++;
      }
      for(int k = 0 ;k<counts.length;k++){
        
          if(counts[k]!=counta[k]){
            return false;
        }
      }
      return true;

    }
}
