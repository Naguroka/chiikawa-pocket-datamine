package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcg implements android.content.SharedPreferences {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Set zzb = new java.util.HashSet();

    private final java.lang.Object zzc(java.lang.String str, java.lang.Object obj) {
        java.lang.Object obj2 = this.zza.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String str) {
        return this.zza.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
        return new com.google.android.gms.internal.measurement.zzce(this, null);
    }

    @Override // android.content.SharedPreferences
    public final java.util.Map getAll() {
        return this.zza;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String str, boolean z) {
        return ((java.lang.Boolean) zzc(str, java.lang.Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String str, float f) {
        return ((java.lang.Float) zzc(str, java.lang.Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String str, int i) {
        return ((java.lang.Integer) zzc(str, java.lang.Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String str, long j) {
        return ((java.lang.Long) zzc(str, java.lang.Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return (java.lang.String) zzc(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        return (java.util.Set) zzc(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.zzb.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.zzb.remove(onSharedPreferenceChangeListener);
    }
}
