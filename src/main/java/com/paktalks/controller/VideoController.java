package com.paktalks.controller;

import com.paktalks.entity.Video;
import com.paktalks.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/videos")

public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Video> getAllVideos () {

        System.out.println("get All Videos called");
        return videoService.getAllVideos();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Video getVideoById (@PathVariable("id") int id) {

            System.out.println("VideoController: getVideoById called, ID IS "+id);

        return this.videoService.getVideoById(id);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteVideoById(@PathVariable("id") int id){
        videoService.removeVideoById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateVideoBy(@RequestBody Video video){
        videoService.updateVideo(video);
    }

}
