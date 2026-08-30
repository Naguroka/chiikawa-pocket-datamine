package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzce implements android.content.SharedPreferences.Editor {
    boolean zza = false;
    final java.util.Set zzb = new java.util.HashSet();
    final java.util.Map zzc = new java.util.HashMap();
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcg zzd;

    /* synthetic */ zzce(com.google.android.gms.internal.measurement.zzcg zzcgVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzcgVar;
    }

    private final void zza(java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.zza) {
            this.zzd.zza.clear();
        }
        com.google.android.gms.internal.measurement.zzcg zzcgVar = this.zzd;
        java.util.Set setKeySet = zzcgVar.zza.keySet();
        java.util.Set set = this.zzb;
        setKeySet.removeAll(set);
        java.util.Map map = this.zzc;
        for (java.util.Map.Entry entry : map.entrySet()) {
            zzcgVar.zza.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        for (android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcgVar.zzb) {
            com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.Sets.union(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcgVar, (java.lang.String) it.next());
            }
        }
        return (!this.zza && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z) {
        zza(str, java.lang.Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f) {
        zza(str, java.lang.Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String str, int i) {
        zza(str, java.lang.Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putLong(java.lang.String str, long j) {
        zza(str, java.lang.Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        zza(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        zza(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String str) {
        this.zzb.add(str);
        return this;
    }
}
