package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public interface IWebRequestListener {
    void onComplete(java.lang.String str, java.lang.String str2, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

    void onFailed(java.lang.String str, java.lang.String str2);
}
