
public class Q02 {

	public static void main(String[] args) {
		int a,b=1,c,d=0,e,f=0;
		for(a=1;a<=30;a++) {
			b*=2;
		}
		System.out.println("30��° ���ݾ� : "+ b/2);
		System.out.println("\n");
		
		for(c=1;c<=1000;c++) {
			if(c%3==0) {
				
			}else
				d+=c;
			if(c%15==0) 
				d+=c;	
		}
		System.out.println("1 ~1000 ������ �� : "+d);
		System.out.println("\n");
		
		
		for(e=1;f<10000;e+=2) {
			f+=e;	
		}
		System.out.println("1���� Ȧ���� ���� 10000�� ���� �ʴ� ��: "+ (e-4));
		

	}

}
