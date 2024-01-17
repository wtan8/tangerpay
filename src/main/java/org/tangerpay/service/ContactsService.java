package org.tangerpay.service;

import org.tangerpay.domain.ContactDetails;
import org.tangerpay.dto.ContactsDto;
import org.tangerpay.dto.ContactsForm;


public interface ContactsService {

    public ContactsDto createContact(ContactsForm conForm);

    public ContactsDto getContactDetails(Long id);

}