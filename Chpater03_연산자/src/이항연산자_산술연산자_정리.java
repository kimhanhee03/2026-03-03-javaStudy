/*
 	산술
 	 단항연산자: ++,--
 	 비트이동연산자: <<,>>
 	 비트연산자: &,\,^
        &(*)  \(+)  ^(다른비트)
     00  0     0     0	
     01  0     1     1
     10  0     1     1
     11  1     1     0
     
 	  10 & 8
 	  
 	  1010
 	  1000 &
 	  ------
 	  1000 = 8
 	  
 	  1010
 	  1000 |
 	  ------
 	  1010 = 10
 	  
 	  1010
 	  1000 ^
 	  ------
 	  0110 = 6
 */
public class 이항연산자_산술연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(56));
		System.out.println(0b111000);
	}

}
