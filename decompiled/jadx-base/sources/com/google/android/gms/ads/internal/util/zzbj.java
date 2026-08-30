package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbj extends com.google.android.gms.internal.ads.zzaqr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ java.util.Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(com.google.android.gms.ads.internal.util.zzbo zzboVar, int i, java.lang.String str, com.google.android.gms.internal.ads.zzapr zzaprVar, com.google.android.gms.internal.ads.zzapq zzapqVar, byte[] bArr, java.util.Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzaprVar, zzapqVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final java.util.Map zzl() throws com.google.android.gms.internal.ads.zzaou {
        java.util.Map map = this.zzb;
        return map == null ? java.util.Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr, com.google.android.gms.internal.ads.zzapm
    protected final /* bridge */ /* synthetic */ void zzo(java.lang.Object obj) {
        zzo((java.lang.String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final byte[] zzx() throws com.google.android.gms.internal.ads.zzaou {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqr
    /* JADX INFO: renamed from: zzz */
    public final void zzo(java.lang.String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
