package javabasic;

public class prolifics_star {
	public static void main(String[] args) {
		String b="prolifics";
		char l[]=b.toCharArray();
		char arr[]=new char[18];
		int m= 0;
		for(int i=0;i<18;i++) {
			if(i%2==0) {
				for(int j=0;j<9;j++) {
					if(j <= m) {
						System.out.print(l[j]);
					}
					else {
						System.out.print('*');
					}
					//System.out.println("%n");
				}
				System.out.println("\n");
				m=m+1;
				
			}

			else 
			{
				
				for(int k=0;k<9;k++) {
					System.out.print('*');
				}
				System.out.println("\n");
			}
		}
	}
}

