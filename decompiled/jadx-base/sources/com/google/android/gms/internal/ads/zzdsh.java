package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdsh {
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzdsb zzf;
    private final java.util.List zzb = new java.util.ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzdsh(java.lang.String str, com.google.android.gms.internal.ads.zzdsb zzdsbVar) {
        this.zze = str;
        this.zzf = zzdsbVar;
    }

    private final java.util.Map zzg() {
        java.util.Map mapZza = this.zzf.zza();
        mapZza.put("tms", java.lang.Long.toString(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), 10));
        mapZza.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY, this.zza.zzN() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzch)).booleanValue()) {
            java.util.Map mapZzg = zzg();
            mapZzg.put("action", "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(java.lang.String str, java.lang.String str2) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzch)).booleanValue()) {
            java.util.Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzch)).booleanValue()) {
            java.util.Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzch)).booleanValue()) {
            java.util.Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzch)).booleanValue() && !this.zzd) {
            java.util.Map mapZzg = zzg();
            mapZzg.put("action", "init_finished");
            this.zzb.add(mapZzg);
            java.util.Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                this.zzf.zzg((java.util.Map) it.next());
            }
            this.zzd = true;
        }
    }

    public final synchronized void zzf() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzch)).booleanValue() && !this.zzc) {
            java.util.Map mapZzg = zzg();
            mapZzg.put("action", "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }
}
