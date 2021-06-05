package com.muxi.sample.mybatis.entity;

import java.io.Serializable;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 **/
public class QuestionDO implements Serializable {

    private static final long serialVersionUID = -5806355517348943929L;

    private Long id;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "QuestionDO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
