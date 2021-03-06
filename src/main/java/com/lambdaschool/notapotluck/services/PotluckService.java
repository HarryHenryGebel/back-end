package com.lambdaschool.notapotluck.services;

import com.lambdaschool.notapotluck.models.Food;
import com.lambdaschool.notapotluck.models.Potluck;
import com.lambdaschool.notapotluck.models.User;

import java.util.List;

public interface PotluckService
{
    List<Potluck> findAll();

    Potluck findPotluckById(long id);

    Potluck save(long userid, Potluck potluck);

    Potluck update(Potluck potluck, long id);

    void delete(long id);

    public void deleteAll();
}
