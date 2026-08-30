package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface ColumnInfo {
    public static final int BINARY = 2;
    public static final int BLOB = 5;
    public static final java.lang.String INHERIT_FIELD_NAME = "[field-name]";
    public static final int INTEGER = 3;
    public static final int LOCALIZED = 5;
    public static final int NOCASE = 3;
    public static final int REAL = 4;
    public static final int RTRIM = 4;
    public static final int TEXT = 2;
    public static final int UNDEFINED = 1;
    public static final int UNICODE = 6;
    public static final int UNSPECIFIED = 1;
    public static final java.lang.String VALUE_UNSPECIFIED = "[value-unspecified]";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Collate {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface SQLiteTypeAffinity {
    }

    int collate() default 1;

    java.lang.String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    java.lang.String name() default "[field-name]";

    int typeAffinity() default 1;
}
