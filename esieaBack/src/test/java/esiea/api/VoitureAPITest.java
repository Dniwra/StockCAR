package esiea.api;
import esiea.dao.VoitureDAO;
import esiea.metier.Voiture;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoitureAPITest {

    @Test
    void testAjouterVoitureSucces() {
        VoitureAPI voitureAPI = new VoitureAPI();
        String saisieJsonValide = "{\"marque\":\"Toyota\",\"modele\":\"Corolla\",\"finition\":\"Sedan\",\"carburant\":\"Essence\",\"km\":5000,\"annee\":2022,\"prix\":25000}";
        String response = voitureAPI.ajouterVoiture(saisieJsonValide);
        assertTrue(response.contains("\"succes\":false"));
    }

    @Test
    void testAjouterVoitureEchec() {
        VoitureAPI voitureAPI = new VoitureAPI();
        String saisieJsonIncorrecte = "{\"marque\":\"Toyota\",\"modele\":\"Corolla\"}";
        String response = voitureAPI.ajouterVoiture(saisieJsonIncorrecte);
        assertTrue(response.contains("\"succes\":false"));
    }

    @Test
    void testSupprimerVoitureSucces() {
        VoitureAPI voitureAPI = new VoitureAPI();
        String idValide = "1";
        String response = voitureAPI.supprimerVoiture(idValide);
        assertTrue(response.contains("\"succes\":true"));
    }

    @Test
    void testSupprimerVoitureEchec() {
        VoitureAPI voitureAPI = new VoitureAPI();
        String idInvalide = "1000";
        String response = voitureAPI.supprimerVoiture(idInvalide);
        assertTrue(response.contains("\"succes\":false"));
    }
}
