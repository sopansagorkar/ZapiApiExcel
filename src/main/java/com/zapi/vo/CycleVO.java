package com.zapi.vo;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CycleVO 
{
	@XmlElement(nillable=true)
    public String id;

    @XmlElement(nillable=true)
    public String clonedCycleId;

    @XmlElement(nillable=false)
    public String name;

    @XmlElement(nillable=true)
    public String build;

    @XmlElement(nillable=true)
    public String description;

    @XmlElement(nillable=true)
    public String environment;

    @XmlElement(nillable=true)
    public String versionId;

    @XmlElement(nillable=true)
    public String projectId;

    @XmlElement(nillable=true)
    public String startDate;

    @XmlElement(nillable=true)
    public String endDate;
    
	public CycleVO(String id, String clonedCycleId, String name, String build,
			String description, String environment, String versionId,
			String projectId, String startDate, String endDate) {
		super();
		this.id = id;
		this.clonedCycleId = clonedCycleId;
		this.name = name;
		this.build = build;
		this.description = description;
		this.environment = environment;
		this.versionId = versionId;
		this.projectId = projectId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public CycleVO() 
	{
		
	}

}
