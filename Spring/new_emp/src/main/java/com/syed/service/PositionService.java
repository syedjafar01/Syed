package com.syed.service;

import com.syed.entities.Position;
import com.syed.pojo.PositionUi;
import com.syed.repository.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

/**
 * Created by syedjafar on 21/12/16.
 */
@Service
public class PositionService {

    @Autowired
    PositionRepo positionRepo;

    public String create(PositionUi p) {

        Position p1 = new Position(p);
        try {
            positionRepo.save(p1);
        }
        catch (Exception e) {
            return "Error creating the user: " + e.toString();
        }
        return "User successfully created! (id = " + p1.getId() + ")";
    }

}
