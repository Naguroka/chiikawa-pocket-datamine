package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemf implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzetr zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzbzm zzd;

    zzemf(com.google.android.gms.internal.ads.zzeoj zzeojVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.content.Context context, com.google.android.gms.internal.ads.zzbzm zzbzmVar) {
        this.zza = zzeojVar;
        this.zzb = zzfcjVar;
        this.zzc = context;
        this.zzd = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzgch.zzm(this.zza.zzb(), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.zza.zzc((com.google.android.gms.internal.ads.zzeua) obj);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzemg zzc(com.google.android.gms.internal.ads.zzeua zzeuaVar) {
        java.lang.String str;
        boolean z;
        java.lang.String strZzj;
        float f;
        int i;
        int i2;
        int i3;
        android.util.DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = zzsVar.zzg;
        if (zzsVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar2 : zzsVarArr) {
                boolean z4 = zzsVar2.zzi;
                if (!z4 && !z2) {
                    str = zzsVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzsVar.zza;
            z = zzsVar.zzi;
        }
        android.content.res.Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzj = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            com.google.android.gms.internal.ads.zzbzm zzbzmVar = this.zzd;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            strZzj = zzbzmVar.zzi().zzj();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr2 = zzsVar.zzg;
        if (zzsVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar3 : zzsVarArr2) {
                if (zzsVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i4 = zzsVar3.zze;
                    if (i4 == -1) {
                        i4 = f != 0.0f ? (int) (zzsVar3.zzf / f) : -1;
                    }
                    sb.append(i4);
                    sb.append("x");
                    int i5 = zzsVar3.zzb;
                    if (i5 == -2) {
                        i5 = f != 0.0f ? (int) (zzsVar3.zzc / f) : -2;
                    }
                    sb.append(i5);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new com.google.android.gms.internal.ads.zzemg(zzsVar, str, z, sb.toString(), f, i2, i, strZzj, this.zzb.zzq);
    }
}
