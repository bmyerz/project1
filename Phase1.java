package edu.uiowa.cs;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Phase1 extends Instruction {

    /* Translates the MAL instruction to 1-3 TAL instructions
     * and returns the TAL instructions in a list
     *
     * mals: input program as a list of Instruction objects
     *
     * returns a list of TAL instructions (should be same size or longer than input list)
     */

    public Phase1(int instruction_id, int rd, int rs, int rt, int immediate, int jump_address, int shift_amount, int label_id, int branch_label){
    super(instruction_id, rd, rs, rt, immediate, jump_address, shift_amount, label_id, branch_label);
    }


    public static List<Instruction> mal_to_tal(List<Instruction> mals) {

        List arr1 = new ArrayList();
        arr1.add(instruction_id);
        arr1.add(rd);
        arr1.add(rs);
        arr1.add(rt);
        arr1.add(immediate);
        arr1.add(jump_address);
        arr1.add(shift_amount);
        arr1.add(label_id);
        arr1.add(branch_label);

        return arr1;

    }
}
