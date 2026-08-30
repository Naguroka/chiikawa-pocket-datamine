package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzck {
    private final android.content.Context zza;
    private final java.util.Map zzb = new java.util.HashMap();

    public zzck(android.content.Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.content.SharedPreferences.Editor zzd(java.lang.String str) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, this.zza.getSharedPreferences(str, 0).edit());
        }
        return (android.content.SharedPreferences.Editor) this.zzb.get(str);
    }

    public final void zzb() {
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((android.content.SharedPreferences.Editor) it.next()).apply();
        }
    }

    public final boolean zzc(java.lang.String str, java.lang.Object obj) {
        com.google.android.gms.internal.consent_sdk.zzcj zzcjVarZza = com.google.android.gms.internal.consent_sdk.zzcl.zza(this.zza, str);
        if (zzcjVarZza == null) {
            return false;
        }
        android.content.SharedPreferences.Editor editorZzd = zzd(zzcjVarZza.zza);
        if (obj instanceof java.lang.Integer) {
            editorZzd.putInt(zzcjVarZza.zzb, ((java.lang.Integer) obj).intValue());
            return true;
        }
        if (obj instanceof java.lang.Long) {
            editorZzd.putLong(zzcjVarZza.zzb, ((java.lang.Long) obj).longValue());
            return true;
        }
        if (obj instanceof java.lang.Double) {
            editorZzd.putFloat(zzcjVarZza.zzb, ((java.lang.Double) obj).floatValue());
            return true;
        }
        if (obj instanceof java.lang.Float) {
            editorZzd.putFloat(zzcjVarZza.zzb, ((java.lang.Float) obj).floatValue());
            return true;
        }
        if (obj instanceof java.lang.Boolean) {
            editorZzd.putBoolean(zzcjVarZza.zzb, ((java.lang.Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        editorZzd.putString(zzcjVarZza.zzb, (java.lang.String) obj);
        return true;
    }
}
