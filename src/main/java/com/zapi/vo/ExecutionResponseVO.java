package com.zapi.vo;

import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
	public class ExecutionResponseVO 
	{
		  public Map<String, StatusVO> status;
		  public List<ExecutionVO> executions;
		  public Integer recordsCount;
	}
