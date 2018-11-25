package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void testGetRandomPasswordSizeIsEight() {
        //Given
        //When
        //Then random password is not null and size is 8
        PasswordGeneration passwordGeneration = new PasswordGeneration();
        assertTrue(passwordGeneration.getRandomPassword().length() == 8);
    }
}