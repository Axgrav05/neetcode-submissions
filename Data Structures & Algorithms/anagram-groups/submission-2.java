class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            List<String> list = strMap.getOrDefault(sortedStr, new ArrayList<>());
            list.add(str);
            strMap.put(sortedStr, list);

        }
        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, List<String>> pair : strMap.entrySet()) {
            result.add(pair.getValue());
            // System.out.println(pair.toString());
        }

        return result;
        
    }
}
