package com.example.sbmpsqlite.contoller;

import com.example.sbmpsqlite.entity.TrainMovement;
import com.example.sbmpsqlite.service.TrainMovementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping(path = "/trainmovement")
public class TrainMovementController {
    @Resource
    private TrainMovementService trainMovementService;

    @GetMapping("/submitTrainMovement")
    public void submitTrainMovement(@RequestParam String uid, String mname, Integer mset, Integer mweight, String mfeeling, String mtype){
        TrainMovement trainMovement = new TrainMovement();
        trainMovement.setUserId(uid);
        trainMovement.setMovementName(mname);
        trainMovement.setMovementSets(mset);
        trainMovement.setMovementWeight(mweight);
        trainMovement.setMovementFeeling(mfeeling);
        trainMovement.setMovementType(mtype);
        trainMovementService.save(trainMovement);
    }

}
