package com.zapi.config;

import java.net.URI;

	public class Configuration{
		   	private String baseUrl;
		    private URI zapiUrl;
		    private URI jiraUrl;
		    private String userName;
		    private String password;
		    private int cyclePolicy;
			private String projectId;
		    private String versionId;
		    
		    public Configuration() {
				super();
			}
		    
		    public Configuration(String url, String userName, String password, int cyclePolicy, String projectId, String versionId) {
		        this.baseUrl = url;
		        this.zapiUrl = URI.create(url+"rest/zapi/latest");
		        this.jiraUrl = URI.create(url+"rest/zapi/latest");
		        this.userName = userName;
		        this.password = password;
		        this.cyclePolicy = cyclePolicy;
		        this.projectId = projectId;
		        this.versionId = versionId;
		    }
		    public String getBaseUrl() {
				return baseUrl;
			}
			public void setBaseUrl(String baseUrl) {
				this.baseUrl = baseUrl;
			}
			public URI getZapiUrl() {
				return zapiUrl;
			}
			public void setZapiUrl(URI zapiUrl) {
				this.zapiUrl = zapiUrl;
			}
			public URI getJiraUrl() {
				return jiraUrl;
			}
			public void setJiraUrl(URI jiraUrl) {
				this.jiraUrl = jiraUrl;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public int getCyclePolicy() {
				return cyclePolicy;
			}
			public void setCyclePolicy(int cyclePolicy) {
				this.cyclePolicy = cyclePolicy;
			}
			public String getProjectId() {
				return projectId;
			}
			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}
			public String getVersionId() {
				return versionId;
			}
			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}
			
	}
