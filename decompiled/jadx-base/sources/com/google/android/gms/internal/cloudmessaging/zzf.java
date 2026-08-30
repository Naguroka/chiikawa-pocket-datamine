package com.google.android.gms.internal.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzf extends android.os.Handler {
    private final android.os.Looper zza;

    public zzf() {
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzf(android.os.Looper looper) {
        super(looper);
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzf(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.zza = android.os.Looper.getMainLooper();
    }
}
