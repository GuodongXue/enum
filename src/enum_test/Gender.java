package enum_test;

public enum Gender {
    Male, Female;
    public void show(){
        System.out.println("不要再枚举里面定义，或使用高级方法， 徒增复杂性");
    }
}
class test{
    public static void main(String[] args) {
        Gender a = Gender.Female;
        System.out.println(a);
        //enum中重写了toString

    }
}