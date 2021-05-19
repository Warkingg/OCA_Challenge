package com.example.quizzapp.services.role;

import com.example.quizzapp.model.Role;
import com.example.quizzapp.services.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}
