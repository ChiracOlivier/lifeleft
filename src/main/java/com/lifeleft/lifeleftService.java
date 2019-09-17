package com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

/**
 * @webService with serviceName = "lifeleftService"
 */
@WebService(serviceName= "lifeleftService")
public class lifeleftService {


    private static final Integer EXPERIENCE_VIE_FEMMES=85;
    private static final  Integer EXPERIENCE_VIE_HOMMES=79;

    String homme= "homme";
    String femme= "femme";

    Integer evRefence =0;

    @WebMethod
    public String anneeRestanteAVivre(String prenom, String sexe, Integer anneeNaissance){
        if(sexe.equals(homme)) evRefence= EXPERIENCE_VIE_HOMMES;
        else  evRefence= EXPERIENCE_VIE_FEMMES;

        Integer anneeRestante= evRefence-(Year.now().getValue()- anneeNaissance);

        return "Bonjour "+ prenom+ ", il vous reste à vivre :"+ anneeRestante+" années";
    }
}
