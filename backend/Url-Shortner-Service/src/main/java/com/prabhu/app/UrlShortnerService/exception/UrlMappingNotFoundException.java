package com.prabhu.app.UrlShortnerService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UrlMappingNotFoundException extends RuntimeException {

    public UrlMappingNotFoundException(String shortUrl) {
        super("URL mapping not found for short URL: " + shortUrl);
    }
}
