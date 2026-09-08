class Solution {
    public String predictPartyVictory(String s) {
        int n = s.length();
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'R') {
                r.add(i);
            } else {
                d.add(i);
            }
        }

        while(!r.isEmpty() && !d.isEmpty()) {
            int ri = r.remove();
            int di = d.remove();

            if(ri < di) {
                r.add(ri + n);
            } else {
                d.add(di + n);
            }
        }

        if(r.isEmpty()) {
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}