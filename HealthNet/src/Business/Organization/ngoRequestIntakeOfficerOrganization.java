/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ngoRequestIntakeOfficerRole;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ngoRequestIntakeOfficerOrganization extends Organization {

    public ngoRequestIntakeOfficerOrganization() {
        super(Organization.Type.ngoManagementCenter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ngoRequestIntakeOfficerRole());
        return roles;
    }

}
