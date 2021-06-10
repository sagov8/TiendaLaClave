
package control;

/**
 *
 * @author sagov8
 */
public class GestionInicioSesion {
    
    Boolean userIN = false;

    public GestionInicioSesion() {
        
    }
    
    public Boolean verificarLogin(Boolean userIn){
        if(userIn){
            this.userIN = true;
        }
        return userIN;
    }
    
    public Boolean userActive(){
        return this.userIN;
    }
}
