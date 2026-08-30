package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzlb extends com.google.android.gms.internal.measurement.zzla {
    protected final byte[] zza;

    zzlb(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzld) || zzd() != ((com.google.android.gms.internal.measurement.zzld) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzlb)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.measurement.zzlb zzlbVar = (com.google.android.gms.internal.measurement.zzlb) obj;
        int iZzi = zzi();
        int iZzi2 = zzlbVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzlbVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzlbVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzlbVar.zzd());
        }
        if (!(zzlbVar instanceof com.google.android.gms.internal.measurement.zzlb)) {
            return zzlbVar.zzf(0, iZzd).equals(zzf(0, iZzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlbVar.zza;
        zzlbVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    protected final int zze(int i, int i2, int i3) {
        return com.google.android.gms.internal.measurement.zzmk.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final com.google.android.gms.internal.measurement.zzld zzf(int i, int i2) {
        int iZzh = zzh(0, i2, zzd());
        return iZzh == 0 ? com.google.android.gms.internal.measurement.zzld.zzb : new com.google.android.gms.internal.measurement.zzky(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    final void zzg(com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        ((com.google.android.gms.internal.measurement.zzlh) zzkvVar).zzc(this.zza, 0, zzd());
    }
}
