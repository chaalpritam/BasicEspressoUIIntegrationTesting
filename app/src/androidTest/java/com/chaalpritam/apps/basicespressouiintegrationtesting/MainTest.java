package com.chaalpritam.apps.basicespressouiintegrationtesting;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Created by chaalpritam on 11/4/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new
            ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void clickSignUpButton_openSignUpScreen() {
        // Click on the Sign Up button
        onView(withId(R.id.button_sign_up)).perform(click());

        // Check if SignUp Screen is Displayed by asserting first name edittext is displayed
        onView(withId(R.id.edit_text_first_name)).check(matches(allOf(isDescendantOfA(withId(R.id.layout_sign_up)), isDisplayed())));
    }

    @Test
    public void clickLoginButton_openLoginScreen() {
        // Click on the Login button
        onView(withId(R.id.button_login)).perform(click());

        // Check if Login Screen is Displayed by asserting
        onView(withId(R.id.edit_text_email)).check(matches(allOf(isDescendantOfA(withId(R.id.layout_login)), isDisplayed())));
    }
}