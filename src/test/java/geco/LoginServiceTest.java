package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService loginService;
    String[] loginExistants = new String[3];
    @Before
    public void init(){
        loginExistants[0] = "Manuel";
        loginExistants[1] = "Amine";
        loginExistants[2] = "Abdel";
        loginService = new LoginService(loginExistants);

    }


    @Test
    public void testLoginExistsFalse() {
        //Given login
        //When
        //Then the result should be false
        assertEquals(false,loginService.loginExists("Nicolas"));
    }

    @Test
    public void testLoginExistsTrue() {
        //Given login
        //When
        //Then the result should be true
        assertEquals(true,loginService.loginExists("Manuel"));
    }

    @Test
    public void testAddLogin() {
        //Given loginToAdd
        //When add login to loginService
        //Then the size should be size+1(3+1)
        assertEquals(false,loginService.loginExists("Nicolas"));
        loginService.addLogin("Nicolas");
        assertEquals(true,loginService.loginExists("Nicolas"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        //Given preference
        //When
        //Then the list should contains the login "Abdel"
        List<String> listLogWithPref = new ArrayList<>();
        listLogWithPref = loginService.findAllLoginsStartingWith("Ab");
        assertEquals("Abdel",listLogWithPref.get(0));

    }

    @Test
    public void findAllLogins() {
        //Given
        //When
        //Then should contains "Abdel","Amine","Manuel"
        List<String> listLogWithPref = new ArrayList<>();
        listLogWithPref = loginService.findAllLogins();
        assertEquals("Abdel",listLogWithPref.get(0));
        assertEquals("Amine",listLogWithPref.get(1));
        assertEquals("Manuel",listLogWithPref.get(2));
        assertEquals(3,listLogWithPref.size());

    }
}