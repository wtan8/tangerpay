package org.tangerpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tangerpay.domain.ContactDetails;

@Repository
public interface ContactsRepository extends JpaRepository<ContactDetails, Long> {
}
