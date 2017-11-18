
package com.bootcamp.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.bootcamp.rest.controllers.ProjetRestController;


/**
 *
 * @author Bignon
 */
@ApplicationPath("rest")
public class Scanner extends Application{
    /**

* configuration pour swagger

* du fait de l'utilisation d'une sous classe Application

* differente de la solution qui configure le web xml

*/

   @Override

public Set<Class<?>> getClasses() {

    Set<Class<?>> resources=new HashSet<>();
    resources.add(ProjetRestController.class);

    return resources;
    }
}
