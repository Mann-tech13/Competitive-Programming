class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] check = new boolean[n];
        check[0] = true;
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = rooms.get(0);
        for(int i = 0; i < list.size(); i++){
            stack.push(list.get(i));
        }
        
        while(!stack.isEmpty()){
            int curKey = stack.pop();
            if(check[curKey])
                continue;
            else{
                check[curKey] = true;
                List<Integer> listNew = rooms.get(curKey);
                for(int i = 0; i < listNew.size(); i++)
                    stack.push(listNew.get(i));
            }
        }
        for (int i = 0; i < n; i++){
            if(!check[i])
                return false;
        }
        return true;
    }
}