package com.cybage.zapi.config;

import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Retention;

/**
 * @author Sopan Sagorkar
 *
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface TestID {
	String testID();
}
