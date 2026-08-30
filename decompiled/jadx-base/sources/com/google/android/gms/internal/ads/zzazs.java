package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzazs {
    final long zza;
    final java.lang.String zzb;
    final int zzc;

    zzazs(long j, java.lang.String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.internal.ads.zzazs)) {
            com.google.android.gms.internal.ads.zzazs zzazsVar = (com.google.android.gms.internal.ads.zzazs) obj;
            if (zzazsVar.zza == this.zza && zzazsVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
