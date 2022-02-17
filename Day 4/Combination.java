import java.util.*;
public class Combination
{
	static Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
	static Vector<Integer> tmp = new Vector<Integer>();
	
	static void makeCombiUtil(int n, int left, int k)
	{
	
		// Pushing this vector to a vector of vector
		if (k == 0) {
			ans.add(tmp);
			for(int i = 0; i < tmp.size(); i++)
			{
				System.out.print(tmp.get(i) + " ");
			}
			System.out.println();
			return;
		}

		// i iterates from left to n. First time
		// left will be 1
		for (int i = left; i <= n; ++i)
		{
			tmp.add(i);
			makeCombiUtil(n, i + 1, k - 1);

			// Popping out last inserted element
			// from the vector
			tmp.remove(tmp.size() - 1);
		}
	}

	// Prints all combinations of size k of numbers
	// from 1 to n.
	static Vector<Vector<Integer>> makeCombi(int n, int k)
	{
		makeCombiUtil(n, 1, k);
		return ans;
	}
	
	public static void main(String[] args)
	{
	
		// given number
		int n = 5;
		int k = 3;
		ans = makeCombi(n, k);
	}
}
