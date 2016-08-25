package co.housepartytinder;

import retrofit.RestAdapter;

/**
 * Created by ZkHaider on 8/24/16.
 */
public class RestClient {

    private static final String API_URL = "";
    private static RestClient mRestClient;
    private static RestAdapter mAsyncRestAdapter;

    public static RestClient getInstance() {
        if (mRestClient == null)
            mRestClient = new RestClient();
        return mRestClient;
    }

    private RestClient() {
        mAsyncRestAdapter = new RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

}
