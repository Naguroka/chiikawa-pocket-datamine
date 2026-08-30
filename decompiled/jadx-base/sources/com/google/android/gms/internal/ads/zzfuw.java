package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfuw implements com.google.android.gms.internal.ads.zzfvb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfua zza;

    zzfuw(com.google.android.gms.internal.ads.zzfua zzfuaVar) {
        this.zza = zzfuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final /* bridge */ /* synthetic */ java.util.Iterator zza(com.google.android.gms.internal.ads.zzfvc zzfvcVar, java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.ads.zzfuv(this, zzfvcVar, charSequence, this.zza.zza(charSequence));
    }
}
