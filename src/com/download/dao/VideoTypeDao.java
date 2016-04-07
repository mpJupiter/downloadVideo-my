package com.download.dao;

import java.util.*;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.download.model.VideoType;

@Service @Transactional
public class VideoTypeDao {
      @Resource SessionFactory factory;
      public void addVideotype(VideoType videotype) throws Exception{
    	  Session s=factory.getCurrentSession();
    	  s.save(videotype);
      }
      public void deleteVideotype(String videoTypeId)throws Exception{
    	  Session s=factory.getCurrentSession();
    	  Object videotype=s.load(VideoType.class, videoTypeId);
    	  s.delete(videotype);
      }
      public void updateVideotype(VideoType videotype) throws Exception{
    	  Session s=factory.getCurrentSession();
    	  s.update(videotype);
      }
      public ArrayList<VideoType> QueryAllVideotype(){
    	  Session s=factory.getCurrentSession();
    	  String hql="From Videotype";
    	  Query q=s.createQuery(hql);
    	  List videotypeList=q.list();
    	  return(ArrayList<VideoType>) videotypeList;
      }
      public VideoType GetVideotypeByVideoTypeId(String vnum){
    	  Session s=factory.getCurrentSession();
    	  VideoType videotype=(VideoType)s.get(VideoType.class, vnum);
    	  return videotype;
      }
      public ArrayList<VideoType> QueryVideotype(String videoTypeName){
    	  Session s=factory.getCurrentSession();
    	  String hql="From Videotype videotype where 1=1";
    	  if(!videoTypeName.equals("")) hql=hql+"and videotype.videoTypeName like '%"+videoTypeName+"%'";
    	  Query q=s.createQuery(hql);
    	  List videotypeList=q.list();
    	  return(ArrayList<VideoType>) videotypeList;
      }
}
