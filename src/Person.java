public class Person {
    int age;
    
    public void setAge(int age){
        if (age < 0){
            throw new IllegalAgeException("年連は0以上にしてください。指定値=" + age);
        }
        this.age = age;
    }
}