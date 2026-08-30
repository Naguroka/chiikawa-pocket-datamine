package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f6a = {"goldfish"};
    private static final java.lang.String[] b = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    private static final java.lang.String[] c = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    private static final java.lang.String[] d = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    private static final java.lang.String[] e = {"fstab.andy", "ueventd.andy.rc"};
    private static final java.lang.String[] f = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};

    private static boolean a() {
        return a(b) || a(e) || a(f) || c() || a(c) || a(d);
    }

    private static boolean b() {
        java.lang.String str = android.os.Build.PRODUCT;
        int i = (str.equals("sdk_x86_64") || str.equals("sdk_google_phone_x86") || str.equals("sdk_google_phone_x86_64") || str.equals("sdk_google_phone_arm64") || str.equals("vbox86p")) ? 1 : 0;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        if (str2.equals("unknown")) {
            i++;
        }
        java.lang.String str3 = android.os.Build.BRAND;
        if (str3.equals("generic") || str3.equalsIgnoreCase("android") || str3.equals("generic_arm64") || str3.equals("generic_x86") || str3.equals("generic_x86_64")) {
            i++;
        }
        java.lang.String str4 = android.os.Build.DEVICE;
        if (str4.equals("generic") || str4.equals("generic_arm64") || str4.equals("generic_x86") || str4.equals("generic_x86_64") || str4.equals("vbox86p")) {
            i++;
        }
        java.lang.String str5 = android.os.Build.MODEL;
        if (str5.equals(com.unity3d.services.core.di.ServiceProvider.NAMED_SDK) || str5.equals("Android SDK built for arm64") || str5.equals("Android SDK built for armv7") || str5.equals("Android SDK built for x86") || str5.equals("Android SDK built for x86_64")) {
            i++;
        }
        java.lang.String str6 = android.os.Build.HARDWARE;
        if (str6.equals("ranchu")) {
            i++;
        }
        java.lang.String str7 = android.os.Build.FINGERPRINT;
        if (str7.contains("sdk_google_phone_arm64") || str7.contains("sdk_google_phone_armv7")) {
            i++;
        }
        boolean z = str7.startsWith("generic") || str5.contains("google_sdk") || str5.toLowerCase().contains("droid4x") || str5.contains("Emulator") || str5.contains("Android SDK built for x86") || str2.contains("Genymotion") || str6.equals("goldfish") || str6.equals("vbox86") || str.equals(com.unity3d.services.core.di.ServiceProvider.NAMED_SDK) || str.startsWith("google_sdk") || str.equals("sdk_x86") || str.equals("vbox86p") || android.os.Build.BOARD.toLowerCase().contains("nox") || android.os.Build.BOOTLOADER.toLowerCase().contains("nox") || str6.toLowerCase().contains("nox") || str.toLowerCase().contains("nox") || android.os.Build.SERIAL.toLowerCase().contains("nox") || android.os.Build.HOST.contains("Droid4x-BuildStation") || str2.startsWith("iToolsAVM") || str4.startsWith("iToolsAVM") || str5.startsWith("iToolsAVM") || str3.startsWith("generic") || str6.startsWith("vbox86");
        if (z) {
            return true;
        }
        boolean z2 = z | (str3.startsWith("generic") && str4.startsWith("generic"));
        return z2 || "google_sdk".equals(str) || z2 || i >= 2;
    }

    private static boolean c() {
        java.io.File[] fileArr = {new java.io.File("/proc/tty/drivers"), new java.io.File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            java.io.File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                }
                java.lang.String str = new java.lang.String(bArr);
                for (java.lang.String str2 : f6a) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (new java.io.File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(android.content.Context context) {
        if (b() || a()) {
            return true;
        }
        return a(context);
    }

    public static boolean a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.packageName.startsWith("com.bluestacks.")) {
                return true;
            }
        }
        java.util.Iterator<android.content.pm.ApplicationInfo> it2 = packageManager.getInstalledApplications(128).iterator();
        while (it2.hasNext()) {
            java.lang.String str = it2.next().packageName;
            if (str.startsWith("com.vphone.") || str.startsWith("com.bignox.") || str.startsWith("com.nox.mopen.app") || str.startsWith("me.haima.") || str.startsWith("com.bluestacks.")) {
                return true;
            }
            if ((str.startsWith("cn.itools.") && android.os.Build.PRODUCT.startsWith("iToolsAVM")) || str.startsWith("com.kop.") || str.startsWith("com.kaopu.") || str.startsWith("com.microvirt.") || str.equals("com.google.android.launcher.layouts.genymotion")) {
                return true;
            }
        }
        java.util.Iterator<android.app.ActivityManager.RunningServiceInfo> it3 = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningServices(30).iterator();
        while (it3.hasNext()) {
            if (it3.next().service.getClassName().startsWith("com.bluestacks.")) {
                return true;
            }
        }
        return false;
    }
}
