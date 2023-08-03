package com.BajajFinserv.SpringBoot_Project_Rest_Exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String exception)
	{
		super(exception);
	}

}
