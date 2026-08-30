package com.unity3d.services.banners.properties;

/* JADX INFO: loaded from: classes6.dex */
public class BannerRefreshInfo {
    private static com.unity3d.services.banners.properties.BannerRefreshInfo instance;
    private java.util.HashMap<java.lang.String, java.lang.Integer> _refreshRateMap = new java.util.HashMap<>();

    public static com.unity3d.services.banners.properties.BannerRefreshInfo getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.banners.properties.BannerRefreshInfo();
        }
        return instance;
    }

    public synchronized void setRefreshRate(java.lang.String str, java.lang.Integer num) {
        this._refreshRateMap.put(str, num);
    }

    public synchronized java.lang.Integer getRefreshRate(java.lang.String str) {
        return this._refreshRateMap.get(str);
    }
}
