package com.bykv.vk.openvk.preload.falconx.statistic;

/* JADX INFO: loaded from: classes3.dex */
public class InterceptorModel {

    @com.bykv.vk.openvk.preload.a.a.b(a = "ac")
    public java.lang.String ac;

    @com.bykv.vk.openvk.preload.a.a.b(a = "access_key")
    public java.lang.String accessKey;

    @com.bykv.vk.openvk.preload.a.a.b(a = "channel")
    public java.lang.String channel;

    @com.bykv.vk.openvk.preload.a.a.b(a = "err_code")
    public java.lang.String errCode;

    @com.bykv.vk.openvk.preload.a.a.b(a = "err_msg")
    public java.lang.String errMsg;

    @com.bykv.vk.openvk.preload.a.a.b(a = "log_id")
    public java.lang.String logId;

    @com.bykv.vk.openvk.preload.a.a.b(a = "mime_type")
    public java.lang.String mimeType;

    @com.bykv.vk.openvk.preload.a.a.b(a = "offline_duration")
    public java.lang.Long offlineDuration;

    @com.bykv.vk.openvk.preload.a.a.b(a = "offline_rule")
    public java.lang.String offlineRule;

    @com.bykv.vk.openvk.preload.a.a.b(a = "offline_status")
    public java.lang.Integer offlineStatus;

    @com.bykv.vk.openvk.preload.a.a.b(a = "online_duration")
    public java.lang.Long onlineDuration;

    @com.bykv.vk.openvk.preload.a.a.b(a = "page_url")
    public java.lang.String pageUrl;

    @com.bykv.vk.openvk.preload.a.a.b(a = "pkg_version")
    public java.lang.Long pkgVersion;

    @com.bykv.vk.openvk.preload.a.a.b(a = "res_root_dir")
    public java.lang.String resRootDir;
    public java.lang.Long startTime = java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis());

    @com.bykv.vk.openvk.preload.a.a.b(a = "resource_url")
    public java.lang.String url;

    public void setErrorCode(java.lang.String str) {
        this.errCode = str;
    }

    public void setErrorMsg(java.lang.String str) {
        this.errMsg = str;
    }

    public void loadFinish(boolean z) {
        if (z) {
            this.offlineDuration = java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - this.startTime.longValue());
            this.offlineStatus = 1;
        } else {
            this.offlineStatus = 0;
        }
    }
}
