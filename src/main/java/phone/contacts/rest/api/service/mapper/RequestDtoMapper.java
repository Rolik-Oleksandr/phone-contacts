package phone.contacts.rest.api.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}