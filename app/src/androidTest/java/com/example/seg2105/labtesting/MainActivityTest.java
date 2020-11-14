package com.example.seg2105.labtesting;

import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    public MainActivity mActivity = null;
    private TextView text;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    //TODO : THE TESTS
}
