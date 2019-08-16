package com.company.project.model;

import javax.persistence.*;

public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 配置名称
     */
    private String name;

    /**
     * 内容部分，可以是任何文本内容
     */
    private String content;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取配置名称
     *
     * @return name - 配置名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置配置名称
     *
     * @param name 配置名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取内容部分，可以是任何文本内容
     *
     * @return content - 内容部分，可以是任何文本内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容部分，可以是任何文本内容
     *
     * @param content 内容部分，可以是任何文本内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}