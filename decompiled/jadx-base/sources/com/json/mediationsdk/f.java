package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0007\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/mediationsdk/f;", "Lcom/ironsource/mediationsdk/g;", "Landroid/content/Context;", "context", "Lcom/ironsource/mediationsdk/i;", "auctionRequestParams", "Lorg/json/JSONObject;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/p4;", "auctionListener", "Lcom/ironsource/mediationsdk/e$a;", "", "Lcom/ironsource/l5;", "Lcom/ironsource/l5;", "settings", "", "b", "Ljava/lang/String;", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Lcom/ironsource/l5;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f implements com.json.mediationsdk.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l5 settings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String sessionId;

    public f(com.json.l5 settings, java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.settings = settings;
        this.sessionId = sessionId;
    }

    private final org.json.JSONObject a(android.content.Context context, com.json.mediationsdk.i auctionRequestParams) throws org.json.JSONException {
        org.json.JSONObject jSONObjectA = com.json.mediationsdk.d.b().a(auctionRequestParams);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }

    @Override // com.json.mediationsdk.g
    public com.ironsource.mediationsdk.e.a a(android.content.Context context, com.json.mediationsdk.i auctionRequestParams, com.json.p4 auctionListener) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        org.json.JSONObject jSONObjectA = a(context, auctionRequestParams);
        java.lang.String strA = this.settings.a(auctionRequestParams.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY java.lang.String());
        return auctionRequestParams.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY java.lang.String() ? new com.json.e5(auctionListener, new java.net.URL(strA), jSONObjectA, auctionRequestParams.getIsEncryptedResponse(), this.settings.g(), this.settings.m(), this.settings.n(), this.settings.o(), this.settings.d()) : new com.ironsource.mediationsdk.e.a(auctionListener, new java.net.URL(strA), jSONObjectA, auctionRequestParams.getIsEncryptedResponse(), this.settings.g(), this.settings.m(), this.settings.n(), this.settings.o(), this.settings.d());
    }

    @Override // com.json.mediationsdk.g
    public boolean a() {
        return this.settings.g() > 0;
    }
}
