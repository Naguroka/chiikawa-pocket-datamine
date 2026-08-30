package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgf implements com.google.android.gms.internal.ads.zzfy {
    private final android.content.Context zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzfy zzc;
    private com.google.android.gms.internal.ads.zzfy zzd;
    private com.google.android.gms.internal.ads.zzfy zze;
    private com.google.android.gms.internal.ads.zzfy zzf;
    private com.google.android.gms.internal.ads.zzfy zzg;
    private com.google.android.gms.internal.ads.zzfy zzh;
    private com.google.android.gms.internal.ads.zzfy zzi;
    private com.google.android.gms.internal.ads.zzfy zzj;
    private com.google.android.gms.internal.ads.zzfy zzk;

    public zzgf(android.content.Context context, com.google.android.gms.internal.ads.zzfy zzfyVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfyVar;
    }

    private final com.google.android.gms.internal.ads.zzfy zzg() {
        if (this.zze == null) {
            com.google.android.gms.internal.ads.zzfq zzfqVar = new com.google.android.gms.internal.ads.zzfq(this.zza);
            this.zze = zzfqVar;
            zzh(zzfqVar);
        }
        return this.zze;
    }

    private final void zzh(com.google.android.gms.internal.ads.zzfy zzfyVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfyVar.zzf((com.google.android.gms.internal.ads.zzgy) this.zzb.get(i));
        }
    }

    private static final void zzi(com.google.android.gms.internal.ads.zzfy zzfyVar, com.google.android.gms.internal.ads.zzgy zzgyVar) {
        if (zzfyVar != null) {
            zzfyVar.zzf(zzgyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfy zzfyVar;
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzk == null);
        java.lang.String scheme = zzgdVar.zza.getScheme();
        android.net.Uri uri = zzgdVar.zza;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        java.lang.String scheme2 = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme2) || com.ironsource.y8.h.b.equals(scheme2)) {
            java.lang.String path = zzgdVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    com.google.android.gms.internal.ads.zzgn zzgnVar = new com.google.android.gms.internal.ads.zzgn();
                    this.zzd = zzgnVar;
                    zzh(zzgnVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                com.google.android.gms.internal.ads.zzfv zzfvVar = new com.google.android.gms.internal.ads.zzfv(this.zza);
                this.zzf = zzfvVar;
                zzh(zzfvVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    com.google.android.gms.internal.ads.zzfy zzfyVar2 = (com.google.android.gms.internal.ads.zzfy) java.lang.Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                    this.zzg = zzfyVar2;
                    zzh(zzfyVar2);
                } catch (java.lang.ClassNotFoundException unused) {
                    com.google.android.gms.internal.ads.zzdo.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                com.google.android.gms.internal.ads.zzha zzhaVar = new com.google.android.gms.internal.ads.zzha(2000);
                this.zzh = zzhaVar;
                zzh(zzhaVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                com.google.android.gms.internal.ads.zzfw zzfwVar = new com.google.android.gms.internal.ads.zzfw();
                this.zzi = zzfwVar;
                zzh(zzfwVar);
            }
            this.zzk = this.zzi;
        } else {
            if (androidx.media3.datasource.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(this.zza);
                    this.zzj = zzgwVar;
                    zzh(zzgwVar);
                }
                zzfyVar = this.zzj;
            } else {
                zzfyVar = this.zzc;
            }
            this.zzk = zzfyVar;
        }
        return this.zzk.zzb(zzgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        com.google.android.gms.internal.ads.zzfy zzfyVar = this.zzk;
        if (zzfyVar == null) {
            return null;
        }
        return zzfyVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfy zzfyVar = this.zzk;
        if (zzfyVar != null) {
            try {
                zzfyVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final java.util.Map zze() {
        com.google.android.gms.internal.ads.zzfy zzfyVar = this.zzk;
        return zzfyVar == null ? java.util.Collections.emptyMap() : zzfyVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfy zzfyVar = this.zzk;
        zzfyVar.getClass();
        return zzfyVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zzc.zzf(zzgyVar);
        this.zzb.add(zzgyVar);
        zzi(this.zzd, zzgyVar);
        zzi(this.zze, zzgyVar);
        zzi(this.zzf, zzgyVar);
        zzi(this.zzg, zzgyVar);
        zzi(this.zzh, zzgyVar);
        zzi(this.zzi, zzgyVar);
        zzi(this.zzj, zzgyVar);
    }
}
