package Q7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students");
        int count= input.nextInt();
        int[] st_no = new int[count];
        int[] maths = new int[count];
        int[] chem = new int[count];
        int[] phy = new int[count];
        int[] total= new int[count];
        double[] avg= new double[count];

        Queue queue = new Queue(count*3);
        for (int i=0;i<count;i++){
            System.out.print("Enter student no: ");
            st_no[i]=input.nextInt();
            System.out.print("Enter marks of Mathematics: ");
            maths[i]=input.nextInt();
            System.out.print("Enter marks of Chemistry: ");
            chem[i]=input.nextInt();
            System.out.print("Enter marks of Physics: ");
            phy[i]=input.nextInt();
        }

        for(int i=0;i<count;i++){
            queue.Append(maths[i]);
            queue.Append(chem[i]);
            queue.Append(phy[i]);
        }

        while(!queue.IsQueueEmpty()){
            for(int i=0;i<count;i++){
                int tot=0;
                for(int j=0;j<3;j++){
                    tot += queue.Serve();
                }
                total[i]=tot;s
                avg[i]=tot/3;
            }
        }

        for (double x : avg){
            System.out.println(x);
        }
    }

}
