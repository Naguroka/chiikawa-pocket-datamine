package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ironsource/t9;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", "d", "e", "f", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum t9 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final com.json.t9.Companion INSTANCE = new com.json.t9.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String value;

    /* JADX INFO: renamed from: com.ironsource.t9$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/t9$a;", "", "", "value", "Lcom/ironsource/t9;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        public final com.json.t9 a(java.lang.String value) {
            for (com.json.t9 t9Var : com.json.t9.values()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(t9Var.getValue(), value)) {
                    if (t9Var == null) {
                        return com.json.t9.NONE;
                    }
                    return t9Var;
                }
            }
            t9Var = null;
            if (t9Var == null) {
                return com.json.t9.NONE;
            }
            return t9Var;
        }
    }

    t9(java.lang.String str) {
        this.value = str;
    }

    @kotlin.jvm.JvmStatic
    public static final com.json.t9 a(java.lang.String str) {
        return INSTANCE.a(str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }
}
