public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        try {
            this.name = name;
            this.age = age;
            if(name.length() > 40 || name.equals("")){
                throw new IllegalArgumentException("The name must be between 1 and 40 characters");
            }
            if(age < 0 || age > 120){
                throw new IllegalArgumentException("The age must be between 0 and 120 years old");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
    public String toString(){
        return "Name: " + name + "\nAge: " + age;
    }
}
