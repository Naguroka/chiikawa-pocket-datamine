package com.bytedance.sdk.openadsdk.p002vb;

/* JADX INFO: loaded from: classes4.dex */
public interface bX {
    android.content.Context getContext();

    android.os.Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(java.util.List<com.bytedance.sdk.openadsdk.p002vb.IL.bg> list);
}
