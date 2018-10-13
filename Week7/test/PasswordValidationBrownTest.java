import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidationBrownTest {

    private String password;
    private String confirmedPassword;
    private boolean validPassword;

    @Before
    public void before(){
        password = "";
        confirmedPassword = "";
        validPassword = false;
    }

    @Test
    public void mismatchPasswords(){

        password = "Password1";
        confirmedPassword = "NotPassword1";

        validPassword = PasswordValidationBrown.validatePassword(password, confirmedPassword);

        assertFalse("Failed to catch mismatched password.", validPassword);
    }

    @Test
    public void passwordTooShort(){

        password = "short";
        confirmedPassword = password;

        validPassword = PasswordValidationBrown.validatePassword(password, confirmedPassword);

        assertFalse("Failed to catch too short passwords.", validPassword);
    }

    @Test
    public void allLowercasePassword(){

        password = "lowercase1";
        confirmedPassword = password;

        validPassword = PasswordValidationBrown.validatePassword(password, confirmedPassword);

        assertFalse("Failed to catch all lowercase password.", validPassword);
    }

    @Test
    public void allUppercasePassword(){

        password = "UPPERCASE1";
        confirmedPassword = password;

        validPassword = PasswordValidationBrown.validatePassword(password, confirmedPassword);

        assertFalse("Failed to catch all uppercase password.", validPassword);
    }

    @Test
    public void missingDigitPassword(){

        password = "NoDigits";
        confirmedPassword = password;

        validPassword = PasswordValidationBrown.validatePassword(password, confirmedPassword);

        assertFalse("Failed to catch password with no digits.", validPassword);
    }

    @Test
    public void validPasswords(){

        password = "MyValidPassword1";
        confirmedPassword = password;

        validPassword = PasswordValidationBrown.validatePassword(password, confirmedPassword);

        assertTrue("Failed to approve of valid password.", validPassword);
    }

}