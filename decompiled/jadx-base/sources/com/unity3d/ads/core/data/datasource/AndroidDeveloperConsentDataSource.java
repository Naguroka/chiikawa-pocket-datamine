package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidDeveloperConsentDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0017\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDeveloperConsentDataSource;", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "flattenerRulesUseCase", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "publicStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "(Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;Lcom/unity3d/services/core/misc/JsonStorage;)V", "developerConsent", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "createDeveloperConsentOption", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", com.ironsource.y8.h.W, "", "value", "", "developerConsentList", "", "fetchData", "Lorg/json/JSONObject;", "getDeveloperConsentChoice", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "choice", "(Ljava/lang/Boolean;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "getDeveloperConsentType", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "type", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidDeveloperConsentDataSource implements com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource {
    private final com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase flattenerRulesUseCase;
    private final com.unity3d.services.core.misc.JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase flattenerRulesUseCase, com.unity3d.services.core.misc.JsonStorage publicStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flattenerRulesUseCase, "flattenerRulesUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicStorage, "publicStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = publicStorage;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    private final java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() throws org.json.JSONException {
        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionCreateDeveloperConsentOption;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObjectFetchData = fetchData();
        java.util.Iterator<java.lang.String> itKeys = jSONObjectFetchData.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(itKeys, "data.keys()");
        while (itKeys.hasNext()) {
            java.lang.String key = itKeys.next();
            java.lang.Object storedValue = jSONObjectFetchData.get(key);
            if (storedValue instanceof java.lang.Boolean) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storedValue, "storedValue");
                developerConsentOptionCreateDeveloperConsentOption = createDeveloperConsentOption(key, ((java.lang.Boolean) storedValue).booleanValue());
            } else if (storedValue instanceof java.lang.String) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storedValue, "storedValue");
                java.lang.String str = (java.lang.String) storedValue;
                if (kotlin.text.StringsKt.equals(str, com.json.mediationsdk.metadata.a.g, true) || kotlin.text.StringsKt.equals(str, "false", true)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    developerConsentOptionCreateDeveloperConsentOption = createDeveloperConsentOption(key, java.lang.Boolean.parseBoolean(str));
                } else {
                    developerConsentOptionCreateDeveloperConsentOption = null;
                }
            } else {
                developerConsentOptionCreateDeveloperConsentOption = null;
            }
            if (developerConsentOptionCreateDeveloperConsentOption != null) {
                arrayList.add(developerConsentOptionCreateDeveloperConsentOption);
            }
        }
        return arrayList;
    }

    private final org.json.JSONObject fetchData() {
        if (this.publicStorage.getData() != null) {
            org.json.JSONObject jSONObjectFlattenJson = new com.unity3d.services.core.misc.JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectFlattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
            return jSONObjectFlattenJson;
        }
        return new org.json.JSONObject();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(java.lang.String type) {
        if (type == null) {
            return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (type.hashCode()) {
            case -1998919769:
                if (type.equals("user.nonbehavioral")) {
                    return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (type.equals("pipl.consent")) {
                    return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (type.equals(com.unity3d.services.core.device.reader.JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                    return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (type.equals("gdpr.consent")) {
                    return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (type.equals("privacy.consent")) {
                    return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (type.equals("privacy.useroveragelimit")) {
                    return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(java.lang.Boolean choice) {
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) choice, (java.lang.Object) true)) {
            return gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) choice, (java.lang.Object) false) ? gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion companion = gatewayprotocol.v1.DeveloperConsentKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllOptions(dsl_create.getOptions(), developerConsentList());
        return dsl_create._build();
    }

    private final gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(java.lang.String key, boolean value) {
        gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl.Companion companion = gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl.INSTANCE;
        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setType(getDeveloperConsentType(key));
        if (dsl_create.getType() == gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            dsl_create.setCustomType(key);
        }
        dsl_create.setValue(getDeveloperConsentChoice(java.lang.Boolean.valueOf(value)));
        return dsl_create._build();
    }
}
