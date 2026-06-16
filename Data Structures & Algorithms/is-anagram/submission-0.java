class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();


        for(int i = 0 ; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            map.put(schar, map.getOrDefault(schar, 0) + 1);
            map.put(tchar, map.getOrDefault(tchar, 0) - 1);
        }

    for(int C : map.values()){
        if(C != 0){
            return false;
        }
    }
    return true;

    }
}
