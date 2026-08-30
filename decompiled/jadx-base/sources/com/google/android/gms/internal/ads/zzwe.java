package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzwe {
    private int zza;
    private final android.util.SparseArray zzb;
    private final com.google.android.gms.internal.ads.zzdb zzc;

    public zzwe() {
        this(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
            }
        });
    }

    public final java.lang.Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i, java.lang.Object obj) {
        if (this.zza == -1) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            android.util.SparseArray sparseArray = this.zzb;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.google.android.gms.internal.ads.zzcw.zzd(i >= iKeyAt);
            if (iKeyAt == i) {
                com.google.android.gms.internal.ads.zzdb zzdbVar = this.zzc;
                android.util.SparseArray sparseArray2 = this.zzb;
                zzdbVar.zza(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            this.zzc.zza(this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.zzb.keyAt(i3)) {
                return;
            }
            this.zzc.zza(this.zzb.valueAt(i2));
            this.zzb.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwe(com.google.android.gms.internal.ads.zzdb zzdbVar) {
        this.zzb = new android.util.SparseArray();
        this.zzc = zzdbVar;
        this.zza = -1;
    }

    public final java.lang.Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 <= 0 || i >= this.zzb.keyAt(i2)) {
                break;
            }
            this.zza--;
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }
}
