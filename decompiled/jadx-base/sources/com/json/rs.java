package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/rs;", "", "Lcom/ironsource/ys;", "b", "()Lcom/ironsource/ys;", "Lcom/ironsource/hm;", "Lcom/ironsource/u;", "mapper", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/ironsource/hm;)Lcom/ironsource/u;", "Lcom/ironsource/l0;", "Lcom/ironsource/l0;", "()Lcom/ironsource/l0;", "adInternalInfo", "<init>", "(Lcom/ironsource/l0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class rs {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l0 adInternalInfo;

    public rs(com.json.l0 l0Var) {
        this.adInternalInfo = l0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.l0 getAdInternalInfo() {
        return this.adInternalInfo;
    }

    public final com.json.u a(com.json.hm<com.json.rs, com.json.u> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    public abstract com.json.ys b();
}
