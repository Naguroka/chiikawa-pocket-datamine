package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Relation {
    androidx.room.Junction associateBy() default @androidx.room.Junction(java.lang.Object.class);

    java.lang.Class<?> entity() default java.lang.Object.class;

    java.lang.String entityColumn();

    java.lang.String parentColumn();

    java.lang.String[] projection() default {};
}
