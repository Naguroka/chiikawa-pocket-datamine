package com.unity3d.services.ads.webplayer;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayerViewCache {
    private static com.unity3d.services.ads.webplayer.WebPlayerViewCache instance;
    private java.util.HashMap<java.lang.String, com.unity3d.services.ads.webplayer.WebPlayerView> _webPlayerMap = new java.util.HashMap<>();

    public static com.unity3d.services.ads.webplayer.WebPlayerViewCache getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.ads.webplayer.WebPlayerViewCache();
        }
        return instance;
    }

    public synchronized void addWebPlayer(java.lang.String str, com.unity3d.services.ads.webplayer.WebPlayerView webPlayerView) {
        this._webPlayerMap.put(str, webPlayerView);
    }

    public synchronized void removeWebPlayer(java.lang.String str) {
        if (this._webPlayerMap.containsKey(str)) {
            this._webPlayerMap.remove(str);
        }
    }

    public synchronized com.unity3d.services.ads.webplayer.WebPlayerView getWebPlayer(java.lang.String str) {
        if (!this._webPlayerMap.containsKey(str)) {
            return null;
        }
        return this._webPlayerMap.get(str);
    }
}
