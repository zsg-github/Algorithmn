 package com.zsg.huawei._2_21;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;


public class _40_�Ӵ��������·������ {
	
	public static void main(String[] args) throws IOException{        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
//        int num = Integer.parseInt(br.readLine());
//         String[] s = new String[num];
//        for(int i=0;i<num;i++){          
//            s[i] = br.readLine();
//        }
//        br.close();
//        Arrays.sort(s);  //jdk�Դ������򷽷�
//        
//        //�Զ���Ĺ鲢����
//        MergeSort m = new MergeSort();
//        m.mergeSort(s);
//        for(int j=0;j<num;j++){
//            System.out.println(s[j]);
//        }
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			TreeSet<String> set = new TreeSet<>();
			for(int i= 0; i < m; i++) {
				set.add(sc.next());
			}
			for(String str : set) {
				System.out.println(str);
			}
		}
		sc.close();
		
    }

}

/**
 * �Զ���鲢����
 * @author zsg
 *
 */
@SuppressWarnings("unchecked")
class MergeSort{
	String[] array;
	String[] leftArray;
	
	public  void mergeSort(String[] array) {
		this.array = array;
		leftArray = new String[array.length >>1];
		sort(0,array.length);	
	}
	private void sort(int begin,int end) {
		//�����ݹ��ж�
		if((end - begin)<2) return;
		int mid = (begin + end)>>1;
		sort(begin,mid);
		sort(mid,end);
		merge(begin,mid,end);
	}
	/**
	 * ��[begin,mid) �� [mid,end)��Χ�����кϲ���һ�����������
	 */
	 private void merge(int begin,int mid,int end) {
		//le,re�߽�ֵ��ΪԽ������
		int li =0, le = mid-begin;
		int ri =mid, re = end;
		int ai =begin;
		//�����������
		for (int i =li; i < le; i++) {
			leftArray[i] = array[begin + i];
		}
		//�����߻�û����
		while(li < le) {
			if(ri < re && ((Comparable) array[ri]).compareTo(leftArray[li]) <0) {
				array[ai++] = array[ri++];
			}else {
				array[ai++] = leftArray[li++];
			}
		}
							
	}
}

