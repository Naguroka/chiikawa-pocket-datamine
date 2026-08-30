package com.google.firebase.crashlytics.internal.concurrency;

/* JADX INFO: compiled from: CrashlyticsWorkers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class CrashlyticsWorkers$Companion$checkBackgroundThread$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
    CrashlyticsWorkers$Companion$checkBackgroundThread$1(java.lang.Object obj) {
        super(0, obj, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Boolean invoke() {
        return java.lang.Boolean.valueOf(((com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion) this.receiver).isBackgroundThread());
    }
}
