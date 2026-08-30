package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfiv {
    private final com.google.android.gms.internal.ads.zzegq zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzfcb zzf;
    private final com.google.android.gms.internal.ads.zzfcc zzg;
    private final com.google.android.gms.common.util.Clock zzh;
    private final com.google.android.gms.internal.ads.zzava zzi;

    public zzfiv(com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, java.lang.String str2, android.content.Context context, com.google.android.gms.internal.ads.zzfcb zzfcbVar, com.google.android.gms.internal.ads.zzfcc zzfccVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzava zzavaVar) {
        this.zza = zzegqVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcbVar;
        this.zzg = zzfccVar;
        this.zzh = clock;
        this.zzi = zzavaVar;
    }

    public static final java.util.List zzf(int i, int i2, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((java.lang.String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final java.util.List zzg(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((java.lang.String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final java.util.List zzh(java.util.List list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((java.lang.String) it.next(), "@gw_ttr@", java.lang.Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzi(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        return com.google.android.gms.ads.internal.util.client.zzl.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static java.lang.String zzj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (true == android.text.TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final java.util.List zzc(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, java.util.List list) {
        return zzd(zzfcaVar, zzfboVar, false, "", "", list);
    }

    public final java.util.List zzd(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, boolean z, java.lang.String str, java.lang.String str2, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            java.lang.String strZzj = zzj(zzj(zzj((java.lang.String) it.next(), "@gw_adlocid@", zzfcaVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfboVar != null) {
                strZzj = com.google.android.gms.internal.ads.zzbyk.zzc(zzj(zzj(zzj(strZzj, "@gw_qdata@", zzfboVar.zzy), "@gw_adnetid@", zzfboVar.zzx), "@gw_allocid@", zzfboVar.zzw), this.zze, zzfboVar.zzW, zzfboVar.zzaw);
            }
            java.lang.String strZzj2 = zzj(zzj(zzj(zzj(strZzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", java.lang.Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdE)).booleanValue() && !android.text.TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !android.text.TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            } else {
                if (z4) {
                }
                arrayList.add(strZzj2);
            }
            if (this.zzi.zzf(android.net.Uri.parse(strZzj2))) {
                android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(strZzj2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzj2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfbo zzfboVar, java.util.List list, com.google.android.gms.internal.ads.zzbvw zzbvwVar) {
        com.google.android.gms.internal.ads.zzfcb zzfcbVar;
        com.google.android.gms.internal.ads.zzful zzfulVarZzd;
        java.lang.String str;
        java.lang.String str2;
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            java.lang.String strZzc = zzbvwVar.zzc();
            java.lang.String string = java.lang.Integer.toString(zzbvwVar.zzb());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdF)).booleanValue()) {
                com.google.android.gms.internal.ads.zzfcc zzfccVar = this.zzg;
                if (zzfccVar == null) {
                    zzfulVarZzd = com.google.android.gms.internal.ads.zzful.zzc();
                } else {
                    zzfcbVar = zzfccVar.zza;
                }
                str = (java.lang.String) zzfulVarZzd.zza(new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzfit
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzfiv.zzi(((com.google.android.gms.internal.ads.zzfcb) obj).zza);
                    }
                }).zzb("");
                str2 = (java.lang.String) zzfulVarZzd.zza(new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzfiu
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzfiv.zzi(((com.google.android.gms.internal.ads.zzfcb) obj).zzb);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.google.android.gms.internal.ads.zzbyk.zzc(zzj(zzj(zzj(zzj(zzj(zzj((java.lang.String) it.next(), "@gw_rwd_userid@", android.net.Uri.encode(str)), "@gw_rwd_custom_data@", android.net.Uri.encode(str2)), "@gw_tmstmp@", java.lang.Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", android.net.Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfboVar.zzW, zzfboVar.zzaw));
                }
                return arrayList;
            }
            zzfcbVar = this.zzf;
            zzfulVarZzd = com.google.android.gms.internal.ads.zzful.zzd(zzfcbVar);
            str = (java.lang.String) zzfulVarZzd.zza(new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzfit
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzfiv.zzi(((com.google.android.gms.internal.ads.zzfcb) obj).zza);
                }
            }).zzb("");
            str2 = (java.lang.String) zzfulVarZzd.zza(new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzfiu
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzfiv.zzi(((com.google.android.gms.internal.ads.zzfcb) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.google.android.gms.internal.ads.zzbyk.zzc(zzj(zzj(zzj(zzj(zzj(zzj((java.lang.String) it.next(), "@gw_rwd_userid@", android.net.Uri.encode(str)), "@gw_rwd_custom_data@", android.net.Uri.encode(str2)), "@gw_tmstmp@", java.lang.Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", android.net.Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfboVar.zzW, zzfboVar.zzaw));
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
