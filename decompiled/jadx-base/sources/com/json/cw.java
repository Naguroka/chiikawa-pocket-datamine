package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/cw;", "Lcom/ironsource/n7;", "Smash", "", "", "c", "b", "Lcom/ironsource/dw;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/dw;", "smashPicker", "", "()Ljava/util/List;", "smashesToLoad", "<init>", "(Lcom/ironsource/dw;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cw<Smash extends com.json.n7<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.dw<Smash> smashPicker;

    public cw(com.json.dw<Smash> smashPicker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.smashPicker = smashPicker;
    }

    public final java.util.List<Smash> a() {
        return this.smashPicker.c();
    }

    public final boolean b() {
        return this.smashPicker.c().isEmpty() && this.smashPicker.a().isEmpty();
    }

    public final boolean c() {
        return this.smashPicker.d() == 0;
    }
}
