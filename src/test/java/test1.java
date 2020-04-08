public class test1 {
    public static void main(String[] args) {

//        System.out.println(getNum(100,104));

        System.out.println(intgetValue(2));
    }

    public static int getNum(int m, int n){
        int num;
        int sum =n-m+1;
        if(sum%2==0){
            num=(n+m)*(sum/2);
        }else {
            int middle = m+sum/2;
            num=(n+m)*(sum/2)+middle;
        }
        return num;

    }


    void test0403(){


    }

    public static int intgetValue(int i){

        int result = 0;
        switch (i){

            case 1:

                result = result + i;
                System.out.println(result);
            case 2:
                result = result + i * 2;
                System.out.println("34::::::::::"+result);
            case 3:
                result = result + i * 3;
                System.out.println("37:::::::::::::::"+result);
            case 4:
                result = result + i * 3;
                System.out.println("40:::::::::::::::"+result);
        }
        return result;
    }



}
