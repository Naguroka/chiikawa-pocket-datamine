package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfei implements com.google.android.gms.internal.ads.zzfeg {
    private final java.lang.String zza;

    public zzfei(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfeg
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfei) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzfei) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfeg
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza;
    }
}
