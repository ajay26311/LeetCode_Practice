class Solution {
    public int distMoney(int money, int children) {

        if(money < children)
        {
            return -1;
        }

        money = money - children;   // give $1 to all children
        
        int count = Math.min(money / 7, children);

        money -= count * 7;
        children -= count;

        // Case 1: All children got $8, but money is still left
        if(children == 0 && money > 0)
        {
            count--;
        }

        // Case 2: One child left and would end up with exactly $4 
        if(children == 1 && money == 3)
        {
            count--;
        }

        return count;
    }
}