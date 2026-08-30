package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB#\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/ironsource/yr;", "Lcom/ironsource/sh;", "Lcom/ironsource/sh$a;", "Landroid/content/Context;", "context", "Lcom/ironsource/zr;", "sdkSessionInfoStorage", "", "b", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", "c", "Lcom/ironsource/zr;", com.ironsource.y8.a.k, "Lcom/ironsource/qr;", "Lcom/ironsource/qr;", "initResponseStorage", "Lcom/ironsource/n9;", "Lcom/ironsource/n9;", "currentTimeProvider", "d", "I", com.ironsource.as.a.SESSION_NUMBER, "e", "J", "firstSessionTimestamp", "<init>", "(Lcom/ironsource/zr;Lcom/ironsource/qr;Lcom/ironsource/n9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yr implements com.json.sh, com.ironsource.sh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.zr storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.qr initResponseStorage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.n9 currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int sessionNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long firstSessionTimestamp;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/yr$a;", "", "", "b", "I", "SESSION_NUMBER_NOT_INITIALIZED_VALUE", "c", "SESSION_NUMBER_INITIAL_VALUE", "", "d", "J", "FIRST_SESSION_TIMESTAMP_NOT_INITIALIZED_VALUE", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.yr.a f3598a = new com.ironsource.yr.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int SESSION_NUMBER_NOT_INITIALIZED_VALUE = -1;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int SESSION_NUMBER_INITIAL_VALUE = 0;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final long FIRST_SESSION_TIMESTAMP_NOT_INITIALIZED_VALUE = -1;

        private a() {
        }
    }

    public yr(com.json.zr storage, com.json.qr initResponseStorage, com.json.n9 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.storage = storage;
        this.initResponseStorage = initResponseStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.sessionNumber = -1;
        this.firstSessionTimestamp = -1L;
    }

    public /* synthetic */ yr(com.json.zr zrVar, com.json.qr qrVar, com.json.n9 n9Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(zrVar, (i & 2) != 0 ? new com.json.rr() : qrVar, (i & 4) != 0 ? new com.ironsource.n9.a() : n9Var);
    }

    private final long a(android.content.Context context, com.json.zr sdkSessionInfoStorage) {
        long jA = sdkSessionInfoStorage.a(context, -1L);
        if (this.initResponseStorage.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.currentTimeProvider.a();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        sdkSessionInfoStorage.b(context, jA2);
        return jA2;
    }

    private final int b(android.content.Context context, com.json.zr sdkSessionInfoStorage) {
        int iB = sdkSessionInfoStorage.b(context, 0) + 1;
        sdkSessionInfoStorage.a(context, iB);
        return iB;
    }

    @Override // com.json.sh
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getFirstSessionTimestamp() {
        return this.firstSessionTimestamp;
    }

    @Override // com.ironsource.sh.a
    public void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.sessionNumber = b(context, this.storage);
        this.firstSessionTimestamp = a(context, this.storage);
    }

    @Override // com.json.sh
    public java.lang.String b() {
        java.lang.String sessionId = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId()");
        return sessionId;
    }

    @Override // com.json.sh
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getSessionNumber() {
        return this.sessionNumber;
    }
}
