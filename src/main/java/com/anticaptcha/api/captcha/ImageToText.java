package com.anticaptcha.api.captcha;

import com.anticaptcha.api.AntiCaptcha;
import com.anticaptcha.api.response.TaskResult;

import java.util.HashMap;

public class ImageToText extends AntiCaptcha {

    final HashMap<String, Object> task = new HashMap<>();

    public ImageToText(String clientKey) {
        super(clientKey, 0);
        task.put("type", "RecaptchaV2EnterpriseTaskProxyless");
    }

    public ImageToText(String clientKey, int softId) {
        super(clientKey, softId);
        task.put("type", "RecaptchaV2EnterpriseTaskProxyless");
    }

    public void setBody(String body) {
        task.put("body", body);
    }

    public void setPhrase(boolean phrase) {
        task.put("phrase", phrase);
    }

    public void setCase(boolean caseSensitive) {
        task.put("case", caseSensitive);
    }

    public void setNumeric(int numeric) {
        task.put("numeric", numeric);
    }

    public void setMath(boolean math) {
        task.put("math", math);
    }

    public void setMinLength(int minLength) {
        task.put("minLength", minLength);
    }

    public void setMaxLength(int maxLength) {
        task.put("maxLength", maxLength);
    }

    public void setComment(String comment) {
        task.put("comment", comment);
    }

    public void setWebsiteURL(String url) {
        task.put("websiteURL", url);
    }

    @Override
    protected TaskResult createTask() {
        return super.createTask();
    }

    @Override
    protected TaskResult createTask(int maxSecTimeout) {
        return super.createTask(maxSecTimeout);
    }
}
