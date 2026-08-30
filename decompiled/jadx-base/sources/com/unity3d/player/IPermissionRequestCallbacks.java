package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public interface IPermissionRequestCallbacks {
    void onPermissionDenied(java.lang.String str);

    void onPermissionDeniedAndDontAskAgain(java.lang.String str);

    void onPermissionGranted(java.lang.String str);
}
