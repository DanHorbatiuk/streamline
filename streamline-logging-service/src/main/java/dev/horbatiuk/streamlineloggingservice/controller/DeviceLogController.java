package dev.horbatiuk.streamlineloggingservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class DeviceLogController {

    /*
     * POST /logs — надсилання логів від пристроїв (може бути асинхронно через Kafka).
     * GET /logs — отримати всі логи користувача.
     * GET /logs/{deviceId} — отримати логи конкретного пристрою.
     * GET /logs?from=&to=&level= — фільтрація логів за датою, рівнем критичності тощо.
     */

}
