package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ironsource/yn;", "Lcom/ironsource/xn;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/mj;", com.ironsource.y8.h.p0, "", "", "showParams", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yn implements com.json.xn {
    @Override // com.json.xn
    public void a(android.app.Activity activity, com.json.mj adInstance, java.util.Map<java.lang.String, java.lang.String> showParams) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showParams, "showParams");
        com.json.sdk.IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.json.xn
    public boolean a(com.json.mj adInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return com.json.sdk.IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
