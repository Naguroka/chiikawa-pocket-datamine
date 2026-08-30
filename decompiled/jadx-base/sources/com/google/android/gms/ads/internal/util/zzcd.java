package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcd {
    @java.lang.Deprecated
    public static java.lang.Object zza(android.content.Context context, java.util.concurrent.Callable callable) {
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            try {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected exception.", th);
            com.google.android.gms.internal.ads.zzbuh.zza(context).zzh(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
