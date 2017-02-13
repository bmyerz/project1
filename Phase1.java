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

public class Phase1{

    
    public static List<Instruction> mal_to_tal(List<Instruction> mals) {
        
        List<Instruction> tals = new LinkedList<Instruction>();
        
        for (int i=0; i<mals.size();i++) {
            
            //when opcode is 2(addu)
            if (mals.get(0)==Instruction.valueOf(2)) {
                return mals;
            }
            
            //when opcode is 100(blt)
            if (mals.get(0)==Instruction.valueOf(100))
                return tals.addAll(8,1,16,8,0,0,0,0,0,6,0,1,0,0,0,0,0,3);
        }

    }
}

//Question: how to treat Instruction type as Inter?
