package week1.spirit;


import java.util.Scanner;

/**
 * 枚举类型练习
 * @auther xupeng
 * 2019.3.21
 */
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"),
    WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日");
    String week;
    Week(String week) {
        this.week = week;
    }

    public String getName() {
        return week;
    }
    // 定义一个静态方法，根据简称得到季节名称
    public static Week getWeek(String input) {
        switch (input) {
            case "mon":
                return Week.MONDAY;
            case "tues":
                return Week.TUESDAY;
            case "wed":
                return Week.WEDNESDAY;
            case "thur":
                return Week.THURSDAY;
            case "fri":
                return Week.FRIDAY;
            case "sat":
                return Week.SATURDAY;
            case "sun":
                return Week.SUNDAY;
            default:
                return Week.MONDAY;
        }
    }
}
 class EnumTest {
    // 创建一个EnumTest类
    public static void main(String[] args) {
        System.out.print("请输入你要的查询：");
        Scanner sc = new Scanner(System.in);
        Week week = Week.getWeek(sc.next());
        System.out.println(week+"----"+week.getName());
    }
}
