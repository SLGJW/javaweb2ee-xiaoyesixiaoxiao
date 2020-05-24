package entity;

public class Student {
    private int id;
    private String name;        //ÐÕÃû
    private int snumber;      //Ñ§ºÅ
    private int age;  //ÄêÁä
    private String ssex;//ÐÔ±ð

    public Student() {
        super();
    }

    public Student(int id, String name, int snumber, int age,String ssex) {
        super();
        this.id = id;
        this.name = name;
        this.snumber = snumber;
        this.age = age;
        this.ssex = ssex;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSnumber() {
        return snumber;
    }
    public void setSnumber(int snumber) {
        this.snumber = snumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSsex() {
        return ssex;
    }
    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "IDÎª:"+id+",name:"+name+",snumber:"+snumber+",age:"+age+",ssex:"+ssex;
    }
}