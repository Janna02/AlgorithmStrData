public class main {

    public static void main(String[] args) {
        TwoWayList<Integer> intList = new TwoWayList<>();

        intList.add(54);
        intList.add(64);
        intList.add(72);
        intList.add(35);
        intList.add(51);
        
        
        TwoWayList.print();
        System.out.println("Развернутый список: ");
        TwoWayList.revert();
        TwoWayList.print();
    }
    
}
