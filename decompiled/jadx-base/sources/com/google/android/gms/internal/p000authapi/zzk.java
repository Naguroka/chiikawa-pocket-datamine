package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
final class zzk extends com.google.android.gms.internal.p000authapi.zzg {
    private final /* synthetic */ com.google.android.gms.internal.p000authapi.zzj zzan;

    zzk(com.google.android.gms.internal.p000authapi.zzj zzjVar) {
        this.zzan = zzjVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzg, com.google.android.gms.internal.p000authapi.zzu
    public final void zzc(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.credentials.Credential credential) {
        this.zzan.setResult(new com.google.android.gms.internal.p000authapi.zzh(status, credential));
    }

    @Override // com.google.android.gms.internal.p000authapi.zzg, com.google.android.gms.internal.p000authapi.zzu
    public final void zzc(com.google.android.gms.common.api.Status status) {
        this.zzan.setResult(com.google.android.gms.internal.p000authapi.zzh.zzd(status));
    }
}
