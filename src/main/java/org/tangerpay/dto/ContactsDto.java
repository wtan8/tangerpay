package org.tangerpay.dto;

import lombok.*;
import org.springframework.stereotype.Component;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Getter
@Setter
public class ContactsDto {
    private Long id;
    private String name;
    private String phoneNum;
}
