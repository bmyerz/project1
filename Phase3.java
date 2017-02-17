
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruciton;

/**
 *
 * @author gyeonghyeko
 */
import java.util.LinkedList;
import java.util.List;

public class Phase3 {

    /* Translate each Instruction object into
     * a 32-bit number.
     *
     * tals: list of Instructions to translate
     *
     * returns a list of instructions in their 32-bit binary representation
     *
     */
    public static List<Integer> translate_instructions(List<Instruction> tals) {
        
        List<Integer> binary_list = new LinkedList<Integer>();
        
        for (int i=0; i<tals.size(); i++) {
            Instruction tals_tmp=tals.get(i);
            
            //addiu
            if (tals_tmp.instruction_id==1){
                String addiu_op_binary = Integer.toBinaryString(9);
                String addiu_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String addiu_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String addiu_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = addiu_op_binary + addiu_rs_binary + addiu_rt_binary +addiu_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }
        }
        return null;
    }
}
