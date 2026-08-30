package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0019\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ironsource/j8;", "", "", "duration", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Integer;)J", "", "Ljava/lang/String;", "unit", "b", "J", "millis", "<init>", "(Ljava/lang/String;ILjava/lang/String;J)V", "c", "d", "e", "f", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum j8 {
    Day("d", 86400000),
    Hour(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, 3600000),
    Second(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, 1000);


    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final com.json.j8.Companion INSTANCE = new com.json.j8.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String unit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long millis;

    /* JADX INFO: renamed from: com.ironsource.j8$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/j8$a;", "", "", "value", "Lcom/ironsource/j8;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.json.j8 a(java.lang.String value) {
            for (com.json.j8 j8Var : com.json.j8.values()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(j8Var.unit, value)) {
                    return j8Var;
                }
            }
            return null;
        }
    }

    j8(java.lang.String str, long j) {
        this.unit = str;
        this.millis = j;
    }

    public static /* synthetic */ long a(com.json.j8 j8Var, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return j8Var.a(num);
    }

    public final long a(java.lang.Integer duration) {
        return ((long) (duration != null ? duration.intValue() : 1)) * this.millis;
    }
}
