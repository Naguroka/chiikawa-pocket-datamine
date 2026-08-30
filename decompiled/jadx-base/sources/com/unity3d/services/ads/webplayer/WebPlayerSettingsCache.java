package com.unity3d.services.ads.webplayer;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayerSettingsCache {
    private static com.unity3d.services.ads.webplayer.WebPlayerSettingsCache instance;
    private java.util.HashMap<java.lang.String, org.json.JSONObject> _webSettings = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, org.json.JSONObject> _webPlayerSettings = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, org.json.JSONObject> _webPlayerEventSettings = new java.util.HashMap<>();

    public static com.unity3d.services.ads.webplayer.WebPlayerSettingsCache getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.ads.webplayer.WebPlayerSettingsCache();
        }
        return instance;
    }

    public synchronized void addWebSettings(java.lang.String str, org.json.JSONObject jSONObject) {
        this._webSettings.put(str, jSONObject);
    }

    public synchronized void removeWebSettings(java.lang.String str) {
        if (this._webSettings.containsKey(str)) {
            this._webSettings.remove(str);
        }
    }

    public synchronized org.json.JSONObject getWebSettings(java.lang.String str) {
        if (this._webSettings.containsKey(str)) {
            return this._webSettings.get(str);
        }
        return new org.json.JSONObject();
    }

    public synchronized void addWebPlayerSettings(java.lang.String str, org.json.JSONObject jSONObject) {
        this._webPlayerSettings.put(str, jSONObject);
    }

    public synchronized void removeWebPlayerSettings(java.lang.String str) {
        if (this._webPlayerSettings.containsKey(str)) {
            this._webPlayerSettings.remove(str);
        }
    }

    public synchronized org.json.JSONObject getWebPlayerSettings(java.lang.String str) {
        if (this._webPlayerSettings.containsKey(str)) {
            return this._webPlayerSettings.get(str);
        }
        return new org.json.JSONObject();
    }

    public synchronized void addWebPlayerEventSettings(java.lang.String str, org.json.JSONObject jSONObject) {
        this._webPlayerEventSettings.put(str, jSONObject);
    }

    public synchronized void removeWebPlayerEventSettings(java.lang.String str) {
        if (this._webPlayerEventSettings.containsKey(str)) {
            this._webPlayerEventSettings.remove(str);
        }
    }

    public synchronized org.json.JSONObject getWebPlayerEventSettings(java.lang.String str) {
        if (this._webPlayerEventSettings.containsKey(str)) {
            return this._webPlayerEventSettings.get(str);
        }
        return new org.json.JSONObject();
    }
}
