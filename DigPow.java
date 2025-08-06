public class DigPow {
	
	public static long digPow(int n, int p) {
	long o = 0;
		String nstr = String.valueOf(n);
		for (int i = 0; i < nstr.length(); i++) {
			o += (long)Math.pow(nstr.charAt(i) -'0', p+i);
		}
		if (o % n == 0)
			return o / n;
		else return -1;
	}
	
}
