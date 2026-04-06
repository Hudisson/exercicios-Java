package com.hudisson.exercise.poo.TwoSum;

import java.util.ArrayList;

public class TwoSumSolver {
    
    // Atributos
    private Integer target;
    private ArrayList<Integer> nums = new ArrayList<>();

    // Construtor
    public TwoSumSolver(Integer target, ArrayList<Integer> nums) {
        this.target = target;
        this.nums = nums;
    }

    public ArrayList<Integer> solve() {
        ArrayList<Integer> resultado = new ArrayList<>();
        for(int i =0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) == target){
                    resultado.add(nums.get(i));
                    resultado.add(nums.get(j));
                    return resultado;
                }
            }
        }
        return resultado;
    }
}
