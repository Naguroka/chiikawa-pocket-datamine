package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzco {
    public static final android.os.Handler zza = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final java.util.concurrent.Executor zzb = new com.google.android.gms.internal.consent_sdk.zzcn("Google consent worker");

    public static void zza() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Method must be call on main thread.");
        }
    }
}
