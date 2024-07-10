package dio.apisantander1.domain.service;

import dio.apisantander1.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);


}
