/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ngoResourceCoordinator;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ngoResourceCoordinatorOrganization extends Organization {

    public ngoResourceCoordinatorOrganization() {
        super(Organization.Type.ngoRAH.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ngoResourceCoordinator());
        return roles;
    }

}
