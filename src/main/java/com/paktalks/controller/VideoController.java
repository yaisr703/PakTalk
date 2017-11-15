package com.paktalks.controller;

import com.paktalks.entity.Video;
import com.paktalks.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/videos")

public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Video> getAllVideos () {
        return videoService.getAllVideos();
    }
}
