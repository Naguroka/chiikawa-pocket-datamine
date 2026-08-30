package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ironsource/sn;", "Lcom/ironsource/rn;", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "Lcom/ironsource/tn;", "loadParams", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class sn implements com.json.rn {
    @Override // com.json.rn
    public java.lang.String a() {
        java.lang.String version = com.json.sdk.IronSourceNetwork.getVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }

    @Override // com.json.rn
    public void a(com.json.mj adInstance, com.json.tn loadParams) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        com.json.sdk.IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }
}
