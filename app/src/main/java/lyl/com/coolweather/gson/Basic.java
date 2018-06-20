package lyl.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 林逸磊 on 2018/6/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
