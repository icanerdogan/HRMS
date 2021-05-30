package com.icanerdogan.HRMS.api;

import com.icanerdogan.HRMS.business.abstracts.PositionService;
import com.icanerdogan.HRMS.core.utilities.results.Result;
import com.icanerdogan.HRMS.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions") //Kullanıcın pozisyonları görmesi için gitmesi gereken sekme
public class PositionsController {
    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/allpositions")
    public List<Position> getAll()
    {
        return this.positionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Position position){
        return positionService.addPosition(position);
    }
}