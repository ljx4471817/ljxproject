import com.alibaba.fastjson.JSON;

public class test {
    static String arr[] ={"15519106778","17585461068","18111938637"};
    public static void main(String[] args) {

                    String params = "templateid=3902929&mobiles=[\"15519106778\",\n" +
                    "\"17585461068\"]";

        String params1 = "templateid=3902929&mobiles=["+arr+"]";
        String json_arr_String = JSON.toJSONString(arr);
        System.out.println(params);
        System.out.println(params1);

        System.out.println(json_arr_String);
    }
}