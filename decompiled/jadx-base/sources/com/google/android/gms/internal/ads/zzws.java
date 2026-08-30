package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzws implements com.google.android.gms.internal.ads.zzxv {
    protected final com.google.android.gms.internal.ads.zzbr zza;
    protected final int zzb;
    protected final int[] zzc;
    private final com.google.android.gms.internal.ads.zzab[] zzd;
    private int zze;

    public zzws(com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr, int i) {
        int length = iArr.length;
        com.google.android.gms.internal.ads.zzcw.zzf(length > 0);
        zzbrVar.getClass();
        this.zza = zzbrVar;
        this.zzb = length;
        this.zzd = new com.google.android.gms.internal.ads.zzab[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbrVar.zzb(iArr[i2]);
        }
        java.util.Arrays.sort(this.zzd, new java.util.Comparator() { // from class: com.google.android.gms.internal.ads.zzwr
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.android.gms.internal.ads.zzab) obj2).zzj - ((com.google.android.gms.internal.ads.zzab) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbrVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzws zzwsVar = (com.google.android.gms.internal.ads.zzws) obj;
            if (this.zza.equals(zzwsVar.zza) && java.util.Arrays.equals(this.zzc, zzwsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (java.lang.System.identityHashCode(this.zza) * 31) + java.util.Arrays.hashCode(this.zzc);
        this.zze = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zza(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zzb() {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzc(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzd() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final com.google.android.gms.internal.ads.zzab zze(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final com.google.android.gms.internal.ads.zzab zzf() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final com.google.android.gms.internal.ads.zzbr zzg() {
        return this.zza;
    }
}
