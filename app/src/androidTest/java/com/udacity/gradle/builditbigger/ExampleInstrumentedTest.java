package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void jokeNullOrEmptyTest() throws ExecutionException, InterruptedException {

        EndpointAsyncTask asyncTask = new EndpointAsyncTask(activityTestRule.getActivity());
        asyncTask.execute();
        String joke = asyncTask.get();
        Assert.assertTrue(!TextUtils.isEmpty(joke));

    }
}
