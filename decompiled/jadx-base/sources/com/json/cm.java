package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ironsource/cm;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "c", "()I", com.json.dm.f2587a, "b", com.json.dm.b, "console", "", "d", "Z", "()Z", com.json.dm.d, "Lorg/json/JSONObject;", "applicationLogger", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int server;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int publisher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int console;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldSendPublisherLogsOnUIThread;

    public cm(org.json.JSONObject applicationLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.server = applicationLogger.optInt(com.json.dm.f2587a, 3);
        this.publisher = applicationLogger.optInt(com.json.dm.b, 3);
        this.console = applicationLogger.optInt("console", 3);
        this.shouldSendPublisherLogsOnUIThread = applicationLogger.optBoolean(com.json.dm.d, false);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConsole() {
        return this.console;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPublisher() {
        return this.publisher;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getServer() {
        return this.server;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShouldSendPublisherLogsOnUIThread() {
        return this.shouldSendPublisherLogsOnUIThread;
    }
}
