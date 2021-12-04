//HW_18 IlyaL
public class Recursion {
static public long factorial(int n) {
	if (n < 0) {
		throw new IllegalArgumentException(" number can't be a negative");
	}
	if (n <= 1) {
		return 1;
	}
	return n * factorial(n - 1);
}
/**
 * 
 * @param a - any number (positive or negative)
 * @param b - any positive number or zero (throwing IllegalArgumentException in the case b < 0)
 * @return a ^ b
 * requirements:
 * 1. No cycles
 *  
 * 2. Only  arithmetic operations either + or -
 * 3. Additional methods (no standard) should apply the #1 and #2 requirements
 * 4. No additional static field
 */
static public long pow (int a, int b) {
//	if (b < 0) {
//		throw new IllegalArgumentException(" power can't be a negative");
//	}
//	if (b == 0) {
//		return 1;
//	}
//	return a * pow(a, b - 1);
	// according to the requirements 
	// V.R. The braces aren't obligatory here
	if (b<0) { throw new IllegalArgumentException("power can't be a negative");}
	if (a==0 && b==0) { throw new IllegalAccessError(" 0 pow 0 undefind");}
	if (b==0 && a!=0) return 1;
	if (a==0 && b!=0) return 0;
	if (a<0 && isEven(b)) a=-a;
	return multyply (a, pow (a, b-1));	
	}

private static boolean isEven(int num) {
	if (num ==1)return false;
	if (num ==2)return true;	
	return isEven(num-2);
}
private static long multyply(int number, long power) {	
	return power>0 ? number + multyply(number, power-1)  :  0;
}



/**
 * 
 * @param array
 * @return sum of the array's elements 
 * requirements:
 * 1. No cycles;
 * 2. Additional methods should apply the requirement #1
 */
static public long sum(int[] array) {
	return sum(0, array);
}
private static long sum(int firstIndex, int[] array) {
	return firstIndex < array.length ? array[firstIndex] + sum(firstIndex + 1, array) : 0;
}
/**
 * 
 * @param x
 * @return x ^ 2
 * 1. No cycles
 * 2. Allowed only operators + or -
 * 3. No additional methods
 * 4. No static fields
 */
public static int square(int x) {
	/* V.R. May be the following is better
	   if(x==1 || x==0) return x;
	   if(x<0) x=-x;
	 * Even the order of lines may be significant
	 */
	if (x<0) x=-x;
	if (x==1)return 1;
	if (x==0)return 0;
	//x**2=((x-1)+1)**2=(x-1)**2 +2*(x-1)*1 +1**2=(x-1)**2 +2*x -1
	return square(x-1)+x+x-1;
	
}
}
