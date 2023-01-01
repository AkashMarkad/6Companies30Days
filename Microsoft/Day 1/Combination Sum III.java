// Problem : Combination Sum III

// Input/Output:
// Input: k = 3, n = 7
// Output: [[1,2,4]]
// Explanation:
// 1 + 2 + 4 = 7
// There are no other valid combinations.

// Approach : Recursion
// use Recursion to solve this problem as given in the problem form 1 to 9 find all possible combination to make sum upto n and size equal to k
// Recursively add elements in and and check sum is equal to the n if equal add in solution else remove last added element and check for the nect element

// Code:

class Solution {
    List<List<Integer>> allcomb = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        findComb(k , n, 1);
        return allcomb;
    }

    private void findComb(int k , int n , int start)
    {
        if(k==0 && n==0)
        {
            allcomb.add(new ArrayList<>(comb));
            return;
        }

        for(int i = start ; i<10;i++)
        {
            comb.add(i);
            findComb(k - 1, n - i, i + 1);
            comb.remove(comb.size() - 1);
        }
    }
}

// Time Complexity - O(n!)
// Space Complexity - O(1)