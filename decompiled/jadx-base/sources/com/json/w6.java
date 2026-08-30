package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/w6;", "Lcom/ironsource/pi;", "", "b", "Lcom/ironsource/ri;", "c", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "f", "d", "", "e", "Lcom/ironsource/z2;", "Lcom/ironsource/z2;", "adapterConfig", "Lcom/ironsource/r6;", "Lcom/ironsource/r6;", "adFormatConfigurations", "<init>", "(Lcom/ironsource/z2;Lcom/ironsource/r6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w6 implements com.json.pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.z2 adapterConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.r6 adFormatConfigurations;

    public w6(com.json.z2 adapterConfig, com.json.r6 adFormatConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.adapterConfig = adapterConfig;
        this.adFormatConfigurations = adFormatConfigurations;
    }

    @Override // com.json.a3
    public boolean a() {
        return !this.adapterConfig.j();
    }

    @Override // com.json.a3
    public java.lang.String b() {
        java.lang.String strA = this.adapterConfig.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.json.a3
    public com.json.ri c() {
        return com.json.ri.INSTANCE.a(this.adapterConfig.d());
    }

    @Override // com.json.a3
    public boolean d() {
        return true;
    }

    @Override // com.json.t
    public long e() {
        return this.adFormatConfigurations.b();
    }

    @Override // com.json.a3
    public java.lang.String f() {
        java.lang.String strF = this.adapterConfig.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        return strF;
    }
}
