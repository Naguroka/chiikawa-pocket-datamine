package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/g1;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "isReady", "b", "Lcom/ironsource/g1$a;", "Lcom/ironsource/g1$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface g1 {

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/g1$a;", "Lcom/ironsource/g1;", "", "b", "reason", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "()Z", "isReady", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a implements com.json.g1 {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final com.ironsource.g1.a.Companion INSTANCE = new com.ironsource.g1.a.Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String reason;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isReady;

        /* JADX INFO: renamed from: com.ironsource.g1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/g1$a$a;", "", "", "reason", "Lcom/ironsource/g1$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.ironsource.g1.a a(java.lang.String reason) {
                return new com.ironsource.g1.a(reason);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(java.lang.String str) {
            this.reason = str;
        }

        public /* synthetic */ a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ com.ironsource.g1.a a(com.ironsource.g1.a aVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.reason;
            }
            return aVar.a(str);
        }

        public final com.ironsource.g1.a a(java.lang.String reason) {
            return new com.ironsource.g1.a(reason);
        }

        @Override // com.json.g1
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsReady() {
            return this.isReady;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String c() {
            return this.reason;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.ironsource.g1.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.ironsource.g1.a) other).reason);
        }

        public int hashCode() {
            java.lang.String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public java.lang.String toString() {
            return "NotReady(reason=" + this.reason + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/g1$b;", "Lcom/ironsource/g1;", "", "b", "Z", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "isReady", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.g1.b f2669a = new com.ironsource.g1.b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final boolean isReady = true;

        private b() {
        }

        @Override // com.json.g1
        /* JADX INFO: renamed from: a */
        public boolean getIsReady() {
            return isReady;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getIsReady();
}
