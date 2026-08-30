package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvt extends com.google.android.gms.internal.ads.zzbvv {
    private final java.lang.String zza;
    private final int zzb;

    public zzbvt(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.zzbvt)) {
            com.google.android.gms.internal.ads.zzbvt zzbvtVar = (com.google.android.gms.internal.ads.zzbvt) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zza, zzbvtVar.zza)) {
                if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(zzbvtVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final java.lang.String zzc() {
        return this.zza;
    }
}
