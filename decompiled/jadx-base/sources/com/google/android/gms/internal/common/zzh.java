package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzh extends android.os.Handler {
    private final android.os.Looper zza;

    public zzh() {
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzh(android.os.Looper looper) {
        super(looper);
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzh(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.zza = android.os.Looper.getMainLooper();
    }
}
