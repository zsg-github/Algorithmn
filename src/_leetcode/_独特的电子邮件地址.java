package _leetcode;

import java.util.HashSet;
import java.util.Set;

public class _独特的电子邮件地址 {
	public static void main(String[] args) {
		String[] str = {"fg.r.u.uzj+o.pw@kziczvh.com",
				"r.cyo.g+d.h+b.ja@tgsg.z.com",
				"fg.r.u.uzj+o.f.d@kziczvh.com",
				"r.cyo.g+ng.r.iq@tgsg.z.com",
				"fg.r.u.uzj+lp.k@kziczvh.com",
				"r.cyo.g+n.h.e+n.g@tgsg.z.com",
				"fg.r.u.uzj+k+p.j@kziczvh.com",
				"fg.r.u.uzj+w.y+b@kziczvh.com",
				"r.cyo.g+x+d.c+f.t@tgsg.z.com",
				"r.cyo.g+x+t.y.l.i@tgsg.z.com",
				"r.cyo.g+brxxi@tgsg.z.com",
				"r.cyo.g+z+dr.k.u@tgsg.z.com",
				"r.cyo.g+d+l.c.n+g@tgsg.z.com",
				"fg.r.u.uzj+vq.o@kziczvh.com",
				"fg.r.u.uzj+uzq@kziczvh.com",
				"fg.r.u.uzj+mvz@kziczvh.com",
				"fg.r.u.uzj+taj@kziczvh.com",
				"fg.r.u.uzj+fek@kziczvh.com"};
		System.out.println(numUniqueEmails(str));
	}
	public static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		for(String email : emails) {
			//测试用例中包含数字和域名可以@leetcode.atg.com
			if(email.matches("[a-z0-9]+@[a-z]+(\\.[a-z]+){0,}\\.com")) {
				set.add(email);
			}else {
				String[] arr = email.split("@");
				int index = arr[0].indexOf('+');
				if(index != -1) {
				  arr[0] = arr[0].substring(0,index);
				}
				String head = arr[0].replace(".", "");
				email = head+"@"+arr[1];
				System.out.println(email);
				if(email.matches("[a-z0-9]+@[a-z]+(\\.[a-z]+){0,}\\.com")) {
					set.add(email);
				}
				
			}
			
		}
		return set.size();

    }

}
