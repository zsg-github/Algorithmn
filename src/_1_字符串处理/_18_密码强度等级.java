package _1_�ַ�������;

import java.util.Scanner;

public class _18_����ǿ�ȵȼ� {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            String n = getPassWordDeg(input);
            System.out.println(n);        
        }
        sc.close();
	}
	
	public static String getPassWordDeg(String str) {
		char[] arr = str.toCharArray();
		int[] temp = new int[4];
		int count = 0;
		//��ĸ����
		for(int i = 0; i < str.length(); i++) {
			if((arr[i]>='a' && arr[i] <='z') || (arr[i]>='A' && arr[i]<='Z')) {
				if(arr[i]>='a' && arr[i] <='z') {
					temp[0] += 1;
				}else {
					temp[1] += 1;
				}	
			}else if(arr[i]>='0' && arr[i]<='9') { //���ּ���
				temp[2] +=1;
			}else {
				temp[3] +=1;
			}
		}
		//�ַ������ӷ�
		int sum =str.length(); 
		if(sum <= 4) {
			count = count +5;
		}else if(sum >= 8) {
			count = count +25;
		}else {
			count = count +10;
		}
		//��Сд��ĸ�ӷ�
		if(temp[0] > 0 || temp[1] > 0) {
			if(temp[0] > 0 && temp[1] >0) {
				count = count + 20;
			}else {
				count = count + 10;
			}
		}
		//���ּӷ�
		if(temp[2]>0) {
			if(temp[2] > 1) {
				count = count + 20;
			}else {
				count = count + 10;	
			}
		}
		//���żӷ�
		if(temp[3]>0) {
			if(temp[3] > 1) {
				count = count + 25;
			}else {
				count = count + 10;	
			}
		}
		//�����ӷ�
		if(temp[0] > 0 && temp[1] > 0 && temp[2] > 0 && temp[3] > 0) {
			count = count + 5;
		}else if((temp[0] > 0 || temp[1] > 0) && temp[2] > 0 && temp[3] > 0) {
			count = count + 3;
		}else if((temp[0] > 0 || temp[1] > 0) && temp[2] > 0) {
			count = count + 2;
		}
		//���ֱ�׼
		if(count >= 90) {
			return "VERY_SECURE";
		}else if(count >= 80) {
			return "SECURE";
		}else if(count >= 70) {
			return "VERY_STRONG";
		}else if(count >= 60) {
			return "STRONG";
		}else if(count >= 50) {
			return "AVERAGE";
		}else if(count >= 20) {
			return "WEAK";
		}else {
			return "VERY_WEAK";
		}
	}

}
