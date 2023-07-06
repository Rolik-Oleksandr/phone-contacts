package phone.contacts.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import phone.contacts.rest.api.model.Contact;
import phone.contacts.rest.api.model.dto.response.ContactResponseDto;
import phone.contacts.rest.api.service.ContactService;
import phone.contacts.rest.api.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;
    private final ResponseDtoMapper<ContactResponseDto, Contact> contactResponseDtoMapper;

    public ContactController(ContactService contactService,
                             ResponseDtoMapper<ContactResponseDto, Contact> contactResponseDtoMapper) {
        this.contactService = contactService;
        this.contactResponseDtoMapper = contactResponseDtoMapper;
    }

    @GetMapping("contact-by-email")
    public ContactResponseDto findByEmail(@RequestParam String email) {
        Contact contact = contactService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Contact with email " + email + " not found"));
        return contactResponseDtoMapper.mapToDto(contact);
    }
}
