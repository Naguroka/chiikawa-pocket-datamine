package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/y0;", "Lcom/ironsource/x0;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/ironsource/xn;", "Lcom/ironsource/xn;", "networkShowApi", "<init>", "(Lcom/ironsource/xn;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class y0 implements com.json.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.xn networkShowApi;

    public y0(com.json.xn networkShowApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.networkShowApi = networkShowApi;
    }

    @Override // com.json.x0
    public void a(android.app.Activity activity, com.json.mj adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.networkShowApi.a(activity, adInstance, new java.util.HashMap());
    }

    @Override // com.json.x0
    public boolean a(com.json.mj adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.networkShowApi.a(adInstance);
    }
}
