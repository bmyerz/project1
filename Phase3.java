
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
    int functnumber;
    
    static void showpush(Stack st, int a) {// change integer to binary number put those numbers in stack.. 
    while (a != 0)
    {
      int d = a % 2;
      st.push(d);
      a /= 2;
    }
    }

    public static List<Integer> translate_instructions(List<Instruction> tals) {
        
        List<Integer> binary_list = new LinkedList<Integer>();
        
        for (int i=0; i<tals.size(); i++) {
            Instruction tals_tmp=tals.get(i);
            
            
           
            // check the id is R type or I type. 
            
            
            if(tals_tmp.instruction_id==2||tals_tmp.instruction_id==3||tals_tmp.instruction_id==8){
                
                if(tals_tmp.instruction_id==2){
                functnumber=33;
                }
                 if(tals_tmp.instruction_id==3){
                functnumber=37;
                }
                 if(tals_tmp.instruction_id==8){
                functnumber=42;
                }
                
                /*
                change integer to binary 
                 String x=Integer.toBinaryString()
                 int y=Integer.parseInt(x)
                */
                
                   }
            
            }
            
            if(tals_tmp.instruction_id==1||tals_tmp.instruction_id==5||tals_tmp.instruction_id==6||tals_tmp.instruction_id==9||tals_tmp.instruction_id==10){
            // put the algorithm for only I-type
            //need op,rs,rt,immediate//
            }
            
                 /*
            if (){//addu rtype 
                String addu_op_binary = Integer.toBinaryString(0);
                String addu_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String addu_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String addu_rd_binary = Integer.toBinaryString(tals_tmp.rd);
                String addu_shift_binary = Integer.toBinaryString(tals_tmp.shift_amount);
                String addu_funct_binary = Integer.toBinaryString(33);
                
                String addu_string_binary = addu_op_binary + addu_rs_binary + addu_rt_binary +addu_rd_binary + addu_shift_binary + addu_funct_binary;
                int addu_binary = Integer.valueOf(addu_string_binary);
                binary_list.add(addu_binary);
            }
           
            //or(R)
            if (tals_tmp.instruction_id==3){
                String or_op_binary = Integer.toBinaryString(0);
                String or_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String or_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String or_rd_binary = Integer.toBinaryString(tals_tmp.rd);
                String or_shift_binary = Integer.toBinaryString(tals_tmp.shift_amount);
                String or_funct_binary = Integer.toBinaryString(37);
                
                String or_string_binary = or_op_binary + or_rs_binary + or_rt_binary +or_rd_binary + or_shift_binary + or_funct_binary;
                int or_binary = Integer.valueOf(or_string_binary);
                binary_list.add(or_binary);
            }
            if(tals.tmp.instruction_id==8){//slt//R-type
               String slt_op_binary = Integer.toBinaryString(0);
               String slt_rs_binary=Integer.toBinaryString(tals_tmp.rs);
               String slt_rt_binary=Integer.toBinaryString(tals_tmp.rt);
               String slt_rd_binary=Integer.toBinaryString(tals_tmp.rd);
               String slt_shamt_binary=Integer.toBinaryString(tals_tmp.shift_amount);
               String slt_funct_binary = Integer.toBinaryString(42);
               String slt_string_binary = slt_op_binary +  slt_rs_binary +  slt_rt_binary +slt_rd_binary+slt_shamt_binary+slt_funct_binary;
               int slt_binary = Integer.valueOf(slt_string_binary);
               binary_list.add(slt_string_binary);
                


            }*/
            
            //addiu(I)
            /*if (tals_tmp.instruction_id==1){//addiu_I_type
                String addiu_op_binary = Integer.toBinaryString(9);
                String addiu_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String addiu_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String addiu_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = addiu_op_binary + addiu_rs_binary + addiu_rt_binary +addiu_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }*/
            
            
            
            //beq(I)
            /*if (tals_tmp.instruction_id==5){
                String beq_op_binary = Integer.toBinaryString(4);
                String beq_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String beq_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String beq_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = beq_op_binary + beq_rs_binary + beq_rt_binary +beq_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }*/
            
            //bne(I)
           /* if (tals_tmp.instruction_id==6){
                String bne_op_binary = Integer.toBinaryString(5);
                String bne_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String bne_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String bne_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String addiu_string_binary = bne_op_binary + bne_rs_binary + bne_rt_binary +bne_immediate_binary;
                int addiu_binary = Integer.valueOf(addiu_string_binary);
                binary_list.add(addiu_binary);
            }*/
            
           
            /*if(tals.tmp.instruction_id==9){//lui // I-type
                    
                String lui_op_binary = Integer.toBinaryString(15);
                String lui_rs_binary = Integer.toBinaryString(tals_tmp.rs);
                String lui_rt_binary = Integer.toBinaryString(tals_tmp.rt);
                String lui_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
                
                String lui_string_binary = lui_op_binary + lui_rs_binary + lui_rt_binary +lui_immediate_binary;
                int lui_binary = Integer.valueOf(lui_string_binary);
                binary_list.add(lui_binary);

            }
            if(tals.tmp.instruction_id==10){//ori //I-type
                    
               String ori_op_binary = Integer.toBinaryString(13);
               String ori_rs_binary = Integer.toBinaryString(tals_tmp.rs);
               String ori_rt_binary = Integer.toBinaryString(tals_tmp.rt);
               String ori_immediate_binary = Integer.toBinaryString(tals_tmp.immediate);
               String ori_string_binary = ori_op_binary + ori_rs_binary + ori_rt_binary +ori_immediate_binary;
               int ori_binary = Integer.valueOf(ori_string_binary);
               binary_list.add(ori_binary);


            }*/
            
           
        }
        return null;
    }
}
