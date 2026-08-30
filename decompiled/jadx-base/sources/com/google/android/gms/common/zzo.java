package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzo extends com.google.android.gms.common.zzm {
    private static final java.lang.ref.WeakReference zza = new java.lang.ref.WeakReference(null);
    private java.lang.ref.WeakReference zzb;

    zzo(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    protected abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzm
    final byte[] zzf() {
        byte[] bArrZzb;
        synchronized (this) {
            bArrZzb = (byte[]) this.zzb.get();
            if (bArrZzb == null) {
                bArrZzb = zzb();
                this.zzb = new java.lang.ref.WeakReference(bArrZzb);
            }
        }
        return bArrZzb;
    }
}
