package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J*\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/lc;", "Lcom/ironsource/io;", "Lorg/json/JSONObject;", "b", "", "dataSource", "impressionData", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", com.json.v2.c, "", "revived", "Lcom/ironsource/p8;", "configurations", "reason", "d", "Z", "isExternalArmEventsEnabled", "Ljava/lang/String;", "externalArmEventsUrl", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class lc implements com.json.io {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isExternalArmEventsEnabled = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.lang.String externalArmEventsUrl = com.json.mc.j;

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/lc$a", "Lcom/ironsource/ue;", "", "requestSucceeded", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.ue {
        a() {
        }

        @Override // com.json.ue
        public void a(boolean requestSucceeded) {
            if (requestSucceeded) {
                return;
            }
            com.json.mediationsdk.logger.IronLog.API.error("failed to send impression data");
        }
    }

    private final org.json.JSONObject b() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("deviceOS", "android");
        android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", com.json.mediationsdk.utils.IronSourceUtils.getDeviceType(applicationContext));
            com.json.rj ironSourceAdvId = com.json.mediationsdk.utils.IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.c());
                jSONObject.put("advIdType", ironSourceAdvId.d());
            }
        }
        java.lang.String strN = com.json.mediationsdk.p.m().n();
        if (strN != null) {
            jSONObject.put(com.ironsource.y8.i.g, strN);
        }
        return jSONObject;
    }

    @Override // com.json.io
    public void a() {
    }

    public final void a(java.lang.String dataSource, org.json.JSONObject impressionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.isExternalArmEventsEnabled) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            org.json.JSONObject jSONObjectB = b();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            com.json.mediationsdk.logger.IronLog.API.info("impressionData: " + jSONObject);
            com.json.mediationsdk.server.HttpFunctions.sendPostRequest(this.externalArmEventsUrl, jSONObject.toString(), new com.ironsource.lc.a());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.json.io
    public void a(java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> adUnits, boolean revived, com.json.p8 configurations) {
        if (configurations != null) {
            com.json.x3 applicationConfigurations = configurations.getApplicationConfigurations();
            com.json.h4 h4VarE = applicationConfigurations != null ? applicationConfigurations.e() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(h4VarE);
            this.isExternalArmEventsEnabled = h4VarE.getIsExternalArmEventsEnabled();
            this.externalArmEventsUrl = configurations.getApplicationConfigurations().e().getExternalArmEventsUrl();
        }
    }

    @Override // com.json.io
    public void d(java.lang.String reason) {
    }
}
