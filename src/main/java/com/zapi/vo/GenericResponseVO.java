package com.zapi.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericResponseVO
{
	@XmlElement
    public Long id;
    @XmlElement
    public String responseMessage;

    public GenericResponseVO()
    {

    }

    public Long getId() 
    {
    	return id;
    }
}
