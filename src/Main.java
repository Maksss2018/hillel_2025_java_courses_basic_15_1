void main() {
    AdvisorImpl advisor = new AdvisorImpl();
    Day today = getIndexOfCurrentDay();

    IO.println(advisor.advise(today));
    /*
    for (Day day : Day.values()) {
        IO.println(advisor.advise(day));
    }
    */
}
Day getIndexOfCurrentDay() {
    LocalDate localDate = LocalDate.now();
    DayOfWeek dayOfWeekEnum = localDate.getDayOfWeek();
    int indexOfDayWeek = dayOfWeekEnum.getValue()-1;
    return Day.values()[indexOfDayWeek];
}