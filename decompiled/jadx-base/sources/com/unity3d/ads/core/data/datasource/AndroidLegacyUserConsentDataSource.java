package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidLegacyUserConsentDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLegacyUserConsentDataSource;", "Lcom/unity3d/ads/core/data/datasource/LegacyUserConsentDataSource;", "flattenerRulesUseCase", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "privateStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "(Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;Lcom/unity3d/services/core/misc/JsonStorage;)V", "privacyData", "", "getPrivacyData", "()Ljava/lang/String;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidLegacyUserConsentDataSource implements com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource {
    private final com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase flattenerRulesUseCase;
    private final com.unity3d.services.core.misc.JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase flattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage privateStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flattenerRulesUseCase, "flattenerRulesUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privateStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = privateStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    public java.lang.String getPrivacyData() {
        org.json.JSONObject jSONObjectFlattenJson;
        org.json.JSONObject data = this.privateStorage.getData();
        if (data == null || (jSONObjectFlattenJson = new com.unity3d.services.core.misc.JsonFlattener(data).flattenJson(".", this.flattenerRulesUseCase.invoke())) == null) {
            return null;
        }
        return jSONObjectFlattenJson.toString();
    }
}
