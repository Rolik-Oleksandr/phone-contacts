package phone.contacts.rest.api.service.mapper;

import phone.contacts.rest.api.model.User;
import org.springframework.stereotype.Component;
import phone.contacts.rest.api.model.dto.response.UserResponseDto;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }
}