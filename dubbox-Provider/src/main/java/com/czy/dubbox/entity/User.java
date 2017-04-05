package com.czy.dubbox.entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

import static javax.swing.text.StyleConstants.Size;


/**
 * @auther     陈郑游
 * @create     2017/4/5 0005
 * @功能       implements Serializable
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@XmlRootElement
public class User{

    @NotNull
    private String id;

    @JsonProperty("name")	//{name:"张三"}
    //@XmlElement(name = "name") //<name>张三</name>
    @NotNull
    @Size(min = 6, max = 50)
    private String name;

	public User() {
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
