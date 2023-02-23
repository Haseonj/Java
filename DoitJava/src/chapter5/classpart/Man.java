package chapter5.classpart;

public class Man {
    int age;
    String name;
    boolean isMarried;
    int children;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public static void main(String[] args) {
        Man James = new Man();
        James.age = 40;
        James.name = "James";
        James.isMarried = true;
        James.children = 3;

        System.out.println("이름 : " + James.name);
        System.out.println("나이 : " + James.age);
        System.out.println("결혼 : " + James.isMarried());
        System.out.println("자녀 : " + James.getChildren());

    }
}
