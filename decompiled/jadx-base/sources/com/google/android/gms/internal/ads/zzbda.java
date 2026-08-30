package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
public final class zzbda {
    private final java.util.List zza = new java.util.LinkedList();
    private final java.util.Map zzb;
    private final java.lang.Object zzc;

    public zzbda(boolean z, java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new java.lang.Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final com.google.android.gms.internal.ads.zzbcx zzf() {
        return new com.google.android.gms.internal.ads.zzbcx(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), null, null);
    }

    public final com.google.android.gms.internal.ads.zzbcz zza() {
        com.google.android.gms.internal.ads.zzbcz zzbczVar;
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbY)).booleanValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.HashMap map = new java.util.HashMap();
        synchronized (this.zzc) {
            for (com.google.android.gms.internal.ads.zzbcx zzbcxVar : this.zza) {
                long jZza = zzbcxVar.zza();
                java.lang.String strZzc = zzbcxVar.zzc();
                com.google.android.gms.internal.ads.zzbcx zzbcxVarZzb = zzbcxVar.zzb();
                if (zzbcxVarZzb != null && jZza > 0) {
                    long jZza2 = jZza - zzbcxVarZzb.zza();
                    sb.append(strZzc);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(',');
                    if (zBooleanValue) {
                        if (map.containsKey(java.lang.Long.valueOf(zzbcxVarZzb.zza()))) {
                            java.lang.StringBuilder sb2 = (java.lang.StringBuilder) map.get(java.lang.Long.valueOf(zzbcxVarZzb.zza()));
                            sb2.append(org.objectweb.asm.signature.SignatureVisitor.EXTENDS);
                            sb2.append(strZzc);
                        } else {
                            map.put(java.lang.Long.valueOf(zzbcxVarZzb.zza()), new java.lang.StringBuilder(strZzc));
                        }
                    }
                }
            }
            this.zza.clear();
            java.lang.String string = null;
            if (!android.text.TextUtils.isEmpty(null)) {
                sb.append((java.lang.String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            if (zBooleanValue) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    sb3.append((java.lang.CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() + (((java.lang.Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbczVar = new com.google.android.gms.internal.ads.zzbcz(sb.toString(), string);
        }
        return zzbczVar;
    }

    public final java.util.Map zzb() {
        java.util.Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbda zzbdaVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbcq zzbcqVarZzg;
        if (android.text.TextUtils.isEmpty(str2) || (zzbcqVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            com.google.android.gms.internal.ads.zzbcw zzbcwVarZza = zzbcqVarZzg.zza(str);
            java.util.Map map = this.zzb;
            map.put(str, zzbcwVarZza.zza((java.lang.String) map.get(str), str2));
        }
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzbcx zzbcxVar, long j, java.lang.String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new com.google.android.gms.internal.ads.zzbcx(j, strArr[0], zzbcxVar));
        }
        return true;
    }
}
