package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void init(){
        loginService = new LoginService(new String[]
                {"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
    }

    @Test
    public void generateLoginForNomAndPrenomCas1() {
        //Given new login generate
        //When
        //Then the result should be "PDUR"
        loginGenerator = new LoginGenerator(loginService);
        assertEquals("PDUR",loginGenerator.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void generateLoginForNomAndPrenomCas2() {
        //Given new login generate
        //When
        //Then the result should be "PDUR"
        loginGenerator = new LoginGenerator(loginService);
        assertEquals("JROL1",loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean"));
    }

    @Test
    public void generateLoginForNomAndPrenomCas3() {
        //Given new login generate
        //When
        //Then the result should be "PDUR"
        loginGenerator = new LoginGenerator(loginService);
        assertEquals("PDUR",loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul"));
    }

    @Test
    public void generateLoginForNomAndPrenomCas4() {
        //Given new login generate
        //When
        //Then the result should be "PDUR"
        loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertEquals(true,loginService.loginExists("JRAL2"));
    }

    @Test
    public void generateLoginForNomAndPrenomPaulDU() {
        //Given new login generate
        //When
        //Then the result should be "PDU"
        loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Du","Paul");
        assertEquals(true,loginService.loginExists("PDU"));
    }
}