import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class LatLng{
    double lat;
    double lng;
    LatLng(double lat, double lng){
        this.lat=lat;
        this.lng=lng;
    }
}

public class GetTimeDistance{
    public static void main(String[] args) {
        LatLng user_LatLng = new LatLng(28.548268333333333,77.18642);
        LatLng drive_LatLng = new LatLng(28.54100, 77.18000);
        
        getJSONObjectFromURL(user_LatLng, driver_latLng);

    }
    public static JSONObject getJSONObjectFromURL(LatLng user_LatLng, LatLng driver_latLng) throws IOException, JSONException {
        String urlString = "http://maps.googleapis.com/maps/api/distancematrix/json?origins="+user_LatLng.latitude+","+user_LatLng.longitude+"&destinations="+driver_latLng.latitude+","+driver_latLng.longitude+"&mode=driving&language=en-EN&sensor=false";
        HttpURLConnection urlConnection = null;
        URL url = new URL(urlString);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setReadTimeout(10000 /* milliseconds */ );
        urlConnection.setConnectTimeout(15000 /* milliseconds */ );
        urlConnection.setDoOutput(true);
        urlConnection.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        br.close();

        String jsonString = sb.toString();
        System.out.println("JSON: " + jsonString);

        return new JSONObject(jsonString);
    }
}