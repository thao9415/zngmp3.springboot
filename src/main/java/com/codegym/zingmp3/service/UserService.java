package com.codegym.zingmp3.service;

import com.codegym.zingmp3.dto.UserDto;
import com.codegym.zingmp3.model.User;
import com.codegym.zingmp3.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    public List<UserDto> getAll() {
        List<UserDto> listOutput = new ArrayList<>();

        List<User> listUser = userRepo.findAll();

        for (User item: listUser){
            UserDto usrDto = new UserDto();
            usrDto.copy(item);
            listOutput.add(usrDto);
        }
        return  listOutput;
    }
}
