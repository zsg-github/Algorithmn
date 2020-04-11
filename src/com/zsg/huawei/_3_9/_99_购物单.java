package com.zsg.huawei._3_9;
/**
 *  ���鱳������
 */
import java.util.Scanner;

public class _99_���ﵥ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	// ��Ǯ��
        	int N = sc.nextInt();
        	// ������Ʒ����
        	int m = sc.nextInt();
        	int[] f = new int[N + 1];
        	// ���飬goods[i][0]Ϊ������goods[i][1]Ϊ����1��goods[i][2]Ϊ����2
        	Good[][] goods1= new Good[60][4];
        	
        	for (int i = 1; i <= m; i++) {
        		int v = sc.nextInt();
        		int p = sc.nextInt();
        		int q = sc.nextInt();
        		
        		Good t = new Good(v, v * p);
        		if (q == 0) {
        			goods1[i][0] = t;
        		} else {
        			if (goods1[q][1] == null) {
        				goods1[q][1] = t;
        			} else {
        				goods1[q][2] = t;
        			}
        		}
        	}
        	
        	for (int i = 1; i <= m; i++) {
        		for (int j = N; j >= 0 && goods1[i][0] != null; j--) {
        			//���´���ӷ�����ѡ���ֵ���ġ��������������ѡ������ѡ������ѡ����1��������ѡ����2��������ѡ����1�͸���2������
        			Good master = goods1[i][0];
        			int max = f[j];
        			if (j >= master.v && max < f[j - master.v] + master.vp) {
        				max = f[j - master.v] + master.vp;
        			}
        			int vt;
        			if (goods1[i][1] != null) {
        				if (j >= (vt = master.v + goods1[i][1].v)
        						&& max <  f[j - vt] + master.vp + goods1[i][1].vp) {
        					max = f[j - vt] + master.vp + goods1[i][1].vp;
        				}
        			}
        			if (goods1[i][2] != null) {
        				if (j >= (vt = master.v + goods1[i][1].v + goods1[i][2].v)
        						&& max < f[j - vt] + master.vp + goods1[i][1].vp + goods1[i][2].vp) {
        					max = f[j - vt] + master.vp + goods1[i][1].vp + goods1[i][2].vp;
        				}
        			}
        			f[j] = max;
        		}
        	}
        	
        	System.out.println(f[N]);
        }
        sc.close();	
    }

}
class Good {
    int v;
    int vp;
    public Good(int v, int vp) {
        this.v = v;
        this.vp = vp;
    }
}
