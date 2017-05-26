package com.project;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author armdev
 */
@Named
@RequestScoped
public class ActionBean implements Serializable {

    @Inject
    private BackendSessionBean backendSessionBean;

    private static final long serialVersionUID = 1L;

    public ActionBean() {
    }

    public void eval() {
        final String alertMe = "We are using " + backendSessionBean.businessMethod();

        StringBuilder alert = new StringBuilder();
        alert.append("alert").append("('").append(alertMe).append("')");

        getFacesContext().getPartialViewContext()
                .getEvalScripts()
                .add(alert.toString());
        ;
    }

    @Produces
    @RequestScoped
    public FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

}
