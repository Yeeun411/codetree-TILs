import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(whichSeason(y,m,d));
    }

    public static String whichSeason(int y, int m,int d){
        if(y%4==0&&y%100!=0){
            //4의 배수이면서 100의 배수가 아니면 윤년
            if(m==2){
                if(d>=29){
                    return "Winter";
                }else{
                    return "-1";
                }
            }else{
                if(doesExist(m,d)){
                    if(m>=3&&m<=5){
                        return "Spring";
                    }else if(m>=6&&m<=8){
                        return "Summer";
                    }else if(m>=9&&m<=11){
                        return "Fall";
                    }else if(m==12||m==1||m==2){
                        return "Winter";
                    }
                }else{
                    return "-1";
                }
            }
        }else if(y%4==0&&y%400==0){
            //4의 배수이면서 100의 배수지만 또한 400의 배수라면 윤년
            if(m==2){
                if(d>=29){
                    return "Winter";
                }else{
                    return "-1";
                }
            }else{
                if(doesExist(m,d)){
                    if(m>=3&&m<=5){
                        return "Spring";
                    }else if(m>=6&&m<=8){
                        return "Summer";
                    }else if(m>=9&&m<=11){
                        return "Fall";
                    }else if(m==12||m==1||m==2){
                        return "Winter";
                    }
                }else{
                    return "-1";
                }
            }
        }else{
            if(m==2){
                if(d>=28){
                    return "Winter";
                }else{
                    return "-1";
                }
            }else{
                if(doesExist(m,d)){
                    if(m>=3&&m<=5){
                        return "Spring";
                    }else if(m>=6&&m<=8){
                        return "Summer";
                    }else if(m>=9&&m<=11){
                        return "Fall";
                    }else if(m==12||m==1||m==2){
                        return "Winter";
                    }
                }else{
                    return "-1";
                }
            }
        }
        return "-1";

    }
    public static boolean doesExist(int m,int d){
        int lastDate = 0;
        switch(m){
            case 1:  lastDate = 31;
                     break;
            case 3:  lastDate = 31;
                     break;
            case 4:  lastDate = 30;
                     break;
            case 5:  lastDate = 31;
                     break;
            case 6:  lastDate = 30;
                     break;
            case 7:  lastDate = 31;
                     break;
            case 8:  lastDate = 31;
                     break;
            case 9:  lastDate = 30;
                     break;
            case 10: lastDate = 31;
                     break;
            case 11: lastDate = 30;
                     break;
            case 12: lastDate = 31;
                     break;
            default: return false;
        }
        if(lastDate>=d){
            return true;
        }else{
            return false;
        }
    }
}