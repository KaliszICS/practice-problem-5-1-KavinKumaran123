public class Parent extends Person {

    private Parent spouse;
    private Child[] children;

    // Constructor with spouse
    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[0];
    }

    // Secondary constructor
    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
        this.children = new Child[0];
    }

    // Getters
    public Parent getSpouse() {
        return spouse;
    }

    public Child[] getChildren() {
        return children;
    }

    // Setters
    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    // Add child method
    public void addChild(Child child) {

        Child[] temp = new Child[children.length + 1];

        for (int i = 0; i < children.length; i++) {
            temp[i] = children[i];
        }

        temp[children.length] = child;

        children = temp;
    }
}