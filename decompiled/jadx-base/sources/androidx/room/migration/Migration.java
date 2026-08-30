package androidx.room.migration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public abstract void migrate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);

    public Migration(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }
}
