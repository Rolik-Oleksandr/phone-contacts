package phone.contacts.rest.api.service.mapper;

import phone.contacts.rest.api.model.PhoneNumber;
import phone.contacts.rest.api.model.dto.response.PhoneNumberResponseDto;

public class PhoneNumberMapper implements ResponseDtoMapper
        <PhoneNumberResponseDto, PhoneNumber>{
    @Override
    public PhoneNumberResponseDto mapToDto(PhoneNumber phoneNumber) {
        PhoneNumberResponseDto numberResponseDto = new PhoneNumberResponseDto();
        numberResponseDto.setPhoneNumber(phoneNumber.getPhoneNumber());
        numberResponseDto.setContact(phoneNumber.getContact());
        return numberResponseDto;
    }
}
