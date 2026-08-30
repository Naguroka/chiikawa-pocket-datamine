package com.scottyab.rootbeer;

/* JADX INFO: loaded from: classes3.dex */
public class RootBeer {
    private boolean loggingEnabled = true;
    private final android.content.Context mContext;

    public RootBeer(android.content.Context context) {
        this.mContext = context;
    }

    public boolean isRooted() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary("su") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    @java.lang.Deprecated
    public boolean isRootedWithoutBusyBoxCheck() {
        return isRooted();
    }

    public boolean isRootedWithBusyBoxCheck() {
        return detectRootManagementApps() || detectPotentiallyDangerousApps() || checkForBinary("su") || checkForBinary("busybox") || checkForDangerousProps() || checkForRWPaths() || detectTestKeys() || checkSuExists() || checkForRootNative() || checkForMagiskBinary();
    }

    public boolean detectTestKeys() {
        java.lang.String str = android.os.Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean detectRootManagementApps() {
        return detectRootManagementApps(null);
    }

    public boolean detectRootManagementApps(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(com.scottyab.rootbeer.Const.knownRootAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(java.util.Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectPotentiallyDangerousApps() {
        return detectPotentiallyDangerousApps(null);
    }

    public boolean detectPotentiallyDangerousApps(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(com.scottyab.rootbeer.Const.knownDangerousAppsPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(java.util.Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean detectRootCloakingApps() {
        return detectRootCloakingApps(null) || (canLoadNativeLibrary() && !checkForNativeLibraryReadAccess());
    }

    public boolean detectRootCloakingApps(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(com.scottyab.rootbeer.Const.knownRootCloakingPackages));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(java.util.Arrays.asList(strArr));
        }
        return isAnyPackageFromListInstalled(arrayList);
    }

    public boolean checkForSuBinary() {
        return checkForBinary("su");
    }

    public boolean checkForMagiskBinary() {
        return checkForBinary("magisk");
    }

    public boolean checkForBusyBoxBinary() {
        return checkForBinary("busybox");
    }

    public boolean checkForBinary(java.lang.String str) {
        boolean z = false;
        for (java.lang.String str2 : com.scottyab.rootbeer.Const.getPaths()) {
            java.lang.String str3 = str2 + str;
            if (new java.io.File(str2, str).exists()) {
                com.scottyab.rootbeer.util.QLog.v(str3 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    public void setLogging(boolean z) {
        this.loggingEnabled = z;
        com.scottyab.rootbeer.util.QLog.LOGGING_LEVEL = z ? 5 : 0;
    }

    private java.lang.String[] propsReader() {
        try {
            java.io.InputStream inputStream = java.lang.Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new java.util.Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (java.io.IOException | java.util.NoSuchElementException e) {
            com.scottyab.rootbeer.util.QLog.e(e);
            return null;
        }
    }

    private java.lang.String[] mountReader() {
        try {
            java.io.InputStream inputStream = java.lang.Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new java.util.Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (java.io.IOException | java.util.NoSuchElementException e) {
            com.scottyab.rootbeer.util.QLog.e(e);
            return null;
        }
    }

    private boolean isAnyPackageFromListInstalled(java.util.List<java.lang.String> list) {
        android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
        boolean z = false;
        for (java.lang.String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                com.scottyab.rootbeer.util.QLog.e(str + " ROOT management app detected!");
                z = true;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public boolean checkForDangerousProps() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("ro.debuggable", "1");
        map.put("ro.secure", "0");
        java.lang.String[] strArrPropsReader = propsReader();
        if (strArrPropsReader == null) {
            return false;
        }
        boolean z = false;
        for (java.lang.String str : strArrPropsReader) {
            for (java.lang.String str2 : map.keySet()) {
                if (str.contains(str2)) {
                    java.lang.String str3 = com.ironsource.y8.i.d + ((java.lang.String) map.get(str2)) + com.ironsource.y8.i.e;
                    if (str.contains(str3)) {
                        com.scottyab.rootbeer.util.QLog.v(str2 + " = " + str3 + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean checkForRWPaths() {
        java.lang.String[] strArrMountReader = mountReader();
        int i = 0;
        if (strArrMountReader == null) {
            return false;
        }
        int length = strArrMountReader.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            java.lang.String str = strArrMountReader[i2];
            java.lang.String[] strArrSplit = str.split(" ");
            if (strArrSplit.length < 6) {
                com.scottyab.rootbeer.util.QLog.e("Error formatting mount line: " + str);
            } else {
                java.lang.String str2 = strArrSplit[2];
                java.lang.String strReplace = strArrSplit[5];
                java.lang.String[] strArr = com.scottyab.rootbeer.Const.pathsThatShouldNotBeWritable;
                int length2 = strArr.length;
                int i3 = i;
                while (i3 < length2) {
                    java.lang.String str3 = strArr[i3];
                    if (str2.equalsIgnoreCase(str3)) {
                        strReplace = strReplace.replace("(", "").replace(")", "");
                        java.lang.String[] strArrSplit2 = strReplace.split(",");
                        int length3 = strArrSplit2.length;
                        for (int i4 = i; i4 < length3; i4++) {
                            if (strArrSplit2[i4].equalsIgnoreCase("rw")) {
                                com.scottyab.rootbeer.util.QLog.v(str3 + " path is mounted with rw permissions! " + str);
                                z = true;
                                break;
                            }
                        }
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        return z;
    }

    public boolean checkSuExists() {
        java.lang.Process processExec = null;
        try {
            processExec = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"which", "su"});
            boolean z = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream())).readLine() != null;
            if (processExec != null) {
                processExec.destroy();
            }
            return z;
        } catch (java.lang.Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public boolean checkForNativeLibraryReadAccess() {
        try {
            new com.scottyab.rootbeer.RootBeerNative().setLogDebugMessages(this.loggingEnabled);
            return true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean canLoadNativeLibrary() {
        return new com.scottyab.rootbeer.RootBeerNative().wasNativeLibraryLoaded();
    }

    public boolean checkForRootNative() {
        if (!canLoadNativeLibrary()) {
            com.scottyab.rootbeer.util.QLog.e("We could not load the native library to test for root");
            return false;
        }
        java.lang.String[] paths = com.scottyab.rootbeer.Const.getPaths();
        int length = paths.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = paths[i] + "su";
        }
        com.scottyab.rootbeer.RootBeerNative rootBeerNative = new com.scottyab.rootbeer.RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.loggingEnabled);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
