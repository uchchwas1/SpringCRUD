package org.example.springcrud.controller;

import org.example.springcrud.entity.NoteSharingTable;
import org.example.springcrud.service.NoteSharingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteSharingController {
    @Autowired
    NoteSharingService noteSharingService;

    @PostMapping("/create")
    public String create(@RequestBody NoteSharingTable noteSharingTable){
        noteSharingService.create(noteSharingTable);
        return "success";
    }

    @PutMapping ("/update")
    public String update(@RequestBody NoteSharingTable noteSharingTable){
        noteSharingService.update(noteSharingTable);

        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        noteSharingService.delete(id);

        return "success";
    }

    @GetMapping("/find/{id}")
    public NoteSharingTable findById(@PathVariable Long id){
        return noteSharingService.findById(id);
    }


}
