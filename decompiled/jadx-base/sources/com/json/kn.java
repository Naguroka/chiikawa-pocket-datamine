package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/ironsource/kn;", "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class kn {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/kn$a;", "", "", "b", "Ljava/lang/String;", "SDK_PLUGIN_TYPE", "c", "SESSION_ID", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.kn.a f2858a = new com.ironsource.kn.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final java.lang.String SDK_PLUGIN_TYPE = "SDKPluginType";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final java.lang.String SESSION_ID = "sessionid";

        private a() {
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> a() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String pluginType = com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(com.ironsource.kn.a.SDK_PLUGIN_TYPE, pluginType);
        }
        java.lang.String sessionId = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        if (sessionId != null) {
            linkedHashMap.put("sessionid", sessionId);
        }
        return linkedHashMap;
    }
}
