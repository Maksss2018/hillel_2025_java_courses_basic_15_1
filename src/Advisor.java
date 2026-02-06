interface AdvisorInterface {
    void advise(Day Day);
}
class AdvisorImpl implements AdvisorInterface {
    @Override
    public void advise(Day Day) {
        switch (Day) {
            case MONDAY:
                System.out.println("MONDAY - hardest day ... be brave and hold on");
                break;
            case TUESDAY:
                System.out.println("TUESDAY - much more easier day then Monday, but still can be hard");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY - it is middle of working week... you still have to be focused but it is easier the previous days");
                break;
            case THURSDAY:
                System.out.println("THURSDAY - almost on finish, one more day and that's all");
                break;
            case FRIDAY:
                System.out.println("FRIDAY - almost the weekend.... you can start to relax");
                break;
            case SATURDAY:
                System.out.println("SATURDAY - atlast ... it is the weekend ... now you can relax ...  but only after you will do you home tasks");
                break;
            case SUNDAY:
                System.out.println("SUNDAY - it is your day, do whatever you want to");
                break;
        }
    }
}