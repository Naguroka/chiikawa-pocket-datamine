package androidx.sqlite.db.framework;

/* JADX INFO: loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        return new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory);
    }
}
