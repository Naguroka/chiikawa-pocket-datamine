package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzall implements com.google.android.gms.internal.ads.zzakf {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy();

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzake zzakeVar, com.google.android.gms.internal.ads.zzdb zzdbVar) {
        com.google.android.gms.internal.ads.zzco zzcoVarZzp;
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = this.zza;
            if (zzdyVar.zzb() <= 0) {
                zzdbVar.zza(new com.google.android.gms.internal.ads.zzajx(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
                return;
            }
            com.google.android.gms.internal.ads.zzcw.zze(zzdyVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zza;
            int iZzg = zzdyVar2.zzg() - 8;
            if (zzdyVar2.zzg() == 1987343459) {
                com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zza;
                java.lang.CharSequence charSequenceZza = null;
                com.google.android.gms.internal.ads.zzcm zzcmVarZzb = null;
                while (iZzg > 0) {
                    com.google.android.gms.internal.ads.zzcw.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzdyVar3.zzg();
                    int iZzg3 = zzdyVar3.zzg();
                    int i3 = iZzg - 8;
                    int i4 = iZzg2 - 8;
                    java.lang.String strZzC = com.google.android.gms.internal.ads.zzei.zzC(zzdyVar3.zzN(), zzdyVar3.zzd(), i4);
                    zzdyVar3.zzM(i4);
                    if (iZzg3 == 1937011815) {
                        zzcmVarZzb = com.google.android.gms.internal.ads.zzalv.zzb(strZzC);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = com.google.android.gms.internal.ads.zzalv.zza(null, strZzC.trim(), java.util.Collections.emptyList());
                    }
                    iZzg = i3 - i4;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzcmVarZzb != null) {
                    zzcmVarZzb.zzl(charSequenceZza);
                    zzcoVarZzp = zzcmVarZzb.zzp();
                } else {
                    com.google.android.gms.internal.ads.zzalt zzaltVar = new com.google.android.gms.internal.ads.zzalt();
                    zzaltVar.zzc = charSequenceZza;
                    zzcoVarZzp = zzaltVar.zza().zzp();
                }
                arrayList.add(zzcoVarZzp);
            } else {
                this.zza.zzM(iZzg);
            }
        }
    }
}
