package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zztq implements com.google.android.gms.internal.ads.zzwa {
    private final com.google.android.gms.internal.ads.zzfxn zza;
    private long zzb;

    public zztq(java.util.List list, java.util.List list2) {
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        com.google.android.gms.internal.ads.zzcw.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzfxkVar.zzf(new com.google.android.gms.internal.ads.zztp((com.google.android.gms.internal.ads.zzwa) list.get(i), (java.util.List) list2.get(i)));
        }
        this.zza = zzfxkVar.zzi();
        this.zzb = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            com.google.android.gms.internal.ads.zztp zztpVar = (com.google.android.gms.internal.ads.zztp) this.zza.get(i);
            long jZzb = zztpVar.zzb();
            if ((zztpVar.zza().contains(1) || zztpVar.zza().contains(2) || zztpVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = java.lang.Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != androidx.media3.common.C.TIME_UNSET ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long jZzc = ((com.google.android.gms.internal.ads.zztp) this.zza.get(i)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((com.google.android.gms.internal.ads.zztp) this.zza.get(i)).zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(com.google.android.gms.internal.ads.zzkj zzkjVar) {
        boolean zZzo;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long jZzc2 = ((com.google.android.gms.internal.ads.zztp) this.zza.get(i)).zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzkjVar.zza;
                if (jZzc2 == jZzc || z2) {
                    zZzo |= ((com.google.android.gms.internal.ads.zztp) this.zza.get(i)).zzo(zzkjVar);
                }
            }
            z |= zZzo;
        } while (zZzo);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((com.google.android.gms.internal.ads.zztp) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
