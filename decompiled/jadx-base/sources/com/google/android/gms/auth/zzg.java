package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzg implements com.google.android.gms.auth.zzj<java.util.List<com.google.android.gms.auth.AccountChangeEvent>> {
    private final /* synthetic */ java.lang.String zzr;
    private final /* synthetic */ int zzs;

    zzg(java.lang.String str, int i) {
        this.zzr = str;
        this.zzs = i;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ java.util.List<com.google.android.gms.auth.AccountChangeEvent> zzb(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        return ((com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.auth.zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(new com.google.android.gms.auth.AccountChangeEventsRequest().setAccountName(this.zzr).setEventIndex(this.zzs)))).getEvents();
    }
}
