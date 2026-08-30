package com.google.firebase.analytics.ktx.ktxtesting;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, d2 = {"withAnalyticsForTest", "", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "block", "Lkotlin/Function0;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TestingKt {
    public static final void withAnalyticsForTest(com.google.firebase.analytics.FirebaseAnalytics analytics, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        synchronized (com.google.firebase.analytics.ktx.AnalyticsKt.getLOCK()) {
            com.google.firebase.analytics.FirebaseAnalytics analytics2 = com.google.firebase.analytics.ktx.AnalyticsKt.getANALYTICS();
            com.google.firebase.analytics.ktx.AnalyticsKt.setANALYTICS(analytics);
            try {
                block.invoke();
                com.google.firebase.analytics.ktx.AnalyticsKt.setANALYTICS(analytics2);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                com.google.firebase.analytics.ktx.AnalyticsKt.setANALYTICS(analytics2);
                throw th;
            }
        }
    }
}
