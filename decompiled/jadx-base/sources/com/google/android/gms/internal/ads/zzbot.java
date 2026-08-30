package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbot extends com.google.android.gms.internal.ads.zzcgs {
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zza;

    zzbot(com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk) {
        this.zza = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzb(java.lang.String str) throws android.os.RemoteException {
        return this.zza.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzc() throws android.os.RemoteException {
        return this.zza.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final android.os.Bundle zzd(android.os.Bundle bundle) throws android.os.RemoteException {
        return this.zza.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zze() throws android.os.RemoteException {
        return this.zza.getAppIdOrigin();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zzf() throws android.os.RemoteException {
        return this.zza.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zzg() throws android.os.RemoteException {
        return this.zza.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zzh() throws android.os.RemoteException {
        return this.zza.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zzi() throws android.os.RemoteException {
        return this.zza.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.util.List zzj(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        return this.zza.getConditionalUserProperties(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.util.Map zzk(java.lang.String str, java.lang.String str2, boolean z) throws android.os.RemoteException {
        return this.zza.getUserProperties(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzl(java.lang.String str) throws android.os.RemoteException {
        this.zza.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzm(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        this.zza.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzn(java.lang.String str) throws android.os.RemoteException {
        this.zza.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzo(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        this.zza.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzp(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zza.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzq(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zza.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzr(android.os.Bundle bundle) throws android.os.RemoteException {
        this.zza.setConsent(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        this.zza.setCurrentScreen(iObjectWrapper != null ? (android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzt(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        this.zza.setUserProperty(str, str2, iObjectWrapper != null ? com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper) : null);
    }
}
