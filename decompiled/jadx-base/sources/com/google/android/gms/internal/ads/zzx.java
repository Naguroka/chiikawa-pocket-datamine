package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzx {
    private final android.util.SparseBooleanArray zza;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzx)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzx zzxVar = (com.google.android.gms.internal.ads.zzx) obj;
        if (com.google.android.gms.internal.ads.zzei.zza >= 24) {
            return this.zza.equals(zzxVar.zza);
        }
        if (this.zza.size() != zzxVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (zza(i) != zzxVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (com.google.android.gms.internal.ads.zzei.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i = 0; i < this.zza.size(); i++) {
            size = (size * 31) + zza(i);
        }
        return size;
    }

    public final int zza(int i) {
        com.google.android.gms.internal.ads.zzcw.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
