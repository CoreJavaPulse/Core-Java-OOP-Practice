package varargsExample;

public class VarArgs {

	public int sum(int... args) {
		int total = 0;
		for (int num : args) {
			total += num;
		}
		return total;
	}
}
