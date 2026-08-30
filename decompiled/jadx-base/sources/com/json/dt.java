package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/dt;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "identifier", "b", "baseConst", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String identifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String baseConst;

    public dt(java.lang.String identifier, java.lang.String baseConst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.identifier = identifier;
        this.baseConst = baseConst;
    }

    public final java.lang.String a() {
        return this.identifier + '_' + this.baseConst;
    }
}
