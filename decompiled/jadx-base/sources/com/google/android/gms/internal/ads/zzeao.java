package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeao extends com.google.android.gms.internal.ads.zzeap {
    private static final android.util.SparseArray zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcuw zzd;
    private final android.telephony.TelephonyManager zze;
    private final com.google.android.gms.internal.ads.zzeag zzf;
    private com.google.android.gms.internal.ads.zzbbq.zzq zzg;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        zzb = sparseArray;
        sparseArray.put(android.net.NetworkInfo.DetailedState.CONNECTED.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.CONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.CONNECTING.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.DISCONNECTING.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.DISCONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.BLOCKED.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.DISCONNECTED.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.FAILED.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.IDLE.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.SCANNING.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.SUSPENDED.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.SUSPENDED);
        sparseArray.put(android.net.NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(android.net.NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.CONNECTING);
    }

    zzeao(android.content.Context context, com.google.android.gms.internal.ads.zzcuw zzcuwVar, com.google.android.gms.internal.ads.zzeag zzeagVar, com.google.android.gms.internal.ads.zzeac zzeacVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeacVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcuwVar;
        this.zzf = zzeagVar;
        this.zze = (android.telephony.TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbbq.zzab zza(com.google.android.gms.internal.ads.zzeao zzeaoVar, android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzbbq.zzab.zzb zzbVar;
        com.google.android.gms.internal.ads.zzbbq.zzab.zza zzaVarZza = com.google.android.gms.internal.ads.zzbbq.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzeaoVar.zzg = com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_TRUE;
        } else {
            zzeaoVar.zzg = com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZza.zzd(com.google.android.gms.internal.ads.zzbbq.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZza.zzd(com.google.android.gms.internal.ads.zzbbq.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(com.google.android.gms.internal.ads.zzbbq.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = com.google.android.gms.internal.ads.zzbbq.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = com.google.android.gms.internal.ads.zzbbq.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = com.google.android.gms.internal.ads.zzbbq.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = com.google.android.gms.internal.ads.zzbbq.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbbq.zzaf.zzd zzb(com.google.android.gms.internal.ads.zzeao zzeaoVar, android.os.Bundle bundle) {
        return (com.google.android.gms.internal.ads.zzbbq.zzaf.zzd) zzb.get(com.google.android.gms.internal.ads.zzfcx.zza(com.google.android.gms.internal.ads.zzfcx.zza(bundle, com.ironsource.y8.h.G), "network").getInt("active_network_state", -1), com.google.android.gms.internal.ads.zzbbq.zzaf.zzd.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(com.google.android.gms.internal.ads.zzeao zzeaoVar, boolean z, java.util.ArrayList arrayList, com.google.android.gms.internal.ads.zzbbq.zzab zzabVar, com.google.android.gms.internal.ads.zzbbq.zzaf.zzd zzdVar) {
        com.google.android.gms.internal.ads.zzbbq.zzaf.zza.C0179zza c0179zzaZzn = com.google.android.gms.internal.ads.zzbbq.zzaf.zza.zzn();
        c0179zzaZzn.zzn(arrayList);
        c0179zzaZzn.zzD(zzg(android.provider.Settings.Global.getInt(zzeaoVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0179zzaZzn.zzE(com.google.android.gms.ads.internal.zzv.zzr().zzg(zzeaoVar.zzc, zzeaoVar.zze));
        c0179zzaZzn.zzM(zzeaoVar.zzf.zze());
        c0179zzaZzn.zzL(zzeaoVar.zzf.zzb());
        c0179zzaZzn.zzG(zzeaoVar.zzf.zza());
        c0179zzaZzn.zzH(zzdVar);
        c0179zzaZzn.zzJ(zzabVar);
        c0179zzaZzn.zzK(zzeaoVar.zzg);
        c0179zzaZzn.zzN(zzg(z));
        c0179zzaZzn.zzP(zzeaoVar.zzf.zzd());
        c0179zzaZzn.zzO(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        c0179zzaZzn.zzQ(zzg(android.provider.Settings.Global.getInt(zzeaoVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return c0179zzaZzn.zzbr().zzaV();
    }

    private static final com.google.android.gms.internal.ads.zzbbq.zzq zzg(boolean z) {
        return z ? com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_TRUE : com.google.android.gms.internal.ads.zzbbq.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z) {
        com.google.android.gms.internal.ads.zzgch.zzr(this.zzd.zzb(new android.os.Bundle()), new com.google.android.gms.internal.ads.zzean(this, z), com.google.android.gms.internal.ads.zzbzw.zzg);
    }
}
