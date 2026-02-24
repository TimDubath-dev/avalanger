package ch.zhaw.avalanger.controller;

import ch.zhaw.avalanger.model.Avalange;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/avalange")
public class AvalangeController {

    @GetMapping({"/{country}"})
    public String getAllAvalange(@PathVariable Optional<String> country, @RequestParam(required = false) String state) {
        if (country.isPresent()) {
            return "No avalange found with country: " + country.get() + " and state: " + state;
        } else {
            return "No avalange found " + country.get() + " and state: " + state;
        }
    }

    @PostMapping("")
    public String createAvalange(@RequestBody Avalange avalange) {
        return "Avalange created: " + avalange.getCountry() + ", " + avalange.getState() + ", " + avalange.getDescription();
    }
}


