package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/p;", "", "", "value", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface p {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/p$a;", "Lcom/ironsource/mediationsdk/demandOnly/p;", "", "value", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "plumbus", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static class a implements com.json.mediationsdk.demandOnly.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String plumbus;

        public a(java.lang.String plumbus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.plumbus = plumbus;
        }

        @Override // com.json.mediationsdk.demandOnly.p
        /* JADX INFO: renamed from: value, reason: from getter */
        public java.lang.String getPlumbus() {
            return this.plumbus;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/p$b;", "Lcom/ironsource/mediationsdk/demandOnly/p$a;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends com.ironsource.mediationsdk.demandOnly.p.a {
        public b() {
            super("");
        }
    }

    /* JADX INFO: renamed from: value */
    java.lang.String getPlumbus();
}
