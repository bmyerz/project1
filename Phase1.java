/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa.cs;

/**
 *
 * @author gyeonghyeko, Hyokyung Kang
 */
import java.util.LinkedList;
import java.util.List;

public class Phase1{
    
    
    ///Q:how to run in Netbean?
    public static List<Instruction> mal_to_tal(List<Instruction> mals) {
        
        List<Instruction> tals = new LinkedList<Instruction>();
        
        for (int i=0; i<mals.size(); i++) {
            Instruction mals_element = mals.get(i);
            
            
            //addiu
            if (mals_element.instruction_id == 1) {
                
                //addiu to TAL
                if (mals_element.immediate>Math.pow(2,15)-1 && mals_element.immediate<-Math.pow(2, 15)) {
                    
                    //lui
                    Instruction addiu_lui = mals_element.copy();
                    addiu_lui.instruction_id = 9;
                    addiu_lui.rs = 0;
                    addiu_lui.rt = 1;
                    
                    //split binary
                    String imm_to_string = Integer.toString(addiu_lui.immediate);
                    int decimal = Integer.parseInt(imm_to_string, 16);
                    String binary_string = Integer.toBinaryString(decimal);
                    
                    StringBuilder upper_sb = new StringBuilder();
                    StringBuilder lower_sb = new StringBuilder();
                    
                    for (int j=0; j<binary_string.length()-1; j++) {
                        
                        if (j<binary_string.length()/2-1){
                            char c = binary_string.charAt(j);
                            String s = Character.toString(c);
                            upper_sb.append(s);
                        }
                        
                        else {
                            char c = binary_string.charAt(j);
                            String s = Character.toString(c);
                            lower_sb.append(s);
                        }
                    }
                    
                    String upper_str = upper_sb.toString();
                    String lower_str = lower_sb.toString();
                    int upper_binary = Integer.valueOf(upper_str);
                    int lower_binary = Integer.valueOf(lower_str);
                    
                    addiu_lui.immediate = upper_binary;
                    tals.add(addiu_lui);
                
                    //ori
                    Instruction addiu_ori = mals_element.copy();
                    addiu_ori.instruction_id = 10;
                    addiu_ori.rs = 1;
                    addiu_ori.rt = 1;
                    addiu_lui.immediate = lower_binary;
                    tals.add(addiu_ori); 
                    
                    //addu
                    Instruction addiu_addu = mals_element.copy();
                    addiu_addu.instruction_id = 2;
                    addiu_addu.rd = addiu_addu.rt;
                    addiu_addu.rt = 1;
                    tals.add(addiu_addu);
                }
                
                //addiu already in TAL format
                else {
                    tals.add(mals_element.copy());
                }
            }
            
            //addu
            if (mals_element.instruction_id == 2) {
                tals.add(mals_element.copy());
            }
            
            //or
            if (mals_element.instruction_id == 3) {
                tals.add(mals_element.copy());
            }
            
            //beq
            if (mals_element.instruction_id == 5) {
                tals.add(mals_element.copy());
            }
            
            //bne
            if (mals_element.instruction_id == 6) {
                tals.add(mals_element.copy());
            }
            
            //slt
            if (mals_element.instruction_id == 8) {
                tals.add(mals_element.copy());
            }
            
            //lui
            if (mals_element.instruction_id == 9) {
                tals.add(mals_element.copy());
            }
            
            //ori
            if (mals_element.instruction_id == 10) {
                
                //ori to TAL
                if (mals_element.immediate>Math.pow(2,15)-1 && mals_element.immediate<-Math.pow(2, 15)) {
                    
                    //lui
                    Instruction ori_lui = mals_element.copy();
                    ori_lui.instruction_id = 9;
                    ori_lui.rs = 0;
                    ori_lui.rt = 1;
                    
                    String imm_to_string = Integer.toString(ori_lui.immediate);
                    int decimal = Integer.parseInt(imm_to_string, 16);
                    String binary_string = Integer.toBinaryString(decimal);
                    
                    StringBuilder upper_sb = new StringBuilder();
                    StringBuilder lower_sb = new StringBuilder();
                    
                    for (int j=0; j<binary_string.length()-1; j++) {
                        
                        if (j<binary_string.length()/2-1){
                            char c = binary_string.charAt(j);
                            String s = Character.toString(c);
                            upper_sb.append(s);
                        }
                        
                        else {
                            char c = binary_string.charAt(j);
                            String s = Character.toString(c);
                            lower_sb.append(s);
                        }
                    }
                    
                    String upper_str = upper_sb.toString();
                    String lower_str = lower_sb.toString();
                    int upper_binary = Integer.valueOf(upper_str);
                    int lower_binary = Integer.valueOf(lower_str);
                    
                    ori_lui.immediate = upper_binary;
                    tals.add(ori_lui);
                
                    //ori
                    Instruction ori_ori = mals_element.copy();
                    ori_ori.instruction_id = 10;
                    ori_ori.rs = 1;
                    ori_ori.rt = 1;
                    ori_ori.immediate = lower_binary;
                    tals.add(ori_ori); 
                    
                    //or
                    Instruction ori_addu = mals_element.copy();
                    ori_addu.instruction_id = 3;
                    ori_addu.rd = ori_addu.rt;
                    ori_addu.rt = 1;
                    tals.add(ori_addu);
                }
                
                //ori is already in TAL format
                else {
                    tals.add(mals_element.copy());
                }
            }
           
            //blt
            if(mals_element.instruction_id == 100) {
                
                //blt to TAL
                //slt
                Instruction blt_slt = mals_element.copy();
                blt_slt.instruction_id = 8;
                blt_slt.rd = 1;
                blt_slt.branch_label = 0;
                tals.add(blt_slt);
                
                //bne
                Instruction blt_bne = mals_element.copy();
                blt_bne.instruction_id = 6;
                blt_bne.rs = 1;
                blt_bne.rt = 0;
                tals.add(blt_bne);
            }
            
            //bge
            if (mals_element.instruction_id == 101) {
                
                //bge to TAL
                //slt
                Instruction bge_slt = mals_element.copy();
                bge_slt.instruction_id = 8;
                bge_slt.rd = 1;
                bge_slt.rs = bge_slt.rt;
                bge_slt.rt = mals_element.rs;
                bge_slt.branch_label = 0;
                tals.add(bge_slt);
                
                //beq
                Instruction bge_beq = mals_element.copy();
                bge_beq.instruction_id = 5;
                bge_beq.rs = 1;
                bge_beq.rt = 0;
                tals.add(bge_slt);
            }
            
        }
        return tals;    
    }
}
