package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
final class Types {
    private static final com.google.common.base.Joiner COMMA_JOINER = com.google.common.base.Joiner.on(", ").useForNull("null");

    static java.lang.reflect.Type newArrayType(java.lang.reflect.Type componentType) {
        if (componentType instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) componentType;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            com.google.common.base.Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
            if (lowerBounds.length == 1) {
                return supertypeOf(newArrayType(lowerBounds[0]));
            }
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            com.google.common.base.Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
            return subtypeOf(newArrayType(upperBounds[0]));
        }
        return com.google.common.reflect.Types.JavaVersion.CURRENT.newArrayType(componentType);
    }

    static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(@javax.annotation.CheckForNull java.lang.reflect.Type ownerType, java.lang.Class<?> rawType, java.lang.reflect.Type... arguments) {
        if (ownerType == null) {
            return newParameterizedType(rawType, arguments);
        }
        com.google.common.base.Preconditions.checkNotNull(arguments);
        com.google.common.base.Preconditions.checkArgument(rawType.getEnclosingClass() != null, "Owner type for unenclosed %s", rawType);
        return new com.google.common.reflect.Types.ParameterizedTypeImpl(ownerType, rawType, arguments);
    }

    static java.lang.reflect.ParameterizedType newParameterizedType(java.lang.Class<?> rawType, java.lang.reflect.Type... arguments) {
        return new com.google.common.reflect.Types.ParameterizedTypeImpl(com.google.common.reflect.Types.ClassOwnership.JVM_BEHAVIOR.getOwnerType(rawType), rawType, arguments);
    }

    private enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            @javax.annotation.CheckForNull
            java.lang.Class<?> getOwnerType(java.lang.Class<?> rawType) {
                return rawType.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            @javax.annotation.CheckForNull
            java.lang.Class<?> getOwnerType(java.lang.Class<?> rawType) {
                if (rawType.isLocalClass()) {
                    return null;
                }
                return rawType.getEnclosingClass();
            }
        };

        static final com.google.common.reflect.Types.ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        @javax.annotation.CheckForNull
        abstract java.lang.Class<?> getOwnerType(java.lang.Class<?> rawType);

        private static com.google.common.reflect.Types.ClassOwnership detectJvmBehavior() {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) java.util.Objects.requireNonNull((java.lang.reflect.ParameterizedType) new com.google.common.reflect.Types.ClassOwnership.C1LocalClass<java.lang.String>() { // from class: com.google.common.reflect.Types.ClassOwnership.3
            }.getClass().getGenericSuperclass());
            for (com.google.common.reflect.Types.ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(com.google.common.reflect.Types.ClassOwnership.C1LocalClass.class) == parameterizedType.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new java.lang.AssertionError();
        }
    }

    static <D extends java.lang.reflect.GenericDeclaration> java.lang.reflect.TypeVariable<D> newArtificialTypeVariable(D declaration, java.lang.String name, java.lang.reflect.Type... bounds) {
        if (bounds.length == 0) {
            bounds = new java.lang.reflect.Type[]{java.lang.Object.class};
        }
        return newTypeVariableImpl(declaration, name, bounds);
    }

    static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type upperBound) {
        return new com.google.common.reflect.Types.WildcardTypeImpl(new java.lang.reflect.Type[0], new java.lang.reflect.Type[]{upperBound});
    }

    static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type lowerBound) {
        return new com.google.common.reflect.Types.WildcardTypeImpl(new java.lang.reflect.Type[]{lowerBound}, new java.lang.reflect.Type[]{java.lang.Object.class});
    }

    static java.lang.String toString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    @javax.annotation.CheckForNull
    static java.lang.reflect.Type getComponentType(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        new com.google.common.reflect.TypeVisitor() { // from class: com.google.common.reflect.Types.1
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> t) {
                atomicReference.set(com.google.common.reflect.Types.subtypeOfComponentType(t.getBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType t) {
                atomicReference.set(com.google.common.reflect.Types.subtypeOfComponentType(t.getUpperBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType t) {
                atomicReference.set(t.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(java.lang.Class<?> t) {
                atomicReference.set(t.getComponentType());
            }
        }.visit(type);
        return (java.lang.reflect.Type) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public static java.lang.reflect.Type subtypeOfComponentType(java.lang.reflect.Type[] bounds) {
        for (java.lang.reflect.Type type : bounds) {
            java.lang.reflect.Type componentType = getComponentType(type);
            if (componentType != null) {
                if (componentType instanceof java.lang.Class) {
                    java.lang.Class cls = (java.lang.Class) componentType;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return subtypeOf(componentType);
            }
        }
        return null;
    }

    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        GenericArrayTypeImpl(java.lang.reflect.Type componentType) {
            this.componentType = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(componentType);
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
            return this.componentType;
        }

        public java.lang.String toString() {
            return com.google.common.reflect.Types.toString(this.componentType) + okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof java.lang.reflect.GenericArrayType) {
                return com.google.common.base.Objects.equal(getGenericComponentType(), ((java.lang.reflect.GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }
    }

    private static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> argumentsList;

        @javax.annotation.CheckForNull
        private final java.lang.reflect.Type ownerType;
        private final java.lang.Class<?> rawType;

        ParameterizedTypeImpl(@javax.annotation.CheckForNull java.lang.reflect.Type ownerType, java.lang.Class<?> rawType, java.lang.reflect.Type[] typeArguments) {
            com.google.common.base.Preconditions.checkNotNull(rawType);
            com.google.common.base.Preconditions.checkArgument(typeArguments.length == rawType.getTypeParameters().length);
            com.google.common.reflect.Types.disallowPrimitiveType(typeArguments, "type parameter");
            this.ownerType = ownerType;
            this.rawType = rawType;
            this.argumentsList = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(typeArguments);
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
            return com.google.common.reflect.Types.toArray(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        @javax.annotation.CheckForNull
        public java.lang.reflect.Type getOwnerType() {
            return this.ownerType;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.ownerType != null && com.google.common.reflect.Types.JavaVersion.CURRENT.jdkTypeDuplicatesOwnerName()) {
                sb.append(com.google.common.reflect.Types.JavaVersion.CURRENT.typeName(this.ownerType)).append('.');
            }
            java.lang.StringBuilder sbAppend = sb.append(this.rawType.getName()).append(kotlin.text.Typography.less);
            com.google.common.base.Joiner joiner = com.google.common.reflect.Types.COMMA_JOINER;
            com.google.common.collect.ImmutableList<java.lang.reflect.Type> immutableList = this.argumentsList;
            final com.google.common.reflect.Types.JavaVersion javaVersion = com.google.common.reflect.Types.JavaVersion.CURRENT;
            java.util.Objects.requireNonNull(javaVersion);
            return sbAppend.append(joiner.join(com.google.common.collect.Iterables.transform(immutableList, new com.google.common.base.Function() { // from class: com.google.common.reflect.Types$ParameterizedTypeImpl$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return javaVersion.typeName((java.lang.reflect.Type) obj);
                }
            }))).append(kotlin.text.Typography.greater).toString();
        }

        public int hashCode() {
            java.lang.reflect.Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
            if (!(other instanceof java.lang.reflect.ParameterizedType)) {
                return false;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) other;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && java.util.Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    private static <D extends java.lang.reflect.GenericDeclaration> java.lang.reflect.TypeVariable<D> newTypeVariableImpl(D genericDeclaration, java.lang.String name, java.lang.reflect.Type[] bounds) {
        return (java.lang.reflect.TypeVariable) com.google.common.reflect.Reflection.newProxy(java.lang.reflect.TypeVariable.class, new com.google.common.reflect.Types.TypeVariableInvocationHandler(new com.google.common.reflect.Types.TypeVariableImpl(genericDeclaration, name, bounds)));
    }

    private static final class TypeVariableInvocationHandler implements java.lang.reflect.InvocationHandler {
        private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.reflect.Method> typeVariableMethods;
        private final com.google.common.reflect.Types.TypeVariableImpl<?> typeVariableImpl;

        static {
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            for (java.lang.reflect.Method method : com.google.common.reflect.Types.TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(com.google.common.reflect.Types.TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (java.security.AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            typeVariableMethods = builder.buildKeepingLast();
        }

        TypeVariableInvocationHandler(com.google.common.reflect.Types.TypeVariableImpl<?> typeVariableImpl) {
            this.typeVariableImpl = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        @javax.annotation.CheckForNull
        public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, @javax.annotation.CheckForNull java.lang.Object[] args) throws java.lang.Throwable {
            java.lang.String name = method.getName();
            java.lang.reflect.Method method2 = typeVariableMethods.get(name);
            if (method2 == null) {
                throw new java.lang.UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.typeVariableImpl, args);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    private static final class TypeVariableImpl<D extends java.lang.reflect.GenericDeclaration> {
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> bounds;
        private final D genericDeclaration;
        private final java.lang.String name;

        TypeVariableImpl(D genericDeclaration, java.lang.String name, java.lang.reflect.Type[] bounds) {
            com.google.common.reflect.Types.disallowPrimitiveType(bounds, "bound for type variable");
            this.genericDeclaration = (D) com.google.common.base.Preconditions.checkNotNull(genericDeclaration);
            this.name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(name);
            this.bounds = com.google.common.collect.ImmutableList.copyOf(bounds);
        }

        public java.lang.reflect.Type[] getBounds() {
            return com.google.common.reflect.Types.toArray(this.bounds);
        }

        public D getGenericDeclaration() {
            return this.genericDeclaration;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public java.lang.String getTypeName() {
            return this.name;
        }

        public java.lang.String toString() {
            return this.name;
        }

        public int hashCode() {
            return this.genericDeclaration.hashCode() ^ this.name.hashCode();
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY) {
                if (obj == null || !java.lang.reflect.Proxy.isProxyClass(obj.getClass()) || !(java.lang.reflect.Proxy.getInvocationHandler(obj) instanceof com.google.common.reflect.Types.TypeVariableInvocationHandler)) {
                    return false;
                }
                com.google.common.reflect.Types.TypeVariableImpl typeVariableImpl = ((com.google.common.reflect.Types.TypeVariableInvocationHandler) java.lang.reflect.Proxy.getInvocationHandler(obj)).typeVariableImpl;
                return this.name.equals(typeVariableImpl.getName()) && this.genericDeclaration.equals(typeVariableImpl.getGenericDeclaration()) && this.bounds.equals(typeVariableImpl.bounds);
            }
            if (!(obj instanceof java.lang.reflect.TypeVariable)) {
                return false;
            }
            java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) obj;
            return this.name.equals(typeVariable.getName()) && this.genericDeclaration.equals(typeVariable.getGenericDeclaration());
        }
    }

    static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> lowerBounds;
        private final com.google.common.collect.ImmutableList<java.lang.reflect.Type> upperBounds;

        WildcardTypeImpl(java.lang.reflect.Type[] lowerBounds, java.lang.reflect.Type[] upperBounds) {
            com.google.common.reflect.Types.disallowPrimitiveType(lowerBounds, "lower bound for wildcard");
            com.google.common.reflect.Types.disallowPrimitiveType(upperBounds, "upper bound for wildcard");
            this.lowerBounds = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(lowerBounds);
            this.upperBounds = com.google.common.reflect.Types.JavaVersion.CURRENT.usedInGenericType(upperBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
            return com.google.common.reflect.Types.toArray(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
            return com.google.common.reflect.Types.toArray(this.upperBounds);
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof java.lang.reflect.WildcardType)) {
                return false;
            }
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) obj;
            return this.lowerBounds.equals(java.util.Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(java.util.Arrays.asList(wildcardType.getUpperBounds()));
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("?");
            com.google.common.collect.UnmodifiableIterator<java.lang.reflect.Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                sb.append(" super ").append(com.google.common.reflect.Types.JavaVersion.CURRENT.typeName(it.next()));
            }
            java.util.Iterator it2 = com.google.common.reflect.Types.filterUpperBounds(this.upperBounds).iterator();
            while (it2.hasNext()) {
                sb.append(" extends ").append(com.google.common.reflect.Types.JavaVersion.CURRENT.typeName((java.lang.reflect.Type) it2.next()));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Type[] toArray(java.util.Collection<java.lang.reflect.Type> types) {
        return (java.lang.reflect.Type[]) types.toArray(new java.lang.reflect.Type[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Iterable<java.lang.reflect.Type> filterUpperBounds(java.lang.Iterable<java.lang.reflect.Type> bounds) {
        return com.google.common.collect.Iterables.filter(bounds, com.google.common.base.Predicates.not(com.google.common.base.Predicates.equalTo(java.lang.Object.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void disallowPrimitiveType(java.lang.reflect.Type[] types, java.lang.String usedAs) {
        for (java.lang.reflect.Type type : types) {
            if (type instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type;
                com.google.common.base.Preconditions.checkArgument(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, usedAs);
            }
        }
    }

    static java.lang.Class<?> getArrayClass(java.lang.Class<?> componentType) {
        return java.lang.reflect.Array.newInstance(componentType, 0).getClass();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
  (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) (LINE:646) com.google.common.reflect.Types.JavaVersion.CURRENT com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            public java.lang.reflect.GenericArrayType newArrayType(java.lang.reflect.Type componentType) {
                return new com.google.common.reflect.Types.GenericArrayTypeImpl(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                com.google.common.base.Preconditions.checkNotNull(type);
                if (!(type instanceof java.lang.Class)) {
                    return type;
                }
                java.lang.Class cls = (java.lang.Class) type;
                return cls.isArray() ? new com.google.common.reflect.Types.GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type newArrayType(java.lang.reflect.Type componentType) {
                if (componentType instanceof java.lang.Class) {
                    return com.google.common.reflect.Types.getArrayClass((java.lang.Class) componentType);
                }
                return new com.google.common.reflect.Types.GenericArrayTypeImpl(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                return (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type newArrayType(java.lang.reflect.Type componentType) {
                return JAVA7.newArrayType(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                return JAVA7.usedInGenericType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.String typeName(java.lang.reflect.Type type) {
                try {
                    return (java.lang.String) java.lang.reflect.Type.class.getMethod("getTypeName", new java.lang.Class[0]).invoke(type, new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.RuntimeException(e);
                } catch (java.lang.NoSuchMethodException unused) {
                    throw new java.lang.AssertionError("Type.getTypeName should be available in Java 8");
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type newArrayType(java.lang.reflect.Type componentType) {
                return JAVA8.newArrayType(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type) {
                return JAVA8.usedInGenericType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            java.lang.String typeName(java.lang.reflect.Type type) {
                return JAVA8.typeName(type);
            }
        };

        static final com.google.common.reflect.Types.JavaVersion CURRENT;

        boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        abstract java.lang.reflect.Type newArrayType(java.lang.reflect.Type componentType);

        abstract java.lang.reflect.Type usedInGenericType(java.lang.reflect.Type type);

        private JavaVersion(java.lang.String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static com.google.common.reflect.Types.JavaVersion valueOf(java.lang.String name) {
            return (com.google.common.reflect.Types.JavaVersion) java.lang.Enum.valueOf(com.google.common.reflect.Types.JavaVersion.class, name);
        }

        public static com.google.common.reflect.Types.JavaVersion[] values() {
            return (com.google.common.reflect.Types.JavaVersion[]) $VALUES.clone();
        }

        static {
            if (java.lang.reflect.AnnotatedElement.class.isAssignableFrom(java.lang.reflect.TypeVariable.class)) {
                if (new com.google.common.reflect.TypeCapture<java.util.Map.Entry<java.lang.String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion;
                    return;
                } else {
                    CURRENT = javaVersion;
                    return;
                }
            }
            if (new com.google.common.reflect.TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.6
            }.capture() instanceof java.lang.Class) {
                CURRENT = javaVersion;
            } else {
                CURRENT = javaVersion;
            }
        }

        final com.google.common.collect.ImmutableList<java.lang.reflect.Type> usedInGenericType(java.lang.reflect.Type[] types) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (java.lang.reflect.Type type : types) {
                builder.add(usedInGenericType(type));
            }
            return builder.build();
        }

        java.lang.String typeName(java.lang.reflect.Type type) {
            return com.google.common.reflect.Types.toString(type);
        }
    }

    static final class NativeTypeVariableEquals<X> {
        static final boolean NATIVE_TYPE_VARIABLE_ONLY = !com.google.common.reflect.Types.NativeTypeVariableEquals.class.getTypeParameters()[0].equals(com.google.common.reflect.Types.newArtificialTypeVariable(com.google.common.reflect.Types.NativeTypeVariableEquals.class, "X", new java.lang.reflect.Type[0]));

        NativeTypeVariableEquals() {
        }
    }

    private Types() {
    }
}
