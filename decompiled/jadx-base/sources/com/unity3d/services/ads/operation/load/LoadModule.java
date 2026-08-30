package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadModule extends com.unity3d.services.ads.operation.load.BaseLoadModule {
    static com.unity3d.services.ads.operation.load.ILoadModule _instance;

    @Override // com.unity3d.services.ads.operation.load.BaseLoadModule
    void addOptionalParameters(com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, org.json.JSONObject jSONObject) {
    }

    public static com.unity3d.services.ads.operation.load.ILoadModule getInstance() {
        if (_instance == null) {
            _instance = new com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout(new com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer(new com.unity3d.services.ads.operation.load.LoadModule((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)), com.unity3d.services.core.configuration.InitializationNotificationCenter.getInstance()), new com.unity3d.services.core.configuration.ExperimentsReader());
        }
        return _instance;
    }

    public LoadModule(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }
}
