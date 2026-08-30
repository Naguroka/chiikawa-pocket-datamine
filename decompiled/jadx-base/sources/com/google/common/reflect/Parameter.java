package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class Parameter implements java.lang.reflect.AnnotatedElement {
    private final java.lang.Object annotatedType;
    private final com.google.common.collect.ImmutableList<java.lang.annotation.Annotation> annotations;
    private final com.google.common.reflect.Invokable<?, ?> declaration;
    private final int position;
    private final com.google.common.reflect.TypeToken<?> type;

    Parameter(com.google.common.reflect.Invokable<?, ?> declaration, int position, com.google.common.reflect.TypeToken<?> type, java.lang.annotation.Annotation[] annotations, java.lang.Object annotatedType) {
        this.declaration = declaration;
        this.position = position;
        this.type = type;
        this.annotations = com.google.common.collect.ImmutableList.copyOf(annotations);
        this.annotatedType = annotatedType;
    }

    public com.google.common.reflect.TypeToken<?> getType() {
        return this.type;
    }

    public com.google.common.reflect.Invokable<?, ?> getDeclaringInvokable() {
        return this.declaration;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> annotationType) {
        return getAnnotation(annotationType) != null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @javax.annotation.CheckForNull
    public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> annotationType) {
        com.google.common.base.Preconditions.checkNotNull(annotationType);
        com.google.common.collect.UnmodifiableIterator<java.lang.annotation.Annotation> it = this.annotations.iterator();
        while (it.hasNext()) {
            java.lang.annotation.Annotation next = it.next();
            if (annotationType.isInstance(next)) {
                return annotationType.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public java.lang.annotation.Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends java.lang.annotation.Annotation> A[] getAnnotationsByType(java.lang.Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public java.lang.annotation.Annotation[] getDeclaredAnnotations() {
        return (java.lang.annotation.Annotation[]) this.annotations.toArray(new java.lang.annotation.Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @javax.annotation.CheckForNull
    public <A extends java.lang.annotation.Annotation> A getDeclaredAnnotation(java.lang.Class<A> annotationType) {
        com.google.common.base.Preconditions.checkNotNull(annotationType);
        return (A) com.google.common.collect.FluentIterable.from(this.annotations).filter(annotationType).first().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends java.lang.annotation.Annotation> A[] getDeclaredAnnotationsByType(java.lang.Class<A> cls) {
        return (A[]) ((java.lang.annotation.Annotation[]) com.google.common.collect.FluentIterable.from(this.annotations).filter(cls).toArray(cls));
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.common.reflect.Parameter)) {
            return false;
        }
        com.google.common.reflect.Parameter parameter = (com.google.common.reflect.Parameter) obj;
        return this.position == parameter.position && this.declaration.equals(parameter.declaration);
    }

    public int hashCode() {
        return this.position;
    }

    public java.lang.String toString() {
        return this.type + " arg" + this.position;
    }
}
