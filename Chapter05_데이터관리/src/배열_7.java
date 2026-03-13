
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		System.out.println("생성된 메모리 갯수:"+alpha.length);
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((int)(Math.random()*26)+65);
		}
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
		alpha[0]='X';
		int i=0;
		for(char c='A';c<='J';c++)
		{
			alpha[i]=c;
			i++;
		}
		System.out.println("\n================");
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
	}

}
