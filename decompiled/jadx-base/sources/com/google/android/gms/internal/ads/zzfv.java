package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfv extends com.google.android.gms.internal.ads.zzfr {
    private final android.content.ContentResolver zza;
    private android.net.Uri zzb;
    private android.content.res.AssetFileDescriptor zzc;
    private java.io.FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfv(android.content.Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzfu {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzfu(e, 2000);
            }
        }
        java.io.FileInputStream fileInputStream = this.zzd;
        int i3 = com.google.android.gms.internal.ads.zzei.zza;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzfu {
        int i;
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                android.net.Uri uriNormalizeScheme = zzgdVar.zza.normalizeScheme();
                this.zzb = uriNormalizeScheme;
                zzi(zzgdVar);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.zza.openAssetFileDescriptor(uriNormalizeScheme, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.zzc = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new com.google.android.gms.internal.ads.zzfu(new java.io.IOException("Could not open file descriptor for: " + java.lang.String.valueOf(uriNormalizeScheme)), 2000);
                    } catch (java.io.IOException e) {
                        e = e;
                        if (true == (e instanceof java.io.FileNotFoundException)) {
                            i = 2005;
                        }
                        throw new com.google.android.gms.internal.ads.zzfu(e, i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgdVar.zze > length) {
                    throw new com.google.android.gms.internal.ads.zzfu(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(zzgdVar.zze + startOffset) - startOffset;
                if (jSkip != zzgdVar.zze) {
                    throw new com.google.android.gms.internal.ads.zzfu(null, 2008);
                }
                if (length == -1) {
                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.zze = jPosition;
                        if (jPosition < 0) {
                            throw new com.google.android.gms.internal.ads.zzfu(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.zze = jPosition;
                    if (jPosition < 0) {
                        throw new com.google.android.gms.internal.ads.zzfu(null, 2008);
                    }
                }
                long jMin = zzgdVar.zzf;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = java.lang.Math.min(jPosition, jMin);
                    }
                    this.zze = jMin;
                }
                this.zzf = true;
                zzj(zzgdVar);
                long j = zzgdVar.zzf;
                return j != -1 ? j : this.zze;
            } catch (com.google.android.gms.internal.ads.zzfu e2) {
                throw e2;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws com.google.android.gms.internal.ads.zzfu {
        this.zzb = null;
        try {
            try {
                try {
                    java.io.FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (java.io.IOException e) {
                        throw new com.google.android.gms.internal.ads.zzfu(e, 2000);
                    }
                } catch (java.io.IOException e2) {
                    throw new com.google.android.gms.internal.ads.zzfu(e2, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.zzd = null;
            try {
                android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (java.io.IOException e3) {
                throw new com.google.android.gms.internal.ads.zzfu(e3, 2000);
            }
        }
    }
}
