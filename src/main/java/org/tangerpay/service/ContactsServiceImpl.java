package org.tangerpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tangerpay.domain.ContactDetails;
import org.tangerpay.dto.ContactsDto;
import org.tangerpay.dto.ContactsForm;
import org.tangerpay.repository.ContactsRepository;

import java.util.List;

@Service
public class ContactsServiceImpl implements ContactsService {
    @Autowired
    public ContactsRepository contactsRepo;

    public ContactsDto createContact(ContactsForm conForm) {
        ContactDetails conDet = new ContactDetails(conForm.getContactName(),conForm.getPhoneNum());
        contactsRepo.save(conDet);
        ContactsDto conDto = new ContactsDto(conDet.getId(),conDet.getName(),conDet.getPhoneNum());
        return conDto;
    }

    public ContactsDto getContactDetails(Long id) {
        ContactDetails det = contactsRepo.findById(id).orElseThrow(RuntimeException::new);
        ContactsDto dto =  new ContactsDto(det.getId(), det.getName(),det.getPhoneNum());
        return dto;
    }
}