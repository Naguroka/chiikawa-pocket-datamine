package com.bykv.vk.openvk.preload.geckox.model;

/* JADX INFO: loaded from: classes3.dex */
public class WebResourceResponseModel {
    public static final int ERROR_DEFAULT = -1;
    public static final int ERROR_INTERCEPT = 1;
    public static final int ERROR_NOT_FIND_BY_RESOURCE = 2;
    int errorType;
    android.webkit.WebResourceResponse webResourceResponse;

    public WebResourceResponseModel(int i, android.webkit.WebResourceResponse webResourceResponse) {
        this.errorType = i;
        this.webResourceResponse = webResourceResponse;
    }

    public int getMsg() {
        return this.errorType;
    }

    public void setMsg(int i) {
        this.errorType = i;
    }

    public android.webkit.WebResourceResponse getWebResourceResponse() {
        return this.webResourceResponse;
    }

    public void setWebResourceResponse(android.webkit.WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }
}
