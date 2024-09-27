package com.prog.trovaIntermedio;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class trovaIntermedioController {
    
    @GetMapping("/calcolaIntermedio")
    public String getMethodName(@RequestParam Integer numA, @RequestParam Integer numB, @RequestParam Integer numC) {
        if (numA > numB) {
            if (numA < numC) {
                return numA.toString();
            } else {
                if (numC > numB) {
                    return numC.toString();
                } else {
                    return numB.toString();
                }
            }
        } else {
            if (numB < numC) {
                return numB.toString();
            } else {
                if (numC > numA) {
                    return numC.toString();
                } else {
                    return numA.toString();
                }
            }
        }
    }
    

}
