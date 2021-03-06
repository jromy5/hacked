package li.doerf.hacked.remote.haveibeenpwned;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by moo on 05/09/16.
 */
public interface HaveIBeenPwned {

    @Headers({
            "Accept: application/vnd.haveibeenpwned.v2+json",
            "User-Agent: Hacked_Android_App"
    })
    @GET("/api/v3/breach/{name}")
    Call<BreachedAccount> getBreach(@Path("name") String name);

    @Headers({
            "Accept: application/vnd.haveibeenpwned.v2+json",
            "User-Agent: Hacked_Android_App"
    })
    @GET("/api/v3/breaches")
    Call<List<BreachedAccount>> getBreachedSites();

}
