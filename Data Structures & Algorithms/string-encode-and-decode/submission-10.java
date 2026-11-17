class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            result.append(str.length() + "#" + str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        
        int i = 0;

        while (i != str.length()) {
            int next = str.indexOf("#", i);
            Integer size = Integer.valueOf(str.substring(i, next));
            result.add(str.substring(next+1, next + size+1));
            i = next + size + 1;
        }
        return result;
    }
}
