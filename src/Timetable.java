import java.util.Calendar;
public class Timetable {
    private String[][] schedule = new String[14][2];

    public Timetable() {
        schedule[0] = new String[]{"", "Saturday"};
        schedule[1] = new String[]{"8:00am - 9:00am", "Box Fit"};
        schedule[2] = new String[]{"9:00am - 10:00am", "Yoga"};
        schedule[3] = new String[]{"10:00am - 11:00am", "Bodysculpt"};
        schedule[4] = new String[]{"11:00am - 12:00pm", "Zumba"};
        schedule[5] = new String[]{"12:00pm - 1:00pm", "Spin"};
        schedule[6] = new String[]{"1:00pm - 2:00pm", "Aquacise"};

        schedule[7] = new String[]{"", "Sunday"};
        schedule[8] = new String[]{"8:00am - 9:00am", "Yoga"};
        schedule[9] = new String[]{"9:00am - 10:00am", "Bodysculpt"};
        schedule[10] = new String[]{"10:00am - 11:00am", "Zumba"};
        schedule[11] = new String[]{"11:00am - 12:00pm", "Box Fit"};
        schedule[12] = new String[]{"12:00pm - 1:00pm", "Spin"};
        schedule[13] = new String[]{"1:00pm - 2:00pm", "Aquacise"};
    }

    public void viewByDay(String day) {
        switch(day) {
            case "Saturday":
                System.out.println("Saturday's Schedule:");
                for (int i = 0; i < 7; i++) {
                    if (schedule[i][0].equals(day)) {
                        System.out.println(schedule[i][0] + ": " + schedule[i][1]);
                    }
                }
                break;
            case "Sunday":
                System.out.println("Sunday's Schedule:");
                for (int i = 7; i < 14; i++) {
                    if (schedule[i][0].equals(day)) {
                        System.out.println(schedule[i][0] + ": " + schedule[i][1]);
                    }
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public void viewByFitnessType(String fitnessType) {
        for (int i = 1; i < 14; i++) {
            if (schedule[i][1].equals(fitnessType)) {
                System.out.println(schedule[i][0] + ": " + schedule[i][1]);
            }
        }
    }
}
