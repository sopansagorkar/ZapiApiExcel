package com.zapi.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

	public class StatusVO
	{
		@XmlElement(nillable=true)
	    public String id;

	    @XmlElement(nillable=true)
	    public String color;

	    @XmlElement(nillable=true)
	    public String description;

	    @XmlElement(nillable=true)
	    public String name;

	    public String type;
	}
