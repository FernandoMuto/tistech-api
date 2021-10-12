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
public class GenerateNumberServiceTest {
    
      GenerateNumberService gnumbService = new GenerateNumberService();
      
      @Test
      public void createNumberCText(){
          assertEquals(1124, gnumbService.createNumberC(12, 14));
          assertEquals(124056, gnumbService.createNumberC(1456, 20));
          assertEquals(233212, gnumbService.createNumberC(2312, 32));
          assertEquals(58696, gnumbService.createNumberC(56, 896));
          assertEquals(-1, gnumbService.createNumberC(5433, 125));
      }
    
}
