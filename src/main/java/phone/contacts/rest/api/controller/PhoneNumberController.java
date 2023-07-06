package phone.contacts.rest.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phone.contacts.rest.api.model.PhoneNumber;
import phone.contacts.rest.api.model.dto.response.PhoneNumberResponseDto;
import phone.contacts.rest.api.service.PhoneNumberService;
import phone.contacts.rest.api.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/phone-numbers")
public class PhoneNumberController {
    private final PhoneNumberService phoneNumberService;
    private final ResponseDtoMapper<PhoneNumberResponseDto, PhoneNumber> responseDtoMapper;

    public PhoneNumberController(PhoneNumberService phoneNumberService,
                                 ResponseDtoMapper<PhoneNumberResponseDto,
                                         PhoneNumber> responseDtoMapper) {
        this.phoneNumberService = phoneNumberService;
        this.responseDtoMapper = responseDtoMapper;
    }
}
