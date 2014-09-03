package com.foo.bar;

import com.sforce.async.BulkConnection;

import org.apache.tools.ant.Task;
import org.apache.tools.ant.BuildException;

public class FooBarTask extends Task {

	private String _message;
	
	public void setMessage(String message) {
        _message = message;
    }
	
	public void execute() throws BuildException {
		log(_message);
    }
}
