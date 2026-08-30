package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadBannerModule extends com.unity3d.services.ads.operation.load.BaseLoadModule {
    static com.unity3d.services.ads.operation.load.ILoadModule _instance;

    public static com.unity3d.services.ads.operation.load.ILoadModule getInstance() {
        if (_instance == null) {
            _instance = new com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout(new com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer(new com.unity3d.services.ads.operation.load.LoadBannerModule((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)), com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance()), new com.unity3d.services.core.configuration.ExperimentsReader());
        }
        return _instance;
    }

    public LoadBannerModule(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    @Override // com.unity3d.services.ads.operation.load.BaseLoadModule
    protected void addOptionalParameters(com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (loadOperationState instanceof com.unity3d.services.ads.operation.load.LoadBannerOperationState) {
            com.unity3d.services.ads.operation.load.LoadBannerOperationState loadBannerOperationState = (com.unity3d.services.ads.operation.load.LoadBannerOperationState) loadOperationState;
            jSONObject.put("width", loadBannerOperationState.getSize().getWidth());
            jSONObject.put("height", loadBannerOperationState.getSize().getHeight());
        }
    }
}
