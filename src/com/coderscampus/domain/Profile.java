package com.coderscampus.domain;


/**Branches main/master represents the code that's
actually live on coderscampus.com)
UAT not typical)
OA
Development
environments
Production -> main/ master
not typical)
OA
Dew
*/







public class Profile {
	private Integer id;
	private String name;
	private String url;
	
	public Integer getId()  {
			return id;
	}
	public void setId(Integer id)  {
			this.id = id;
	}
	public String getName ()		{
			return name;
	}
	public void setName (String name)  {
			this.name = name;
	}
	public String getUrl () 	{
			return url;
	}
	public void setUrl (String url)		{
			this.url = url;
	}
)