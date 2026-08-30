package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0007\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/ironsource/xk;", "", "", "d", "Ljava/lang/Runnable;", "runnable", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "callback", "b", "Lcom/ironsource/c1;", "adProperties", "Lcom/ironsource/l1;", "Lcom/ironsource/l1;", "()Lcom/ironsource/l1;", "adTools", "", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "adUnitId", "c", "Z", "()Z", "(Z)V", "isLoadAdCalled", "<init>", "(Lcom/ironsource/l1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.l1 adTools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.lang.String adUnitId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isLoadAdCalled;

    public xk(com.json.l1 adTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.adTools = adTools;
        this.adUnitId = "";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.l1 getAdTools() {
        return this.adTools;
    }

    public final void a(com.json.c1 adProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.adTools.getEventSender().a(new com.json.z1(this.adTools, adProperties, null, 4, null));
    }

    public final void a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.adTools.d(runnable);
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adUnitId = str;
    }

    protected final void a(boolean z) {
        this.isLoadAdCalled = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final void b(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.adTools.e(callback);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    protected final boolean getIsLoadAdCalled() {
        return this.isLoadAdCalled;
    }

    public abstract boolean d();
}
