package com.josepillado.arquitecturasmodernas.eventdrivenprogramming.functions.controller;

import com.josepillado.arquitecturasmodernas.eventdrivenprogramming.functions.model.Transfer;
import com.josepillado.arquitecturasmodernas.eventdrivenprogramming.functions.service.AlertService;
import com.josepillado.arquitecturasmodernas.eventdrivenprogramming.functions.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  @Autowired
  private TransferService transferService;

  @Autowired
  private AlertService alertService;

  @PostMapping("/transfer")
  public void addTransfer(@RequestBody Transfer transfer) {
    transferService.executeTransfer(transfer);
    alertService.sendAlertIfNeeded(transfer);
  }
}
