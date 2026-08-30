package com.json.mediationsdk.config;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigFile {
    private static com.json.mediationsdk.config.ConfigFile mInstance;
    private java.lang.String mPluginFrameworkVersion;
    private java.lang.String mPluginType;
    private java.lang.String mPluginVersion;
    private java.lang.String[] mSupportedPlugins = {"AdobeAir", "Cocos2dx", "Cordova", "Corona", "Defold", "Flutter", "ReactNative", "Unity", "Unreal", "Xamarin", "Other"};

    public static synchronized com.json.mediationsdk.config.ConfigFile getConfigFile() {
        if (mInstance == null) {
            mInstance = new com.json.mediationsdk.config.ConfigFile();
        }
        return mInstance;
    }

    public java.lang.String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public java.lang.String getPluginType() {
        return this.mPluginType;
    }

    public java.lang.String getPluginVersion() {
        return this.mPluginVersion;
    }

    public void setPluginData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mPluginType = null;
        if (str != null) {
            for (java.lang.String str4 : this.mSupportedPlugins) {
                if (str.equalsIgnoreCase(str4)) {
                    this.mPluginType = str4;
                    break;
                }
            }
        }
        if (str2 != null) {
            this.mPluginVersion = str2;
        }
        if (str3 != null) {
            this.mPluginFrameworkVersion = str3;
        }
    }
}
