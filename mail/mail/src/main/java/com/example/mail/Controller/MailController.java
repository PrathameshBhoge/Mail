package com.example.mail.Controller;

import com.example.mail.Model.MailStructure;
import com.example.mail.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {
   @Autowired
   MailService mailService;


    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
          mailService.sendMail(mail,mailStructure);
          return "Successful";
    }
}
