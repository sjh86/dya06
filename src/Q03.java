import java.util.Scanner;
public class Q03 {

	public static void main(String[] args) {
		int a,b=2,c=0;
		int d,e,f,g,h=100,l=0;
		int i,j,k;
		
		for(a=1;c<100000;a++) {
			c+=(b*20);
			if(a%10==0) {
				b*=2;
			}
		}
		
		System.out.println("�㰡 ���� �� �Դ³�: "+(a-1));
		System.out.println("��� "+ b+"����");
		System.out.println("\n");
		
		
		
		Scanner pulls = new Scanner(System.in);
		System.out.println("ù���� ������ �Է�");
		d=pulls.nextInt();
		System.out.println("�ι��� ������ �Է�");
		e=pulls.nextInt();
		
		for(f=1;f<h;f++) {
			for(g=1;g<h;g++) {
				
				if (d*f == e*g) {
					System.out.println("�ּ� �����: "+(e*g));
					l++;
				}
			}
			if(l==1)
				break;
		}
		for(f=h;f>1;f--) {
				if (d%f ==0 && e%f==0) {
					System.out.println("�ִ� �����: " +f);
					break;
				}	
		}
		System.out.println("\n");
		
		
		System.out.println("������ �Է��ϼ���");
		k=pulls.nextInt();
		for(i=1;i<=k;i++) {
			if(k%i==0) 
				System.out.print(String.format("%3d",i));
		}
		
		System.out.println("\n");	
		l=0;
		for (j=1;j<=1000;j++) {
			if(j%12==1) {				
				l+=j;	
			}
		}
		System.out.println("���� : "+l);
		
	}
}
