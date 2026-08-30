package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakt implements com.google.android.gms.internal.ads.zzakf {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy();
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy();
    private final com.google.android.gms.internal.ads.zzaks zzc = new com.google.android.gms.internal.ads.zzaks();
    private java.util.zip.Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zza;
        if (zzdyVar.zzb() > 0 && zzdyVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new java.util.zip.Inflater();
            }
            if (com.google.android.gms.internal.ads.zzei.zzH(zzdyVar, this.zzb, this.zzd)) {
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzb;
                zzdyVar.zzJ(zzdyVar2.zzN(), zzdyVar2.zze());
            }
        }
        this.zzc.zze();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zza;
            if (zzdyVar3.zzb() < 3) {
                zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
                return;
            }
            com.google.android.gms.internal.ads.zzaks zzaksVar = this.zzc;
            int iZze = zzdyVar3.zze();
            int iZzm = zzdyVar3.zzm();
            int iZzq = zzdyVar3.zzq();
            int iZzd = zzdyVar3.zzd() + iZzq;
            com.google.android.gms.internal.ads.zzco zzcoVar = null;
            if (iZzd > iZze) {
                zzdyVar3.zzL(iZze);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            com.google.android.gms.internal.ads.zzaks.zzd(zzaksVar, zzdyVar3, iZzq);
                            break;
                        case 21:
                            com.google.android.gms.internal.ads.zzaks.zzb(zzaksVar, zzdyVar3, iZzq);
                            break;
                        case 22:
                            com.google.android.gms.internal.ads.zzaks.zzc(zzaksVar, zzdyVar3, iZzq);
                            break;
                    }
                } else {
                    com.google.android.gms.internal.ads.zzco zzcoVarZza = zzaksVar.zza();
                    zzaksVar.zze();
                    zzcoVar = zzcoVarZza;
                }
                zzdyVar3.zzL(iZzd);
            }
            if (zzcoVar != null) {
                arrayList.add(zzcoVar);
            }
        }
    }
}
