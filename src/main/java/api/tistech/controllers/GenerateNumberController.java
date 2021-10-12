/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.tistech.controllers;

import api.tistech.services.GenerateNumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fernando Muto
 */
@RestController
@Api
@RequestMapping("math")
public class GenerateNumberController {
    
     GenerateNumberService gnumbService = new GenerateNumberService();
    
    @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna o número c"),
		        @ApiResponse(code = 404, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
    @RequestMapping(value = "/number-c", method = RequestMethod.GET, produces="application/json")
    public String createNumberC(@RequestParam("firstNumber")int firstNumber,@RequestParam("secondNumber") int secondNumber){
         
        String finalNumberC = ""+gnumbService.createNumberC(firstNumber, secondNumber); 
        
        return "{\"numberC\": "+finalNumberC+"}"; 
    
    }
    
}
