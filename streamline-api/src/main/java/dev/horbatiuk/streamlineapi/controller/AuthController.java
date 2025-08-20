package dev.horbatiuk.streamlineapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    /*
     * POST /auth/login — логін користувача, повертає JWT.
     * POST /auth/register — реєстрація нового користувача.
     * POST /auth/verify-email — підтвердження email через SES.
     * POST /auth/refresh-token — отримання нового JWT.
     */

}
