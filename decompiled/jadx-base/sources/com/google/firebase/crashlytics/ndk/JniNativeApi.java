package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
class JniNativeApi implements com.google.firebase.crashlytics.ndk.NativeApi {
    private static final java.io.FilenameFilter APK_FILTER = new java.io.FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.JniNativeApi$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return str.toLowerCase().endsWith(".apk");
        }
    };
    private static final boolean LIB_CRASHLYTICS_LOADED;
    private final android.content.Context context;

    private static int getPackageInfoFlags() {
        return 9216;
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    private native boolean nativeInit(java.lang.String[] strArr, java.lang.Object obj);

    static {
        boolean z;
        try {
            java.lang.System.loadLibrary("crashlytics");
            z = true;
        } catch (java.lang.UnsatisfiedLinkError e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e.getLocalizedMessage());
            z = false;
        }
        LIB_CRASHLYTICS_LOADED = z;
    }

    public JniNativeApi(android.content.Context context) {
        this.context = context;
    }

    private static java.lang.String getVersionCodeAsString(android.content.pm.PackageInfo packageInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return java.lang.Long.toString(packageInfo.getLongVersionCode());
        }
        return java.lang.Integer.toString(packageInfo.versionCode);
    }

    public static void addSplitSourceDirs(java.util.List<java.lang.String> list, android.content.pm.PackageInfo packageInfo) {
        android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo.splitSourceDirs != null) {
            java.util.Collections.addAll(list, applicationInfo.splitSourceDirs);
        }
        java.io.File file = new java.io.File(applicationInfo.dataDir, java.lang.String.format("files/splitcompat/%s/verified-splits", getVersionCodeAsString(packageInfo)));
        if (!file.exists()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        java.io.File[] fileArrListFiles = file.listFiles(APK_FILTER);
        if (fileArrListFiles == null) {
            fileArrListFiles = new java.io.File[0];
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Found " + fileArrListFiles.length + " APKs in " + file.getAbsolutePath());
        for (java.io.File file2 : fileArrListFiles) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    public java.lang.String[] makePackagePaths(java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), getPackageInfoFlags());
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (isAtLeastLollipop()) {
                addSplitSourceDirs(arrayList, packageInfo);
            }
            if (packageInfo.applicationInfo.sharedLibraryFiles != null) {
                java.util.Collections.addAll(arrayList, packageInfo.applicationInfo.sharedLibraryFiles);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(10);
            java.io.File parentFile = new java.io.File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new java.io.File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new java.io.File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new java.io.File(parentFile, "arm").getPath());
                }
            }
            for (java.lang.String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(java.lang.System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            return new java.lang.String[]{android.text.TextUtils.join(java.io.File.pathSeparator, arrayList), android.text.TextUtils.join(java.io.File.pathSeparator, arrayList2)};
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Unable to compose package paths", e);
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // com.google.firebase.crashlytics.ndk.NativeApi
    public boolean initialize(java.lang.String str, android.content.res.AssetManager assetManager) {
        java.lang.String[] strArrMakePackagePaths = makePackagePaths(android.os.Build.CPU_ABI);
        if (strArrMakePackagePaths.length < 2) {
            return false;
        }
        return LIB_CRASHLYTICS_LOADED && nativeInit(new java.lang.String[]{strArrMakePackagePaths[0], strArrMakePackagePaths[1], str}, assetManager);
    }
}
