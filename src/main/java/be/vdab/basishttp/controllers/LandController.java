package be.vdab.basishttp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LandController {
    @GetMapping("land")
    String onsLand() {
        return "België";
    }
}
