interface FamilyRole {
    void describeRole();
}
class FamilyMember implements FamilyRole {
    protected String name;
    protected int age;
    protected String role;

    public FamilyMember(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void describeRole() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
class Parent extends FamilyMember {
    public Parent(String name, int age) {
        super(name, age, "Parent");
    }
}

class Child extends FamilyMember {
    public Child(String name, int age) {
        super(name, age, "Child");
    }
}
class FamilyDemo {
    public static void main(String[] args) {
        FamilyRole dad = new Parent("John", 40);
        FamilyRole mom = new Parent("Mary", 38);
        FamilyRole son = new Child("David", 10);

        dad.describeRole();
        mom.describeRole();
        son.describeRole();
    }
}
    

