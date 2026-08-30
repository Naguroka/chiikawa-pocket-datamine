package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
class zzjm extends com.google.android.gms.internal.drive.zzjl {
    protected final byte[] zzny;

    zzjm(byte[] bArr) {
        bArr.getClass();
        this.zzny = bArr;
    }

    protected int zzbw() {
        return 0;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzs(int i) {
        return this.zzny[i];
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    byte zzt(int i) {
        return this.zzny[i];
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public int size() {
        return this.zzny.length;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final com.google.android.gms.internal.drive.zzjc zza(int i, int i2) {
        int iZzb = zzb(0, i2, size());
        if (iZzb == 0) {
            return com.google.android.gms.internal.drive.zzjc.zznq;
        }
        return new com.google.android.gms.internal.drive.zzjh(this.zzny, zzbw(), iZzb);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    final void zza(com.google.android.gms.internal.drive.zzjb zzjbVar) throws java.io.IOException {
        zzjbVar.zza(this.zzny, zzbw(), size());
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final java.lang.String zza(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzny, zzbw(), size(), charset);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean zzbu() {
        int iZzbw = zzbw();
        return com.google.android.gms.internal.drive.zznf.zze(this.zzny, iZzbw, size() + iZzbw);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzjc) || size() != ((com.google.android.gms.internal.drive.zzjc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzjm) {
            com.google.android.gms.internal.drive.zzjm zzjmVar = (com.google.android.gms.internal.drive.zzjm) obj;
            int iZzbv = zzbv();
            int iZzbv2 = zzjmVar.zzbv();
            if (iZzbv == 0 || iZzbv2 == 0 || iZzbv == iZzbv2) {
                return zza(zzjmVar, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.drive.zzjl
    final boolean zza(com.google.android.gms.internal.drive.zzjc zzjcVar, int i, int i2) {
        if (i2 > zzjcVar.size()) {
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(40).append("Length too large: ").append(i2).append(size()).toString());
        }
        if (i2 > zzjcVar.size()) {
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(59).append("Ran off end of other: 0, ").append(i2).append(", ").append(zzjcVar.size()).toString());
        }
        if (zzjcVar instanceof com.google.android.gms.internal.drive.zzjm) {
            com.google.android.gms.internal.drive.zzjm zzjmVar = (com.google.android.gms.internal.drive.zzjm) zzjcVar;
            byte[] bArr = this.zzny;
            byte[] bArr2 = zzjmVar.zzny;
            int iZzbw = zzbw() + i2;
            int iZzbw2 = zzbw();
            int iZzbw3 = zzjmVar.zzbw();
            while (iZzbw2 < iZzbw) {
                if (bArr[iZzbw2] != bArr2[iZzbw3]) {
                    return false;
                }
                iZzbw2++;
                iZzbw3++;
            }
            return true;
        }
        return zzjcVar.zza(0, i2).equals(zza(0, i2));
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.drive.zzkm.zza(i, this.zzny, zzbw(), i3);
    }
}
