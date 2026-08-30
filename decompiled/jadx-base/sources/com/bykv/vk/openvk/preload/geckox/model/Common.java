package com.bykv.vk.openvk.preload.geckox.model;

/* JADX INFO: loaded from: classes3.dex */
public class Common {

    @com.bykv.vk.openvk.preload.a.a.b(a = "ac")
    public java.lang.String ac;

    @com.bykv.vk.openvk.preload.a.a.b(a = com.json.tk.b)
    public long aid;

    @com.bykv.vk.openvk.preload.a.a.b(a = "app_name")
    public java.lang.String appName;

    @com.bykv.vk.openvk.preload.a.a.b(a = "app_version")
    public java.lang.String appVersion;

    @com.bykv.vk.openvk.preload.a.a.b(a = "device_id")
    public java.lang.String deviceId;

    @com.bykv.vk.openvk.preload.a.a.b(a = androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)
    public java.lang.String region;

    @com.bykv.vk.openvk.preload.a.a.b(a = "uid")
    public java.lang.String uid;

    @com.bykv.vk.openvk.preload.a.a.b(a = com.json.ce.y)
    public int os = 0;

    @com.bykv.vk.openvk.preload.a.a.b(a = "os_version")
    public java.lang.String osVersion = new java.lang.StringBuilder().append(android.os.Build.VERSION.SDK_INT).toString();

    @com.bykv.vk.openvk.preload.a.a.b(a = "device_model")
    public java.lang.String deviceModel = android.os.Build.MODEL;

    @com.bykv.vk.openvk.preload.a.a.b(a = "device_platform")
    public java.lang.String devicePlatform = "android";

    @com.bykv.vk.openvk.preload.a.a.b(a = "sdk_version")
    public java.lang.String sdkVersion = "2.0.3-rc.9-pangle";

    public Common(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }

    public Common(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
