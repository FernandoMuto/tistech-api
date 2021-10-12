/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.tistech.services;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author mamboo
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class BinaryTreeServiceTest {
    
     BinaryTreeService btreeService = new BinaryTreeService();
    
    @Test
    public void sumSubsequent(){
        int nodes[] = {20, 10, 8, 11, 25, 21, 30};
        
        if (BinaryTreeService.root == null) {
            for (int i = 0; i < nodes.length; i++) {
                btreeService.insertNode(nodes[i]);
            }
        }
        
        assertEquals(19, btreeService.sumSubsequent(10));
        assertEquals(0, btreeService.sumSubsequent(8));
        assertEquals(105, btreeService.sumSubsequent(20));
        assertEquals(51, btreeService.sumSubsequent(25));

        
    }
    
}
