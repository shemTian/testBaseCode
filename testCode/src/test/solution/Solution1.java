package test.solution;
/**
 * 递归
 * @author tsq
 *
 */
public class Solution1 {
	public int jumpFloor( int target){
		if(target<0){
			return 0;
		}
		if(target==0){
			return 1;
		}
		if(target==2){
			return 2;
		}
		else{
			return jumpFloor(target-1)+jumpFloor(target-2);
		}
	}
}
