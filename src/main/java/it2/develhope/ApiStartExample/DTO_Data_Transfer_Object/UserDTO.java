package it2.develhope.ApiStartExample.DTO_Data_Transfer_Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    //@NotBlank(message = "Mandatory") lo utilizziamo per la validazione
    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String name;
    @NotBlank(message = "Mandatory")
    private String surname;
}
