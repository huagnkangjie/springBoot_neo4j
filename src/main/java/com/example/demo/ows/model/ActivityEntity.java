package com.example.demo.ows.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author huang_kangjie
 * @date 2019-09-16 17:15
 * @since 3.0.0
 **/
@Data
@NodeEntity
public class ActivityEntity {

     @Id
     @GeneratedValue
     private Long id;

     /**
      * 活动名称
      */
     private String name;

}
