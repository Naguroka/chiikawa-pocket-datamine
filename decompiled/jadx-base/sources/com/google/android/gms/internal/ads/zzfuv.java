package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfuv extends com.google.android.gms.internal.ads.zzfva {
    final /* synthetic */ com.google.android.gms.internal.ads.zzftz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfuv(com.google.android.gms.internal.ads.zzfuw zzfuwVar, com.google.android.gms.internal.ads.zzfvc zzfvcVar, java.lang.CharSequence charSequence, com.google.android.gms.internal.ads.zzftz zzftzVar) {
        super(zzfvcVar, charSequence);
        this.zza = zzftzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int i) {
        return ((com.google.android.gms.internal.ads.zzfud) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int i) {
        if (((com.google.android.gms.internal.ads.zzfud) this.zza).zza.find(i)) {
            return ((com.google.android.gms.internal.ads.zzfud) this.zza).zza.start();
        }
        return -1;
    }
}
