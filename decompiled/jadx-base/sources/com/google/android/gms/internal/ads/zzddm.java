package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzddm extends com.google.android.gms.internal.ads.zzdbj implements com.google.android.gms.internal.ads.zzayk {
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfbo zzd;

    public zzddm(android.content.Context context, java.util.Set set, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        super(set);
        this.zzb = new java.util.WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfboVar;
    }

    public final synchronized void zza(android.view.View view) {
        com.google.android.gms.internal.ads.zzayl zzaylVar = (com.google.android.gms.internal.ads.zzayl) this.zzb.get(view);
        if (zzaylVar == null) {
            com.google.android.gms.internal.ads.zzayl zzaylVar2 = new com.google.android.gms.internal.ads.zzayl(this.zzc, view);
            zzaylVar2.zzc(this);
            this.zzb.put(view, zzaylVar2);
            zzaylVar = zzaylVar2;
        }
        if (this.zzd.zzX) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbx)).booleanValue()) {
                zzaylVar.zzg(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbw)).longValue());
                return;
            }
        }
        zzaylVar.zzf();
    }

    public final synchronized void zzb(android.view.View view) {
        if (this.zzb.containsKey(view)) {
            ((com.google.android.gms.internal.ads.zzayl) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final synchronized void zzdn(final com.google.android.gms.internal.ads.zzayj zzayjVar) {
        zzq(new com.google.android.gms.internal.ads.zzdbi() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzayk) obj).zzdn(zzayjVar);
            }
        });
    }
}
