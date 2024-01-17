package org.tangerpay.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Getter
@Setter
public class ContactsForm {
    private String contactName;
    private String phoneNum;
}

