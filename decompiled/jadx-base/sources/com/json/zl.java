package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/zl;", "Lcom/ironsource/oc;", "Lcom/ironsource/yl;", "b", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "adm", "Lcom/ironsource/up;", "Lcom/ironsource/up;", "providerName", "Lcom/ironsource/b3;", "c", "Lcom/ironsource/b3;", "adapterConfigs", "", "d", "Z", "isSDKInitialized", "<init>", "(Ljava/lang/String;Lcom/ironsource/up;Lcom/ironsource/b3;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class zl implements com.json.oc<com.json.yl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String adm;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.up providerName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.b3 adapterConfigs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSDKInitialized;

    public zl(java.lang.String adm, com.json.up providerName, com.json.b3 adapterConfigs, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.adm = adm;
        this.providerName = providerName;
        this.adapterConfigs = adapterConfigs;
        this.isSDKInitialized = z;
    }

    @Override // com.json.oc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.json.yl a() throws java.lang.Exception {
        com.json.pi piVarA = this.adapterConfigs.a(this.providerName);
        new com.json.p0(this.adm, piVarA, this.isSDKInitialized).a();
        if (piVarA != null) {
            return new com.json.yl(piVarA.c(), piVarA.b(), piVarA.e(), piVarA.a(), false, 16, null);
        }
        return null;
    }
}
