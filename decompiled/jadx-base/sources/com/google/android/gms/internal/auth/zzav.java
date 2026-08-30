package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzav extends com.google.android.gms.internal.auth.zzaj {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzau zzcg;

    zzav(com.google.android.gms.internal.auth.zzau zzauVar) {
        this.zzcg = zzauVar;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zzb(java.lang.String str) {
        if (str != null) {
            this.zzcg.setResult(new com.google.android.gms.internal.auth.zzax(str));
        } else {
            this.zzcg.setResult(com.google.android.gms.internal.auth.zzau.zzc(new com.google.android.gms.common.api.Status(com.google.android.gms.auth.api.proxy.AuthApiStatusCodes.AUTH_APP_CERT_ERROR)));
        }
    }
}
