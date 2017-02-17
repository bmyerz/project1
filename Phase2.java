/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruciton;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Phase2 {

    public static List<Instruction> resolve_addresses(List<Instruction> unresolved, int first_pc) {
        
        LinkedList<Instruction> resolved_tals = new LinkedList<Instruction>();
        Map map_address = new HashMap(); //map of address-order (of address as positive int)
        Map map_labelID = new HashMap(); //map of labelID-address
        
        //make Maps
        for (int i=0; i<unresolved.size();i++){
            //address-order map
            map_address.put(first_pc, i);

            //labelID-address map
            if(unresolved.get(i).branch_label!=0) {
                map_labelID.put(unresolved.get(i).copy().branch_label, first_pc);
            }
            
            first_pc = first_pc+4; 
        }
        
        
        for (int j=0; j<unresolved.size(); j++){
            Instruction unresolved_tals_tmp = unresolved.get(j);
            
            //branch_label is 0
            if(unresolved_tals_tmp.branch_label==0){
                resolved_tals.add(unresolved_tals_tmp.copy());
            }
            
            //branch_label is not 0
            else {
                //target address
                int target_address = (int) map_labelID.get(unresolved_tals_tmp.branch_label);
                int target_address_order = (int) map_address.get(target_address);
                
                //modifiy immediate
                //j is current address
                if(target_address_order<j){
                    int immediate = target_address_order-j-1;
                    
                    //modify immediate and branchLabel
                    //store in resolved_tals
                    unresolved_tals_tmp.immediate = immediate;
                    unresolved_tals_tmp.branch_label = 0;
                    resolved_tals.add(unresolved_tals_tmp.copy());
                }
                
                if(target_address_order>j){
                    int immediate = target_address_order-j-1;
                    
                    unresolved_tals_tmp.immediate = immediate;
                    unresolved_tals_tmp.branch_label = 0;
                    resolved_tals.add(unresolved_tals_tmp.copy());
                }   
            }
        }
        return resolved_tals;
    }

}

