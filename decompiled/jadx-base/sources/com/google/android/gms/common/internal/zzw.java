package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
    zzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws android.os.RemoteException {
        zzD(2, zza());
    }
}
