package com.paktalks.service;

import com.paktalks.dao.VideoDao;
import com.paktalks.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VideoService {

    @Autowired
    private VideoDao videoDao;

    public Collection<Video> getAllVideos () {
        return videoDao.getAllVideos();
    }

}