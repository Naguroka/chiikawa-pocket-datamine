package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/ironsource/e8;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enabled", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxImpressions", "Lcom/ironsource/j8;", "c", "Lcom/ironsource/j8;", "()Lcom/ironsource/j8;", "unit", "Lorg/json/JSONObject;", "features", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.Integer maxImpressions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.j8 unit;

    public e8(org.json.JSONObject features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        this.enabled = features.has("enabled") ? java.lang.Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.maxImpressions = features.has("maxImpressions") ? java.lang.Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.unit = features.has("unit") ? com.json.j8.INSTANCE.a(features.optString("unit")) : null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.Integer getMaxImpressions() {
        return this.maxImpressions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.json.j8 getUnit() {
        return this.unit;
    }
}
