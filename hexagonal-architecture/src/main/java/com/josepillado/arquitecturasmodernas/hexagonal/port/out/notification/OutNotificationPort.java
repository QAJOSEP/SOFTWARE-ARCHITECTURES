package com.josepillado.arquitecturasmodernas.hexagonal.port.out.notification;

import com.josepillado.arquitecturasmodernas.hexagonal.application.dto.TennisMatchDTO;

public interface OutNotificationPort {

  void notifyMatchResult(TennisMatchDTO result);
}
