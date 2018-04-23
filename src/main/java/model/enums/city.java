package model.enums;

/**
 * Created by IntelliJ IDEA.
 *
 * @User: Zacky Kharboutli
 * @Date: 2018-04-14
 * @Project : HotelSystem
 */


public enum  city {
    VÄXJÖ {

        @Override
        public String toString() {
            return "Växjö";
        }
    },


    KALMAR {

        @Override
        public String toString() {
            return "Kalmar";
        }
    };

    public static city toEnum(String str){

        if(str.equals("Kalmar")){
            return KALMAR;
        }else if(str.equals("Växjö")){
            return VÄXJÖ;
        }
        return null;
    }
}
