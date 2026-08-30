package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgw extends com.google.android.gms.internal.ads.zzfr {
    private final android.content.Context zza;
    private com.google.android.gms.internal.ads.zzgd zzb;
    private android.content.res.AssetFileDescriptor zzc;
    private java.io.InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgw(android.content.Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i) {
        return android.net.Uri.parse("rawresource:///" + i);
    }

    private static int zzk(java.lang.String str) throws com.google.android.gms.internal.ads.zzgv {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new com.google.android.gms.internal.ads.zzgv("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static android.content.res.AssetFileDescriptor zzl(android.content.Context context, com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgv {
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.net.Uri uriNormalizeScheme = zzgdVar.zza.normalizeScheme();
        if (android.text.TextUtils.equals(androidx.media3.datasource.RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new com.google.android.gms.internal.ads.zzgv("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = zzk(pathSegments.get(0));
        } else {
            if (!android.text.TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new com.google.android.gms.internal.ads.zzgv("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            java.lang.String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            java.lang.String packageName = android.text.TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new com.google.android.gms.internal.ads.zzgv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new com.google.android.gms.internal.ads.zzgv("Resource not found.", null, 2005);
                }
            }
        }
        try {
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new com.google.android.gms.internal.ads.zzgv("Resource is compressed: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uriNormalizeScheme))), null, 2000);
        } catch (android.content.res.Resources.NotFoundException e2) {
            throw new com.google.android.gms.internal.ads.zzgv(null, e2, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzgv {
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
                throw new com.google.android.gms.internal.ads.zzgv(null, e, 2000);
            }
        }
        java.io.InputStream inputStream = this.zzd;
        int i3 = com.google.android.gms.internal.ads.zzei.zza;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new com.google.android.gms.internal.ads.zzgv("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws com.google.android.gms.internal.ads.zzgv {
        long size;
        this.zzb = zzgdVar;
        zzi(zzgdVar);
        android.content.res.AssetFileDescriptor assetFileDescriptorZzl = zzl(this.zza, zzgdVar);
        this.zzc = assetFileDescriptorZzl;
        long length = assetFileDescriptorZzl.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzgdVar.zze > length) {
                    throw new com.google.android.gms.internal.ads.zzgv(null, null, 2008);
                }
            } catch (com.google.android.gms.internal.ads.zzgv e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new com.google.android.gms.internal.ads.zzgv(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long jSkip = fileInputStream.skip(zzgdVar.zze + startOffset) - startOffset;
        if (jSkip != zzgdVar.zze) {
            throw new com.google.android.gms.internal.ads.zzgv(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new com.google.android.gms.internal.ads.zzgv(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.zze = size;
            if (size < 0) {
                throw new com.google.android.gms.internal.ads.zzfz(2008);
            }
        }
        long jMin = zzgdVar.zzf;
        if (jMin != -1) {
            if (size != -1) {
                jMin = java.lang.Math.min(size, jMin);
            }
            this.zze = jMin;
        }
        this.zzf = true;
        zzj(zzgdVar);
        long j = zzgdVar.zzf;
        return j != -1 ? j : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        com.google.android.gms.internal.ads.zzgd zzgdVar = this.zzb;
        if (zzgdVar != null) {
            return zzgdVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws com.google.android.gms.internal.ads.zzgv {
        this.zzb = null;
        try {
            try {
                try {
                    java.io.InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
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
                        throw new com.google.android.gms.internal.ads.zzgv(null, e, 2000);
                    }
                } catch (java.io.IOException e2) {
                    throw new com.google.android.gms.internal.ads.zzgv(null, e2, 2000);
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
                throw new com.google.android.gms.internal.ads.zzgv(null, e3, 2000);
            }
        }
    }
}
