package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ironsource/f0;", "", "Lcom/ironsource/n1$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "performance", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/n1$a;", "b", "()Lcom/ironsource/n1$a;", "(Lcom/ironsource/n1$a;)V", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.ironsource.n1.a performance;

    public f0(com.ironsource.n1.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        this.performance = performance;
    }

    public static /* synthetic */ com.json.f0 a(com.json.f0 f0Var, com.ironsource.n1.a aVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aVar = f0Var.performance;
        }
        return f0Var.a(aVar);
    }

    public final com.json.f0 a(com.ironsource.n1.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        return new com.json.f0(performance);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.ironsource.n1.a getPerformance() {
        return this.performance;
    }

    public final com.ironsource.n1.a b() {
        return this.performance;
    }

    public final void b(com.ironsource.n1.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.performance = aVar;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.f0) && this.performance == ((com.json.f0) other).performance;
    }

    public int hashCode() {
        return this.performance.hashCode();
    }

    public java.lang.String toString() {
        return "AdInstancePerformance(performance=" + this.performance + ')';
    }
}
