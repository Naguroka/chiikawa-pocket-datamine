package com.json.adapters.ironsource;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\n\u000b\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters;", "", "config", "Lorg/json/JSONObject;", com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, "", "value", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Base", "Constants", "WithLog", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IronSourceLoadParameters {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J$\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters$Base;", "Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters;", "loadConfig", "Lorg/json/JSONObject;", com.json.j5.s, "", "(Lorg/json/JSONObject;Ljava/lang/String;)V", "config", com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, "", "value", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Base implements com.json.adapters.ironsource.IronSourceLoadParameters {
        private final org.json.JSONObject loadConfig;
        private final java.lang.String serverData;

        public Base(org.json.JSONObject loadConfig, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadConfig, "loadConfig");
            this.loadConfig = loadConfig;
            this.serverData = str;
        }

        public /* synthetic */ Base(org.json.JSONObject jSONObject, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }

        @Override // com.json.adapters.ironsource.IronSourceLoadParameters
        /* JADX INFO: renamed from: config, reason: from getter */
        public org.json.JSONObject getLoadConfig() {
            return this.loadConfig;
        }

        @Override // com.json.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, false);
        }

        @Override // com.json.adapters.ironsource.IronSourceLoadParameters
        public java.util.HashMap<java.lang.String, java.lang.String> value() {
            java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
            map.put("isOneFlow", java.lang.String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                java.lang.String strA = com.json.mediationsdk.d.b().a(this.serverData);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strA, "getInstance().getAdmFromServerData(serverData)");
                map.put("adm", strA);
                map.putAll(com.json.mediationsdk.d.b().b(this.serverData));
            }
            return map;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters$Constants;", "", "()V", "ADM_KEY", "", "DEMAND_ONLY", "ONE_FLOW_KEY", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Constants {
        public static final java.lang.String ADM_KEY = "adm";
        public static final java.lang.String DEMAND_ONLY = "demandOnly";
        public static final com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants INSTANCE = new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants();
        public static final java.lang.String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters$WithLog;", "Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters;", "loadParameters", "(Lcom/ironsource/adapters/ironsource/IronSourceLoadParameters;)V", "config", "Lorg/json/JSONObject;", com.ironsource.adapters.ironsource.IronSourceLoadParameters.Constants.DEMAND_ONLY, "", "value", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithLog implements com.json.adapters.ironsource.IronSourceLoadParameters {
        private final com.json.adapters.ironsource.IronSourceLoadParameters loadParameters;

        public WithLog(com.json.adapters.ironsource.IronSourceLoadParameters loadParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParameters, "loadParameters");
            this.loadParameters = loadParameters;
        }

        @Override // com.json.adapters.ironsource.IronSourceLoadParameters
        /* JADX INFO: renamed from: config */
        public org.json.JSONObject getLoadConfig() {
            return this.loadParameters.getLoadConfig();
        }

        @Override // com.json.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.json.adapters.ironsource.IronSourceLoadParameters
        public java.util.HashMap<java.lang.String, java.lang.String> value() {
            java.util.HashMap<java.lang.String, java.lang.String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose("instance extra params:");
                for (java.lang.String str : mapValue.keySet()) {
                    com.json.mediationsdk.logger.IronLog.ADAPTER_API.verbose(str + '=' + mapValue.get(str));
                }
            }
            return mapValue;
        }
    }

    /* JADX INFO: renamed from: config */
    org.json.JSONObject getLoadConfig();

    boolean demandOnly();

    java.util.HashMap<java.lang.String, java.lang.String> value();
}
