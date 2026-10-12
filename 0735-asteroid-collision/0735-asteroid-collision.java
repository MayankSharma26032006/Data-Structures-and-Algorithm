
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int a : asteroids) {
            boolean alive = true;

            while(!st.isEmpty() && a < 0 && st.peek() > 0) {
                if(st.peek() < -a) {
                    st.pop();
                }
                else if(st.peek() == -a) {
                    st.pop();
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }

            if(alive) {
                st.push(a);
            }
        }

        int[] ans = new int[st.size()];

        for(int i = st.size()-1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
