package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/wk;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/UUID;", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "id", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.UUID id;

    public wk() {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this.id = uuidRandomUUID;
    }

    public final java.lang.String a() {
        java.lang.String string = this.id.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        return string;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.util.UUID getId() {
        return this.id;
    }
}
