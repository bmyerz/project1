
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruciton;

/**
 *
 * @author gyeonghyeko, hyokyung kang
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
            if (tals_tmp.instruction_id==1){//addiu//I-type
                String addiu_op_binary = Integer.toBinaryString(9);
                String addiu_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String addiu_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String addiu_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = addiu_op_binary + addiu_rs_binary + addiu_rt_binary +addiu_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }
            
            if(tals.tmp.instruction_id==8){//slt//R-type
               String slt_op_binary = Integer.toBinaryString(0);
               String slt_rs_binary=Integer.toBinaryString(tals_tmp.rs);
               String slt_rt_binary=Integer.toBinaryString(tals_tmp.rt);
               String slt_rd_binary=Integer.toBinaryString(tals_tmp.rd);
               String slt_shamt_binary=Integer.toBinaryString(tals_tmp.shift_amount);
               String slt_funct_binary = Integer.toBinaryString(42);
               String slt_string_binary = slt_op_binary +  slt_rs_binary +  slt_rs_binary +slt_rd_binary+slt_shamt_binary+slt_funct_binary;
               int slt_binary = Integer.valueOf(slt_string_binary);
               binary_list.add(slt_string_binary);
                


            }
            if(tals.tmp.instruction_id=9){//lui // I-type
                int lui_op=15;
                String lui_rs_binary=Integer.toBinaryString(tals_tmp.rs);
                String slt

            }
            if(tals.tmp.instruction_id=10){//ori //I-type
                int ori_op=13;
                String slt_rs_binary=Integer.toBinaryString(tals_tmp.rs);
                String slt

            }
            if(tals.tmp.instruction_id=100){//blt //
                int lui_op=;
                String slt_rs_binary=Integer.toBinaryString(tals_tmp.rs);
                String slt

            }
            if(tals.tmp.instruction_id=101){//bge //
                int lui_op=;
                String slt_rs_binary=Integer.toBinaryString(tals_tmp.rs);
                String slt

            }
        }
        return null;
    }
}
