package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfq extends com.google.android.gms.internal.ads.zzfr {
    private final android.content.res.AssetManager zza;
    private android.net.Uri zzb;
    private java.io.InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfq(android.content.Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzfp {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzfp(e, 2000);
            }
        }
        java.io.InputStream inputStream = this.zzc;
        int i3 = com.google.android.gms.internal.ads.zzei.zza;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.zzd;
        if (j2 != -1) {
            this.zzd = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzfp {
        try {
            android.net.Uri uri = zzgdVar.zza;
            this.zzb = uri;
            java.lang.String path = uri.getPath();
            path.getClass();
            java.lang.String str = path;
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzgdVar);
            java.io.InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            if (inputStreamOpen.skip(zzgdVar.zze) < zzgdVar.zze) {
                throw new com.google.android.gms.internal.ads.zzfp(null, 2008);
            }
            long j = zzgdVar.zzf;
            if (j != -1) {
                this.zzd = j;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzj(zzgdVar);
            return this.zzd;
        } catch (com.google.android.gms.internal.ads.zzfp e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.google.android.gms.internal.ads.zzfp(e2, true != (e2 instanceof java.io.FileNotFoundException) ? 2000 : 2005);
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
    public final void zzd() throws com.google.android.gms.internal.ads.zzfp {
        this.zzb = null;
        try {
            java.io.InputStream inputStream = this.zzc;
            if (inputStream != null) {
                inputStream.close();
            }
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzfp(e, 2000);
        }
    }
}
