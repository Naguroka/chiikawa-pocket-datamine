package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineSdkWrapper.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/ads/mediation/line/LineSdkWrapper;", "", "()V", "delegate", "Lcom/google/ads/mediation/line/SdkWrapper;", "getDelegate$line_release", "()Lcom/google/ads/mediation/line/SdkWrapper;", "setDelegate$line_release", "(Lcom/google/ads/mediation/line/SdkWrapper;)V", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineSdkWrapper {
    public static final com.google.ads.mediation.line.LineSdkWrapper INSTANCE = new com.google.ads.mediation.line.LineSdkWrapper();
    private static com.google.ads.mediation.line.SdkWrapper delegate = new com.google.ads.mediation.line.SdkWrapper() { // from class: com.google.ads.mediation.line.LineSdkWrapper$delegate$1
        @Override // com.google.ads.mediation.line.SdkWrapper
        public java.lang.String getSdkVersion() {
            java.lang.String sdkSemanticVersion = com.five_corp.ad.FiveAd.getSdkSemanticVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sdkSemanticVersion, "getSdkSemanticVersion()");
            return sdkSemanticVersion;
        }

        @Override // com.google.ads.mediation.line.SdkWrapper
        public boolean isInitialized() {
            return com.five_corp.ad.FiveAd.isInitialized();
        }

        @Override // com.google.ads.mediation.line.SdkWrapper
        public void initialize(android.content.Context context, com.five_corp.ad.FiveAdConfig configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
            com.five_corp.ad.FiveAd.initialize(context, configuration);
        }
    };

    private LineSdkWrapper() {
    }

    public final com.google.ads.mediation.line.SdkWrapper getDelegate$line_release() {
        return delegate;
    }

    public final void setDelegate$line_release(com.google.ads.mediation.line.SdkWrapper sdkWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkWrapper, "<set-?>");
        delegate = sdkWrapper;
    }
}
