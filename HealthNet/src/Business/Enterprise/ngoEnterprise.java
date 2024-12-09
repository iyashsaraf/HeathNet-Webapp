/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saket
 */
public class ngoEnterprise extends Enterprise {

    public ngoEnterprise(String name) {
        super(EnterpriseType.ngo, name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.ngoManagementCenter);
        orgTypes.add(Organization.Type.ngoRAH);
        orgTypes.add(Organization.Type.ngoODU);

        return orgTypes;
    }

}
