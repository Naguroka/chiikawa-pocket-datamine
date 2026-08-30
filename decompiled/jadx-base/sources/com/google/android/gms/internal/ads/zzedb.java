package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzedb {
    private final java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzfbr zzd = null;
    private com.google.android.gms.internal.ads.zzfbo zze = null;
    private com.google.android.gms.ads.internal.client.zzw zzf = null;
    private final java.util.Map zzb = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.List zza = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public zzedb(java.lang.String str) {
        this.zzc = str;
    }

    private static java.lang.String zzj(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdH)).booleanValue() ? zzfboVar.zzap : zzfboVar.zzw;
    }

    private final synchronized void zzk(com.google.android.gms.internal.ads.zzfbo zzfboVar, int i) {
        java.util.Map map = this.zzb;
        java.lang.String strZzj = zzj(zzfboVar);
        if (map.containsKey(strZzj)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> itKeys = zzfboVar.zzv.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                bundle.putString(next, zzfboVar.zzv.getString(next));
            } catch (org.json.JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(zzfboVar.zzE, 0L, null, bundle, zzfboVar.zzF, zzfboVar.zzG, zzfboVar.zzH, zzfboVar.zzI);
        try {
            this.zza.add(i, zzwVar);
        } catch (java.lang.IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzj, zzwVar);
    }

    private final void zzl(com.google.android.gms.internal.ads.zzfbo zzfboVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        java.util.Map map = this.zzb;
        java.lang.String strZzj = zzj(zzfboVar);
        if (map.containsKey(strZzj)) {
            if (this.zze == null) {
                this.zze = zzfboVar;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zzb.get(strZzj);
            zzwVar.zzb = j;
            zzwVar.zzc = zzeVar;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgD)).booleanValue() && z) {
                this.zzf = zzwVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzw zza() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzcvm zzb() {
        return new com.google.android.gms.internal.ads.zzcvm(this.zze, "", this, this.zzd, this.zzc);
    }

    public final java.util.List zzc() {
        return this.zza;
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        zzk(zzfboVar, this.zza.size());
    }

    public final void zze(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        int iIndexOf = this.zza.indexOf(this.zzb.get(zzj(zzfboVar)));
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            iIndexOf = this.zza.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.zza.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(iIndexOf);
            zzwVar.zzb = 0L;
            zzwVar.zzc = null;
        }
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfbo zzfboVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfboVar, j, zzeVar, false);
    }

    public final void zzg(com.google.android.gms.internal.ads.zzfbo zzfboVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfboVar, j, null, true);
    }

    public final synchronized void zzh(java.lang.String str, java.util.List list) {
        try {
            if (this.zzb.containsKey(str)) {
                int iIndexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzw) this.zzb.get(str));
                try {
                    this.zza.remove(iIndexOf);
                } catch (java.lang.IndexOutOfBoundsException e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(str);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzk((com.google.android.gms.internal.ads.zzfbo) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void zzi(com.google.android.gms.internal.ads.zzfbr zzfbrVar) {
        this.zzd = zzfbrVar;
    }
}
