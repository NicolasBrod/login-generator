package geco;

import java.util.Random;

/**
 * Classe de service permettant la génération aléatoire de mot de passe
 */
public class PasswordGeneration {

    private final int PASSWORD_SIZE = 8;
    private final int ASCII_MAX = 126;
    private final int ASCII_MIN = 33;

    /**
     * Renvoie un mot de passe généré aléatoirement
     *
     * @return mot de passe
     */
    public String getRandomPassword(){
        Random random = new Random();
        String randomPassword="";
        for(int i=0; i < PASSWORD_SIZE; i++){
            randomPassword += (char) (random.nextInt(ASCII_MAX - ASCII_MIN + 1) + ASCII_MIN);
        }
        return randomPassword;
    }
}
