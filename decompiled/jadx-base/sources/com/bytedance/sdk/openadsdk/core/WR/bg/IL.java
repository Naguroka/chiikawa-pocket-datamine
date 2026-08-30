package com.bytedance.sdk.openadsdk.core.WR.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static volatile com.bytedance.sdk.openadsdk.core.WR.bg.IL bg;
    private final java.util.ArrayList<java.lang.String> IL = new java.util.ArrayList<>();
    private final java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    private long eqN = java.lang.System.currentTimeMillis();
    private long zx = 0;
    private long ldr = 0;
    private java.lang.String iR = "";
    private java.lang.String Kg = "";
    private java.lang.String WR = "";
    private boolean eo = false;
    private boolean VB = false;

    public static com.bytedance.sdk.openadsdk.core.WR.bg.IL bg(android.app.Application application) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.WR.bg.IL.class) {
                if (bg == null) {
                    com.bytedance.sdk.openadsdk.core.WR.bg.IL il = new com.bytedance.sdk.openadsdk.core.WR.bg.IL();
                    bg = il;
                    il.eo = bg((android.content.Context) application);
                    bg.VB = bg(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    bg.bg();
                }
            }
        }
        return bg;
    }

    private static int bg(android.content.Context context, java.lang.String str) {
        try {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    private static boolean bg(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void bg(android.app.Activity activity) {
        java.lang.String localClassName = activity.getLocalClassName();
        if (this.IL.size() == 0) {
            this.iR = localClassName;
            this.zx = java.lang.System.currentTimeMillis();
            this.ldr = java.lang.System.currentTimeMillis() - this.eqN;
            this.bX.set(false);
        }
        if (!this.IL.contains(localClassName)) {
            this.IL.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.WR = localClassName;
    }

    public void IL(android.app.Activity activity) {
        java.lang.String localClassName = activity.getLocalClassName();
        if (this.IL.contains(localClassName)) {
            this.IL.remove(localClassName);
        }
        if (this.IL.size() == 0) {
            this.eqN = java.lang.System.currentTimeMillis();
            this.bX.set(true);
            this.Kg = localClassName;
        }
    }

    private void bg() {
        int size;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                java.lang.Class<?> cls2 = java.lang.Class.forName("android.app.ActivityThread$ActivityClientRecord");
                java.lang.reflect.Field declaredField2 = cls2.getDeclaredField(com.ironsource.y8.h.h0);
                declaredField2.setAccessible(true);
                java.lang.reflect.Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    java.lang.Object objValueAt = arrayMap.valueAt(i);
                    if (!((java.lang.Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        java.lang.String localClassName = ((android.app.Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.IL.contains(localClassName)) {
                            this.IL.add(localClassName);
                        }
                    }
                }
                this.bX.set(this.IL.size() <= 0);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public java.lang.String bg(java.lang.String str, long j, int i) {
        java.lang.String string;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.zx;
        long j3 = jCurrentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.bX.get() && this.VB) {
            i2 |= 2;
        }
        if (!this.bX.get() && this.ldr >= 5000 && j2 < 1000) {
            i2 = this.Kg.equals(this.WR) ? i2 | 4 : i2 | 8;
        }
        try {
            string = new org.json.JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.ldr).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.bX).put("alert", this.VB).put(androidx.core.app.NotificationCompat.CATEGORY_SYSTEM, this.eo).put("actsize", this.IL.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.IL.bX()).toString();
        } catch (org.json.JSONException unused) {
            string = "";
        }
        this.iR = "";
        this.ldr = 0L;
        this.zx = 0L;
        this.eqN = java.lang.System.currentTimeMillis();
        return string;
    }
}
