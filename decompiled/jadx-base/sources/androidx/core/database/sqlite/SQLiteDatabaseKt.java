package androidx.core.database.sqlite;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SQLiteDatabaseKt {
    public static /* synthetic */ java.lang.Object transaction$default(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, kotlin.jvm.functions.Function1 body, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            java.lang.Object objInvoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            sQLiteDatabase.endTransaction();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T transaction(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean z, kotlin.jvm.functions.Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            sQLiteDatabase.endTransaction();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
