package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/as;", "Lcom/ironsource/zr;", "Landroid/content/Context;", "context", "", "defaultValue", "b", "newValue", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", com.ironsource.aa.a.d, "Lcom/ironsource/th;", "Lcom/ironsource/th;", "sdkSharedPref", "<init>", "(Lcom/ironsource/th;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class as implements com.json.zr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.th sdkSharedPref;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/as$a;", "", "", "b", "Ljava/lang/String;", "SESSION_NUMBER", "c", "FIRST_SESSION_TIMESTAMP", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.as.a f2517a = new com.ironsource.as.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final java.lang.String SESSION_NUMBER = "sessionNumber";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final java.lang.String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public as() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public as(com.json.th sdkSharedPref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.sdkSharedPref = sdkSharedPref;
    }

    public /* synthetic */ as(com.json.th thVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.json.cs() : thVar);
    }

    @Override // com.json.jr
    public long a(android.content.Context context, long defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.sdkSharedPref.b(context, "firstSessionTimestamp", defaultValue);
    }

    @Override // com.json.bs
    public void a(android.content.Context context, int newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.sdkSharedPref.a(context, com.ironsource.as.a.SESSION_NUMBER, newValue);
    }

    @Override // com.json.bs
    public int b(android.content.Context context, int defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.sdkSharedPref.b(context, com.ironsource.as.a.SESSION_NUMBER, defaultValue);
    }

    @Override // com.json.jr
    public void b(android.content.Context context, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.sdkSharedPref.a(context, "firstSessionTimestamp", timestamp);
    }
}
