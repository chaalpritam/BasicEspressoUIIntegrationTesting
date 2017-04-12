package com.chaalpritam.apps.basicespressouiintegrationtesting;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by chaalpritam on 11/4/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule =
            new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void clickLoginButton_showSuccessScreenAfterLogin() {

        String email = "username@email.com";
        String password = "password";

        // Type in Email
        onView(withId(R.id.edit_text_email)).perform(typeText(email), closeSoftKeyboard());

        // Type in Password
        onView(withId(R.id.edit_text_password)).perform(typeText(password), closeSoftKeyboard());

        // Click on Login Button
        onView(withId(R.id.button_login)).perform(click());

        // Verify that Success Screen Shows
        String successString = InstrumentationRegistry.getTargetContext().getString(R.string.text_login_successful);
        onView(withText(successString)).check(matches(isDisplayed()));
    }
}
