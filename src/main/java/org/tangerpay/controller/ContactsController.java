package org.tangerpay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tangerpay.dto.ContactsDto;
import org.tangerpay.dto.ContactsForm;
import org.tangerpay.service.ContactsService;

import java.net.URI;
import java.net.URISyntaxException;

@RequestMapping(path = "/contacts")
@RestController
public class ContactsController {

    @Autowired
    private ContactsService conService;

    @Autowired
    private ContactsDto conDto;

    @CrossOrigin
    @PostMapping("/recordContactDetails")
    public ResponseEntity createContact(@RequestBody ContactsForm form) throws URISyntaxException {
        ContactsDto resp = conService.createContact(form);
        return ResponseEntity.created(new URI("/contacts/" + resp.getId())).body(resp);
    }
    @CrossOrigin
    @GetMapping(path = "/retrieveContactDetails/{id}",  produces = "application/json")
    public ResponseEntity<?> getContactInfo(@PathVariable Long id) {
        ContactsDto details =  conService.getContactDetails(id);
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

}