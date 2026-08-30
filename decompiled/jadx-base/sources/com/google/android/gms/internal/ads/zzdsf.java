package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzdsf {
    protected final java.util.Map zza;
    protected final android.content.Context zzb;
    protected final java.util.concurrent.Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzu zzd;
    protected final boolean zze;
    private final com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final java.util.concurrent.atomic.AtomicBoolean zzi;
    private final java.util.concurrent.atomic.AtomicReference zzj;

    protected zzdsf(java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder csiUrlBuilder, android.content.Context context) {
        this.zza = new java.util.HashMap();
        this.zzi = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzj = new java.util.concurrent.atomic.AtomicReference(new android.os.Bundle());
        this.zzc = executor;
        this.zzd = zzuVar;
        this.zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcf)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzci)).booleanValue();
        this.zzh = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgN)).booleanValue();
        this.zzb = context;
    }

    private final void zza(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzks);
            this.zzj.set(com.google.android.gms.ads.internal.util.zzad.zza(this.zzb, str, new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdsd
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
                    this.zza.zzd(str, sharedPreferences, str2);
                }
            }));
        }
        android.os.Bundle bundle = (android.os.Bundle) this.zzj.get();
        for (java.lang.String str2 : bundle.keySet()) {
            map.put(str2, java.lang.String.valueOf(bundle.get(str2)));
        }
    }

    private final void zzh(java.util.Map map, boolean z) {
        if (map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty paramMap.");
            return;
        }
        zza(map);
        final java.lang.String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        boolean z2 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("scar"));
        if (this.zze) {
            if (!z || this.zzg) {
                if (!z2 || this.zzh) {
                    this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdsc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd.zza(strGenerateUrl);
                        }
                    });
                }
            }
        }
    }

    protected final java.lang.String zzb(java.util.Map map) {
        return this.zzf.generateUrl(map);
    }

    public final java.util.concurrent.ConcurrentHashMap zzc() {
        return new java.util.concurrent.ConcurrentHashMap(this.zza);
    }

    final /* synthetic */ void zzd(java.lang.String str, android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
        this.zzj.set(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, str));
    }

    public final void zze(java.util.Map map) {
        if (map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty paramMap.");
            return;
        }
        zza(map);
        final java.lang.String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmX)).booleanValue() || this.zze) {
            this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdse
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza(strGenerateUrl);
                }
            });
        }
    }

    public final void zzf(java.util.Map map) {
        zzh(map, true);
    }

    public final void zzg(java.util.Map map) {
        zzh(map, false);
    }
}
