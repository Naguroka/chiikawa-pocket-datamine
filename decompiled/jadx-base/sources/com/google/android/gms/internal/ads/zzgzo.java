package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzo implements com.google.android.gms.internal.ads.zzgyz {
    private final com.google.android.gms.internal.ads.zzgzc zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzgzo(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zza = zzgzcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final com.google.android.gms.internal.ads.zzgzc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    final java.lang.String zzd() {
        return this.zzb;
    }

    final java.lang.Object[] zze() {
        return this.zzc;
    }
}
