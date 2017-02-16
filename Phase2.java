package edu.uiowa.cs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Phase2 {

    /* Returns a list of copies of the Instructions with the
     * immediate field of the instruction filled in
     * with the address calculated from the branch_label.
     *
     * The instruction should not be changed if it is not a branch instruction.
     *
     * unresolved: list of instructions without resolved addresses
     * first_pc: address where the first instruction will eventually be placed in memory
     */
    int instructionaddress=0;
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    public static List<Instruction> resolve_addresses(List<Instruction> unresolved, int first_pc) {
        instructionaddress=first_pc;
        for(int i=0; i<unresolved.size()){
            hmap.put(unresolved.get(i).instruction_id,instructionaddress+4(i-1));
        }
        return unresolved;
    }

}
