package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface ForeignKey {
    public static final int CASCADE = 5;
    public static final int NO_ACTION = 1;
    public static final int RESTRICT = 2;
    public static final int SET_DEFAULT = 4;
    public static final int SET_NULL = 3;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Action {
    }

    java.lang.String[] childColumns();

    boolean deferred() default false;

    java.lang.Class<?> entity();

    int onDelete() default 1;

    int onUpdate() default 1;

    java.lang.String[] parentColumns();
}
