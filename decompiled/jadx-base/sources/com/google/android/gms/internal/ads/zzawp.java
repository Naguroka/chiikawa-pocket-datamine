package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawp extends com.google.android.gms.internal.ads.zzaxr {
    public zzawp(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", zzascVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this.zzd.zzaa(3);
        try {
            int i = 1;
            boolean zBooleanValue = ((java.lang.Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            com.google.android.gms.internal.ads.zzasc zzascVar = this.zzd;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzascVar.zzaa(i);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (!(e.getTargetException() instanceof android.provider.Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
