package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends com.google.common.reflect.TypeCapture<T> implements java.io.Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.reflect.TypeResolver covariantTypeResolver;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.reflect.TypeResolver invariantTypeResolver;
    private final java.lang.reflect.Type runtimeType;

    private enum TypeFilter implements com.google.common.base.Predicate<com.google.common.reflect.TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public boolean apply(com.google.common.reflect.TypeToken<?> type) {
                return ((((com.google.common.reflect.TypeToken) type).runtimeType instanceof java.lang.reflect.TypeVariable) || (((com.google.common.reflect.TypeToken) type).runtimeType instanceof java.lang.reflect.WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public boolean apply(com.google.common.reflect.TypeToken<?> type) {
                return type.getRawType().isInterface();
            }
        }
    }

    protected TypeToken() {
        java.lang.reflect.Type typeCapture = capture();
        this.runtimeType = typeCapture;
        com.google.common.base.Preconditions.checkState(!(typeCapture instanceof java.lang.reflect.TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    protected TypeToken(java.lang.Class<?> declaringClass) {
        java.lang.reflect.Type typeCapture = super.capture();
        if (typeCapture instanceof java.lang.Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = com.google.common.reflect.TypeResolver.covariantly(declaringClass).resolveType(typeCapture);
        }
    }

    private TypeToken(java.lang.reflect.Type type) {
        this.runtimeType = (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(type);
    }

    public static <T> com.google.common.reflect.TypeToken<T> of(java.lang.Class<T> type) {
        return new com.google.common.reflect.TypeToken.SimpleTypeToken(type);
    }

    public static com.google.common.reflect.TypeToken<?> of(java.lang.reflect.Type type) {
        return new com.google.common.reflect.TypeToken.SimpleTypeToken(type);
    }

    public final java.lang.Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final java.lang.reflect.Type getType() {
        return this.runtimeType;
    }

    public final <X> com.google.common.reflect.TypeToken<T> where(com.google.common.reflect.TypeParameter<X> typeParam, com.google.common.reflect.TypeToken<X> typeArg) {
        return new com.google.common.reflect.TypeToken.SimpleTypeToken(new com.google.common.reflect.TypeResolver().where(com.google.common.collect.ImmutableMap.of(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeParam.typeVariable), typeArg.runtimeType)).resolveType(this.runtimeType));
    }

    public final <X> com.google.common.reflect.TypeToken<T> where(com.google.common.reflect.TypeParameter<X> typeParam, java.lang.Class<X> typeArg) {
        return where(typeParam, of((java.lang.Class) typeArg));
    }

    public final com.google.common.reflect.TypeToken<?> resolveType(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        return of(getInvariantTypeResolver().resolveType(type));
    }

    private com.google.common.reflect.TypeToken<?> resolveSupertype(java.lang.reflect.Type type) {
        com.google.common.reflect.TypeToken<?> typeTokenOf = of(getCovariantTypeResolver().resolveType(type));
        typeTokenOf.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenOf.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenOf;
    }

    @javax.annotation.CheckForNull
    final com.google.common.reflect.TypeToken<? super T> getGenericSuperclass() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.TypeVariable) {
            return boundAsSuperclass(((java.lang.reflect.TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return boundAsSuperclass(((java.lang.reflect.WildcardType) type).getUpperBounds()[0]);
        }
        java.lang.reflect.Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (com.google.common.reflect.TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    @javax.annotation.CheckForNull
    private com.google.common.reflect.TypeToken<? super T> boundAsSuperclass(java.lang.reflect.Type type) {
        com.google.common.reflect.TypeToken<? super T> typeToken = (com.google.common.reflect.TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    final com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>> getGenericInterfaces() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.TypeVariable) {
            return boundsAsInterfaces(((java.lang.reflect.TypeVariable) type).getBounds());
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return boundsAsInterfaces(((java.lang.reflect.WildcardType) type).getUpperBounds());
        }
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.reflect.Type type2 : getRawType().getGenericInterfaces()) {
            builder.add(resolveSupertype(type2));
        }
        return builder.build();
    }

    private com.google.common.collect.ImmutableList<com.google.common.reflect.TypeToken<? super T>> boundsAsInterfaces(java.lang.reflect.Type[] bounds) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.reflect.Type type : bounds) {
            com.google.common.reflect.TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                builder.add(typeTokenOf);
            }
        }
        return builder.build();
    }

    public final com.google.common.reflect.TypeToken<T>.TypeSet getTypes() {
        return new com.google.common.reflect.TypeToken.TypeSet();
    }

    public final com.google.common.reflect.TypeToken<? super T> getSupertype(java.lang.Class<? super T> cls) {
        com.google.common.base.Preconditions.checkArgument(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((java.lang.reflect.TypeVariable) type).getBounds());
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((java.lang.reflect.WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return getArraySupertype(cls);
        }
        return (com.google.common.reflect.TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final com.google.common.reflect.TypeToken<? extends T> getSubtype(java.lang.Class<?> cls) {
        com.google.common.base.Preconditions.checkArgument(!(this.runtimeType instanceof java.lang.reflect.TypeVariable), "Cannot get subtype of type variable <%s>", this);
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((java.lang.reflect.WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        com.google.common.base.Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        com.google.common.reflect.TypeToken<? extends T> typeToken = (com.google.common.reflect.TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        com.google.common.base.Preconditions.checkArgument(typeToken.isSubtypeOf((com.google.common.reflect.TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final boolean isSupertypeOf(com.google.common.reflect.TypeToken<?> type) {
        return type.isSubtypeOf(getType());
    }

    public final boolean isSupertypeOf(java.lang.reflect.Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final boolean isSubtypeOf(com.google.common.reflect.TypeToken<?> type) {
        return isSubtypeOf(type.getType());
    }

    public final boolean isSubtypeOf(java.lang.reflect.Type supertype) {
        com.google.common.base.Preconditions.checkNotNull(supertype);
        if (supertype instanceof java.lang.reflect.WildcardType) {
            return any(((java.lang.reflect.WildcardType) supertype).getLowerBounds()).isSupertypeOf(this.runtimeType);
        }
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.WildcardType) {
            return any(((java.lang.reflect.WildcardType) type).getUpperBounds()).isSubtypeOf(supertype);
        }
        if (type instanceof java.lang.reflect.TypeVariable) {
            return type.equals(supertype) || any(((java.lang.reflect.TypeVariable) this.runtimeType).getBounds()).isSubtypeOf(supertype);
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return of(supertype).isSupertypeOfArray((java.lang.reflect.GenericArrayType) this.runtimeType);
        }
        if (supertype instanceof java.lang.Class) {
            return someRawTypeIsSubclassOf((java.lang.Class) supertype);
        }
        if (supertype instanceof java.lang.reflect.ParameterizedType) {
            return isSubtypeOfParameterizedType((java.lang.reflect.ParameterizedType) supertype);
        }
        if (supertype instanceof java.lang.reflect.GenericArrayType) {
            return isSubtypeOfArrayType((java.lang.reflect.GenericArrayType) supertype);
        }
        return false;
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        java.lang.reflect.Type type = this.runtimeType;
        return (type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive();
    }

    public final com.google.common.reflect.TypeToken<T> wrap() {
        return isPrimitive() ? of(com.google.common.primitives.Primitives.wrap((java.lang.Class) this.runtimeType)) : this;
    }

    private boolean isWrapper() {
        return com.google.common.primitives.Primitives.allWrapperTypes().contains(this.runtimeType);
    }

    public final com.google.common.reflect.TypeToken<T> unwrap() {
        return isWrapper() ? of(com.google.common.primitives.Primitives.unwrap((java.lang.Class) this.runtimeType)) : this;
    }

    @javax.annotation.CheckForNull
    public final com.google.common.reflect.TypeToken<?> getComponentType() {
        java.lang.reflect.Type componentType = com.google.common.reflect.Types.getComponentType(this.runtimeType);
        if (componentType == null) {
            return null;
        }
        return of(componentType);
    }

    public final com.google.common.reflect.Invokable<T, java.lang.Object> method(java.lang.reflect.Method method) {
        com.google.common.base.Preconditions.checkArgument(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new com.google.common.reflect.Invokable.MethodInvokable<T>(method) { // from class: com.google.common.reflect.TypeToken.1
            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type getGenericReturnType() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveType(super.getGenericReturnType());
            }

            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericParameterTypes() {
                return com.google.common.reflect.TypeToken.this.getInvariantTypeResolver().resolveTypesInPlace(super.getGenericParameterTypes());
            }

            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericExceptionTypes() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveTypesInPlace(super.getGenericExceptionTypes());
            }

            @Override // com.google.common.reflect.Invokable
            public com.google.common.reflect.TypeToken<T> getOwnerType() {
                return com.google.common.reflect.TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public java.lang.String toString() {
                return getOwnerType() + "." + super.toString();
            }
        };
    }

    public final com.google.common.reflect.Invokable<T, T> constructor(java.lang.reflect.Constructor<?> constructor) {
        com.google.common.base.Preconditions.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new com.google.common.reflect.Invokable.ConstructorInvokable<T>(constructor) { // from class: com.google.common.reflect.TypeToken.2
            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type getGenericReturnType() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveType(super.getGenericReturnType());
            }

            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericParameterTypes() {
                return com.google.common.reflect.TypeToken.this.getInvariantTypeResolver().resolveTypesInPlace(super.getGenericParameterTypes());
            }

            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            java.lang.reflect.Type[] getGenericExceptionTypes() {
                return com.google.common.reflect.TypeToken.this.getCovariantTypeResolver().resolveTypesInPlace(super.getGenericExceptionTypes());
            }

            @Override // com.google.common.reflect.Invokable
            public com.google.common.reflect.TypeToken<T> getOwnerType() {
                return com.google.common.reflect.TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public java.lang.String toString() {
                return getOwnerType() + "(" + com.google.common.base.Joiner.on(", ").join(getGenericParameterTypes()) + ")";
            }
        };
    }

    public class TypeSet extends com.google.common.collect.ForwardingSet<com.google.common.reflect.TypeToken<? super T>> implements java.io.Serializable {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> types;

        TypeSet() {
        }

        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
            return new com.google.common.reflect.TypeToken.InterfaceSet(this);
        }

        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
            return new com.google.common.reflect.TypeToken.ClassSet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> set = com.google.common.collect.FluentIterable.from(com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE.collectTypes(com.google.common.reflect.TypeToken.this)).filter(com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.types = set;
            return set;
        }

        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE.collectTypes(com.google.common.reflect.TypeToken.this.getRawTypes()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class InterfaceSet extends com.google.common.reflect.TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient com.google.common.reflect.TypeToken<T>.TypeSet allTypes;

        @javax.annotation.CheckForNull
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> interfaces;

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        InterfaceSet(com.google.common.reflect.TypeToken<T>.TypeSet allTypes) {
            super();
            this.allTypes = allTypes;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> immutableSet = this.interfaces;
            if (immutableSet != null) {
                return immutableSet;
            }
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> set = com.google.common.collect.FluentIterable.from(this.allTypes).filter(com.google.common.reflect.TypeToken.TypeFilter.INTERFACE_ONLY).toSet();
            this.interfaces = set;
            return set;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
            return com.google.common.collect.FluentIterable.from(com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE.collectTypes(com.google.common.reflect.TypeToken.this.getRawTypes())).filter(new com.google.common.base.Predicate() { // from class: com.google.common.reflect.TypeToken$InterfaceSet$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return ((java.lang.Class) obj).isInterface();
                }
            }).toSet();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
            throw new java.lang.UnsupportedOperationException("interfaces().classes() not supported.");
        }

        private java.lang.Object readResolve() {
            return com.google.common.reflect.TypeToken.this.getTypes().interfaces();
        }
    }

    private final class ClassSet extends com.google.common.reflect.TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        @javax.annotation.CheckForNull
        private transient com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> classes;

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet classes() {
            return this;
        }

        private ClassSet() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public java.util.Set<com.google.common.reflect.TypeToken<? super T>> delegate() {
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> immutableSet = this.classes;
            if (immutableSet != null) {
                return immutableSet;
            }
            com.google.common.collect.ImmutableSet<com.google.common.reflect.TypeToken<? super T>> set = com.google.common.collect.FluentIterable.from(com.google.common.reflect.TypeToken.TypeCollector.FOR_GENERIC_TYPE.classesOnly().collectTypes(com.google.common.reflect.TypeToken.this)).filter(com.google.common.reflect.TypeToken.TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.classes = set;
            return set;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public java.util.Set<java.lang.Class<? super T>> rawTypes() {
            return com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.reflect.TypeToken.TypeCollector.FOR_RAW_TYPE.classesOnly().collectTypes(com.google.common.reflect.TypeToken.this.getRawTypes()));
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public com.google.common.reflect.TypeToken<T>.TypeSet interfaces() {
            throw new java.lang.UnsupportedOperationException("classes().interfaces() not supported.");
        }

        private java.lang.Object readResolve() {
            return com.google.common.reflect.TypeToken.this.getTypes().classes();
        }
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
        if (o instanceof com.google.common.reflect.TypeToken) {
            return this.runtimeType.equals(((com.google.common.reflect.TypeToken) o).runtimeType);
        }
        return false;
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public java.lang.String toString() {
        return com.google.common.reflect.Types.toString(this.runtimeType);
    }

    protected java.lang.Object writeReplace() {
        return of(new com.google.common.reflect.TypeResolver().resolveType(this.runtimeType));
    }

    final com.google.common.reflect.TypeToken<T> rejectTypeVariables() {
        new com.google.common.reflect.TypeVisitor() { // from class: com.google.common.reflect.TypeToken.3
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> type) {
                throw new java.lang.IllegalArgumentException(com.google.common.reflect.TypeToken.this.runtimeType + "contains a type variable and is not safe for the operation");
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType type) {
                visit(type.getLowerBounds());
                visit(type.getUpperBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(java.lang.reflect.ParameterizedType type) {
                visit(type.getActualTypeArguments());
                visit(type.getOwnerType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType type) {
                visit(type.getGenericComponentType());
            }
        }.visit(this.runtimeType);
        return this;
    }

    private boolean someRawTypeIsSubclassOf(java.lang.Class<?> superclass) {
        com.google.common.collect.UnmodifiableIterator<java.lang.Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (superclass.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(java.lang.reflect.ParameterizedType supertype) {
        java.lang.Class<? super java.lang.Object> rawType = of(supertype).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        java.lang.reflect.TypeVariable<java.lang.Class<? super java.lang.Object>>[] typeParameters = rawType.getTypeParameters();
        java.lang.reflect.Type[] actualTypeArguments = supertype.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!of(getCovariantTypeResolver().resolveType(typeParameters[i])).is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return java.lang.reflect.Modifier.isStatic(((java.lang.Class) supertype.getRawType()).getModifiers()) || supertype.getOwnerType() == null || isOwnedBySubtypeOf(supertype.getOwnerType());
    }

    private boolean isSubtypeOfArrayType(java.lang.reflect.GenericArrayType supertype) {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                return of((java.lang.Class) cls.getComponentType()).isSubtypeOf(supertype.getGenericComponentType());
            }
            return false;
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return of(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()).isSubtypeOf(supertype.getGenericComponentType());
        }
        return false;
    }

    private boolean isSupertypeOfArray(java.lang.reflect.GenericArrayType subtype) {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (!cls.isArray()) {
                return cls.isAssignableFrom(java.lang.Object[].class);
            }
            return of(subtype.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return of(subtype.getGenericComponentType()).isSubtypeOf(((java.lang.reflect.GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean is(java.lang.reflect.Type formalType, java.lang.reflect.TypeVariable<?> declaration) {
        if (this.runtimeType.equals(formalType)) {
            return true;
        }
        if (formalType instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(declaration, (java.lang.reflect.WildcardType) formalType);
            return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).isSupertypeOf(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).isSubtypeOf(this.runtimeType);
        }
        return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(formalType));
    }

    private static java.lang.reflect.Type canonicalizeTypeArg(java.lang.reflect.TypeVariable<?> declaration, java.lang.reflect.Type typeArg) {
        if (typeArg instanceof java.lang.reflect.WildcardType) {
            return canonicalizeWildcardType(declaration, (java.lang.reflect.WildcardType) typeArg);
        }
        return canonicalizeWildcardsInType(typeArg);
    }

    private static java.lang.reflect.Type canonicalizeWildcardsInType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((java.lang.reflect.ParameterizedType) type);
        }
        return type instanceof java.lang.reflect.GenericArrayType ? com.google.common.reflect.Types.newArrayType(canonicalizeWildcardsInType(((java.lang.reflect.GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static java.lang.reflect.WildcardType canonicalizeWildcardType(java.lang.reflect.TypeVariable<?> declaration, java.lang.reflect.WildcardType type) {
        java.lang.reflect.Type[] bounds = declaration.getBounds();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Type type2 : type.getUpperBounds()) {
            if (!any(bounds).isSubtypeOf(type2)) {
                arrayList.add(canonicalizeWildcardsInType(type2));
            }
        }
        return new com.google.common.reflect.Types.WildcardTypeImpl(type.getLowerBounds(), (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]));
    }

    private static java.lang.reflect.ParameterizedType canonicalizeWildcardsInParameterizedType(java.lang.reflect.ParameterizedType type) {
        java.lang.Class cls = (java.lang.Class) type.getRawType();
        java.lang.reflect.TypeVariable<java.lang.Class<T>>[] typeParameters = cls.getTypeParameters();
        java.lang.reflect.Type[] actualTypeArguments = type.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return com.google.common.reflect.Types.newParameterizedTypeWithOwner(type.getOwnerType(), cls, actualTypeArguments);
    }

    private static com.google.common.reflect.TypeToken.Bounds every(java.lang.reflect.Type[] bounds) {
        return new com.google.common.reflect.TypeToken.Bounds(bounds, false);
    }

    private static com.google.common.reflect.TypeToken.Bounds any(java.lang.reflect.Type[] bounds) {
        return new com.google.common.reflect.TypeToken.Bounds(bounds, true);
    }

    private static class Bounds {
        private final java.lang.reflect.Type[] bounds;
        private final boolean target;

        Bounds(java.lang.reflect.Type[] bounds, boolean target) {
            this.bounds = bounds;
            this.target = target;
        }

        boolean isSubtypeOf(java.lang.reflect.Type supertype) {
            for (java.lang.reflect.Type type : this.bounds) {
                boolean zIsSubtypeOf = com.google.common.reflect.TypeToken.of(type).isSubtypeOf(supertype);
                boolean z = this.target;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.target;
        }

        boolean isSupertypeOf(java.lang.reflect.Type subtype) {
            com.google.common.reflect.TypeToken<?> typeTokenOf = com.google.common.reflect.TypeToken.of(subtype);
            for (java.lang.reflect.Type type : this.bounds) {
                boolean zIsSubtypeOf = typeTokenOf.isSubtypeOf(type);
                boolean z = this.target;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.target;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.ImmutableSet<java.lang.Class<? super T>> getRawTypes() {
        final com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        new com.google.common.reflect.TypeVisitor(this) { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> t) {
                visit(t.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType t) {
                visit(t.getUpperBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(java.lang.reflect.ParameterizedType t) {
                builder.add((java.lang.Class) t.getRawType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(java.lang.Class<?> t) {
                builder.add(t);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType t) {
                builder.add(com.google.common.reflect.Types.getArrayClass(com.google.common.reflect.TypeToken.of(t.getGenericComponentType()).getRawType()));
            }
        }.visit(this.runtimeType);
        return builder.build();
    }

    private boolean isOwnedBySubtypeOf(java.lang.reflect.Type supertype) {
        java.util.Iterator<com.google.common.reflect.TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            java.lang.reflect.Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(supertype)) {
                return true;
            }
        }
        return false;
    }

    @javax.annotation.CheckForNull
    private java.lang.reflect.Type getOwnerTypeIfPresent() {
        java.lang.reflect.Type type = this.runtimeType;
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) type).getOwnerType();
        }
        if (type instanceof java.lang.Class) {
            return ((java.lang.Class) type).getEnclosingClass();
        }
        return null;
    }

    static <T> com.google.common.reflect.TypeToken<? extends T> toGenericType(java.lang.Class<T> cls) {
        if (cls.isArray()) {
            return (com.google.common.reflect.TypeToken<? extends T>) of(com.google.common.reflect.Types.newArrayType(toGenericType(cls.getComponentType()).runtimeType));
        }
        java.lang.reflect.TypeVariable<java.lang.Class<T>>[] typeParameters = cls.getTypeParameters();
        java.lang.reflect.Type type = (!cls.isMemberClass() || java.lang.reflect.Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return (com.google.common.reflect.TypeToken<? extends T>) of(com.google.common.reflect.Types.newParameterizedTypeWithOwner(type, cls, typeParameters));
        }
        return of((java.lang.Class) cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.TypeResolver getCovariantTypeResolver() {
        com.google.common.reflect.TypeResolver typeResolver = this.covariantTypeResolver;
        if (typeResolver != null) {
            return typeResolver;
        }
        com.google.common.reflect.TypeResolver typeResolverCovariantly = com.google.common.reflect.TypeResolver.covariantly(this.runtimeType);
        this.covariantTypeResolver = typeResolverCovariantly;
        return typeResolverCovariantly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.TypeResolver getInvariantTypeResolver() {
        com.google.common.reflect.TypeResolver typeResolver = this.invariantTypeResolver;
        if (typeResolver != null) {
            return typeResolver;
        }
        com.google.common.reflect.TypeResolver typeResolverInvariantly = com.google.common.reflect.TypeResolver.invariantly(this.runtimeType);
        this.invariantTypeResolver = typeResolverInvariantly;
        return typeResolverInvariantly;
    }

    private com.google.common.reflect.TypeToken<? super T> getSupertypeFromUpperBounds(java.lang.Class<? super T> cls, java.lang.reflect.Type[] typeArr) {
        for (java.lang.reflect.Type type : typeArr) {
            com.google.common.reflect.TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return (com.google.common.reflect.TypeToken<? super T>) typeTokenOf.getSupertype(cls);
            }
        }
        throw new java.lang.IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private com.google.common.reflect.TypeToken<? extends T> getSubtypeFromLowerBounds(java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr) {
        if (typeArr.length > 0) {
            return (com.google.common.reflect.TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        throw new java.lang.IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private com.google.common.reflect.TypeToken<? super T> getArraySupertype(java.lang.Class<? super T> cls) {
        com.google.common.reflect.TypeToken<?> componentType = getComponentType();
        if (componentType == null) {
            throw new java.lang.IllegalArgumentException(cls + " isn't a super type of " + this);
        }
        return (com.google.common.reflect.TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype((java.lang.Class) java.util.Objects.requireNonNull(cls.getComponentType())).runtimeType));
    }

    private com.google.common.reflect.TypeToken<? extends T> getArraySubtype(java.lang.Class<?> cls) {
        java.lang.Class<?> componentType = cls.getComponentType();
        if (componentType == null) {
            throw new java.lang.IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
        }
        return (com.google.common.reflect.TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(((com.google.common.reflect.TypeToken) java.util.Objects.requireNonNull(getComponentType())).getSubtype(componentType).runtimeType));
    }

    private java.lang.reflect.Type resolveTypeArgsForSubclass(java.lang.Class<?> subclass) {
        if ((this.runtimeType instanceof java.lang.Class) && (subclass.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return subclass;
        }
        com.google.common.reflect.TypeToken genericType = toGenericType(subclass);
        return new com.google.common.reflect.TypeResolver().where(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).resolveType(genericType.runtimeType);
    }

    private static java.lang.reflect.Type newArrayClassOrGenericArrayType(java.lang.reflect.Type componentType) {
        return com.google.common.reflect.Types.JavaVersion.JAVA7.newArrayType(componentType);
    }

    private static final class SimpleTypeToken<T> extends com.google.common.reflect.TypeToken<T> {
        private static final long serialVersionUID = 0;

        SimpleTypeToken(java.lang.reflect.Type type) {
            super(type);
        }
    }

    private static abstract class TypeCollector<K> {
        static final com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>> FOR_GENERIC_TYPE = new com.google.common.reflect.TypeToken.TypeCollector<com.google.common.reflect.TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Class<?> getRawType(com.google.common.reflect.TypeToken<?> type) {
                return type.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Iterable<? extends com.google.common.reflect.TypeToken<?>> getInterfaces(com.google.common.reflect.TypeToken<?> type) {
                return type.getGenericInterfaces();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @javax.annotation.CheckForNull
            public com.google.common.reflect.TypeToken<?> getSuperclass(com.google.common.reflect.TypeToken<?> type) {
                return type.getGenericSuperclass();
            }
        };
        static final com.google.common.reflect.TypeToken.TypeCollector<java.lang.Class<?>> FOR_RAW_TYPE = new com.google.common.reflect.TypeToken.TypeCollector<java.lang.Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Class<?> getRawType(java.lang.Class<?> type) {
                return type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public java.lang.Iterable<? extends java.lang.Class<?>> getInterfaces(java.lang.Class<?> type) {
                return java.util.Arrays.asList(type.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @javax.annotation.CheckForNull
            public java.lang.Class<?> getSuperclass(java.lang.Class<?> type) {
                return type.getSuperclass();
            }
        };

        abstract java.lang.Iterable<? extends K> getInterfaces(K type);

        abstract java.lang.Class<?> getRawType(K type);

        @javax.annotation.CheckForNull
        abstract K getSuperclass(K type);

        private TypeCollector() {
        }

        final com.google.common.reflect.TypeToken.TypeCollector<K> classesOnly() {
            return new com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector<K>(this, this) { // from class: com.google.common.reflect.TypeToken.TypeCollector.3
                @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
                java.lang.Iterable<? extends K> getInterfaces(K type) {
                    return com.google.common.collect.ImmutableSet.of();
                }

                @Override // com.google.common.reflect.TypeToken.TypeCollector
                com.google.common.collect.ImmutableList<K> collectTypes(java.lang.Iterable<? extends K> types) {
                    com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
                    for (K k : types) {
                        if (!getRawType(k).isInterface()) {
                            builder.add(k);
                        }
                    }
                    return super.collectTypes((java.lang.Iterable) builder.build());
                }
            };
        }

        final com.google.common.collect.ImmutableList<K> collectTypes(K type) {
            return collectTypes((java.lang.Iterable) com.google.common.collect.ImmutableList.of(type));
        }

        com.google.common.collect.ImmutableList<K> collectTypes(java.lang.Iterable<? extends K> types) {
            java.util.HashMap mapNewHashMap = com.google.common.collect.Maps.newHashMap();
            java.util.Iterator<? extends K> it = types.iterator();
            while (it.hasNext()) {
                collectTypes(it.next(), mapNewHashMap);
            }
            return sortKeysByValue(mapNewHashMap, com.google.common.collect.Ordering.natural().reverse());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int collectTypes(K k, java.util.Map<? super K, java.lang.Integer> map) {
            java.lang.Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = getRawType(k).isInterface();
            java.util.Iterator<? extends K> it = getInterfaces(k).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = java.lang.Math.max(iMax, collectTypes(it.next(), map));
            }
            K superclass = getSuperclass(k);
            int iMax2 = iMax;
            if (superclass != null) {
                iMax2 = java.lang.Math.max(iMax, collectTypes(superclass, map));
            }
            int i = iMax2 + 1;
            map.put(k, java.lang.Integer.valueOf(i));
            return i;
        }

        private static <K, V> com.google.common.collect.ImmutableList<K> sortKeysByValue(final java.util.Map<K, V> map, final java.util.Comparator<? super V> comparator) {
            return (com.google.common.collect.ImmutableList<K>) new com.google.common.collect.Ordering<K>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.Ordering, java.util.Comparator
                public int compare(K left, K right) {
                    return comparator.compare(java.util.Objects.requireNonNull(map.get(left)), java.util.Objects.requireNonNull(map.get(right)));
                }
            }.immutableSortedCopy(map.keySet());
        }

        private static class ForwardingTypeCollector<K> extends com.google.common.reflect.TypeToken.TypeCollector<K> {
            private final com.google.common.reflect.TypeToken.TypeCollector<K> delegate;

            ForwardingTypeCollector(com.google.common.reflect.TypeToken.TypeCollector<K> delegate) {
                super();
                this.delegate = delegate;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            java.lang.Class<?> getRawType(K type) {
                return this.delegate.getRawType(type);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            java.lang.Iterable<? extends K> getInterfaces(K type) {
                return this.delegate.getInterfaces(type);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @javax.annotation.CheckForNull
            K getSuperclass(K type) {
                return this.delegate.getSuperclass(type);
            }
        }
    }
}
