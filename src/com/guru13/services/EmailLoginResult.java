package com.guru13.services;

/**
 * @author Aliaksei Huryanchyk
 */
public enum EmailLoginResult {
    SUCCESS,
    FAILED_BY_CREDENTIALS,
    FAILED_BY_NETWORK,
    FAILED_BY_UNEXPECTED_ERROR;
}
