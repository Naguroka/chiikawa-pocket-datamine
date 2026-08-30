package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J,\u0010\t\u001a\u00020\b2\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0006H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/a1;", "Lcom/ironsource/b1;", "", "", "get", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "params", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, com.ironsource.y8.h.W, "value", "b", "", "Ljava/util/Map;", "data", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a1 implements com.json.b1 {
    private static final java.lang.String c = "ext_";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> data = new java.util.HashMap();

    @Override // com.json.b1
    public void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.data.put(key, value);
    }

    @Override // com.json.b1
    public void a(java.util.HashMap<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        this.data.putAll(params);
    }

    @Override // com.json.b1
    public void b(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.data.put("ext_" + key, value);
    }

    @Override // com.json.b1
    public java.util.Map<java.lang.String, java.lang.String> get() {
        return this.data;
    }
}
