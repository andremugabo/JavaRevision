public class SwitchCase {
    public static void main(String[] args){
        int month = 6;
        String season = switch(month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Invalid month";
        };
        System.out.println(season);
    }
    
}
