package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class StatsUtils {
    public static java.lang.String getEventKey(android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf((((long) android.os.Process.myPid()) << 32) | ((long) java.lang.System.identityHashCode(wakeLock)));
        if (true == android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        return java.lang.String.valueOf(strValueOf).concat(java.lang.String.valueOf(str));
    }
}
