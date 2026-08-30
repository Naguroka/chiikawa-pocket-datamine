package com.unity3d.services.core.device.reader.pii;

/* JADX INFO: compiled from: NonBehavioralFlag.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "TRUE", "FALSE", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.Companion INSTANCE = new com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.Companion(null);

    /* JADX INFO: compiled from: NonBehavioralFlag.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag$Companion;", "", "()V", "fromString", "Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "value", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.unity3d.services.core.device.reader.pii.NonBehavioralFlag fromString(java.lang.String value) {
            java.lang.Object objM1301constructorimpl;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.Companion companion2 = this;
                java.lang.String upperCase = value.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.unity3d.services.core.device.reader.pii.NonBehavioralFlag nonBehavioralFlag = com.unity3d.services.core.device.reader.pii.NonBehavioralFlag.UNKNOWN;
            if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl)) {
                objM1301constructorimpl = nonBehavioralFlag;
            }
            return (com.unity3d.services.core.device.reader.pii.NonBehavioralFlag) objM1301constructorimpl;
        }
    }
}
