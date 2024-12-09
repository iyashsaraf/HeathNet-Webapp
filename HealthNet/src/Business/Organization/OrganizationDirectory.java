/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
import static Business.Organization.Organization.Type.InsuranceFundOrganization;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        
         else if(type.getValue().equals(Type.Patient.getValue()))
        {
            organization = new PatientOrganization();
            organizationList.add(organization);
                    
        }
        
        else if(type.getValue().equals(Type.Accountant.getValue()))
        {
            organization = new AccountantOrganization();
            organizationList.add(organization);
                    
        }
        
        
        else if(type.getValue().equals(Type.HealthcareChief.getValue()))
        {
            organization = new HealthCareOfficerOrganization();
            organizationList.add(organization);
                    
        }
        
         else if(type.getValue().equals(Type.GovernmentSecretary.getValue()))
        {
            organization = new SecretaryOrganization();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.GovernmentAccountant.getValue()))
        {
            organization = new TreasurerOrganization();
            organizationList.add(organization);
                    
        }
                
          else if(type.getValue().equals(Type.InsuranceAgent.getValue()))
        {
            organization = new InsuranceAgentOrganization();
            organizationList.add(organization);
                    
        } 
          else if(type.getValue().equals(Type.InsuranceFundOrganization.getValue()))
        {
            organization = new InsuranceFinanceOrganization();
            organizationList.add(organization);
                    
        }
          else if(type.getValue().equals(Type.PolicyPlanner.getValue()))
        {
            organization = new InsurancePolicyPlannerOrganization();
            organizationList.add(organization);
                    
        }
        
        else if(type.getValue().equals(Type.ngoManagementCenter.getValue()))
        {
            organization = new ngoRequestIntakeOfficerOrganization();
            organizationList.add(organization);
                    
        }
        
         else if(type.getValue().equals(Type.ngoRAH.getValue()))
        {
            organization = new ngoResourceCoordinatorOrganization();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.ngoODU.getValue()))
        {
            organization = new ngoDeploymentSpecialistOrganization();
            organizationList.add(organization);
                    
        }
        

       
        return organization;
    }
}