package com.download.model;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Video entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_video"
    ,catalog="downloadvideo"
)

public class Video  implements java.io.Serializable {


    // Fields    

     private Integer videoId;
     private VideoType videotype;
     private String videoName;
     private String introduce;
     private String director;
     private String pubishData;
     private String cast;
     private String picture;
     private String path;


    // Constructors

    /** default constructor */
    public Video() {
    }

	/** minimal constructor */
    public Video(Integer videoId) {
        this.videoId = videoId;
    }
    
    /** full constructor */
    public Video(Integer videoId, VideoType videotype, String videoName, String introduce, String director, String pubishData, String cast, String picture, String path) {
        this.videoId = videoId;
        this.videotype = videotype;
        this.videoName = videoName;
        this.introduce = introduce;
        this.director = director;
        this.pubishData = pubishData;
        this.cast = cast;
        this.picture = picture;
        this.path = path;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="videoId", unique=true, nullable=false)

    public Integer getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="videoType")

    public VideoType getVideotype() {
        return this.videotype;
    }
    
    public void setVideotype(VideoType videotype) {
        this.videotype = videotype;
    }
    
    @Column(name="videoName", length=11)

    public String getVideoName() {
        return this.videoName;
    }
    
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
    
    @Column(name="introduce", length=50)

    public String getIntroduce() {
        return this.introduce;
    }
    
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
    
    @Column(name="director", length=11)

    public String getDirector() {
        return this.director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    @Column(name="pubishData", length=11)

    public String getPubishData() {
        return this.pubishData;
    }
    
    public void setPubishData(String pubishData) {
        this.pubishData = pubishData;
    }
    
    @Column(name="cast", length=11)

    public String getCast() {
        return this.cast;
    }
    
    public void setCast(String cast) {
        this.cast = cast;
    }
    
    @Column(name="picture", length=30)

    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    @Column(name="path", length=20)

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
   








}