package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.Deprecated
public @interface OnLifecycleEvent {
    androidx.lifecycle.Lifecycle.Event value();
}
