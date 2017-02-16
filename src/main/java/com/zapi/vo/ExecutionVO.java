package com.zapi.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExecutionVO
{
	@XmlElement(nillable=true)
    public Integer id;

    @XmlElement(nillable=true)
    public String executionStatus;

    @XmlElement(nillable=true)
    public String comment;

    @XmlElement(nillable=true)
    public String htmlComment;

    @XmlElement(nillable=true)
    public Integer cycleId;

    @XmlElement(nillable=true)
    public String cycleName;

    @XmlElement(nillable=true)
    public String versionId;

    @XmlElement(nillable=true)
    public String versionName;

    @XmlElement(nillable=true)
    public String projectId;

    @XmlElement(nillable=true)
    public String issueId;

    @XmlElement(nillable=true)
    public String issueKey;

    @XmlElement(nillable=true)
    public String summary;

    @XmlElement(nillable=true)
    public String label;

    @XmlElement(nillable=true)
    public String component;

    public ExecutionVO(String executionStatus, Integer cycleId, String projectId, String versionId, String issueId, String comment) {
        this.executionStatus = executionStatus;
        this.cycleId = cycleId;
        this.projectId = projectId;
        this.versionId = versionId;
        this.issueId = issueId;
        this.comment = comment;
    }

	public ExecutionVO() {
		super();
	}




}
