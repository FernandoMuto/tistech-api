/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.tistech.controllers;

import api.tistech.services.BinaryTreeService;
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
@RequestMapping("binary-tree")
public class BinaryTreeControllers {

    BinaryTreeService btreeHelper = new BinaryTreeService();

    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna o número c")
        ,
		        @ApiResponse(code = 404, message = "Você não tem permissão para acessar este recurso")
        ,
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),})
    @RequestMapping(value = "/sum-subsequent", method = RequestMethod.GET, produces = "application/json")
    public String sumSubsequent(@RequestParam("node") int node) {

        int nodes[] = {20, 10, 8, 11, 25, 21, 30}; // Valores estáticos somente para teste
        
        if (BinaryTreeService.root == null) {
            for (int i = 0; i < nodes.length; i++) {
                btreeHelper.insertNode(nodes[i]);
            }
        }

        int sumSubsequent = btreeHelper.sumSubsequent(node);

        return "{\"sum_subsequent\": " + sumSubsequent + "}";

    }

}
