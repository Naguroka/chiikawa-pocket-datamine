package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Entity {
    androidx.room.ForeignKey[] foreignKeys() default {};

    java.lang.String[] ignoredColumns() default {};

    androidx.room.Index[] indices() default {};

    boolean inheritSuperIndices() default false;

    java.lang.String[] primaryKeys() default {};

    java.lang.String tableName() default "";
}
