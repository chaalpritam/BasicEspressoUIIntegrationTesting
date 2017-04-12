package com.chaalpritam.apps.basicespressouiintegrationtesting;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.chaalpritam.apps.basicespressouiintegrationtesting.view.activity.SignUpActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static org.hamcrest.CoreMatchers.allOf;

/**
 * Created by chaalpritam on 11/4/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SignUpTest {

    @Rule
    public ActivityTestRule<SignUpActivity> signUpActivityActivityTestRule =
            new ActivityTestRule<SignUpActivity>(SignUpActivity.class);

    @Test
    public void clickSignUpButtonAfterFillingForm_showProgressAndSuccessScreen() {
        String first_name = "Firstname";
        String last_name = "Lastname";
        String email = "firstname.lastname@g.com";
        String password = "password";

        // firstname
        onView(withId(R.id.edit_text_first_name)).perform(typeText(first_name), closeSoftKeyboard());

        // lastname
        onView(withId(R.id.edit_text_last_name)).perform(typeText(last_name), closeSoftKeyboard());

        // email
        onView(withId(R.id.edit_text_email)).perform(typeText(email), closeSoftKeyboard());

        // password
        onView(withId(R.id.edit_text_password)).perform(typeText(password), closeSoftKeyboard());

        // SignUp Button
        onView(withId(R.id.button_sign_up)).perform(click());

        // Check Success Screen
        String successString = InstrumentationRegistry.getTargetContext().getString(R.string.text_sign_up_successful);
        onView(withId(R.id.text_view_status_message)).check(matches(allOf(withText(successString), isDisplayed())));
    }
}
