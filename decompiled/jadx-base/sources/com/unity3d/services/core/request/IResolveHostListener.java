package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public interface IResolveHostListener {
    void onFailed(java.lang.String str, com.unity3d.services.core.request.ResolveHostError resolveHostError, java.lang.String str2);

    void onResolve(java.lang.String str, java.lang.String str2);
}
