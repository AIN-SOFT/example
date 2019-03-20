package week1.spirit;


import java.util.Scanner;

/**
 * 枚举类型练习
 * Created by lenovo on 2019/3/21 6:30
 */
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    String week;
    Week(String week) {
        this.week = week;
    }

    public String getName() {
        return week;
    }

    public static Week getWeek(String week) {
        // 定义一个静态方法，用来根据输入获取对应Week枚举值
        switch (week) {
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

class EnumSetTest {
    // 创建一个EnumSetTest类
    public static void main(String[] args) {
        // 提示信息
        Week weekArray[] = Week.values();
        // 获取枚举数组
        for (Week k : weekArray) {
            // foreach循环遍历枚举数组
            System.out.println(k + "——" + k.getName());
            // 输出枚举名称及对应中文含义
        }
        System.out.print("查询星期：");
        // 提示信息
        Scanner sc = new Scanner(System.in);
        // 控制台输入
        Week week = Week.getWeek(sc.next());
        // 根据输入获取枚举值
        switch (week) {
            case MONDAY:
                System.out.println("MONDAY————" + week.getName());
                // 获取枚举值的中文描述
                break;
            case TUESDAY:
                System.out.println("TUESDAY——" + week.getName());
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY——" + week.getName());
                break;
            case THURSDAY:
                System.out.println("THURSDAY——" + week.getName());
                break;
            case FRIDAY:
                System.out.println("FRIDAY——" + week.getName());
                break;
            case SATURDAY:
                System.out.println("SATURDAY——" + week.getName());
                break;
            case SUNDAY:
                System.out.println("SUNDAY——" + week.getName());
                break;
        }
        sc.close();
    }
}
