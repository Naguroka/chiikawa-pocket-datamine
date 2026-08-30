package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public class AppMeasurement {
    public static final java.lang.String CRASH_ORIGIN = "crash";
    public static final java.lang.String FCM_ORIGIN = "fcm";
    public static final java.lang.String FIAM_ORIGIN = "fiam";
    private static volatile com.google.android.gms.measurement.AppMeasurement zza;
    private final com.google.android.gms.measurement.zzc zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    public interface EventInterceptor extends com.google.android.gms.measurement.internal.zzkb {
        @Override // com.google.android.gms.measurement.internal.zzkb
        void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    public interface OnEventListener extends com.google.android.gms.measurement.internal.zzkc {
        @Override // com.google.android.gms.measurement.internal.zzkc
        void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    public AppMeasurement(com.google.android.gms.measurement.internal.zzio zzioVar) {
        this.zzb = new com.google.android.gms.measurement.zza(zzioVar);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context context) {
        com.google.android.gms.measurement.internal.zzlx zzlxVar;
        if (zza == null) {
            synchronized (com.google.android.gms.measurement.AppMeasurement.class) {
                if (zza == null) {
                    try {
                        zzlxVar = (com.google.android.gms.measurement.internal.zzlx) java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", android.content.Context.class, android.os.Bundle.class).invoke(null, context, null);
                    } catch (java.lang.ClassNotFoundException | java.lang.Exception unused) {
                        zzlxVar = null;
                    }
                    if (zzlxVar != null) {
                        zza = new com.google.android.gms.measurement.AppMeasurement(zzlxVar);
                    } else {
                        zza = new com.google.android.gms.measurement.AppMeasurement(com.google.android.gms.measurement.internal.zzio.zzp(context, new com.google.android.gms.internal.measurement.zzdh(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return zza;
    }

    public void beginAdUnitExposure(java.lang.String str) {
        this.zzb.zzp(str);
    }

    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zzb.zzq(str, str2, bundle);
    }

    public void endAdUnitExposure(java.lang.String str) {
        this.zzb.zzr(str);
    }

    public long generateEventId() {
        return this.zzb.zzb();
    }

    public java.lang.String getAppInstanceId() {
        return this.zzb.zzh();
    }

    public java.lang.Boolean getBoolean() {
        return this.zzb.zzc();
    }

    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        java.util.List listZzm = this.zzb.zzm(str, str2);
        java.util.ArrayList arrayList = new java.util.ArrayList(listZzm == null ? 0 : listZzm.size());
        java.util.Iterator it = listZzm.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty((android.os.Bundle) it.next()));
        }
        return arrayList;
    }

    public java.lang.String getCurrentScreenClass() {
        return this.zzb.zzi();
    }

    public java.lang.String getCurrentScreenName() {
        return this.zzb.zzj();
    }

    public java.lang.Double getDouble() {
        return this.zzb.zzd();
    }

    public java.lang.String getGmpAppId() {
        return this.zzb.zzk();
    }

    public java.lang.Integer getInteger() {
        return this.zzb.zze();
    }

    public java.lang.Long getLong() {
        return this.zzb.zzf();
    }

    public int getMaxUserProperties(java.lang.String str) {
        return this.zzb.zza(str);
    }

    public java.lang.String getString() {
        return this.zzb.zzl();
    }

    protected java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zzb.zzo(str, str2, z);
    }

    public void logEventInternal(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zzb.zzs(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zzb.zzt(str, str2, bundle, j);
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        this.zzb.zzu(onEventListener);
    }

    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        java.lang.String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        java.lang.String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        java.lang.Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            com.google.android.gms.measurement.internal.zzjt.zzb(bundle, obj);
        }
        java.lang.String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str4);
        }
        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.mTriggerTimeout);
        java.lang.String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str5);
        }
        android.os.Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        java.lang.String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str6);
        }
        android.os.Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.mTimeToLive);
        java.lang.String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str7);
        }
        android.os.Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        com.google.android.gms.measurement.zzc zzcVar = this.zzb;
        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.mTriggeredTimestamp);
        zzcVar.zzv(bundle);
    }

    public void setEventInterceptor(com.google.android.gms.measurement.AppMeasurement.EventInterceptor eventInterceptor) {
        this.zzb.zzw(eventInterceptor);
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        this.zzb.zzx(onEventListener);
    }

    public AppMeasurement(com.google.android.gms.measurement.internal.zzlx zzlxVar) {
        this.zzb = new com.google.android.gms.measurement.zzb(zzlxVar);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean z) {
        return this.zzb.zzn(z);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public java.lang.String mAppId;
        public long mCreationTimestamp;
        public java.lang.String mExpiredEventName;
        public android.os.Bundle mExpiredEventParams;
        public java.lang.String mName;
        public java.lang.String mOrigin;
        public long mTimeToLive;
        public java.lang.String mTimedOutEventName;
        public android.os.Bundle mTimedOutEventParams;
        public java.lang.String mTriggerEventName;
        public long mTriggerTimeout;
        public java.lang.String mTriggeredEventName;
        public android.os.Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public java.lang.Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(android.os.Bundle bundle) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
            this.mAppId = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, "app_id", java.lang.String.class, null);
            this.mOrigin = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, "origin", java.lang.String.class, null);
            this.mName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, "name", java.lang.String.class, null);
            this.mValue = com.google.android.gms.measurement.internal.zzjt.zza(bundle, "value", java.lang.Object.class, null);
            this.mTriggerEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, java.lang.String.class, null);
            this.mTriggerTimeout = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.class, 0L)).longValue();
            this.mTimedOutEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, java.lang.String.class, null);
            this.mTimedOutEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, android.os.Bundle.class, null);
            this.mTriggeredEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, java.lang.String.class, null);
            this.mTriggeredEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, android.os.Bundle.class, null);
            this.mTimeToLive = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.class, 0L)).longValue();
            this.mExpiredEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, java.lang.String.class, null);
            this.mExpiredEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, android.os.Bundle.class, null);
            this.mActive = ((java.lang.Boolean) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, java.lang.Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((java.lang.Long) com.google.android.gms.measurement.internal.zzjt.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, java.lang.Long.class, 0L)).longValue();
        }

        public ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            java.lang.Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                java.lang.Object objZza = com.google.android.gms.measurement.internal.zzmg.zza(obj);
                this.mValue = objZza;
                if (objZza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            android.os.Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new android.os.Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            android.os.Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new android.os.Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            android.os.Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new android.os.Bundle(bundle3);
            }
        }
    }
}
