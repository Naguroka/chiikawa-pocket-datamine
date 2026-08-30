package com.google.android.gms.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AppSetIdInfo {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final java.lang.String zza;
    private final int zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public AppSetIdInfo(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public java.lang.String getId() {
        return this.zza;
    }

    public int getScope() {
        return this.zzb;
    }
}
