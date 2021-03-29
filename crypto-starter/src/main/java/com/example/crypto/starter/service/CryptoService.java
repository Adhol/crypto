package com.example.crypto.starter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoService {

    private static final String URL = "https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=RUB";

    private final RestTemplate restTemplate;

    public CryptoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getBtcPriceInRub() {
        return restTemplate.getForObject(URL, String.class);
    }
}
