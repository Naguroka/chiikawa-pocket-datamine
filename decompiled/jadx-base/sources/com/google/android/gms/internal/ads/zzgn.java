package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgn extends com.google.android.gms.internal.ads.zzfr {
    private java.io.RandomAccessFile zza;
    private android.net.Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgm {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = this.zza;
            int i3 = com.google.android.gms.internal.ads.zzei.zza;
            int i4 = randomAccessFile.read(bArr, i, (int) java.lang.Math.min(this.zzc, i2));
            if (i4 > 0) {
                this.zzc -= (long) i4;
                zzg(i4);
            }
            return i4;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzgm(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgm {
        android.net.Uri uri = zzgdVar.zza;
        this.zzb = uri;
        zzi(zzgdVar);
        try {
            java.lang.String path = uri.getPath();
            path.getClass();
            java.lang.String str = path;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(path, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgdVar.zze);
                long length = zzgdVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - zzgdVar.zze;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new com.google.android.gms.internal.ads.zzgm(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzgdVar);
                return this.zzc;
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzgm(e, 2000);
            }
        } catch (java.io.FileNotFoundException e2) {
            if (android.text.TextUtils.isEmpty(uri.getQuery()) && android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new com.google.android.gms.internal.ads.zzgm(e2, ((e2.getCause() instanceof android.system.ErrnoException) && ((android.system.ErrnoException) e2.getCause()).errno == android.system.OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new com.google.android.gms.internal.ads.zzgm(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (java.lang.SecurityException e3) {
            throw new com.google.android.gms.internal.ads.zzgm(e3, 2006);
        } catch (java.lang.RuntimeException e4) {
            throw new com.google.android.gms.internal.ads.zzgm(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zzb;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.gms.internal.ads.zzfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzgm {
        this.zzb = null;
        try {
            java.io.RandomAccessFile randomAccessFile = this.zza;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzgm(e, 2000);
        }
    }
}
