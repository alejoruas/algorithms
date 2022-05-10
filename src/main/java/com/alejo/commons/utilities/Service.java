package com.alejo.commons.utilities;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Inheritance;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inheritance
public @interface Service {}
