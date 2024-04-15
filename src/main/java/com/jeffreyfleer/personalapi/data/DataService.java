package com.jeffreyfleer.personalapi.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DataService {

    public List<String> home() {
        return List.of("a", "b", "z");
    }
}
