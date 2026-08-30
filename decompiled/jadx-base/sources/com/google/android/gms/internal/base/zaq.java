package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zaq extends android.os.Handler {
    private final android.os.Looper zaa;

    public zaq() {
        this.zaa = android.os.Looper.getMainLooper();
    }

    public zaq(android.os.Looper looper) {
        super(looper);
        this.zaa = android.os.Looper.getMainLooper();
    }

    public zaq(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.zaa = android.os.Looper.getMainLooper();
    }
}
