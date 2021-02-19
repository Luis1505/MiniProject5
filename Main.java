class Main {
  public static void main(String[] args) {
    minutesWasted(10);
    addedTime(7);
  }
  public static void minutesWasted(int timePassed) {
    if (timePassed == 0) {
      System.out.println("Your time is over.");
    } else {
      System.out.println(timePassed);
      timePassed--;
      minutesWasted(timePassed);
    }
  }
  public static int addedTime(int timeAdded) {
    if (timeAdded == 10) {
      System.out.println("Time has been added");
    } else {
      return timeAdded + 1;

    }
  }
} 