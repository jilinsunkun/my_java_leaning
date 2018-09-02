public class ANATtest{
	public static void main(String[] args) {
		class AtypeName{
			int i;
			double d;
			boolean b;
			void show () {
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		AtypeName a=new AtypeName();
		a.i=3;
		a.d=10;
		a.b=true;
		a.show();
		
	}
}