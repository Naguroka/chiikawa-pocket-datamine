package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzeg extends com.google.android.gms.internal.play_billing.zzef {
    protected final byte[] zza;

    zzeg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzei) || zzd() != ((com.google.android.gms.internal.play_billing.zzei) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzeg)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.play_billing.zzeg zzegVar = (com.google.android.gms.internal.play_billing.zzeg) obj;
        int iZzi = zzi();
        int iZzi2 = zzegVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzegVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzegVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzegVar.zzd());
        }
        if (!(zzegVar instanceof com.google.android.gms.internal.play_billing.zzeg)) {
            return zzegVar.zzf(0, iZzd).equals(zzf(0, iZzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzegVar.zza;
        zzegVar.zzc();
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

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    protected final int zze(int i, int i2, int i3) {
        return com.google.android.gms.internal.play_billing.zzfo.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final com.google.android.gms.internal.play_billing.zzei zzf(int i, int i2) {
        int iZzh = zzh(0, i2, zzd());
        return iZzh == 0 ? com.google.android.gms.internal.play_billing.zzei.zzb : new com.google.android.gms.internal.play_billing.zzec(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    final void zzg(com.google.android.gms.internal.play_billing.zzdz zzdzVar) throws java.io.IOException {
        ((com.google.android.gms.internal.play_billing.zzem) zzdzVar).zzc(this.zza, 0, zzd());
    }
}
