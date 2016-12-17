package com.nessq.utils;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

public class LogManager {

	Logger logger;

	public LogManager(Class<?> className) {
		logger = Logger.getLogger(className);
	}

	public void info(String message) {
		logger.info(message);
	}

	public void warn(String message) {
		logger.warn(message);
	}

	public void error(String message) {
		logger.error(message);
	}

	public void fatal(String message) {
		logger.fatal(message);
	}

	public void debug(String message) {
		logger.debug(message);
	}

	public void logStackTrace(Exception e) {
		logger.info(Arrays.asList(e.getStackTrace()).stream().map(Objects::toString).collect(Collectors.joining("\n")));
	}
}
