package com.google.firebase.crashlytics.internal;

/* JADX INFO: loaded from: classes5.dex */
public class DevelopmentPlatformProvider {
    private static final java.lang.String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final java.lang.String FLUTTER_PLATFORM = "Flutter";
    private static final java.lang.String UNITY_PLATFORM = "Unity";
    private static final java.lang.String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final android.content.Context context;
    private com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform developmentPlatform = null;

    public DevelopmentPlatformProvider(android.content.Context context) {
        this.context = context;
    }

    public java.lang.String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    public java.lang.String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }

    public static boolean isUnity(android.content.Context context) {
        return com.google.firebase.crashlytics.internal.common.CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetFileExists(java.lang.String str) {
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            java.io.InputStream inputStreamOpen = this.context.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    private class DevelopmentPlatform {
        private final java.lang.String developmentPlatform;
        private final java.lang.String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = com.google.firebase.crashlytics.internal.common.CommonUtils.getResourcesIdentifier(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.this.context, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.UNITY_VERSION_FIELD, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING);
            if (resourcesIdentifier == 0) {
                if (com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.this.assetFileExists(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.FLUTTER_ASSET_FILE)) {
                    this.developmentPlatform = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                    this.developmentPlatformVersion = null;
                    com.google.firebase.crashlytics.internal.Logger.getLogger().v("Development platform is: Flutter");
                    return;
                } else {
                    this.developmentPlatform = null;
                    this.developmentPlatformVersion = null;
                    return;
                }
            }
            this.developmentPlatform = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.UNITY_PLATFORM;
            java.lang.String string = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
            this.developmentPlatformVersion = string;
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Unity Editor version is: " + string);
        }
    }
}
