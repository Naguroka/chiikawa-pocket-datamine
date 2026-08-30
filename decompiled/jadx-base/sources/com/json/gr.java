package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/ironsource/gr;", "", "Lcom/ironsource/or;", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/or;", "sdkInitResponse", "Lcom/ironsource/hs;", "d", "()Lcom/ironsource/hs;", "legacyInitResponse", "Lcom/ironsource/h4;", "()Lcom/ironsource/h4;", "applicationGeneralSettings", "Lcom/ironsource/cm;", "e", "()Lcom/ironsource/cm;", "loggerSettings", "Lcom/ironsource/a4;", "b", "()Lcom/ironsource/a4;", "crashReporterSettings", "Lcom/ironsource/jc;", "c", "()Lcom/ironsource/jc;", com.json.pr.d, "Lcom/ironsource/hs$a;", "f", "()Lcom/ironsource/hs$a;", "responseOrigin", "<init>", "(Lcom/ironsource/or;)V", "sdkConfig", "(Lcom/ironsource/gr;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.or sdkInitResponse;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gr(com.json.gr sdkConfig) {
        this(sdkConfig.sdkInitResponse);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public gr(com.json.or sdkInitResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.sdkInitResponse = sdkInitResponse;
    }

    public final com.json.h4 a() {
        return this.sdkInitResponse.getConfigurations().getApplicationConfigurations().getGeneralSettings();
    }

    public final com.json.a4 b() {
        return this.sdkInitResponse.getConfigurations().getApplicationConfigurations().getCrashReporter();
    }

    public final com.json.jc c() {
        return this.sdkInitResponse.getExperiments();
    }

    public final com.json.hs d() {
        return this.sdkInitResponse.getFullResponse();
    }

    public final com.json.cm e() {
        return this.sdkInitResponse.getConfigurations().getApplicationConfigurations().getLogger();
    }

    public final com.ironsource.hs.a f() {
        com.ironsource.hs.a aVarH = this.sdkInitResponse.getFullResponse().h();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVarH, "sdkInitResponse.fullResponse.origin");
        return aVarH;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final com.json.or getSdkInitResponse() {
        return this.sdkInitResponse;
    }
}
