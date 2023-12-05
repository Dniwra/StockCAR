package dao;

import esiea.dao.VoitureDAO;
import esiea.metier.Voiture;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoitureDAOTest {

    @Test
    void testAjouterVoiture() {
        VoitureDAO voitureDAO = new VoitureDAO();
        Voiture voiture = new Voiture();
        voiture.setMarque("Toyota");
        voiture.setModele("Corolla");
        voiture.setFinition("Sedan");
        voiture.setCarburant(Voiture.Carburant.ESSENCE);
        voiture.setKm(5000);
        voiture.setAnnee(2022);
        voiture.setPrix(25000);
        try {
            voitureDAO.ajouterVoiture(voiture);
            assertTrue(true);
        } catch (Exception e) {
            fail("L'ajout de la voiture a échoué : " + e.getMessage());
        }
    }

    @Test
    void testSupprimerVoiture() {
        VoitureDAO voitureDAO = new VoitureDAO();
        String idValide = "1";
        try {
            voitureDAO.supprimerVoiture(idValide);
            assertTrue(true);
        } catch (Exception e) {
            fail("La suppression de la voiture a échoué : " + e.getMessage());
        }
    }
}
