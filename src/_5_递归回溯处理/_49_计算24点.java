package _5_�ݹ���ݴ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _49_����24�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null) {
			String[] arr = str.split(" ");
			Boolean result = calculate(arr);
			System.out.println(result);
		}
	}
	
	public static Boolean calculate(String[] arr) {
		List<Integer> inputArr = new ArrayList<>();
		for(String numStr:arr) {
			inputArr.add(Integer.parseInt(numStr));
		}
		//���ȡ��һ��Ԫ��
		for(int i = 0; i < inputArr.size(); i++) {
			int temp = inputArr.get(i);
			inputArr.remove(i);
			//���ƥ��ɹ�����ֱ�ӷ��ء����򣬽�Ԫ�طŻأ��Ƚ�����Ԫ��
			if(match24(inputArr,temp)) {
				return true;
			}else {
				inputArr.add(i,temp);
			}
		}
		return false;
	}
	
	public static Boolean match24(List<Integer> list, int temp) {
		if(list.size() > 0) {
			//�����Ӽ��ϣ����ȡ��һ��Ԫ��
			for(int i = 0; i < list.size();i++) {
				int n = list.get(i);
				list.remove(i);
				//�ݹ��ȫ����
				if(match24(list,temp * n) || match24(list,temp + n) || match24(list,temp - n) ||match24(list,n-temp)) {
					return true;
				}else if(temp % n == 0) {
					if(match24(list,temp / n)) {
						return true;
					}
				}else if(n % temp == 0) {
					if(match24(list, n / temp)){
						return true;
					}
				}
				list.add(i,n);
			}
			return false;
		}else if(temp == 24) {  //�ݹ���ֹ
			return true;
		}else {
			return false;
		}
	}
}
