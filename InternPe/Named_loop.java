//--------------Task3---------------//
//--Question3:- Create a Named Loop--//

class Named_loop {
    public static void main(String args[]) {
        outer:
        //label
        for (int i = 1;i <= 5;i++) {
            inner:
            //label
            for(int j = 1;j<=i; j++) {
                System.out.print(j+"");
                if (j == 5)
                    break inner;
            }
            System.out.println("");
            continue outer;
        }
    }
}