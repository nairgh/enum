enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class EnumDayOfWeekExample{
    public static void main(String[] args) {
       for( DayOfWeek day : DayOfWeek.values() ){
          System.out.println("Day " + day);

       if(day.isWeekend()){
         System.out.println(day + " is a weekend");
       }else {
           System.out.println(day + " is a weekday");
       }
    }
   DayOfWeek today = DayOfWeek.FRIDAY;
   System.out.println("\nToday: " + today);
   System.out.println("Is today a weekend? " + today.isWeekend());
}
}