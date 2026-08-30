package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduq {
    private final com.google.android.gms.internal.ads.zzdua zza;
    private final com.google.android.gms.internal.ads.zzdpj zzb;
    private final java.lang.Object zzc = new java.lang.Object();
    private final java.util.List zzd = new java.util.ArrayList();
    private boolean zze;

    zzduq(com.google.android.gms.internal.ads.zzdua zzduaVar, com.google.android.gms.internal.ads.zzdpj zzdpjVar) {
        this.zza = zzduaVar;
        this.zzb = zzdpjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(java.util.List list) {
        com.google.android.gms.internal.ads.zzdpi zzdpiVarZza;
        com.google.android.gms.internal.ads.zzdpi zzdpiVarZza2;
        com.google.android.gms.internal.ads.zzbrs zzbrsVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.zzbln zzblnVar = (com.google.android.gms.internal.ads.zzbln) it.next();
                java.lang.String string = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjj)).booleanValue() || (zzdpiVarZza2 = this.zzb.zza(zzblnVar.zza)) == null || (zzbrsVar = zzdpiVarZza2.zzc) == null) ? "" : zzbrsVar.toString();
                java.lang.String str = string;
                boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjk)).booleanValue() && (zzdpiVarZza = this.zzb.zza(zzblnVar.zza)) != null && zzdpiVarZza.zzd;
                java.util.List list2 = this.zzd;
                java.lang.String str2 = zzblnVar.zza;
                list2.add(new com.google.android.gms.internal.ads.zzdup(str2, str, this.zzb.zzb(str2), zzblnVar.zzb ? 1 : 0, zzblnVar.zzd, zzblnVar.zzc, z));
            }
            this.zze = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[Catch: all -> 0x003f, LOOP:0: B:13:0x0029->B:15:0x002f, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:9:0x001e, B:10:0x0021, B:12:0x0023, B:13:0x0029, B:15:0x002f, B:16:0x003d), top: B:21:0x0008 }] */
    public final org.json.JSONArray zza() throws org.json.JSONException {
        java.util.Iterator it;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (this.zzc) {
            if (this.zze) {
                it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((com.google.android.gms.internal.ads.zzdup) it.next()).zza());
                }
            } else if (this.zza.zzt()) {
                zzd(this.zza.zzg());
                it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((com.google.android.gms.internal.ads.zzdup) it.next()).zza());
                }
            } else {
                zzc();
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new com.google.android.gms.internal.ads.zzduo(this));
    }
}
