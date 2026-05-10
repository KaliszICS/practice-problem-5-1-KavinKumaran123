public class Child extends Person {

    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;

    // Constructor
    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);

        this.parent1 = parent1;
        this.parent2 = parent2;

        this.siblings = new Child[0];
    }

    // Getters
    public Parent getParent1() {
        return parent1;
    }

    public Parent getParent2() {
        return parent2;
    }

    public Child[] getSiblings() {
        return siblings;
    }

    // Setter
    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

    // Add sibling method
    public void addSibling(Child child) {

        Child[] temp = new Child[siblings.length + 1];

        for (int i = 0; i < siblings.length; i++) {
            temp[i] = siblings[i];
        }

        temp[siblings.length] = child;

        siblings = temp;
    }
}