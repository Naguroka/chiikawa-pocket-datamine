package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzdbj {
    protected final java.util.Map zza = new java.util.HashMap();

    protected zzdbj(java.util.Set set) {
        zzp(set);
    }

    public final synchronized void zzk(com.google.android.gms.internal.ads.zzddk zzddkVar) {
        zzo(zzddkVar.zza, zzddkVar.zzb);
    }

    public final synchronized void zzo(java.lang.Object obj, java.util.concurrent.Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((com.google.android.gms.internal.ads.zzddk) it.next());
        }
    }

    protected final synchronized void zzq(final com.google.android.gms.internal.ads.zzdbi zzdbiVar) {
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            final java.lang.Object key = entry.getKey();
            ((java.util.concurrent.Executor) entry.getValue()).execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdbh
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdbiVar.zza(key);
                    } catch (java.lang.Throwable th) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
