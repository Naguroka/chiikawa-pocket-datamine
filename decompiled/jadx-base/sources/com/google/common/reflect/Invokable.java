package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class Invokable<T, R> implements java.lang.reflect.AnnotatedElement, java.lang.reflect.Member {
    private static final boolean ANNOTATED_TYPE_EXISTS = initAnnotatedTypeExists();
    private final java.lang.reflect.AccessibleObject accessibleObject;
    private final java.lang.reflect.Member member;

    abstract java.lang.reflect.Type[] getGenericExceptionTypes();

    abstract java.lang.reflect.Type[] getGenericParameterTypes();

    abstract java.lang.reflect.Type getGenericReturnType();

    abstract java.lang.annotation.Annotation[][] getParameterAnnotations();

    public abstract java.lang.reflect.TypeVariable<?>[] getTypeParameters();

    @javax.annotation.CheckForNull
    abstract java.lang.Object invokeInternal(@javax.annotation.CheckForNull java.lang.Object receiver, java.lang.Object[] args) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;

    public abstract boolean isOverridable();

    public abstract boolean isVarArgs();

    <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> Invokable(M member) {
        com.google.common.base.Preconditions.checkNotNull(member);
        this.accessibleObject = member;
        this.member = member;
    }

    public static com.google.common.reflect.Invokable<?, java.lang.Object> from(java.lang.reflect.Method method) {
        return new com.google.common.reflect.Invokable.MethodInvokable(method);
    }

    public static <T> com.google.common.reflect.Invokable<T, T> from(java.lang.reflect.Constructor<T> constructor) {
        return new com.google.common.reflect.Invokable.ConstructorInvokable(constructor);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> annotationClass) {
        return this.accessibleObject.isAnnotationPresent(annotationClass);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @javax.annotation.CheckForNull
    public final <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> cls) {
        return (A) this.accessibleObject.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getAnnotations() {
        return this.accessibleObject.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final java.lang.annotation.Annotation[] getDeclaredAnnotations() {
        return this.accessibleObject.getDeclaredAnnotations();
    }

    public final void setAccessible(boolean flag) {
        this.accessibleObject.setAccessible(flag);
    }

    public final boolean trySetAccessible() {
        try {
            this.accessibleObject.setAccessible(true);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean isAccessible() {
        return this.accessibleObject.isAccessible();
    }

    @Override // java.lang.reflect.Member
    public final java.lang.String getName() {
        return this.member.getName();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.member.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.member.isSynthetic();
    }

    public final boolean isPublic() {
        return java.lang.reflect.Modifier.isPublic(getModifiers());
    }

    public final boolean isProtected() {
        return java.lang.reflect.Modifier.isProtected(getModifiers());
    }

    public final boolean isPackagePrivate() {
        return (isPrivate() || isPublic() || isProtected()) ? false : true;
    }

    public final boolean isPrivate() {
        return java.lang.reflect.Modifier.isPrivate(getModifiers());
    }

    public final boolean isStatic() {
        return java.lang.reflect.Modifier.isStatic(getModifiers());
    }

    public final boolean isFinal() {
        return java.lang.reflect.Modifier.isFinal(getModifiers());
    }

    public final boolean isAbstract() {
        return java.lang.reflect.Modifier.isAbstract(getModifiers());
    }

    public final boolean isNative() {
        return java.lang.reflect.Modifier.isNative(getModifiers());
    }

    public final boolean isSynchronized() {
        return java.lang.reflect.Modifier.isSynchronized(getModifiers());
    }

    final boolean isVolatile() {
        return java.lang.reflect.Modifier.isVolatile(getModifiers());
    }

    final boolean isTransient() {
        return java.lang.reflect.Modifier.isTransient(getModifiers());
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.common.reflect.Invokable)) {
            return false;
        }
        com.google.common.reflect.Invokable invokable = (com.google.common.reflect.Invokable) obj;
        return getOwnerType().equals(invokable.getOwnerType()) && this.member.equals(invokable.member);
    }

    public int hashCode() {
        return this.member.hashCode();
    }

    public java.lang.String toString() {
        return this.member.toString();
    }

    @javax.annotation.CheckForNull
    public final R invoke(@javax.annotation.CheckForNull T t, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        return (R) invokeInternal(t, (java.lang.Object[]) com.google.common.base.Preconditions.checkNotNull(objArr));
    }

    public final com.google.common.reflect.TypeToken<? extends R> getReturnType() {
        return (com.google.common.reflect.TypeToken<? extends R>) com.google.common.reflect.TypeToken.of(getGenericReturnType());
    }

    public final com.google.common.collect.ImmutableList<com.google.common.reflect.Parameter> getParameters() {
        java.lang.reflect.Type[] genericParameterTypes = getGenericParameterTypes();
        java.lang.annotation.Annotation[][] parameterAnnotations = getParameterAnnotations();
        java.lang.Object[] objArr = new java.lang.Object[genericParameterTypes.length];
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < genericParameterTypes.length; i++) {
            builder.add(new com.google.common.reflect.Parameter(this, i, com.google.common.reflect.TypeToken.of(genericParameterTypes[i]), parameterAnnotations[i], objArr[i]));
        }
        return builder.build();
    }

    public final com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? extends java.lang.Throwable>> getExceptionTypes() {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.reflect.Type type : getGenericExceptionTypes()) {
            builder.add(com.google.common.reflect.TypeToken.of(type));
        }
        return builder.build();
    }

    public final <R1 extends R> com.google.common.reflect.Invokable<T, R1> returning(java.lang.Class<R1> returnType) {
        return returning(com.google.common.reflect.TypeToken.of((java.lang.Class) returnType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> com.google.common.reflect.Invokable<T, R1> returning(com.google.common.reflect.TypeToken<R1> returnType) {
        if (returnType.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new java.lang.IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + returnType);
    }

    @Override // java.lang.reflect.Member
    public final java.lang.Class<? super T> getDeclaringClass() {
        return (java.lang.Class<? super T>) this.member.getDeclaringClass();
    }

    public com.google.common.reflect.TypeToken<T> getOwnerType() {
        return com.google.common.reflect.TypeToken.of((java.lang.Class) getDeclaringClass());
    }

    static class MethodInvokable<T> extends com.google.common.reflect.Invokable<T, java.lang.Object> {
        final java.lang.reflect.Method method;

        MethodInvokable(java.lang.reflect.Method method) {
            super(method);
            this.method = method;
        }

        @Override // com.google.common.reflect.Invokable
        @javax.annotation.CheckForNull
        final java.lang.Object invokeInternal(@javax.annotation.CheckForNull java.lang.Object receiver, java.lang.Object[] args) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            return this.method.invoke(receiver, args);
        }

        @Override // com.google.common.reflect.Invokable
        java.lang.reflect.Type getGenericReturnType() {
            return this.method.getGenericReturnType();
        }

        @Override // com.google.common.reflect.Invokable
        java.lang.reflect.Type[] getGenericParameterTypes() {
            return this.method.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.Invokable
        java.lang.reflect.Type[] getGenericExceptionTypes() {
            return this.method.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        final java.lang.annotation.Annotation[][] getParameterAnnotations() {
            return this.method.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.reflect.TypeVariable<?>[] getTypeParameters() {
            return this.method.getTypeParameters();
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return (isFinal() || isPrivate() || isStatic() || java.lang.reflect.Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.method.isVarArgs();
        }
    }

    static class ConstructorInvokable<T> extends com.google.common.reflect.Invokable<T, T> {
        final java.lang.reflect.Constructor<?> constructor;

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return false;
        }

        ConstructorInvokable(java.lang.reflect.Constructor<?> constructor) {
            super(constructor);
            this.constructor = constructor;
        }

        @Override // com.google.common.reflect.Invokable
        final java.lang.Object invokeInternal(@javax.annotation.CheckForNull java.lang.Object receiver, java.lang.Object[] args) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            try {
                return this.constructor.newInstance(args);
            } catch (java.lang.InstantiationException e) {
                throw new java.lang.RuntimeException(this.constructor + " failed.", e);
            }
        }

        @Override // com.google.common.reflect.Invokable
        java.lang.reflect.Type getGenericReturnType() {
            java.lang.Class<? super T> declaringClass = getDeclaringClass();
            java.lang.reflect.TypeVariable<java.lang.Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? com.google.common.reflect.Types.newParameterizedType(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.Invokable
        java.lang.reflect.Type[] getGenericParameterTypes() {
            java.lang.reflect.Type[] genericParameterTypes = this.constructor.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !mayNeedHiddenThis()) {
                return genericParameterTypes;
            }
            java.lang.Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (java.lang.reflect.Type[]) java.util.Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.Invokable
        java.lang.reflect.Type[] getGenericExceptionTypes() {
            return this.constructor.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        final java.lang.annotation.Annotation[][] getParameterAnnotations() {
            return this.constructor.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        public final java.lang.reflect.TypeVariable<?>[] getTypeParameters() {
            java.lang.reflect.TypeVariable<java.lang.Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeParameters2 = this.constructor.getTypeParameters();
            java.lang.reflect.TypeVariable<?>[] typeVariableArr = new java.lang.reflect.TypeVariable[typeParameters.length + typeParameters2.length];
            java.lang.System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            java.lang.System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.constructor.isVarArgs();
        }

        private boolean mayNeedHiddenThis() {
            java.lang.Class<?> declaringClass = this.constructor.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            java.lang.reflect.Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !java.lang.reflect.Modifier.isStatic(enclosingMethod.getModifiers());
            }
            return (declaringClass.getEnclosingClass() == null || java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }
    }

    private static boolean initAnnotatedTypeExists() {
        try {
            java.lang.Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }
}
