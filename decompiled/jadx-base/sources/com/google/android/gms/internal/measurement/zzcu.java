package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcu extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzcv {
    public zzcu() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static com.google.android.gms.internal.measurement.zzcv asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzcv ? (com.google.android.gms.internal.measurement.zzcv) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.zzct(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.measurement.zzcy zzcwVar;
        com.google.android.gms.internal.measurement.zzcy zzcwVar2 = null;
        com.google.android.gms.internal.measurement.zzdb zzczVar = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar3 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar4 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar5 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar6 = null;
        com.google.android.gms.internal.measurement.zzde zzdcVar = null;
        com.google.android.gms.internal.measurement.zzde zzdcVar2 = null;
        com.google.android.gms.internal.measurement.zzde zzdcVar3 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar7 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar8 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar9 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar10 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar11 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar12 = null;
        com.google.android.gms.internal.measurement.zzdg zzdfVar = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar13 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar14 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar15 = null;
        com.google.android.gms.internal.measurement.zzcy zzcwVar16 = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.measurement.zzdh zzdhVar = (com.google.android.gms.internal.measurement.zzdh) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdh.CREATOR);
                long j = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                initialize(iObjectWrapperAsInterface, zzdhVar, j);
                break;
            case 2:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                boolean zZzf = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                boolean zZzf2 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                long j2 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                logEvent(string, string2, bundle, zZzf, zZzf2, j2);
                break;
            case 3:
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcwVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.zzcw(strongBinder);
                }
                long j3 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                logEventAndBundle(string3, string4, bundle2, zzcwVar, j3);
                break;
            case 4:
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzf3 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                long j4 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setUserProperty(string5, string6, iObjectWrapperAsInterface2, zZzf3, j4);
                break;
            case 5:
                java.lang.String string7 = parcel.readString();
                java.lang.String string8 = parcel.readString();
                boolean zZzf4 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar2 = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.measurement.zzcw(strongBinder2);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getUserProperties(string7, string8, zZzf4, zzcwVar2);
                break;
            case 6:
                java.lang.String string9 = parcel.readString();
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar16 = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.measurement.zzcw(strongBinder3);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getMaxUserProperties(string9, zzcwVar16);
                break;
            case 7:
                java.lang.String string10 = parcel.readString();
                long j5 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                long j6 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                java.lang.String string11 = parcel.readString();
                java.lang.String string12 = parcel.readString();
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                java.lang.String string13 = parcel.readString();
                java.lang.String string14 = parcel.readString();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar15 = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.measurement.zzcw(strongBinder4);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getConditionalUserProperties(string13, string14, zzcwVar15);
                break;
            case 11:
                boolean zZzf5 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                long j7 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setMeasurementEnabled(zZzf5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String string15 = parcel.readString();
                java.lang.String string16 = parcel.readString();
                long j11 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setCurrentScreen(iObjectWrapperAsInterface3, string15, string16, j11);
                break;
            case 16:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar14 = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.measurement.zzcw(strongBinder5);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getCurrentScreenName(zzcwVar14);
                break;
            case 17:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar13 = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.measurement.zzcw(strongBinder6);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getCurrentScreenClass(zzcwVar13);
                break;
            case 18:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdfVar = iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.internal.measurement.zzdg ? (com.google.android.gms.internal.measurement.zzdg) iInterfaceQueryLocalInterface7 : new com.google.android.gms.internal.measurement.zzdf(strongBinder7);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setInstanceIdProvider(zzdfVar);
                break;
            case 19:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar12 = iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface8 : new com.google.android.gms.internal.measurement.zzcw(strongBinder8);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getCachedAppInstanceId(zzcwVar12);
                break;
            case 20:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar11 = iInterfaceQueryLocalInterface9 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface9 : new com.google.android.gms.internal.measurement.zzcw(strongBinder9);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getAppInstanceId(zzcwVar11);
                break;
            case 21:
                android.os.IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar10 = iInterfaceQueryLocalInterface10 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface10 : new com.google.android.gms.internal.measurement.zzcw(strongBinder10);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getGmpAppId(zzcwVar10);
                break;
            case 22:
                android.os.IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar9 = iInterfaceQueryLocalInterface11 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface11 : new com.google.android.gms.internal.measurement.zzcw(strongBinder11);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                generateEventId(zzcwVar9);
                break;
            case 23:
                java.lang.String string17 = parcel.readString();
                long j12 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                java.lang.String string18 = parcel.readString();
                long j13 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityStarted(iObjectWrapperAsInterface4, j14);
                break;
            case 26:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityStopped(iObjectWrapperAsInterface5, j15);
                break;
            case 27:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                long j16 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityCreated(iObjectWrapperAsInterface6, bundle5, j16);
                break;
            case 28:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityDestroyed(iObjectWrapperAsInterface7, j17);
                break;
            case 29:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityPaused(iObjectWrapperAsInterface8, j18);
                break;
            case 30:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityResumed(iObjectWrapperAsInterface9, j19);
                break;
            case 31:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar8 = iInterfaceQueryLocalInterface12 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface12 : new com.google.android.gms.internal.measurement.zzcw(strongBinder12);
                }
                long j20 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivitySaveInstanceState(iObjectWrapperAsInterface10, zzcwVar8, j20);
                break;
            case 32:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar7 = iInterfaceQueryLocalInterface13 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface13 : new com.google.android.gms.internal.measurement.zzcw(strongBinder13);
                }
                long j21 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                performAction(bundle6, zzcwVar7, j21);
                break;
            case 33:
                int i3 = parcel.readInt();
                java.lang.String string19 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface13 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                logHealthData(i3, string19, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12, iObjectWrapperAsInterface13);
                break;
            case 34:
                android.os.IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdcVar3 = iInterfaceQueryLocalInterface14 instanceof com.google.android.gms.internal.measurement.zzde ? (com.google.android.gms.internal.measurement.zzde) iInterfaceQueryLocalInterface14 : new com.google.android.gms.internal.measurement.zzdc(strongBinder14);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setEventInterceptor(zzdcVar3);
                break;
            case 35:
                android.os.IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdcVar2 = iInterfaceQueryLocalInterface15 instanceof com.google.android.gms.internal.measurement.zzde ? (com.google.android.gms.internal.measurement.zzde) iInterfaceQueryLocalInterface15 : new com.google.android.gms.internal.measurement.zzdc(strongBinder15);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                registerOnMeasurementEventListener(zzdcVar2);
                break;
            case 36:
                android.os.IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdcVar = iInterfaceQueryLocalInterface16 instanceof com.google.android.gms.internal.measurement.zzde ? (com.google.android.gms.internal.measurement.zzde) iInterfaceQueryLocalInterface16 : new com.google.android.gms.internal.measurement.zzdc(strongBinder16);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                unregisterOnMeasurementEventListener(zzdcVar);
                break;
            case 37:
                java.util.HashMap mapZzb = com.google.android.gms.internal.measurement.zzbo.zzb(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                initForTests(mapZzb);
                break;
            case 38:
                android.os.IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar6 = iInterfaceQueryLocalInterface17 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface17 : new com.google.android.gms.internal.measurement.zzcw(strongBinder17);
                }
                int i4 = parcel.readInt();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getTestFlag(zzcwVar6, i4);
                break;
            case 39:
                boolean zZzf6 = com.google.android.gms.internal.measurement.zzbo.zzf(parcel);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setDataCollectionEnabled(zZzf6);
                break;
            case 40:
                android.os.IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar5 = iInterfaceQueryLocalInterface18 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface18 : new com.google.android.gms.internal.measurement.zzcw(strongBinder18);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                isDataCollectionEnabled(zzcwVar5);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                android.os.Bundle bundle7 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                android.os.Bundle bundle8 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                long j23 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                android.os.Bundle bundle9 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                long j24 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                android.os.IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar4 = iInterfaceQueryLocalInterface19 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface19 : new com.google.android.gms.internal.measurement.zzcw(strongBinder19);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                getSessionId(zzcwVar4);
                break;
            case 48:
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                com.google.android.gms.internal.measurement.zzdj zzdjVar = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                java.lang.String string20 = parcel.readString();
                java.lang.String string21 = parcel.readString();
                long j25 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                setCurrentScreenByScionActivityInfo(zzdjVar, string20, string21, j25);
                break;
            case 51:
                com.google.android.gms.internal.measurement.zzdj zzdjVar2 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                long j26 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityStartedByScionActivityInfo(zzdjVar2, j26);
                break;
            case 52:
                com.google.android.gms.internal.measurement.zzdj zzdjVar3 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                long j27 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityStoppedByScionActivityInfo(zzdjVar3, j27);
                break;
            case 53:
                com.google.android.gms.internal.measurement.zzdj zzdjVar4 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                android.os.Bundle bundle10 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
                long j28 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityCreatedByScionActivityInfo(zzdjVar4, bundle10, j28);
                break;
            case 54:
                com.google.android.gms.internal.measurement.zzdj zzdjVar5 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                long j29 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityDestroyedByScionActivityInfo(zzdjVar5, j29);
                break;
            case 55:
                com.google.android.gms.internal.measurement.zzdj zzdjVar6 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                long j30 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityPausedByScionActivityInfo(zzdjVar6, j30);
                break;
            case 56:
                com.google.android.gms.internal.measurement.zzdj zzdjVar7 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                long j31 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivityResumedByScionActivityInfo(zzdjVar7, j31);
                break;
            case 57:
                com.google.android.gms.internal.measurement.zzdj zzdjVar8 = (com.google.android.gms.internal.measurement.zzdj) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.internal.measurement.zzdj.CREATOR);
                android.os.IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcwVar3 = iInterfaceQueryLocalInterface20 instanceof com.google.android.gms.internal.measurement.zzcy ? (com.google.android.gms.internal.measurement.zzcy) iInterfaceQueryLocalInterface20 : new com.google.android.gms.internal.measurement.zzcw(strongBinder20);
                }
                long j32 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdjVar8, zzcwVar3, j32);
                break;
            case 58:
                android.os.IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    zzczVar = iInterfaceQueryLocalInterface21 instanceof com.google.android.gms.internal.measurement.zzdb ? (com.google.android.gms.internal.measurement.zzdb) iInterfaceQueryLocalInterface21 : new com.google.android.gms.internal.measurement.zzcz(strongBinder21);
                }
                com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
                retrieveAndUploadBatches(zzczVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
