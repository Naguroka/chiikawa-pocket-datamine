package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzct extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcv {
    zzct(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void clearMeasurementEnabled(long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void generateEventId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getGmpAppId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getSessionId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(46, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getTestFlag(com.google.android.gms.internal.measurement.zzcy zzcyVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        parcelZza.writeInt(i);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i = com.google.android.gms.internal.measurement.zzbo.zza;
        parcelZza.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void initForTests(java.util.Map map) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdh zzdhVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdhVar);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeInt(z2 ? 1 : 0);
        parcelZza.writeLong(j);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, iObjectWrapper3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(53, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        parcelZza.writeLong(j);
        zzc(54, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        parcelZza.writeLong(j);
        zzc(55, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        parcelZza.writeLong(j);
        zzc(56, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        parcelZza.writeLong(j);
        zzc(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        parcelZza.writeLong(j);
        zzc(51, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        parcelZza.writeLong(j);
        zzc(52, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzcyVar);
        parcelZza.writeLong(j);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzdeVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void resetAnalyticsData(long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzdb zzdbVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzdbVar);
        zzc(58, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConsent(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setConsentThirdParty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzdjVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j);
        zzc(50, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setDataCollectionEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.measurement.zzbo.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setDefaultEventParameters(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setEventInterceptor(com.google.android.gms.internal.measurement.zzde zzdeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzdeVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.measurement.zzbo.zza;
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setMinimumSessionDuration(long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setSessionTimeoutDuration(long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setSgtmDebugInfo(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, intent);
        zzc(48, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setUserId(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzdeVar);
        zzc(36, parcelZza);
    }
}
