package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbr extends android.webkit.WebView {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.consent_sdk.zzbx zzb;
    private boolean zzc;

    public zzbr(com.google.android.gms.internal.consent_sdk.zzbt zzbtVar, android.os.Handler handler, com.google.android.gms.internal.consent_sdk.zzbx zzbxVar) {
        super(zzbtVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbxVar;
    }

    static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.internal.consent_sdk.zzbr zzbrVar, java.lang.String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final com.google.android.gms.internal.consent_sdk.zzbx zzbxVar = this.zzb;
        java.util.Objects.requireNonNull(zzbxVar);
        this.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // java.lang.Runnable
            public final void run() {
                zzbxVar.zzc();
            }
        });
    }

    public final void zzd(java.lang.String str, java.lang.String str2) {
        final java.lang.String str3 = str + "(" + str2 + ");";
        this.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzcp.zza(this.zza, str3);
            }
        });
    }
}
