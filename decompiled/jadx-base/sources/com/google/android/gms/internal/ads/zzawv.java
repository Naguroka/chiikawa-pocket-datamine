package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawv extends com.google.android.gms.internal.ads.zzaxr {
    public zzawv(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzascVar, i, 24);
    }

    private final void zzc() {
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClientZzh = this.zza.zzh();
        if (advertisingIdClientZzh == null) {
            return;
        }
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = advertisingIdClientZzh.getInfo();
            java.lang.String id = info.getId();
            int i = com.google.android.gms.internal.ads.zzawg.zza;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                java.util.UUID uuidFromString = java.util.UUID.fromString(id);
                byte[] bArr = new byte[16];
                java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = com.google.android.gms.internal.ads.zzatr.zza(bArr, true);
            }
            if (id != null) {
                synchronized (this.zzd) {
                    this.zzd.zzs(id);
                    this.zzd.zzr(info.isLimitAdTrackingEnabled());
                    this.zzd.zzab(6);
                }
            }
        } catch (java.io.IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (this.zza.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzs((java.lang.String) this.zze.invoke(null, this.zza.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final java.lang.Void zzk() throws java.lang.Exception {
        if (this.zza.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zza.zzq()) {
            zzc();
        }
        return null;
    }
}
