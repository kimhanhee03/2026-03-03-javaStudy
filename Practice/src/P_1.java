import java.util.*;
 		
public class P_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
char[] alpha=new char[10];
        
        // 1. 배열의 저장 갯수 
        System.out.println("생성된 메모리 갯수:"+alpha.length);
        // 2. 배열의 초기값 
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((int)(Math.random()*26)+65);
        	//       ----4  ---2 ---------------1 --- 3
        	//                    0~25 + 65 ==> 65~90
        	// A~Z
        }
        // 3. 출력 ==> for-each를 사용한다 
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
        
        // 변경 
      //  alpha[0]='X'; 
        // 한번에 변경 
        int i=0;
        for(char c='A';c<='J';c++)
        {
        	alpha[i]=c;
        	i++;
        }
        System.out.println("변경후...");
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
	}
}
