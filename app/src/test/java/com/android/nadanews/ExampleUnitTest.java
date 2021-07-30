package com.android.nadanews;

import com.android.nadanews.api.ApiClient;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testRetrofit() {
        ApiClient apiClient = new ApiClient();
        assertNotNull(apiClient.getApiClient());
    }

    @Test
    public void testGetCountry(){
        Utils utils = new Utils();
        assertSame(Locale.JAPAN,utils.getCountry());
    }

    @Test
    public void testGetLanguage(){
        Utils utils = new Utils();
        assertSame(Locale.JAPANESE,utils.getLanguage());
    }
}