package com.google.firebase.analytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000\u001a+\u0010\u0016\u001a\u00020\u000f*\u00020\u00012\u0019\b\u0004\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getANALYTICS", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setANALYTICS", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "LOCK", "", "getLOCK", "()Ljava/lang/Object;", "analytics", "Lcom/google/firebase/Firebase;", "getAnalytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "logEvent", "", "name", "", "block", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ParametersBuilder;", "Lkotlin/ExtensionFunctionType;", "setConsent", "Lcom/google/firebase/analytics/ConsentBuilder;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsKt {
    private static volatile com.google.firebase.analytics.FirebaseAnalytics zza;
    private static final java.lang.Object zzb = new java.lang.Object();

    public static final com.google.firebase.analytics.FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final com.google.firebase.analytics.FirebaseAnalytics getAnalytics(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = com.google.firebase.analytics.FirebaseAnalytics.getInstance(com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).getApplicationContext());
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics = zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }

    public static final java.lang.Object getLOCK() {
        return zzb;
    }

    public static final void setANALYTICS(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    public static final void logEvent(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics, java.lang.String name, kotlin.jvm.functions.Function1<? super com.google.firebase.analytics.ParametersBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.firebase.analytics.ParametersBuilder parametersBuilder = new com.google.firebase.analytics.ParametersBuilder();
        block.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(name, parametersBuilder.getZza());
    }

    public static final void setConsent(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics, kotlin.jvm.functions.Function1<? super com.google.firebase.analytics.ConsentBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        com.google.firebase.analytics.ConsentBuilder consentBuilder = new com.google.firebase.analytics.ConsentBuilder();
        block.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
