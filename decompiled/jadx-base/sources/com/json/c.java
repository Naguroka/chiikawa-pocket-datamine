package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B<\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u000f\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/ironsource/c;", "Lcom/ironsource/eb;", "Lorg/json/JSONObject;", "Lcom/ironsource/ih;", com.ironsource.y8.h.b, "c", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ah;", "error", "Lcom/ironsource/uc;", "Lcom/ironsource/uc;", "()Lcom/ironsource/uc;", com.ironsource.rc.c.f3240a, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "destinationPath", "Lcom/ironsource/jf;", "Lcom/ironsource/jf;", "k", "()Lcom/ironsource/jf;", "downloadManager", "Lkotlin/Function1;", "Lkotlin/Result;", "d", "Lkotlin/jvm/functions/Function1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Lkotlin/jvm/functions/Function1;", "onFinish", "e", "Lcom/ironsource/ih;", "j", "()Lcom/ironsource/ih;", "(Lcom/ironsource/ih;)V", "<init>", "(Lcom/ironsource/uc;Ljava/lang/String;Lcom/ironsource/jf;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class c implements com.json.eb<org.json.JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.uc fileUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String destinationPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.jf downloadManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> onFinish;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private com.json.ih file;

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.json.uc fileUrl, java.lang.String destinationPath, com.json.jf downloadManager, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> onFinish) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
        this.downloadManager = downloadManager;
        this.onFinish = onFinish;
        this.file = new com.json.ih(getDestinationPath(), com.json.y8.h);
    }

    private final org.json.JSONObject c(com.json.ih file) {
        return new org.json.JSONObject(com.json.sdk.utils.IronSourceStorageUtils.readFile(file));
    }

    @Override // com.json.lo
    public void a(com.json.ih file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (kotlin.jvm.internal.Intrinsics.areEqual(file.getName(), com.json.y8.h)) {
            try {
                org.json.JSONObject jSONObjectC = c(file);
                kotlin.jvm.functions.Function1<kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> function1I = i();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                function1I.invoke(kotlin.Result.m1300boximpl(kotlin.Result.m1301constructorimpl(jSONObjectC)));
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                kotlin.jvm.functions.Function1<kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> function1I2 = i();
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                function1I2.invoke(kotlin.Result.m1300boximpl(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(e))));
            }
        }
    }

    @Override // com.json.lo
    public void a(com.json.ih file, com.json.ah error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.functions.Function1<kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> function1I = i();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        function1I.invoke(kotlin.Result.m1300boximpl(kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Unable to download abTestMap.json: " + error.b())))));
    }

    @Override // com.json.eb
    /* JADX INFO: renamed from: b, reason: from getter */
    public java.lang.String getDestinationPath() {
        return this.destinationPath;
    }

    @Override // com.json.eb
    public void b(com.json.ih ihVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ihVar, "<set-?>");
        this.file = ihVar;
    }

    @Override // com.json.eb
    /* JADX INFO: renamed from: c, reason: from getter */
    public com.json.uc getFileUrl() {
        return this.fileUrl;
    }

    @Override // com.json.eb
    public kotlin.jvm.functions.Function1<kotlin.Result<? extends org.json.JSONObject>, kotlin.Unit> i() {
        return this.onFinish;
    }

    @Override // com.json.eb
    /* JADX INFO: renamed from: j, reason: from getter */
    public com.json.ih getFile() {
        return this.file;
    }

    @Override // com.json.eb
    /* JADX INFO: renamed from: k, reason: from getter */
    public com.json.jf getDownloadManager() {
        return this.downloadManager;
    }
}
