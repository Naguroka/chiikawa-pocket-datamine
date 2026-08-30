package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbaz extends com.google.android.gms.internal.ads.zzcab {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbf zza;

    zzbaz(com.google.android.gms.internal.ads.zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcab, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        com.google.android.gms.internal.ads.zzbbf.zze(this.zza);
        return super.cancel(z);
    }
}
