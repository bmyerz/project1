
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa.cs;

/**
 *
 * @author hyokyung kang
 */
import java.util.LinkedList;
import java.util.*;

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
    int opcode;
    
    public static Stack<Integer> decimaltobinary5(int a) {// change integer to binary number put those numbers in stack.. 
        Stack<Integer> stack = new Stack<Integer>();
        while (a != 0)
        {
        int d = a % 2;
        stack.push(d);
        a /= 2;
        }
        while(st.size()<=5){
         stack.push(0)}
   
        }
        return stack;
    }
    public static Stack<Integer> decimaltobinary6(int a) {// change integer to binary number put those numbers in stack.. 
        Stack<Integer> stack = new Stack<Integer>();
        while (a != 0)
        {
        int d = a % 2;
        stack.push(d);
        a /= 2;
        }
        while(st.size()<=6){
         stack.push(0)}
    }
        return stack;
    }
    

     
      

    public static List<Integer> translate_instructions(List<Instruction> tals) {
        
        List<Integer> binary_list = new LinkedList<Integer>();
        
        for (int i=0; i<tals.size(); i++) {
            Instruction tals_tmp=tals.get(i);
            
            
           
            // check the id is R type or I type. 
            
            
            if(tals_tmp.instruction_id==2||tals_tmp.instruction_id==3||tals_tmp.instruction_id==8){
                // check the Id is R-type
                
                if(tals_tmp.instruction_id==2){
                functnumber=33;
                }
                 if(tals_tmp.instruction_id==3){
                functnumber=37;
                }
                 if(tals_tmp.instruction_id==8){
                functnumber=42;
                }
                
                for(int i=0;i<decimaltobinary6(0).size()){
                 int q=decimaltobinary6(0).pop();
                    Binary_list.add(q);
                    
                }
                for(int i=0;i<decimaltobinary5(tals_tmp.rs).size();i++){
                int q=decimaltobinary5(tals_tmp.rs);
                 Binary_list.add(q);
               
                
                }
                for(int i=0;i<decimaltobinary5(tals_tmp.rt).size();i++){
                int q=decimaltobinary5(tals_tmp.rt).pop();
                 Binary_list.add.(q);            
                }
                for(int i=0;i<decimaltobinary5(tals_tmp.rd).size();i++){
                int q=decimaltobinary5(tals_tmp.rd).pop();
                 Binary_list.add.(q);            
                }
                for(int i=0;i<decimaltobinary5(functnumber).size();i++){
                int q=decimaltobinary5(functnumber).pop();
                 Binary_list.add.(q);            
                }
            }
                                           
                
                
           
           if(tals_tmp.instruction_id==1||tals_tmp.instruction_id==5||tals_tmp.instruction_id==6||tals_tmp.instruction_id==9||tals_tmp.instruction_id==10){
            // put the algorithm for only I-type
            //need op,rs,rt,immediate//
                if(tals_tmp.instruction_id==1){
                opcode=42;}
                if(tals_tmp.instruction_id==5){
                opcode=4;}
                if(tals_tmp.instruction_id==6){
                opcode=5;}
                if(tals_tmp.instruction_id==9){
                opcode=15;}
                if(tals_tmp.instruction_id==10){
                opcode=13;}
                
              for(int i=0;i<decimaltobinary6(opcode).size();i++){
                 int q=decimaltobinary6(opcode).pop();
                    Binary_list.add(q);
                    
                }
               for(int i=0;i<decimaltobinary5(rs).size();i++){
                 int q=decimaltobinary5(rs).pop();
                    Binary_list.add(q);
                    
                }
               
               for(int i=0;i<decimaltobinary5(rt).size();i++){
                 int q=decimaltobinary5(rt).pop();
                    Binary_list.add(q);
                    
                }
               
             
                if(tals_tmp.immediate)<=0){  
                tals_tmp.immediate=tals_tmp.immediate*(-1);
                int b = Integer.parseInt("tals_tmp.immediate",2);
                int a = Integer.parseInt("(2^12-1)",2);             
                int c=a|b;
                  }
                Binary_list.add(c);}          
               }
        return binary_list;
    }
}
