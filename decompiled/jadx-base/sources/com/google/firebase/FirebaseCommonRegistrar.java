package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String ANDROID_INSTALLER = "android-installer";
    private static final java.lang.String ANDROID_PLATFORM = "android-platform";
    private static final java.lang.String DEVICE_BRAND = "device-brand";
    private static final java.lang.String DEVICE_MODEL = "device-model";
    private static final java.lang.String DEVICE_NAME = "device-name";
    private static final java.lang.String FIREBASE_ANDROID = "fire-android";
    private static final java.lang.String FIREBASE_COMMON = "fire-core";
    private static final java.lang.String KOTLIN = "kotlin";
    private static final java.lang.String MIN_SDK = "android-min-sdk";
    private static final java.lang.String TARGET_SDK = "android-target-sdk";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.firebase.platforminfo.DefaultUserAgentPublisher.component());
        arrayList.add(com.google.firebase.heartbeatinfo.DefaultHeartBeatController.component());
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.create(FIREBASE_ANDROID, java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.create(FIREBASE_COMMON, com.google.firebase.BuildConfig.VERSION_NAME));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.create(DEVICE_NAME, safeValue(android.os.Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.create(DEVICE_MODEL, safeValue(android.os.Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.create(DEVICE_BRAND, safeValue(android.os.Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(TARGET_SDK, new com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final java.lang.String extract(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.lambda$getComponents$0((android.content.Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(MIN_SDK, new com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final java.lang.String extract(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.lambda$getComponents$1((android.content.Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(ANDROID_PLATFORM, new com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda2
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final java.lang.String extract(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.lambda$getComponents$2((android.content.Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(ANDROID_INSTALLER, new com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda3
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final java.lang.String extract(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.lambda$getComponents$3((android.content.Context) obj);
            }
        }));
        java.lang.String strDetectVersion = com.google.firebase.platforminfo.KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(com.google.firebase.platforminfo.LibraryVersionComponent.create(KOTLIN, strDetectVersion));
        }
        return arrayList;
    }

    static /* synthetic */ java.lang.String lambda$getComponents$0(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? java.lang.String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    static /* synthetic */ java.lang.String lambda$getComponents$1(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? java.lang.String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    static /* synthetic */ java.lang.String lambda$getComponents$2(android.content.Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (android.os.Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    static /* synthetic */ java.lang.String lambda$getComponents$3(android.content.Context context) {
        java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? safeValue(installerPackageName) : "";
    }

    private static java.lang.String safeValue(java.lang.String str) {
        return str.replace(' ', '_').replace('/', '_');
    }
}
