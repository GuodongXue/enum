package enum_test;

public class DEMO {
    public static void main(String[] args) {
        //int a = 10;

        //switch可以int， byte，short， char，
        //引用数据类型， String， 枚举
        //不可以long， float， double， boolean
        Gender a = Gender.Female;
        switch (a){
            case Female:
                System.out.println("girl");
                break;
            case Male:
                System.out.println("boy");
                break;
        }
    }
}
