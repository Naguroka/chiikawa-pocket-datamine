package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public interface AMoAdNativeListener {

    public enum Result {
        Success,
        Failure,
        Empty
    }

    void onClicked(java.lang.String str, java.lang.String str2, android.view.View view);

    void onIconReceived(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeListener.Result result);

    void onImageReceived(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeListener.Result result);

    void onReceived(java.lang.String str, java.lang.String str2, android.view.View view, com.amoad.AMoAdNativeListener.Result result);
}
