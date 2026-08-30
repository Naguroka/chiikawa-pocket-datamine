package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv {
    private final com.google.android.gms.internal.ads.zzdsb zzh;
    private java.util.Map zzi;
    private final java.util.ArrayDeque zzf = new java.util.ArrayDeque();
    private final java.util.ArrayDeque zzg = new java.util.ArrayDeque();
    private final int zza = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgK)).intValue();
    private final long zzb = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgL)).longValue();
    private final boolean zzc = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgP)).booleanValue();
    private final boolean zzd = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgO)).booleanValue();
    private final java.util.Map zze = java.util.Collections.synchronizedMap(new com.google.android.gms.ads.nonagon.signalgeneration.zzt(this));

    public zzv(com.google.android.gms.internal.ads.zzdsb zzdsbVar) {
        this.zzh = zzdsbVar;
    }

    private final synchronized void zzi(final com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        if (this.zzc) {
            java.util.ArrayDeque arrayDeque = this.zzg;
            final java.util.ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            java.util.ArrayDeque arrayDeque2 = this.zzf;
            final java.util.ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzdrqVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzj(com.google.android.gms.internal.ads.zzdrq zzdrqVar, java.util.ArrayDeque arrayDeque, java.lang.String str) {
        android.util.Pair pair;
        while (!arrayDeque.isEmpty()) {
            android.util.Pair pair2 = (android.util.Pair) arrayDeque.poll();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(zzdrqVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (java.lang.String) pair2.first);
            if (this.zzd) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) pair2.second);
                    pair = new android.util.Pair(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (org.json.JSONException unused) {
                    pair = new android.util.Pair("", "");
                }
                zzl(this.zzi, "e_type", (java.lang.String) pair.first);
                zzl(this.zzi, "e_agent", (java.lang.String) pair.second);
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final synchronized void zzk() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            try {
                java.util.Iterator it = this.zze.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (jCurrentTimeMillis - ((com.google.android.gms.ads.nonagon.signalgeneration.zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                        break;
                    }
                    this.zzg.add(new android.util.Pair((java.lang.String) entry.getKey(), ((com.google.android.gms.ads.nonagon.signalgeneration.zzu) entry.getValue()).zzb));
                    it.remove();
                    throw th;
                }
            } catch (java.util.ConcurrentModificationException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "QueryJsonMap.removeExpiredEntries");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private static final void zzl(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized java.lang.String zzb(java.lang.String str, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzu zzuVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) this.zze.get(str);
        zzdrqVar.zzb().put("request_id", str);
        if (zzuVar == null) {
            zzdrqVar.zzb().put("mhit", "false");
            return null;
        }
        zzdrqVar.zzb().put("mhit", com.json.mediationsdk.metadata.a.g);
        return zzuVar.zzb;
    }

    public final synchronized void zzd(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zze.put(str, new com.google.android.gms.ads.nonagon.signalgeneration.zzu(java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()), str2, new java.util.HashSet()));
        zzk();
        zzi(zzdrqVar);
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzdrq zzdrqVar, java.util.ArrayDeque arrayDeque, java.util.ArrayDeque arrayDeque2) {
        zzj(zzdrqVar, arrayDeque, androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO);
        zzj(zzdrqVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(java.lang.String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(java.lang.String str, java.lang.String str2, int i) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzu zzuVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) this.zze.get(str);
        if (zzuVar == null) {
            return false;
        }
        zzuVar.zzc.add(str2);
        return zzuVar.zzc.size() < i;
    }

    public final synchronized boolean zzh(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzu zzuVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzu) this.zze.get(str);
        return zzuVar != null && zzuVar.zzc.contains(str2);
    }
}
