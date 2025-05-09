/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentTreasurer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class TreasurerOrganization extends Organization {

    public TreasurerOrganization() {
        super(Organization.Type.GovernmentAccountant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentTreasurer());
        return roles;
    }

}
