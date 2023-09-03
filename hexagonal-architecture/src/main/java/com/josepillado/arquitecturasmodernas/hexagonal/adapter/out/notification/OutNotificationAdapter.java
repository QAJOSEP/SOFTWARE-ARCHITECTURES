package com.josepillado.arquitecturasmodernas.hexagonal.adapter.out.notification;

import com.josepillado.arquitecturasmodernas.hexagonal.application.dto.TennisMatchDTO;
import com.josepillado.arquitecturasmodernas.hexagonal.port.out.notification.OutNotificationPort;
import org.springframework.stereotype.Service;

@Service
public class OutNotificationAdapter implements OutNotificationPort {

  @Override
  public void notifyMatchResult(TennisMatchDTO result) {
    // Send Message to AWS to notify that a match has ended
  }
}
