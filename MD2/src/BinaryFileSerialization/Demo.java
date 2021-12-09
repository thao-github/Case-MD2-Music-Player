package BinaryFileSerialization;
import java.io.*;

public class Demo {
    public static void main(String [] args) {
        int [] a = {2,3,4,5,11};
        try{
            FileInputStream fin = new FileInputStream(String.valueOf(a[0]));
            DataInputStream din = new DataInputStream(fin);
            while(true){
                System.out.println(din.readInt());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fout = new FileOutputStream(String.valueOf(a[0]));
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);
                dout.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
