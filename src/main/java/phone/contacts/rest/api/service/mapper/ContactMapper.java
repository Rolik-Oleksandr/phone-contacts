package phone.contacts.rest.api.service.mapper;

import org.springframework.stereotype.Component;
import phone.contacts.rest.api.model.Contact;
import phone.contacts.rest.api.model.dto.response.ContactResponseDto;

@Component
public class ContactMapper implements ResponseDtoMapper<ContactResponseDto, Contact>  {
    @Override
    public ContactResponseDto mapToDto(Contact contact) {
        ContactResponseDto responseDto = new ContactResponseDto();
        responseDto.setName(contact.getName());
        responseDto.setEmail(contact.getEmail());
        return responseDto;
    }
}
