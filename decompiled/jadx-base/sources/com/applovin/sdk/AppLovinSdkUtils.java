package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinSdkUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.os.Handler f1609a = new android.os.Handler(android.os.Looper.getMainLooper());

    public static final class Size {
        public static final com.applovin.sdk.AppLovinSdkUtils.Size ZERO = new com.applovin.sdk.AppLovinSdkUtils.Size(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1610a;
        private int b;

        public Size(int i, int i2) {
            this.f1610a = i;
            this.b = i2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.sdk.AppLovinSdkUtils.Size)) {
                return false;
            }
            com.applovin.sdk.AppLovinSdkUtils.Size size = (com.applovin.sdk.AppLovinSdkUtils.Size) obj;
            return this.f1610a == size.getWidth() && this.b == size.getHeight();
        }

        public int getHeight() {
            return this.b;
        }

        public int getWidth() {
            return this.f1610a;
        }

        public int hashCode() {
            int i = this.b;
            int i2 = this.f1610a;
            return i ^ ((i2 >>> 16) | (i2 << 16));
        }

        public java.lang.String toString() {
            return this.f1610a + "x" + this.b;
        }
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        return com.applovin.impl.sdk.utils.StringUtils.startsWithAtLeastOnePrefix(str, com.applovin.impl.sdk.utils.CollectionUtils.explode(str2));
    }

    public static int dpToPx(android.content.Context context, int i) {
        return (int) android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int getOrientation(android.content.Context context) {
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static boolean isEmulator() {
        return a(android.os.Build.DEVICE, "goldfish,vbox") || a(android.os.Build.HARDWARE, "ranchu,generic,vbox") || a(android.os.Build.MANUFACTURER, "Genymotion") || a(android.os.Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(android.content.Context context) {
        return "amazon".equalsIgnoreCase(android.os.Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isInclusiveVersion(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        int iF = com.applovin.impl.yp.f(str);
        if (str2 == null || iF >= com.applovin.impl.yp.f(str2)) {
            return str3 == null || iF <= com.applovin.impl.yp.f(str3);
        }
        return false;
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(java.lang.String str) {
        return com.applovin.sdk.AppLovinSdk.VERSION_CODE >= com.applovin.impl.yp.f(str);
    }

    public static boolean isTablet(android.content.Context context) {
        android.graphics.Point pointB = com.applovin.impl.z3.b(context);
        return java.lang.Math.min(pointB.x, pointB.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(android.content.Context context) {
        if (isFireTv(context)) {
            return true;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        return com.applovin.impl.z3.f() ? packageManager.hasSystemFeature("android.software.leanback") : packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str);
    }

    public static int pxToDp(android.content.Context context, int i) {
        return (int) java.lang.Math.ceil(i / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(java.lang.Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(java.lang.Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, f1609a);
    }

    public static void setImageUrl(java.lang.String str, android.widget.ImageView imageView, com.applovin.sdk.AppLovinSdk appLovinSdk) {
        com.applovin.impl.sdk.utils.ImageViewUtils.setImageUri(imageView, android.net.Uri.parse(str), appLovinSdk.a());
    }

    public static java.util.Map<java.lang.String, java.lang.String> toMap(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return com.applovin.impl.sdk.utils.JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z, java.lang.Runnable runnable) {
        if (z || !com.applovin.impl.yp.h()) {
            f1609a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(java.lang.Runnable runnable, long j, android.os.Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (com.applovin.impl.yp.h()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
