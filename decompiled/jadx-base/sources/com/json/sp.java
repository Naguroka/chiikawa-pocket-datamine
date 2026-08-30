package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/ironsource/sp;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enabled", "Lorg/json/JSONObject;", "features", "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class sp {
    public static final java.lang.String c = "enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Boolean enabled;

    public sp(org.json.JSONObject features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        this.enabled = features.has("enabled") ? java.lang.Boolean.valueOf(features.getBoolean("enabled")) : null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Boolean getEnabled() {
        return this.enabled;
    }
}
