package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzekq implements com.google.android.gms.internal.ads.zzcye {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zza.set(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        com.google.android.gms.internal.ads.zzeyt.zza(this.zza, new com.google.android.gms.internal.ads.zzeys() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(java.lang.Object obj) throws android.os.RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
            }
        });
    }
}
