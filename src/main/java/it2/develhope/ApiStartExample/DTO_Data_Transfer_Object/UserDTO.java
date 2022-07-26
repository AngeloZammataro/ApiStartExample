package it2.develhope.ApiStartExample.DTO_Data_Transfer_Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotBlank(message = "Mandatory") lo utilizziamo per la validazione
    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String name;
    @NotBlank(message = "Mandatory")
    private String surname;
}
