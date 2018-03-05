package bai3a;

public class Bai3a {
	public static void main(String[] args) {
		float f = 0.0f, sum = 0.0f;
		float max = Float.MIN_VALUE;//gia tri nho nhat.
		for(int i = 0; i<args.length ; i++) {
			try {
				f = Float.valueOf(args[i]);
			}catch(Exception e) {
				f = 0;
			}
			finally {
				sum += f;
				if(max < f) max = f;
			}
		}
		System.out.print("tong cua cac doi so hop le: " +sum + ",max: "+max);
	}
}
