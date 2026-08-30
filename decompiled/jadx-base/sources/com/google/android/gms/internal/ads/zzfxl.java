package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxl extends com.google.android.gms.internal.ads.zzfvn {
    private final com.google.android.gms.internal.ads.zzfxn zza;

    zzfxl(com.google.android.gms.internal.ads.zzfxn zzfxnVar, int i) {
        super(zzfxnVar.size(), i);
        this.zza = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
