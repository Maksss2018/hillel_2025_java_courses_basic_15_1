interface AdvisorInterface {
    String advise(Day Day);
}
class AdvisorImpl implements AdvisorInterface {
    @Override
    public String advise(Day Day) {
        return  switch (Day) {
            case MONDAY -> "MONDAY - hardest day ... be brave and hold on";
            case TUESDAY -> "TUESDAY - much more easier day then Monday, but still can be hard";
            case WEDNESDAY -> "WEDNESDAY - it is middle of working week... you still have to be focused but it is easier the previous days";
            case THURSDAY -> "THURSDAY - almost on finish, one more day and that's all";
            case FRIDAY -> "FRIDAY - almost the weekend.... you can start to relax";
            case SATURDAY -> "SATURDAY - atlast ... it is the weekend ... now you can relax ...  but only after you will do you home tasks";
            case SUNDAY -> "SUNDAY - it is your day, do whatever you want to";
        };

    }
}