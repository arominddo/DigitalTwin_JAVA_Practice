package free_prac;

public class programers {

	public static void main(String[] args) {
		int left, right;
		left = 13;
		right = 17;
		
		int cnt;
		
		int sum = 0;
        
        
        for(int i=left; i<=right; i++) {
            cnt = 0;
        	for(int j=1; j<=i; j++) {
                if (i%j == 0) {
                    cnt += 1;
                    System.out.println("cnt : "+ cnt);
                }
                
            }
        	if (cnt%2==0) {
            	sum += i;
                
            }
        	else {
        		sum -= i;
        	}   
        }
        int answer = sum;
        System.out.println(answer);

	}

}