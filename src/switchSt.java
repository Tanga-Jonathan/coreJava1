public class switchSt {
    public static void main(String[] args) {
        
        int monthnummber = 12;
        String month;

        switch(monthnummber) {
            case 1: 
            month = "January";
            break;
            case 2:
            month = "February";
            break;
            default:
            month = "Invalid Month";
            
        }
        System.out.println(month);
    }
}
