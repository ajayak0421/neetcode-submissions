class Solution {

    public String encode(List<String> strs) {

    StringBuilder result = new StringBuilder();

    for(String str : strs){

        result.append(str.length()).append("#").append(str);

    } 

    return result.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        int i = 0;

        while(i < str.length()){

            int j = i;

            while(j < str.length()){
                if('#' == str.charAt(j)){
                    break;
                }
                j++;
            }

            Integer num = Integer.parseInt(str.substring(i, j));

            list.add(str.substring(j + 1 , j + 1 + num));

            i = j + num +1;
        }

        return list;

    }
}
