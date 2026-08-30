package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzfgv {
    public static com.google.android.gms.internal.ads.zzfgw zza(android.content.Context context, int i) {
        boolean zBooleanValue;
        if (com.google.android.gms.internal.ads.zzfhk.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new com.google.android.gms.internal.ads.zzfgy(context, i);
            }
        }
        return new com.google.android.gms.internal.ads.zzfid();
    }

    public static com.google.android.gms.internal.ads.zzfgw zzb(android.content.Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = zza(context, i);
        if (zzfgwVarZza instanceof com.google.android.gms.internal.ads.zzfgy) {
            zzfgwVarZza.zzi();
            zzfgwVarZza.zzn(i2);
            zzfgwVarZza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzmVar.zzm));
            if (com.google.android.gms.internal.ads.zzfhg.zze(zzmVar.zzp)) {
                zzfgwVarZza.zze(zzmVar.zzp);
            }
        }
        return zzfgwVarZza;
    }
}
