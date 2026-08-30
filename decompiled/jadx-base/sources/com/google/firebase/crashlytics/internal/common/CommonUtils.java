package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class CommonUtils {
    static final java.lang.String BUILD_IDS_ARCH_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_arch";
    static final java.lang.String BUILD_IDS_BUILD_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_build_id";
    static final java.lang.String BUILD_IDS_LIB_NAMES_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_lib";
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    private static final java.lang.String GOLDFISH = "goldfish";
    private static final char[] HEX_VALUES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    static final java.lang.String LEGACY_MAPPING_FILE_ID_RESOURCE_NAME = "com.crashlytics.android.build_id";
    public static final java.lang.String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    static final java.lang.String MAPPING_FILE_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.mapping_file_id";
    private static final java.lang.String RANCHU = "ranchu";
    private static final java.lang.String SDK = "sdk";
    private static final java.lang.String SHA1_INSTANCE = "SHA-1";
    public static final java.lang.String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";
    static final java.lang.String VERSION_CONTROL_INFO_RESOURCE_NAME = "com.google.firebase.crashlytics.version_control_info";

    @java.lang.Deprecated
    public static boolean isLoggingEnabled(android.content.Context context) {
        return false;
    }

    public static android.content.SharedPreferences getSharedPrefs(android.content.Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static android.content.SharedPreferences getLegacySharedPrefs(android.content.Context context) {
        return context.getSharedPreferences(LEGACY_SHARED_PREFS_NAME, 0);
    }

    public static int getCpuArchitectureInt() {
        return com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.getValue().ordinal();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture, still in use, count: 1, list:
  (r0v0 com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:116)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final java.util.Map<java.lang.String, com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture> matcher;

        private Architecture() {
            super(str, i);
        }

        public static com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture valueOf(java.lang.String str) {
            return (com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture) java.lang.Enum.valueOf(com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.class, str);
        }

        public static com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[] values() {
            return (com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture[]) $VALUES.clone();
        }

        static {
            java.util.HashMap map = new java.util.HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", new com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture());
            map.put("armeabi", new com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture());
            map.put("arm64-v8a", new com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture());
            map.put("x86", new com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture());
        }

        static com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture getValue() {
            java.lang.String str = android.os.Build.CPU_ABI;
            if (android.text.TextUtils.isEmpty(str)) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture architecture = matcher.get(str.toLowerCase(java.util.Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    public static java.lang.String streamToString(java.io.InputStream inputStream) {
        java.util.Scanner scannerUseDelimiter = new java.util.Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static java.lang.String sha1(java.lang.String str) {
        return hash(str, "SHA-1");
    }

    private static java.lang.String hash(java.lang.String str, java.lang.String str2) {
        return hash(str.getBytes(), str2);
    }

    private static java.lang.String hash(byte[] bArr, java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return hexify(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    public static java.lang.String createInstanceIdFrom(java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(java.util.Locale.US));
            }
        }
        java.util.Collections.sort(arrayList);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
        }
        java.lang.String string = sb.toString();
        if (string.length() > 0) {
            return sha1(string);
        }
        return null;
    }

    public static synchronized long calculateTotalRamInBytes(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long calculateFreeRamInBytes(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(java.lang.String str) {
        android.os.StatFs statFs = new android.os.StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean getProximitySensorEnabled(android.content.Context context) {
        return (isEmulator() || ((android.hardware.SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static boolean getBooleanResourceValue(android.content.Context context, java.lang.String str, boolean z) {
        android.content.res.Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, "bool");
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING);
            if (resourcesIdentifier2 > 0) {
                return java.lang.Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z;
    }

    public static int getResourcesIdentifier(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static boolean isEmulator() {
        return android.os.Build.PRODUCT.contains("sdk") || android.os.Build.HARDWARE.contains(GOLDFISH) || android.os.Build.HARDWARE.contains(RANCHU);
    }

    public static boolean isRooted() {
        boolean zIsEmulator = isEmulator();
        java.lang.String str = android.os.Build.TAGS;
        if ((zIsEmulator || str == null || !str.contains("test-keys")) && !new java.io.File("/system/app/Superuser.apk").exists()) {
            return !zIsEmulator && new java.io.File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean isDebuggerAttached() {
        return android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int getDeviceState() {
        boolean zIsEmulator = isEmulator();
        ?? r0 = zIsEmulator;
        if (isRooted()) {
            r0 = (zIsEmulator ? 1 : 0) | 2;
        }
        return isDebuggerAttached() ? r0 | 4 : r0;
    }

    public static java.lang.String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = HEX_VALUES;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static boolean isAppDebuggable(android.content.Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static void closeOrLog(java.io.Closeable closeable, java.lang.String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e(str, e);
            }
        }
    }

    public static java.lang.String padWithZerosToMaxIntWidth(int i) {
        if (i >= 0) {
            return java.lang.String.format(java.util.Locale.US, "%1$10s", java.lang.Integer.valueOf(i)).replace(' ', '0');
        }
        throw new java.lang.IllegalArgumentException("value must be zero or greater");
    }

    public static java.lang.String getResourcePackageName(android.content.Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                java.lang.String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (android.content.res.Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static java.lang.String getMappingFileId(android.content.Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, MAPPING_FILE_ID_RESOURCE_NAME, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING);
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, LEGACY_MAPPING_FILE_ID_RESOURCE_NAME, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING);
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    public static java.util.List<com.google.firebase.crashlytics.internal.common.BuildIdInfo> getBuildIdInfo(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int resourcesIdentifier = getResourcesIdentifier(context, BUILD_IDS_LIB_NAMES_RESOURCE_NAME, "array");
        int resourcesIdentifier2 = getResourcesIdentifier(context, BUILD_IDS_ARCH_RESOURCE_NAME, "array");
        int resourcesIdentifier3 = getResourcesIdentifier(context, BUILD_IDS_BUILD_ID_RESOURCE_NAME, "array");
        if (resourcesIdentifier == 0 || resourcesIdentifier2 == 0 || resourcesIdentifier3 == 0) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d(java.lang.String.format("Could not find resources: %d %d %d", java.lang.Integer.valueOf(resourcesIdentifier), java.lang.Integer.valueOf(resourcesIdentifier2), java.lang.Integer.valueOf(resourcesIdentifier3)));
            return arrayList;
        }
        java.lang.String[] stringArray = context.getResources().getStringArray(resourcesIdentifier);
        java.lang.String[] stringArray2 = context.getResources().getStringArray(resourcesIdentifier2);
        java.lang.String[] stringArray3 = context.getResources().getStringArray(resourcesIdentifier3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d(java.lang.String.format("Lengths did not match: %d %d %d", java.lang.Integer.valueOf(stringArray.length), java.lang.Integer.valueOf(stringArray2.length), java.lang.Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i = 0; i < stringArray3.length; i++) {
            arrayList.add(new com.google.firebase.crashlytics.internal.common.BuildIdInfo(stringArray[i], stringArray2[i], stringArray3[i]));
        }
        return arrayList;
    }

    public static java.lang.String getVersionControlInfo(android.content.Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, VERSION_CONTROL_INFO_RESOURCE_NAME, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING);
        if (resourcesIdentifier == 0) {
            return null;
        }
        return context.getResources().getString(resourcesIdentifier);
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static boolean checkPermission(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean canTryConnection(android.content.Context context) {
        if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean nullSafeEquals(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
