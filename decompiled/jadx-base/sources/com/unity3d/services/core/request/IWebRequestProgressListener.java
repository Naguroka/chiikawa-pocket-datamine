package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(java.lang.String str, long j, long j2);

    void onRequestStart(java.lang.String str, long j, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);
}
