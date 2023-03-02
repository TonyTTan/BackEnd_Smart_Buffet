package com.tony.smart_buffet.controller;

import com.tony.smart_buffet.pojo.History;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;
import com.tony.smart_buffet.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/history/{cId}")
    public List<String> selectOneByIdHistory(@PathVariable("cId") String cId) {
        return historyService.selectOneByIdHistory(cId);
    }

    @PostMapping("/history")
    public ResponseResult insertHistory(@RequestBody History history) {
        return historyService.insertHistory(history);
    }

}
