package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sLock = new java.lang.Object();
    private static final java.lang.Object sSync = new java.lang.Object();
    private static android.util.TypedValue sTempValue;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RegisterReceiverFlags {
    }

    protected ContextCompat() {
    }

    public static java.lang.String getAttributionTag(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.ContextCompat.Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        androidx.core.content.ContextCompat.Api16Impl.startActivities(context, intentArr, bundle);
        return true;
    }

    public static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        androidx.core.content.ContextCompat.Api16Impl.startActivity(context, intent, bundle);
    }

    public static java.io.File getDataDir(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api24Impl.getDataDir(context);
    }

    public static java.io.File[] getObbDirs(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api19Impl.getObbDirs(context);
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
        return androidx.core.content.ContextCompat.Api19Impl.getExternalFilesDirs(context, str);
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api19Impl.getExternalCacheDirs(context);
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return androidx.core.content.ContextCompat.Api21Impl.getDrawable(context, i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        return androidx.core.content.res.ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static int getColor(android.content.Context context, int i) {
        return androidx.core.content.ContextCompat.Api23Impl.getColor(context, i);
    }

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str, "permission must be non-null");
        if (androidx.core.os.BuildCompat.isAtLeastT() || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        return androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api21Impl.getNoBackupFilesDir(context);
    }

    public static java.io.File getCodeCacheDir(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api21Impl.getCodeCacheDir(context);
    }

    private static java.io.File createFilesDir(java.io.File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                android.util.Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api24Impl.createDeviceProtectedStorageContext(context);
    }

    public static boolean isDeviceProtectedStorage(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api24Impl.isDeviceProtectedStorage(context);
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.ContextCompat.Api28Impl.getMainExecutor(context);
        }
        return androidx.core.os.ExecutorCompat.create(new android.os.Handler(context.getMainLooper()));
    }

    public static void startForegroundService(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.content.ContextCompat.Api26Impl.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        return (T) androidx.core.content.ContextCompat.Api23Impl.getSystemService(context, cls);
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new java.lang.IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.core.content.ContextCompat.Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.content.ContextCompat.Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if ((i3 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
        return androidx.core.content.ContextCompat.Api23Impl.getSystemServiceName(context, cls);
    }

    static java.lang.String obtainAndCheckReceiverPermission(android.content.Context context) {
        java.lang.String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (androidx.core.content.PermissionChecker.checkSelfPermission(context, str) == 0) {
            return str;
        }
        throw new java.lang.RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    private static final class LegacyServiceMapHolder {
        static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES;

        private LegacyServiceMapHolder() {
        }

        static {
            java.util.HashMap<java.lang.Class<?>, java.lang.String> map = new java.util.HashMap<>();
            SERVICES = map;
            map.put(android.telephony.SubscriptionManager.class, "telephony_subscription_service");
            map.put(android.app.usage.UsageStatsManager.class, "usagestats");
            map.put(android.appwidget.AppWidgetManager.class, "appwidget");
            map.put(android.os.BatteryManager.class, "batterymanager");
            map.put(android.hardware.camera2.CameraManager.class, "camera");
            map.put(android.app.job.JobScheduler.class, "jobscheduler");
            map.put(android.content.pm.LauncherApps.class, "launcherapps");
            map.put(android.media.projection.MediaProjectionManager.class, "media_projection");
            map.put(android.media.session.MediaSessionManager.class, "media_session");
            map.put(android.content.RestrictionsManager.class, "restrictions");
            map.put(android.telecom.TelecomManager.class, "telecom");
            map.put(android.media.tv.TvInputManager.class, "tv_input");
            map.put(android.app.AppOpsManager.class, "appops");
            map.put(android.view.accessibility.CaptioningManager.class, "captioning");
            map.put(android.hardware.ConsumerIrManager.class, "consumer_ir");
            map.put(android.print.PrintManager.class, "print");
            map.put(android.bluetooth.BluetoothManager.class, com.json.u8.d);
            map.put(android.hardware.display.DisplayManager.class, "display");
            map.put(android.os.UserManager.class, "user");
            map.put(android.hardware.input.InputManager.class, "input");
            map.put(android.media.MediaRouter.class, "media_router");
            map.put(android.net.nsd.NsdManager.class, "servicediscovery");
            map.put(android.view.accessibility.AccessibilityManager.class, "accessibility");
            map.put(android.accounts.AccountManager.class, "account");
            map.put(android.app.ActivityManager.class, "activity");
            map.put(android.app.AlarmManager.class, androidx.core.app.NotificationCompat.CATEGORY_ALARM);
            map.put(android.media.AudioManager.class, "audio");
            map.put(android.content.ClipboardManager.class, "clipboard");
            map.put(android.net.ConnectivityManager.class, "connectivity");
            map.put(android.app.admin.DevicePolicyManager.class, "device_policy");
            map.put(android.app.DownloadManager.class, "download");
            map.put(android.os.DropBoxManager.class, "dropbox");
            map.put(android.view.inputmethod.InputMethodManager.class, "input_method");
            map.put(android.app.KeyguardManager.class, "keyguard");
            map.put(android.view.LayoutInflater.class, "layout_inflater");
            map.put(android.location.LocationManager.class, com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
            map.put(android.nfc.NfcManager.class, "nfc");
            map.put(android.app.NotificationManager.class, "notification");
            map.put(android.os.PowerManager.class, "power");
            map.put(android.app.SearchManager.class, "search");
            map.put(android.hardware.SensorManager.class, "sensor");
            map.put(android.os.storage.StorageManager.class, com.ironsource.y8.a.k);
            map.put(android.telephony.TelephonyManager.class, "phone");
            map.put(android.view.textservice.TextServicesManager.class, "textservices");
            map.put(android.app.UiModeManager.class, "uimode");
            map.put(android.hardware.usb.UsbManager.class, "usb");
            map.put(android.os.Vibrator.class, "vibrator");
            map.put(android.app.WallpaperManager.class, "wallpaper");
            map.put(android.net.wifi.p2p.WifiP2pManager.class, "wifip2p");
            map.put(android.net.wifi.WifiManager.class, com.json.u8.b);
            map.put(android.view.WindowManager.class, "window");
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static java.io.File[] getExternalCacheDirs(android.content.Context context) {
            return context.getExternalCacheDirs();
        }

        static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
            return context.getExternalFilesDirs(str);
        }

        static java.io.File[] getObbDirs(android.content.Context context) {
            return context.getObbDirs();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
            return context.getDrawable(i);
        }

        static java.io.File getNoBackupFilesDir(android.content.Context context) {
            return context.getNoBackupFilesDir();
        }

        static java.io.File getCodeCacheDir(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getColor(android.content.Context context, int i) {
            return context.getColor(i);
        }

        static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static java.io.File getDataDir(android.content.Context context) {
            return context.getDataDir();
        }

        static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean isDeviceProtectedStorage(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, androidx.core.content.ContextCompat.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        static android.content.ComponentName startForegroundService(android.content.Context context, android.content.Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
            return context.getMainExecutor();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String getAttributionTag(android.content.Context context) {
            return context.getAttributionTag();
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }
}
