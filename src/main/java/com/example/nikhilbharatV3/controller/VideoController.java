package com.example.nikhilbharatV3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


//import reactor.core.publisher.Mono;


@RestController
public class VideoController {
	
    @Autowired
    private com.example.nikhilbharatV3.service.StreamingService service;


//    @GetMapping(value = "videos/{title}", produces = "video/mp4")
//    public Mono<Resource> getVideos(@PathVariable String title, @RequestHeader("Range") String range) {
//        System.out.println("range in bytes() : " + range);
//        return service.getVideo(title);
//    }

}
