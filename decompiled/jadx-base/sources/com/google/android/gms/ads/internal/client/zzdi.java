package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdi implements com.google.android.gms.ads.MuteThisAdReason {
    private final java.lang.String zza;
    private final com.google.android.gms.ads.internal.client.zzdh zzb;

    public zzdi(com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        java.lang.String strZze;
        this.zzb = zzdhVar;
        try {
            strZze = zzdhVar.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            strZze = null;
        }
        this.zza = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final java.lang.String getDescription() {
        return this.zza;
    }

    public final java.lang.String toString() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzdh zza() {
        return this.zzb;
    }
}
