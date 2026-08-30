package com.unity3d.ads.core.domain.privacy;

/* JADX INFO: compiled from: LegacyUserConsentFlattenerRulesUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/domain/privacy/LegacyUserConsentFlattenerRulesUseCase;", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "()V", "invoke", "Lcom/unity3d/services/core/misc/JsonFlattenerRules;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyUserConsentFlattenerRulesUseCase implements com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public com.unity3d.services.core.misc.JsonFlattenerRules invoke() {
        return new com.unity3d.services.core.misc.JsonFlattenerRules(kotlin.collections.CollectionsKt.mutableListOf("privacy", "unity", "pipl"), kotlin.collections.CollectionsKt.listOf("value"), kotlin.collections.CollectionsKt.mutableListOf("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
