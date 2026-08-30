package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/u9;", "Lcom/ironsource/yh;", "Lcom/ironsource/xh;", "Landroid/content/Context;", "context", "Lcom/ironsource/t9;", "source", "", com.ironsource.y8.h.W, "value", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/hf;", "Lcom/ironsource/hf;", "sharedSignalsStorageFactory", "<init>", "(Lcom/ironsource/hf;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u9 implements com.json.yh, com.json.xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.hf sharedSignalsStorageFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public u9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public u9(com.json.hf sharedSignalsStorageFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.sharedSignalsStorageFactory = sharedSignalsStorageFactory;
    }

    public /* synthetic */ u9(com.json.hf hfVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.json.x9() : hfVar);
    }

    @Override // com.json.yh
    public java.lang.String a(android.content.Context context, com.json.t9 source, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.json.z9 z9VarA = this.sharedSignalsStorageFactory.a(context, source);
        if (z9VarA != null) {
            return com.json.z9.a(z9VarA, key, null, 2, null);
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    @Override // com.json.xh
    public void a(android.content.Context context, com.json.t9 source, java.lang.String key, java.lang.String value) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.json.z9 z9VarA = this.sharedSignalsStorageFactory.a(context, source);
        if (z9VarA != null) {
            z9VarA.a(key, value);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }
}
