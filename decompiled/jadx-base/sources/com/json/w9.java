package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\tH\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001c\u0010\u0012\u001a\n \f*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ironsource/w9;", "Lcom/ironsource/z9;", "", com.ironsource.y8.h.W, "value", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "defValue", "getString", "", "allData", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences$Editor;", "b", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/Context;", "context", com.ironsource.rc.c.b, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w9 implements com.json.z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final android.content.SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final android.content.SharedPreferences.Editor editor;

    public w9(android.content.Context context, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.sharedPreferences = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    @Override // com.json.z9
    public void a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.editor.remove(key).apply();
    }

    @Override // com.json.z9
    public void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.editor.putString(key, value).apply();
    }

    @Override // com.json.z9
    public java.util.Map<java.lang.String, ?> allData() {
        java.util.Map<java.lang.String, ?> all = this.sharedPreferences.getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.json.z9
    public java.lang.String getString(java.lang.String key, java.lang.String defValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.sharedPreferences.getString(key, defValue);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
