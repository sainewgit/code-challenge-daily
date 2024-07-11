package lowelevel.oops;

public class Practice {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.Show();

        Parent pc=new Child();
        pc.Show();

        Child c=new Child();
        c.childShow();
        c.Show();

    }
}
