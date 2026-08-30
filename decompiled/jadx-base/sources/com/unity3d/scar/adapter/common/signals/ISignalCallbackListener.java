package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: classes6.dex */
public interface ISignalCallbackListener<T> {
    void onFailure(java.lang.String str);

    void onSuccess(java.lang.String str, java.lang.String str2, T t);
}
