package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\bR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\f\"\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/wr;", "", "Lcom/ironsource/vr;", "b", "", "isOldInit", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Boolean;", "<set-?>", "c", "Lcom/ironsource/vr;", "()Lcom/ironsource/vr;", "(Lcom/ironsource/vr;)V", "initStatus", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wr {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static java.lang.Boolean isOldInit;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.wr f3542a = new com.json.wr();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static com.json.vr initStatus = com.json.vr.NOT_INIT;

    private wr() {
    }

    public final synchronized com.json.vr a() {
        return initStatus;
    }

    public final synchronized void a(com.json.vr vrVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vrVar, "<set-?>");
        initStatus = vrVar;
    }

    public final void a(boolean isOldInit2) {
        isOldInit = java.lang.Boolean.valueOf(isOldInit2);
    }

    public final com.json.vr b() {
        java.lang.Boolean bool = isOldInit;
        if (bool == null ? true : kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.FALSE)) {
            return com.json.vr.NOT_INIT;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            return initStatus;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
