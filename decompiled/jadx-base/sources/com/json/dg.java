package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ironsource/dg;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "c", "d", "e", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum dg {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final com.json.dg.Companion INSTANCE = new com.json.dg.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: com.ironsource.dg$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/dg$a;", "", "", "value", "Lcom/ironsource/dg;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Integer;)Lcom/ironsource/dg;", "", "dynamicDemandSourceId", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0024  */
        /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
        public final com.json.dg a(java.lang.Integer value) {
            for (com.json.dg dgVar : com.json.dg.values()) {
                if (value != null && dgVar.getId() == value.intValue()) {
                    if (dgVar == null) {
                        return com.json.dg.UnknownProvider;
                    }
                    return dgVar;
                }
            }
            dgVar = null;
            if (dgVar == null) {
                return com.json.dg.UnknownProvider;
            }
            return dgVar;
        }

        public final com.json.dg a(java.lang.String dynamicDemandSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) dynamicDemandSourceId, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            return listSplit$default.size() < 2 ? com.json.dg.UnknownProvider : a(kotlin.text.StringsKt.toIntOrNull((java.lang.String) listSplit$default.get(1)));
        }
    }

    dg(int i) {
        this.id = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }
}
