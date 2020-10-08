package cse360assignment02;

public class testing {
    public static void main(String[] args) {
        AddingMachine addingMachine = new AddingMachine();
        System.out.println(addingMachine.getTotal());
        addingMachine.add(10);
        addingMachine.subtract(3);
        addingMachine.add(2);
        System.out.println(addingMachine.getTotal());
        System.out.println(addingMachine.toString());
        addingMachine.clear();
        System.out.println(addingMachine.getTotal());
        System.out.println(addingMachine.toString());
    }
}
