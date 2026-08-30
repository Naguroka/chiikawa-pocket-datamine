package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0003B!\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0018\u0010\u0003\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0003\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/ironsource/ct;", "Lcom/ironsource/d8;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Long;)Ljava/lang/Long;", "", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "", "identifier", "showCounter", "", "c", "(Ljava/lang/String;)Ljava/lang/Integer;", "lastShowTime", "b", "(Ljava/lang/String;)Ljava/lang/Long;", "threshold", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Ljava/lang/String;", "baseName", "Lcom/ironsource/th;", "Lcom/ironsource/th;", "sdkSharedPref", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/ironsource/th;)V", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ct implements com.json.d8 {
    public static final int e = -1;
    public static final long f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.content.Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String baseName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.th sdkSharedPref;

    public ct(android.content.Context context, java.lang.String baseName, com.json.th sdkSharedPref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseName, "baseName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.context = context;
        this.baseName = baseName;
        this.sdkSharedPref = sdkSharedPref;
    }

    public /* synthetic */ ct(android.content.Context context, java.lang.String str, com.json.th thVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new com.json.cs() : thVar);
    }

    private final java.lang.Integer a(java.lang.Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    private final java.lang.Long a(java.lang.Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    @Override // com.json.d8
    public java.lang.Long a(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(java.lang.Long.valueOf(this.sdkSharedPref.b(this.context, new com.json.dt(identifier, this.baseName + ".show_count_threshold").a(), -1L)));
    }

    @Override // com.json.d8
    public void a(java.lang.String identifier, int showCounter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.sdkSharedPref.a(this.context, new com.json.dt(identifier, this.baseName + ".show_count_show_counter").a(), showCounter);
    }

    @Override // com.json.d8
    public void a(java.lang.String identifier, long threshold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.sdkSharedPref.a(this.context, new com.json.dt(identifier, this.baseName + ".show_count_threshold").a(), threshold);
    }

    @Override // com.json.d8
    public java.lang.Long b(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(java.lang.Long.valueOf(this.sdkSharedPref.b(this.context, new com.json.dt(identifier, this.baseName + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.json.d8
    public void b(java.lang.String identifier, long lastShowTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.sdkSharedPref.a(this.context, new com.json.dt(identifier, this.baseName + ".pacing_last_show_time").a(), lastShowTime);
    }

    @Override // com.json.d8
    public java.lang.Integer c(java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(java.lang.Integer.valueOf(this.sdkSharedPref.b(this.context, new com.json.dt(identifier, this.baseName + ".show_count_show_counter").a(), -1)));
    }
}
