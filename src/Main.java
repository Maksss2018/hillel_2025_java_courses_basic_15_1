void main() {
    AdvisorImpl advisor = new AdvisorImpl();
    Calendar c = Calendar.getInstance();
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
    Day today = Day.values()[dayOfWeek];
    IO.println(advisor.advise(today));
    /*
    for (Day day : Day.values()) {
        IO.println(advisor.advise(day));
    }
    */
}
