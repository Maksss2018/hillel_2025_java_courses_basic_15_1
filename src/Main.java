void main() {
    AdvisorImpl advisor = new AdvisorImpl();
    for (Day day : Day.values()) {
        IO.println(advisor.advise(day));
    }
}
