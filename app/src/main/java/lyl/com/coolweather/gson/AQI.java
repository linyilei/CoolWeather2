package lyl.com.coolweather.gson;

/**
 * Created by 林逸磊 on 2018/6/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
