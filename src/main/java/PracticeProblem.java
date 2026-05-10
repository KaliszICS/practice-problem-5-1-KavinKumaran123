public class PracticeProblem {

    public static void main(String args[]) {

        Parent dad = new Parent("John", 40);
        Parent mom = new Parent("Sarah", 38);

        dad.setSpouse(mom);
        mom.setSpouse(dad);

        Child child1 = new Child("Alex", 12, dad, mom);
        Child child2 = new Child("Emma", 10, dad, mom);

        dad.addChild(child1);
        dad.addChild(child2);

        mom.addChild(child1);
        mom.addChild(child2);

        child1.addSibling(child2);
        child2.addSibling(child1);

        System.out.println(dad.getName());
        System.out.println(mom.getName());

        System.out.println(child1.getName());
        System.out.println(child2.getName());
    }
}