class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || 
            (s.isEmpty() && !t.isEmpty()) ||
            (!s.isEmpty() && t.isEmpty())
            ) {
            return false;
        }

        Map<Character, Integer> sMap = new TreeMap<>();
        Map<Character, Integer> tMap = new TreeMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            // System.out.println("S: " + s.charAt(i) + "\nT: " + t.charAt(i) + "\n");
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        //System.out.println(sMap.toString());
        // System.out.println(tMap.toString());

        for (Map.Entry<Character, Integer> sPair : sMap.entrySet()) {
            if (!Objects.equals(sPair.getValue(), tMap.get(sPair.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
