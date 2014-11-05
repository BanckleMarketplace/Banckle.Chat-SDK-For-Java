package com.banckle.chat.api;

import com.banckle.client.ApiException;
import com.banckle.client.ApiInvoker;

import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class TranscriptsApi {
  String basePath = "https://chat.banckle.com/v3";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  
  public String searchTranscripts (String startTime, String endTime, Integer messageNumber, String widgetId, String keywords) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(startTime == null || endTime == null || messageNumber == null || widgetId == null || keywords == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts?start={startTime}&end={endTime}&messages={messageNumber}&widget={widgetId}&keywords={keywords}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "startTime" + "\\}", apiInvoker.escapeString(startTime.toString())).replaceAll("\\{" + "endTime" + "\\}", apiInvoker.escapeString(endTime.toString())).replaceAll("\\{" + "messageNumber" + "\\}", apiInvoker.escapeString(messageNumber.toString())).replaceAll("\\{" + "widgetId" + "\\}", apiInvoker.escapeString(widgetId.toString())).replaceAll("\\{" + "keywords" + "\\}", apiInvoker.escapeString(keywords.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  public String getTranscriptMessages (String thread) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(thread == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts/{thread}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "thread" + "\\}", apiInvoker.escapeString(thread.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void deleteTranscript (String transcriptId) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(transcriptId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts/{transcriptId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "transcriptId" + "\\}", apiInvoker.escapeString(transcriptId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public Object emailTranscripts (String recipient, String subject, Integer additionalMessage, String timezoneOffset, String threads) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(recipient == null || subject == null || additionalMessage == null || timezoneOffset == null || threads == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts/email?recipient={recipient}&subject={subject}&additionalMessage={additionalMessage}&timeZoneOffset={timezoneOffset}&threads={threads}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "recipient" + "\\}", apiInvoker.escapeString(recipient.toString())).replaceAll("\\{" + "subject" + "\\}", apiInvoker.escapeString(subject.toString())).replaceAll("\\{" + "additionalMessage" + "\\}", apiInvoker.escapeString(additionalMessage.toString())).replaceAll("\\{" + "timezoneOffset" + "\\}", apiInvoker.escapeString(timezoneOffset.toString())).replaceAll("\\{" + "threads" + "\\}", apiInvoker.escapeString(threads.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void createTranscriptLink (String thread) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(thread == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts/{thread}/link".replaceAll("\\{format\\}","json").replaceAll("\\{" + "thread" + "\\}", apiInvoker.escapeString(thread.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public void deleteTranscriptLink (String thread) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(thread == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts/{thread}/link".replaceAll("\\{format\\}","json").replaceAll("\\{" + "thread" + "\\}", apiInvoker.escapeString(thread.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  
  public String getTranscriptLink (String thread) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(thread == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/transcripts/{thread}/link".replaceAll("\\{format\\}","json").replaceAll("\\{" + "thread" + "\\}", apiInvoker.escapeString(thread.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

