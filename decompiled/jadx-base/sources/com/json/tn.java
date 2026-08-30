package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u001d\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/tn;", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/f5;", "Lcom/ironsource/f5;", "auctionResponse", "", "b", "Z", "isOneFlow", "<init>", "(Lcom/ironsource/f5;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.f5 auctionResponse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isOneFlow;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/tn$a;", "", "", "b", "Ljava/lang/String;", "ADM_KEY", "c", "ONE_FLOW_KEY", "d", "MULTIPLE_AD_OBJECTS_KEY", "e", "ADS_INTERNAL_INFO_KEY", "f", "ADS_INTERNAL_INFO_SUCCESS_KEY", "g", "ADS_INTERNAL_INFO_ERROR_KEY", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "ADS_INTERNAL_INFO_DATA_KEY", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.tn.a f3443a = new com.ironsource.tn.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final java.lang.String ADM_KEY = "adm";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final java.lang.String ONE_FLOW_KEY = "isOneFlow";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final java.lang.String MULTIPLE_AD_OBJECTS_KEY = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final java.lang.String ADS_INTERNAL_INFO_KEY = "adsInternalInfo";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final java.lang.String ADS_INTERNAL_INFO_SUCCESS_KEY = "success";

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final java.lang.String ADS_INTERNAL_INFO_ERROR_KEY = "error";

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final java.lang.String ADS_INTERNAL_INFO_DATA_KEY = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tn() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public tn(com.json.f5 f5Var, boolean z) {
        this.auctionResponse = f5Var;
        this.isOneFlow = z;
    }

    public /* synthetic */ tn(com.json.f5 f5Var, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f5Var, (i & 2) != 0 ? false : z);
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> a() {
        com.json.k5 serverData;
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        map.put("isOneFlow", java.lang.String.valueOf(this.isOneFlow));
        map.put("isMultipleAdObjects", com.json.mediationsdk.metadata.a.g);
        java.util.List<com.json.l0> listA = com.json.im.INSTANCE.d().F().a();
        java.lang.String string = (listA != null ? new org.json.JSONObject().put("success", true).put("data", listA) : new org.json.JSONObject().put("success", false).put("error", "Failed to get ad internal info")).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(com.ironsource.tn.a.ADS_INTERNAL_INFO_KEY, string);
        com.json.f5 f5Var = this.auctionResponse;
        if (f5Var != null && (serverData = f5Var.getServerData()) != null) {
            map.put("adm", serverData.a());
            map.putAll(serverData.b());
        }
        return map;
    }
}
