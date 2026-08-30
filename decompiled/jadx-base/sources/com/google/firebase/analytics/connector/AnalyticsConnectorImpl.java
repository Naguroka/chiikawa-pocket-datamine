package com.google.firebase.analytics.connector;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public class AnalyticsConnectorImpl implements com.google.firebase.analytics.connector.AnalyticsConnector {
    private static volatile com.google.firebase.analytics.connector.AnalyticsConnector zzc;
    final com.google.android.gms.measurement.api.AppMeasurementSdk zza;
    final java.util.Map zzb;

    AnalyticsConnectorImpl(com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(appMeasurementSdk);
        this.zza = appMeasurementSdk;
        this.zzb = new java.util.concurrent.ConcurrentHashMap();
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    static /* synthetic */ void zza(com.google.firebase.events.Event event) {
        boolean z = ((com.google.firebase.DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (com.google.firebase.analytics.connector.AnalyticsConnectorImpl.class) {
            ((com.google.firebase.analytics.connector.AnalyticsConnectorImpl) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc)).zza.zza(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzc(java.lang.String str) {
        if (str.isEmpty()) {
            return false;
        }
        java.util.Map map = this.zzb;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.zzc.zzb(str2, bundle)) {
            this.zza.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public java.util.List<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Bundle bundle : this.zza.getConditionalUserProperties(str, str2)) {
            int i = com.google.firebase.analytics.connector.internal.zzc.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
            com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty();
            conditionalUserProperty.origin = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, "origin", java.lang.String.class, null));
            conditionalUserProperty.name = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, "name", java.lang.String.class, null));
            conditionalUserProperty.value = com.google.android.gms.measurement.internal.zzjt.zza(bundle, "value", java.lang.Object.class, null);
            conditionalUserProperty.triggerEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, java.lang.String.class, null);
            conditionalUserProperty.triggerTimeout = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.class, 0L)).longValue();
            conditionalUserProperty.timedOutEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, java.lang.String.class, null);
            conditionalUserProperty.timedOutEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, android.os.Bundle.class, null);
            conditionalUserProperty.triggeredEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, java.lang.String.class, null);
            conditionalUserProperty.triggeredEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, android.os.Bundle.class, null);
            conditionalUserProperty.timeToLive = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.class, 0L)).longValue();
            conditionalUserProperty.expiredEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, java.lang.String.class, null);
            conditionalUserProperty.expiredEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, android.os.Bundle.class, null);
            conditionalUserProperty.active = ((java.lang.Boolean) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, java.lang.Boolean.class, false)).booleanValue();
            conditionalUserProperty.creationTimestamp = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.class, 0L)).longValue();
            conditionalUserProperty.triggeredTimestamp = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, java.lang.Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(java.lang.String str) {
        return this.zza.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean z) {
        return this.zza.getUserProperties(null, null, z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.zzc.zzd(str) && com.google.firebase.analytics.connector.internal.zzc.zzb(str2, bundle) && com.google.firebase.analytics.connector.internal.zzc.zza(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.zza.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final java.lang.String str, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(analyticsConnectorListener);
        if (com.google.firebase.analytics.connector.internal.zzc.zzd(str) && !zzc(str)) {
            com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk = this.zza;
            if (com.google.android.gms.measurement.AppMeasurement.FIAM_ORIGIN.equals(str)) {
                zzgVar = new com.google.firebase.analytics.connector.internal.zze(appMeasurementSdk, analyticsConnectorListener);
            } else {
                zzgVar = "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.zzg(appMeasurementSdk, analyticsConnectorListener) : null;
            }
            if (zzgVar != null) {
                this.zzb.put(str, zzgVar);
                return new com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle(this) { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                    final /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnectorImpl zzb;

                    {
                        this.zzb = this;
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void registerEventNames(java.util.Set<java.lang.String> set) {
                        com.google.firebase.analytics.connector.AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        java.lang.String str2 = str;
                        if (!analyticsConnectorImpl.zzc(str2) || !str2.equals(com.google.android.gms.measurement.AppMeasurement.FIAM_ORIGIN) || set == null || set.isEmpty()) {
                            return;
                        }
                        ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzb(set);
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public final void unregister() {
                        com.google.firebase.analytics.connector.AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        java.lang.String str2 = str;
                        if (analyticsConnectorImpl.zzc(str2)) {
                            java.util.Map map = analyticsConnectorImpl.zzb;
                            com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = ((com.google.firebase.analytics.connector.internal.zza) map.get(str2)).zza();
                            if (analyticsConnectorListenerZza != null) {
                                analyticsConnectorListenerZza.onMessageTriggered(0, null);
                            }
                            map.remove(str2);
                        }
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void unregisterEventNames() {
                        com.google.firebase.analytics.connector.AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        java.lang.String str2 = str;
                        if (analyticsConnectorImpl.zzc(str2) && str2.equals(com.google.android.gms.measurement.AppMeasurement.FIAM_ORIGIN)) {
                            ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzc();
                        }
                    }
                };
            }
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        java.lang.String str;
        int i = com.google.firebase.analytics.connector.internal.zzc.zza;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return;
        }
        if ((conditionalUserProperty.value == null || com.google.android.gms.measurement.internal.zzmg.zza(conditionalUserProperty.value) != null) && com.google.firebase.analytics.connector.internal.zzc.zzd(str) && com.google.firebase.analytics.connector.internal.zzc.zze(str, conditionalUserProperty.name)) {
            if (conditionalUserProperty.expiredEventName == null || (com.google.firebase.analytics.connector.internal.zzc.zzb(conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams) && com.google.firebase.analytics.connector.internal.zzc.zza(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
                if (conditionalUserProperty.triggeredEventName == null || (com.google.firebase.analytics.connector.internal.zzc.zzb(conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams) && com.google.firebase.analytics.connector.internal.zzc.zza(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
                    if (conditionalUserProperty.timedOutEventName == null || (com.google.firebase.analytics.connector.internal.zzc.zzb(conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams) && com.google.firebase.analytics.connector.internal.zzc.zza(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams))) {
                        com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk = this.zza;
                        android.os.Bundle bundle = new android.os.Bundle();
                        if (conditionalUserProperty.origin != null) {
                            bundle.putString("origin", conditionalUserProperty.origin);
                        }
                        if (conditionalUserProperty.name != null) {
                            bundle.putString("name", conditionalUserProperty.name);
                        }
                        if (conditionalUserProperty.value != null) {
                            com.google.android.gms.measurement.internal.zzjt.zzb(bundle, conditionalUserProperty.value);
                        }
                        if (conditionalUserProperty.triggerEventName != null) {
                            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, conditionalUserProperty.triggerEventName);
                        }
                        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.triggerTimeout);
                        if (conditionalUserProperty.timedOutEventName != null) {
                            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, conditionalUserProperty.timedOutEventName);
                        }
                        if (conditionalUserProperty.timedOutEventParams != null) {
                            bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, conditionalUserProperty.timedOutEventParams);
                        }
                        if (conditionalUserProperty.triggeredEventName != null) {
                            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, conditionalUserProperty.triggeredEventName);
                        }
                        if (conditionalUserProperty.triggeredEventParams != null) {
                            bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, conditionalUserProperty.triggeredEventParams);
                        }
                        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.timeToLive);
                        if (conditionalUserProperty.expiredEventName != null) {
                            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, conditionalUserProperty.expiredEventName);
                        }
                        if (conditionalUserProperty.expiredEventParams != null) {
                            bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, conditionalUserProperty.expiredEventParams);
                        }
                        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.creationTimestamp);
                        bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.active);
                        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.triggeredTimestamp);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (com.google.firebase.analytics.connector.internal.zzc.zzd(str) && com.google.firebase.analytics.connector.internal.zzc.zze(str, str2)) {
            this.zza.setUserProperty(str, str2, obj);
        }
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        return (com.google.firebase.analytics.connector.AnalyticsConnector) firebaseApp.get(com.google.firebase.analytics.connector.AnalyticsConnector.class);
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector getInstance(com.google.firebase.FirebaseApp firebaseApp, android.content.Context context, com.google.firebase.events.Subscriber subscriber) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseApp);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(subscriber);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zzc == null) {
            synchronized (com.google.firebase.analytics.connector.AnalyticsConnectorImpl.class) {
                if (zzc == null) {
                    android.os.Bundle bundle = new android.os.Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(com.google.firebase.DataCollectionDefaultChange.class, new java.util.concurrent.Executor() { // from class: com.google.firebase.analytics.connector.zza
                            @Override // java.util.concurrent.Executor
                            public final void execute(java.lang.Runnable runnable) {
                                runnable.run();
                            }
                        }, new com.google.firebase.events.EventHandler() { // from class: com.google.firebase.analytics.connector.zzb
                            @Override // com.google.firebase.events.EventHandler
                            public final void handle(com.google.firebase.events.Event event) {
                                com.google.firebase.analytics.connector.AnalyticsConnectorImpl.zza(event);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzc = new com.google.firebase.analytics.connector.AnalyticsConnectorImpl(com.google.android.gms.internal.measurement.zzff.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return zzc;
    }
}
