package com.paktalks.dao;

import com.paktalks.entity.Video;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class VideoDao {

    private static Map<Integer, Video> videos;

    static {
        videos = new HashMap<Integer, Video>(){
            {
                put(new Integer(1), new Video("1", "Title1", "Type1", "HostSource1","URL1"));
                put(2, new Video("2", "Title2", "Type2", "HostSource2","URL2"));
                put(3, new Video("3", "Title3", "Type3", "HostSource3","URL3"));
                put(4, new Video("4", "Title4", "Type4", "HostSource4","URL4"));
            }
        };
    }

    public Collection<Video> getAllVideos () {
        return this.videos.values();
    }

    public Video getVideoById (int id) {
        System.out.println("VideoDao: getVideoById called, ID IS "+id);
        System.out.println("VideoDao: getVideoById called, result IS "+this.videos.get(id));
        return this.videos.get(id);
    }

    public void removeVideoById(int id) {
        this.videos.remove(id);
    }
}
