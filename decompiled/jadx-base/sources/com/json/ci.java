package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\tJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ironsource/ci;", "Lcom/ironsource/di;", "", "url", "", "d", "Lkotlin/Result;", "Landroid/graphics/drawable/Drawable;", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "c", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/r8;", "Lcom/ironsource/r8;", "connectionFactory", "<init>", "(Lcom/ironsource/r8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ci implements com.json.di {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.r8 connectionFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public ci() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ci(com.json.r8 connectionFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.connectionFactory = connectionFactory;
    }

    public /* synthetic */ ci(com.json.r8 r8Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.json.fa.f2652a : r8Var);
    }

    private final java.lang.Object b(java.lang.String url) {
        java.lang.Object objCreateFromPath;
        java.lang.Exception exc;
        java.io.File file = new java.io.File(url);
        if (file.exists()) {
            objCreateFromPath = android.graphics.drawable.Drawable.createFromPath(file.getPath());
            if (objCreateFromPath == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                exc = new java.lang.Exception("failed to create a drawable");
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            }
            return kotlin.Result.m1301constructorimpl(objCreateFromPath);
        }
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        exc = new java.lang.Exception("file does not exists");
        objCreateFromPath = kotlin.ResultKt.createFailure(exc);
        return kotlin.Result.m1301constructorimpl(objCreateFromPath);
    }

    private final java.lang.Object c(java.lang.String url) {
        java.io.InputStream inputStreamA = this.connectionFactory.a(url);
        try {
            java.lang.Object objCreateFromStream = android.graphics.drawable.Drawable.createFromStream(inputStreamA, new java.io.File(url).getName());
            kotlin.io.CloseableKt.closeFinally(inputStreamA, null);
            if (objCreateFromStream == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                objCreateFromStream = kotlin.ResultKt.createFailure(new java.lang.Exception("failed to create a drawable"));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            }
            return kotlin.Result.m1301constructorimpl(objCreateFromStream);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(inputStreamA, th);
                throw th2;
            }
        }
    }

    private final boolean d(java.lang.String url) {
        return android.webkit.URLUtil.isHttpsUrl(url);
    }

    @Override // com.json.di
    public java.lang.Object a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(e));
        }
    }
}
