package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
class zzgwg extends com.google.android.gms.internal.ads.zzgwf {
    protected final byte[] zza;

    zzgwg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgwj) || zzd() != ((com.google.android.gms.internal.ads.zzgwj) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzgwg)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.ads.zzgwg zzgwgVar = (com.google.android.gms.internal.ads.zzgwg) obj;
        int iZzr = zzr();
        int iZzr2 = zzgwgVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgwgVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    final boolean zzg(com.google.android.gms.internal.ads.zzgwj zzgwjVar, int i, int i2) {
        if (i2 > zzgwjVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgwjVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgwjVar.zzd());
        }
        if (!(zzgwjVar instanceof com.google.android.gms.internal.ads.zzgwg)) {
            return zzgwjVar.zzk(i, i3).equals(zzk(0, i2));
        }
        com.google.android.gms.internal.ads.zzgwg zzgwgVar = (com.google.android.gms.internal.ads.zzgwg) zzgwjVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgwgVar.zza;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzgwgVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final int zzi(int i, int i2, int i3) {
        return com.google.android.gms.internal.ads.zzgye.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return com.google.android.gms.internal.ads.zzhat.zzf(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final com.google.android.gms.internal.ads.zzgwj zzk(int i, int i2) {
        int iZzq = zzq(i, i2, zzd());
        return iZzq == 0 ? com.google.android.gms.internal.ads.zzgwj.zzb : new com.google.android.gms.internal.ads.zzgwd(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final com.google.android.gms.internal.ads.zzgwp zzl() {
        return com.google.android.gms.internal.ads.zzgwp.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final java.lang.String zzm(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final java.nio.ByteBuffer zzn() {
        return java.nio.ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    final void zzo(com.google.android.gms.internal.ads.zzgwa zzgwaVar) throws java.io.IOException {
        zzgwaVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        int iZzc = zzc();
        return com.google.android.gms.internal.ads.zzhat.zzi(this.zza, iZzc, zzd() + iZzc);
    }
}
