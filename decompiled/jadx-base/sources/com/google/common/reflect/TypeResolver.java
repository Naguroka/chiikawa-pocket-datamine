package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class TypeResolver {
    private final com.google.common.reflect.TypeResolver.TypeTable typeTable;

    public TypeResolver() {
        this.typeTable = new com.google.common.reflect.TypeResolver.TypeTable();
    }

    private TypeResolver(com.google.common.reflect.TypeResolver.TypeTable typeTable) {
        this.typeTable = typeTable;
    }

    static com.google.common.reflect.TypeResolver covariantly(java.lang.reflect.Type contextType) {
        return new com.google.common.reflect.TypeResolver().where(com.google.common.reflect.TypeResolver.TypeMappingIntrospector.getTypeMappings(contextType));
    }

    static com.google.common.reflect.TypeResolver invariantly(java.lang.reflect.Type contextType) {
        return new com.google.common.reflect.TypeResolver().where(com.google.common.reflect.TypeResolver.TypeMappingIntrospector.getTypeMappings(com.google.common.reflect.TypeResolver.WildcardCapturer.INSTANCE.capture(contextType)));
    }

    public com.google.common.reflect.TypeResolver where(java.lang.reflect.Type formal, java.lang.reflect.Type actual) {
        java.util.HashMap mapNewHashMap = com.google.common.collect.Maps.newHashMap();
        populateTypeMappings(mapNewHashMap, (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(formal), (java.lang.reflect.Type) com.google.common.base.Preconditions.checkNotNull(actual));
        return where(mapNewHashMap);
    }

    com.google.common.reflect.TypeResolver where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> mappings) {
        return new com.google.common.reflect.TypeResolver(this.typeTable.where(mappings));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void populateTypeMappings(final java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> mappings, java.lang.reflect.Type from, final java.lang.reflect.Type to) {
        if (from.equals(to)) {
            return;
        }
        new com.google.common.reflect.TypeVisitor() { // from class: com.google.common.reflect.TypeResolver.1
            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(java.lang.reflect.TypeVariable<?> typeVariable) {
                mappings.put(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeVariable), to);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(java.lang.reflect.WildcardType fromWildcardType) {
                java.lang.reflect.Type type = to;
                if (type instanceof java.lang.reflect.WildcardType) {
                    java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                    java.lang.reflect.Type[] upperBounds = fromWildcardType.getUpperBounds();
                    java.lang.reflect.Type[] upperBounds2 = wildcardType.getUpperBounds();
                    java.lang.reflect.Type[] lowerBounds = fromWildcardType.getLowerBounds();
                    java.lang.reflect.Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    com.google.common.base.Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, to);
                    for (int i = 0; i < upperBounds.length; i++) {
                        com.google.common.reflect.TypeResolver.populateTypeMappings(mappings, upperBounds[i], upperBounds2[i]);
                    }
                    for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                        com.google.common.reflect.TypeResolver.populateTypeMappings(mappings, lowerBounds[i2], lowerBounds2[i2]);
                    }
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(java.lang.reflect.ParameterizedType fromParameterizedType) {
                java.lang.reflect.Type type = to;
                if (type instanceof java.lang.reflect.WildcardType) {
                    return;
                }
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) com.google.common.reflect.TypeResolver.expectArgument(java.lang.reflect.ParameterizedType.class, type);
                if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                    com.google.common.reflect.TypeResolver.populateTypeMappings(mappings, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
                }
                com.google.common.base.Preconditions.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, to);
                java.lang.reflect.Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
                java.lang.reflect.Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                com.google.common.base.Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    com.google.common.reflect.TypeResolver.populateTypeMappings(mappings, actualTypeArguments[i], actualTypeArguments2[i]);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(java.lang.reflect.GenericArrayType fromArrayType) {
                java.lang.reflect.Type type = to;
                if (type instanceof java.lang.reflect.WildcardType) {
                    return;
                }
                java.lang.reflect.Type componentType = com.google.common.reflect.Types.getComponentType(type);
                com.google.common.base.Preconditions.checkArgument(componentType != null, "%s is not an array type.", to);
                com.google.common.reflect.TypeResolver.populateTypeMappings(mappings, fromArrayType.getGenericComponentType(), componentType);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(java.lang.Class<?> fromClass) {
                if (!(to instanceof java.lang.reflect.WildcardType)) {
                    throw new java.lang.IllegalArgumentException("No type mapping from " + fromClass + " to " + to);
                }
            }
        }.visit(from);
    }

    public java.lang.reflect.Type resolveType(java.lang.reflect.Type type) {
        com.google.common.base.Preconditions.checkNotNull(type);
        if (type instanceof java.lang.reflect.TypeVariable) {
            return this.typeTable.resolve((java.lang.reflect.TypeVariable) type);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return resolveParameterizedType((java.lang.reflect.ParameterizedType) type);
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return resolveGenericArrayType((java.lang.reflect.GenericArrayType) type);
        }
        return type instanceof java.lang.reflect.WildcardType ? resolveWildcardType((java.lang.reflect.WildcardType) type) : type;
    }

    java.lang.reflect.Type[] resolveTypesInPlace(java.lang.reflect.Type[] types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = resolveType(types[i]);
        }
        return types;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.reflect.Type[] resolveTypes(java.lang.reflect.Type[] types) {
        java.lang.reflect.Type[] typeArr = new java.lang.reflect.Type[types.length];
        for (int i = 0; i < types.length; i++) {
            typeArr[i] = resolveType(types[i]);
        }
        return typeArr;
    }

    private java.lang.reflect.WildcardType resolveWildcardType(java.lang.reflect.WildcardType type) {
        return new com.google.common.reflect.Types.WildcardTypeImpl(resolveTypes(type.getLowerBounds()), resolveTypes(type.getUpperBounds()));
    }

    private java.lang.reflect.Type resolveGenericArrayType(java.lang.reflect.GenericArrayType type) {
        return com.google.common.reflect.Types.newArrayType(resolveType(type.getGenericComponentType()));
    }

    private java.lang.reflect.ParameterizedType resolveParameterizedType(java.lang.reflect.ParameterizedType type) {
        java.lang.reflect.Type ownerType = type.getOwnerType();
        return com.google.common.reflect.Types.newParameterizedTypeWithOwner(ownerType == null ? null : resolveType(ownerType), (java.lang.Class) resolveType(type.getRawType()), resolveTypes(type.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T expectArgument(java.lang.Class<T> type, java.lang.Object arg) {
        try {
            return type.cast(arg);
        } catch (java.lang.ClassCastException unused) {
            throw new java.lang.IllegalArgumentException(arg + " is not a " + type.getSimpleName());
        }
    }

    private static class TypeTable {
        private final com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> map;

        TypeTable() {
            this.map = com.google.common.collect.ImmutableMap.of();
        }

        private TypeTable(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> map) {
            this.map = map;
        }

        final com.google.common.reflect.TypeResolver.TypeTable where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> mappings) {
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            builder.putAll(this.map);
            for (java.util.Map.Entry<com.google.common.reflect.TypeResolver.TypeVariableKey, ? extends java.lang.reflect.Type> entry : mappings.entrySet()) {
                com.google.common.reflect.TypeResolver.TypeVariableKey key = entry.getKey();
                java.lang.reflect.Type value = entry.getValue();
                com.google.common.base.Preconditions.checkArgument(!key.equalsType(value), "Type variable %s bound to itself", key);
                builder.put(key, value);
            }
            return new com.google.common.reflect.TypeResolver.TypeTable(builder.buildOrThrow());
        }

        final java.lang.reflect.Type resolve(final java.lang.reflect.TypeVariable<?> var) {
            return resolveInternal(var, new com.google.common.reflect.TypeResolver.TypeTable(this) { // from class: com.google.common.reflect.TypeResolver.TypeTable.1
                @Override // com.google.common.reflect.TypeResolver.TypeTable
                public java.lang.reflect.Type resolveInternal(java.lang.reflect.TypeVariable<?> intermediateVar, com.google.common.reflect.TypeResolver.TypeTable forDependent) {
                    return intermediateVar.getGenericDeclaration().equals(var.getGenericDeclaration()) ? intermediateVar : this.resolveInternal(intermediateVar, forDependent);
                }
            });
        }

        java.lang.reflect.Type resolveInternal(java.lang.reflect.TypeVariable<?> var, com.google.common.reflect.TypeResolver.TypeTable forDependants) {
            java.lang.reflect.Type type = this.map.get(new com.google.common.reflect.TypeResolver.TypeVariableKey(var));
            if (type == null) {
                java.lang.reflect.Type[] bounds = var.getBounds();
                if (bounds.length == 0) {
                    return var;
                }
                java.lang.reflect.Type[] typeArrResolveTypes = new com.google.common.reflect.TypeResolver(forDependants).resolveTypes(bounds);
                return (com.google.common.reflect.Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY && java.util.Arrays.equals(bounds, typeArrResolveTypes)) ? var : com.google.common.reflect.Types.newArtificialTypeVariable(var.getGenericDeclaration(), var.getName(), typeArrResolveTypes);
            }
            return new com.google.common.reflect.TypeResolver(forDependants).resolveType(type);
        }
    }

    private static final class TypeMappingIntrospector extends com.google.common.reflect.TypeVisitor {
        private final java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> mappings = com.google.common.collect.Maps.newHashMap();

        private TypeMappingIntrospector() {
        }

        static com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeResolver.TypeVariableKey, java.lang.reflect.Type> getTypeMappings(java.lang.reflect.Type contextType) {
            com.google.common.base.Preconditions.checkNotNull(contextType);
            com.google.common.reflect.TypeResolver.TypeMappingIntrospector typeMappingIntrospector = new com.google.common.reflect.TypeResolver.TypeMappingIntrospector();
            typeMappingIntrospector.visit(contextType);
            return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) typeMappingIntrospector.mappings);
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitClass(java.lang.Class<?> clazz) {
            visit(clazz.getGenericSuperclass());
            visit(clazz.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitParameterizedType(java.lang.reflect.ParameterizedType parameterizedType) {
            java.lang.Class cls = (java.lang.Class) parameterizedType.getRawType();
            java.lang.reflect.TypeVariable[] typeParameters = cls.getTypeParameters();
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            com.google.common.base.Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                map(new com.google.common.reflect.TypeResolver.TypeVariableKey(typeParameters[i]), actualTypeArguments[i]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitTypeVariable(java.lang.reflect.TypeVariable<?> t) {
            visit(t.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitWildcardType(java.lang.reflect.WildcardType t) {
            visit(t.getUpperBounds());
        }

        private void map(com.google.common.reflect.TypeResolver.TypeVariableKey var, java.lang.reflect.Type arg) {
            if (this.mappings.containsKey(var)) {
                return;
            }
            java.lang.reflect.Type type = arg;
            while (type != null) {
                if (var.equalsType(type)) {
                    while (arg != null) {
                        arg = this.mappings.remove(com.google.common.reflect.TypeResolver.TypeVariableKey.forLookup(arg));
                    }
                    return;
                }
                type = this.mappings.get(com.google.common.reflect.TypeResolver.TypeVariableKey.forLookup(type));
            }
            this.mappings.put(var, arg);
        }
    }

    private static class WildcardCapturer {
        static final com.google.common.reflect.TypeResolver.WildcardCapturer INSTANCE = new com.google.common.reflect.TypeResolver.WildcardCapturer();
        private final java.util.concurrent.atomic.AtomicInteger id;

        private WildcardCapturer() {
            this(new java.util.concurrent.atomic.AtomicInteger());
        }

        private WildcardCapturer(java.util.concurrent.atomic.AtomicInteger id) {
            this.id = id;
        }

        final java.lang.reflect.Type capture(java.lang.reflect.Type type) {
            com.google.common.base.Preconditions.checkNotNull(type);
            if ((type instanceof java.lang.Class) || (type instanceof java.lang.reflect.TypeVariable)) {
                return type;
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return com.google.common.reflect.Types.newArrayType(notForTypeVariable().capture(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                java.lang.Class cls = (java.lang.Class) parameterizedType.getRawType();
                java.lang.reflect.TypeVariable<?>[] typeParameters = cls.getTypeParameters();
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = forTypeVariable(typeParameters[i]).capture(actualTypeArguments[i]);
                }
                return com.google.common.reflect.Types.newParameterizedTypeWithOwner(notForTypeVariable().captureNullable(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? captureAsTypeVariable(wildcardType.getUpperBounds()) : type;
            }
            throw new java.lang.AssertionError("must have been one of the known types");
        }

        java.lang.reflect.TypeVariable<?> captureAsTypeVariable(java.lang.reflect.Type[] upperBounds) {
            return com.google.common.reflect.Types.newArtificialTypeVariable(com.google.common.reflect.TypeResolver.WildcardCapturer.class, "capture#" + this.id.incrementAndGet() + "-of ? extends " + com.google.common.base.Joiner.on(kotlin.text.Typography.amp).join(upperBounds), upperBounds);
        }

        private com.google.common.reflect.TypeResolver.WildcardCapturer forTypeVariable(final java.lang.reflect.TypeVariable<?> typeParam) {
            return new com.google.common.reflect.TypeResolver.WildcardCapturer(this, this.id) { // from class: com.google.common.reflect.TypeResolver.WildcardCapturer.1
                @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
                java.lang.reflect.TypeVariable<?> captureAsTypeVariable(java.lang.reflect.Type[] upperBounds) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(java.util.Arrays.asList(upperBounds));
                    linkedHashSet.addAll(java.util.Arrays.asList(typeParam.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(java.lang.Object.class);
                    }
                    return super.captureAsTypeVariable((java.lang.reflect.Type[]) linkedHashSet.toArray(new java.lang.reflect.Type[0]));
                }
            };
        }

        private com.google.common.reflect.TypeResolver.WildcardCapturer notForTypeVariable() {
            return new com.google.common.reflect.TypeResolver.WildcardCapturer(this.id);
        }

        @javax.annotation.CheckForNull
        private java.lang.reflect.Type captureNullable(@javax.annotation.CheckForNull java.lang.reflect.Type type) {
            if (type == null) {
                return null;
            }
            return capture(type);
        }
    }

    static final class TypeVariableKey {
        private final java.lang.reflect.TypeVariable<?> var;

        TypeVariableKey(java.lang.reflect.TypeVariable<?> var) {
            this.var = (java.lang.reflect.TypeVariable) com.google.common.base.Preconditions.checkNotNull(var);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.var.getGenericDeclaration(), this.var.getName());
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.reflect.TypeResolver.TypeVariableKey) {
                return equalsTypeVariable(((com.google.common.reflect.TypeResolver.TypeVariableKey) obj).var);
            }
            return false;
        }

        public java.lang.String toString() {
            return this.var.toString();
        }

        @javax.annotation.CheckForNull
        static com.google.common.reflect.TypeResolver.TypeVariableKey forLookup(java.lang.reflect.Type t) {
            if (t instanceof java.lang.reflect.TypeVariable) {
                return new com.google.common.reflect.TypeResolver.TypeVariableKey((java.lang.reflect.TypeVariable) t);
            }
            return null;
        }

        boolean equalsType(java.lang.reflect.Type type) {
            if (type instanceof java.lang.reflect.TypeVariable) {
                return equalsTypeVariable((java.lang.reflect.TypeVariable) type);
            }
            return false;
        }

        private boolean equalsTypeVariable(java.lang.reflect.TypeVariable<?> that) {
            return this.var.getGenericDeclaration().equals(that.getGenericDeclaration()) && this.var.getName().equals(that.getName());
        }
    }
}
