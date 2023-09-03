package com.josepillado.arquitecturasmodernas.hexagonal.port.in.notification;

import com.josepillado.arquitecturasmodernas.hexagonal.application.dto.HumidityDTO;

public interface InNotificationPort {

  void handleHumidityNotification(HumidityDTO humidity);
}
