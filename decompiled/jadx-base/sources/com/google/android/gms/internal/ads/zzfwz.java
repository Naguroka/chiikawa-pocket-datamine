package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfwz extends com.google.android.gms.internal.ads.zzfxc {
    zzfwz() {
        super(null);
    }

    static final com.google.android.gms.internal.ads.zzfxc zzf(int i) {
        if (i < 0) {
            return com.google.android.gms.internal.ads.zzfxc.zzb;
        }
        return i > 0 ? com.google.android.gms.internal.ads.zzfxc.zzc : com.google.android.gms.internal.ads.zzfxc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final com.google.android.gms.internal.ads.zzfxc zzb(int i, int i2) {
        return zzf(java.lang.Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final com.google.android.gms.internal.ads.zzfxc zzc(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final com.google.android.gms.internal.ads.zzfxc zzd(boolean z, boolean z2) {
        return zzf(java.lang.Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final com.google.android.gms.internal.ads.zzfxc zze(boolean z, boolean z2) {
        return zzf(java.lang.Boolean.compare(z2, z));
    }
}
