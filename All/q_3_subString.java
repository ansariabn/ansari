package All;

import java.util.Scanner;

    class Implement_strstr
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while(t>0)
            {
                String line = sc.nextLine();
                String a = line.split(" ")[0];
                String b = line.split(" ")[1];

                skill g = new skill();
                System.out.println(g.strstr(a,b));

                t--;
            }
        }
    }

    class skill
    {
        int strstr(String s, String x)
        {
            int ans;
            int n1=x.length();
            int n=s.length();
            for(int i=0;i<=n-n1;i++){

                if(x.equals(s.substring(i,i+n1))){
                    return i;
                }
            }
            return -1;

        }
    }

