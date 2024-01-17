package org.tangerpay.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class ContactDetails {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phoneNum;

    public ContactDetails(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Contact Details [id=" + id + ", name=" + name + ", phoneNum=" + phoneNum  + "]";
    }
}


