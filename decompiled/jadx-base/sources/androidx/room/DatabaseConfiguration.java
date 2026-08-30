package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;
    public final android.content.Context context;
    public final java.lang.String copyFromAssetPath;
    public final java.io.File copyFromFile;
    public final androidx.room.RoomDatabase.JournalMode journalMode;
    private final java.util.Set<java.lang.Integer> mMigrationNotRequiredFrom;
    public final androidx.room.RoomDatabase.MigrationContainer migrationContainer;
    public final boolean multiInstanceInvalidation;
    public final java.lang.String name;
    public final java.util.concurrent.Executor queryExecutor;
    public final boolean requireMigration;
    public final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final java.util.concurrent.Executor transactionExecutor;

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, boolean z2, java.util.Set<java.lang.Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor, false, z2, false, set, null, null);
    }

    @java.lang.Deprecated
    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2, z3, z4, set, null, null);
    }

    public DatabaseConfiguration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.RoomDatabase.MigrationContainer migrationContainer, java.util.List<androidx.room.RoomDatabase.Callback> list, boolean z, androidx.room.RoomDatabase.JournalMode journalMode, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z2, boolean z3, boolean z4, java.util.Set<java.lang.Integer> set, java.lang.String str2, java.io.File file) {
        this.sqliteOpenHelperFactory = factory;
        this.context = context;
        this.name = str;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidation = z2;
        this.requireMigration = z3;
        this.allowDestructiveMigrationOnDowngrade = z4;
        this.mMigrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
    }

    @java.lang.Deprecated
    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    public boolean isMigrationRequired(int i, int i2) {
        java.util.Set<java.lang.Integer> set;
        if ((i > i2) && this.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        return this.requireMigration && ((set = this.mMigrationNotRequiredFrom) == null || !set.contains(java.lang.Integer.valueOf(i)));
    }
}
