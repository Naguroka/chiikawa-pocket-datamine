package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ri;", "", "", "b", "instanceType", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "value", "<init>", "(Ljava/lang/String;II)V", "c", "d", "e", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum ri {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final com.json.ri.Companion INSTANCE = new com.json.ri.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: com.ironsource.ri$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/ri$a;", "", "", "value", "Lcom/ironsource/ri;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        public final com.json.ri a(int value) {
            for (com.json.ri riVar : com.json.ri.values()) {
                if (riVar.value == value) {
                    if (riVar == null) {
                        return com.json.ri.NotSupported;
                    }
                    return riVar;
                }
            }
            riVar = null;
            if (riVar == null) {
                return com.json.ri.NotSupported;
            }
            return riVar;
        }
    }

    ri(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final boolean b(com.json.ri instanceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.getValue() == this.value;
    }
}
