package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: $Gson$Types.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.reflect.Type[] f1615a = new java.lang.reflect.Type[0];

    private static java.lang.reflect.GenericArrayType f(java.lang.reflect.Type type) {
        return new com.bykv.vk.openvk.preload.a.b.a.C0073a(type);
    }

    public static java.lang.reflect.Type a(java.lang.reflect.Type type) {
        java.lang.reflect.Type c0073a;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                c0073a = cls;
                c0073a = new com.bykv.vk.openvk.preload.a.b.a.C0073a(a((java.lang.reflect.Type) cls.getComponentType()));
            }
            c0073a = cls;
            return c0073a;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.bykv.vk.openvk.preload.a.b.a.b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return new com.bykv.vk.openvk.preload.a.b.a.C0073a(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.bykv.vk.openvk.preload.a.b.a.c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static java.lang.Class<?> b(java.lang.reflect.Type type) {
        while (!(type instanceof java.lang.Class)) {
            if (type instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                com.bykv.vk.openvk.preload.falconx.a.a.a(rawType instanceof java.lang.Class);
                return (java.lang.Class) rawType;
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return java.lang.reflect.Array.newInstance(b(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof java.lang.reflect.TypeVariable) {
                return java.lang.Object.class;
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
            } else {
                throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
            }
        }
        return (java.lang.Class) type;
    }

    public static boolean a(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        while (type != type2) {
            if (type instanceof java.lang.Class) {
                return type.equals(type2);
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                    return false;
                }
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
                java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                java.lang.reflect.Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                if (!(type2 instanceof java.lang.reflect.GenericArrayType)) {
                    return false;
                }
                type = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                type2 = ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof java.lang.reflect.WildcardType) {
                    if (!(type2 instanceof java.lang.reflect.WildcardType)) {
                        return false;
                    }
                    java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
                    java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type2;
                    return java.util.Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && java.util.Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof java.lang.reflect.TypeVariable) || !(type2 instanceof java.lang.reflect.TypeVariable)) {
                    return false;
                }
                java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
                java.lang.reflect.TypeVariable typeVariable2 = (java.lang.reflect.TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    static int a(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static java.lang.String c(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[LOOP:2: B:18:0x0034->B:28:0x0051, LOOP_START, PHI: r5
  0x0034: PHI (r5v2 java.lang.Class<?>) = (r5v1 java.lang.Class<?>), (r5v4 java.lang.Class<?>) binds: [B:17:0x0032, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[LOOP:2: B:18:0x0034->B:28:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0049 A[SYNTHETIC] */
    private static java.lang.reflect.Type a(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        java.lang.Class<?> superclass;
        java.lang.reflect.Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                java.lang.Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        java.lang.Class<?> cls3 = interfaces[i];
                        if (cls3 == cls2) {
                            return cls.getGenericInterfaces()[i];
                        }
                        if (cls2.isAssignableFrom(cls3)) {
                            genericSuperclass = cls.getGenericInterfaces()[i];
                            superclass = interfaces[i];
                        } else {
                            i++;
                        }
                    } else {
                        if (!cls.isInterface()) {
                            while (cls != java.lang.Object.class) {
                                superclass = cls.getSuperclass();
                                if (superclass == cls2) {
                                    return cls.getGenericSuperclass();
                                }
                                if (cls2.isAssignableFrom(superclass)) {
                                    genericSuperclass = cls.getGenericSuperclass();
                                } else {
                                    cls = superclass;
                                }
                            }
                        }
                        return cls2;
                    }
                }
            } else {
                if (!cls.isInterface()) {
                    while (cls != java.lang.Object.class) {
                        superclass = cls.getSuperclass();
                        if (superclass == cls2) {
                            return cls.getGenericSuperclass();
                        }
                        if (cls2.isAssignableFrom(superclass)) {
                            genericSuperclass = cls.getGenericSuperclass();
                        } else {
                            cls = superclass;
                        }
                    }
                }
                return cls2;
            }
            java.lang.reflect.Type type2 = genericSuperclass;
            cls = superclass;
            type = type2;
        }
        return type;
    }

    private static java.lang.reflect.Type b(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (type instanceof java.lang.reflect.WildcardType) {
            type = ((java.lang.reflect.WildcardType) type).getUpperBounds()[0];
        }
        com.bykv.vk.openvk.preload.falconx.a.a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static java.lang.reflect.Type d(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        return ((java.lang.Class) type).getComponentType();
    }

    public static java.lang.reflect.Type a(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Type typeB = b(type, cls, java.util.Collection.class);
        if (typeB instanceof java.lang.reflect.WildcardType) {
            typeB = ((java.lang.reflect.WildcardType) typeB).getUpperBounds()[0];
        }
        if (typeB instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) typeB).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static java.lang.reflect.Type[] b(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        java.lang.reflect.Type typeB = b(type, cls, java.util.Map.class);
        return typeB instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) typeB).getActualTypeArguments() : new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    public static java.lang.reflect.Type a(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return a(type, cls, type2, new java.util.HashSet());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    private static java.lang.reflect.Type a(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Collection<java.lang.reflect.TypeVariable> collection) {
        java.lang.reflect.Type type3;
        java.lang.reflect.WildcardType wildcardType;
        java.lang.reflect.Type typeA;
        java.lang.reflect.Type[] upperBounds;
        java.lang.reflect.Type[] lowerBounds;
        java.lang.reflect.TypeVariable typeVariable;
        do {
            int i = 0;
            if (type2 instanceof java.lang.reflect.TypeVariable) {
                typeVariable = (java.lang.reflect.TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                java.lang.reflect.GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                java.lang.Class cls2 = genericDeclaration instanceof java.lang.Class ? (java.lang.Class) genericDeclaration : null;
                if (cls2 != null) {
                    java.lang.reflect.Type typeA2 = a(type, cls, (java.lang.Class<?>) cls2);
                    if (typeA2 instanceof java.lang.reflect.ParameterizedType) {
                        java.lang.reflect.TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (true) {
                            if (i < length) {
                                if (typeVariable.equals(typeParameters[i])) {
                                    type2 = ((java.lang.reflect.ParameterizedType) typeA2).getActualTypeArguments()[i];
                                    break;
                                }
                                i++;
                            } else {
                                throw new java.util.NoSuchElementException();
                            }
                        }
                    } else {
                        type2 = typeVariable;
                    }
                } else {
                    type2 = typeVariable;
                }
            } else {
                if (type2 instanceof java.lang.Class) {
                    java.lang.Class cls3 = (java.lang.Class) type2;
                    if (cls3.isArray()) {
                        java.lang.Class<?> componentType = cls3.getComponentType();
                        java.lang.reflect.Type typeA3 = a(type, cls, componentType, collection);
                        return componentType == typeA3 ? cls3 : f(typeA3);
                    }
                }
                if (type2 instanceof java.lang.reflect.GenericArrayType) {
                    java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type2;
                    java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
                    java.lang.reflect.Type typeA4 = a(type, cls, genericComponentType, collection);
                    return genericComponentType == typeA4 ? genericArrayType : f(typeA4);
                }
                if (type2 instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type2;
                    java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
                    java.lang.reflect.Type typeA5 = a(type, cls, ownerType, collection);
                    boolean z = typeA5 != ownerType;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        java.lang.reflect.Type typeA6 = a(type, cls, actualTypeArguments[i], collection);
                        if (typeA6 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeA6;
                        }
                        i++;
                    }
                    return z ? new com.bykv.vk.openvk.preload.a.b.a.b(typeA5, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof java.lang.reflect.WildcardType) {
                    wildcardType = (java.lang.reflect.WildcardType) type2;
                    java.lang.reflect.Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    java.lang.reflect.Type[] upperBounds2 = wildcardType.getUpperBounds();
                    if (lowerBounds2.length == 1) {
                        java.lang.reflect.Type typeA7 = a(type, cls, lowerBounds2[0], collection);
                        if (typeA7 != lowerBounds2[0]) {
                            if (typeA7 instanceof java.lang.reflect.WildcardType) {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = ((java.lang.reflect.WildcardType) typeA7).getLowerBounds();
                            } else {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = new java.lang.reflect.Type[]{typeA7};
                            }
                            return new com.bykv.vk.openvk.preload.a.b.a.c(new java.lang.reflect.Type[]{java.lang.Object.class}, lowerBounds);
                        }
                    } else if (upperBounds2.length == 1 && (typeA = a(type, cls, upperBounds2[0], collection)) != upperBounds2[0]) {
                        if (typeA instanceof java.lang.reflect.WildcardType) {
                            type3 = type2;
                            type3 = wildcardType;
                            type3 = wildcardType;
                            upperBounds = ((java.lang.reflect.WildcardType) typeA).getUpperBounds();
                        } else {
                            type3 = type2;
                            type3 = wildcardType;
                            type3 = wildcardType;
                            upperBounds = new java.lang.reflect.Type[]{typeA};
                        }
                        return new com.bykv.vk.openvk.preload.a.b.a.c(upperBounds, f1615a);
                    }
                }
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                return type3;
            }
        } while (type2 != typeVariable);
        return type2;
    }

    static void e(java.lang.reflect.Type type) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: compiled from: $Gson$Types.java */
    static final class b implements java.io.Serializable, java.lang.reflect.ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Type f1617a;
        private final java.lang.reflect.Type b;
        private final java.lang.reflect.Type[] c;

        public b(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type2;
                boolean z = true;
                boolean z2 = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.bykv.vk.openvk.preload.falconx.a.a.a(z);
            }
            this.f1617a = type == null ? null : com.bykv.vk.openvk.preload.a.b.a.a(type);
            this.b = com.bykv.vk.openvk.preload.a.b.a.a(type2);
            java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
            this.c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(this.c[i]);
                com.bykv.vk.openvk.preload.a.b.a.e(this.c[i]);
                java.lang.reflect.Type[] typeArr3 = this.c;
                typeArr3[i] = com.bykv.vk.openvk.preload.a.b.a.a(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getRawType() {
            return this.b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final java.lang.reflect.Type getOwnerType() {
            return this.f1617a;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.bykv.vk.openvk.preload.a.b.a.a(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public final int hashCode() {
            return (java.util.Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ com.bykv.vk.openvk.preload.a.b.a.a((java.lang.Object) this.f1617a);
        }

        public final java.lang.String toString() {
            int length = this.c.length;
            if (length == 0) {
                return com.bykv.vk.openvk.preload.a.b.a.c(this.b);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((length + 1) * 30);
            sb.append(com.bykv.vk.openvk.preload.a.b.a.c(this.b)).append("<").append(com.bykv.vk.openvk.preload.a.b.a.c(this.c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ").append(com.bykv.vk.openvk.preload.a.b.a.c(this.c[i]));
            }
            return sb.append(">").toString();
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.b.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: $Gson$Types.java */
    static final class C0073a implements java.io.Serializable, java.lang.reflect.GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Type f1616a;

        public C0073a(java.lang.reflect.Type type) {
            this.f1616a = com.bykv.vk.openvk.preload.a.b.a.a(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final java.lang.reflect.Type getGenericComponentType() {
            return this.f1616a;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && com.bykv.vk.openvk.preload.a.b.a.a(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.f1616a.hashCode();
        }

        public final java.lang.String toString() {
            return com.bykv.vk.openvk.preload.a.b.a.c(this.f1616a) + okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: compiled from: $Gson$Types.java */
    static final class c implements java.io.Serializable, java.lang.reflect.WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Type f1618a;
        private final java.lang.reflect.Type b;

        public c(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr2.length <= 1);
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr2[0]);
                com.bykv.vk.openvk.preload.a.b.a.e(typeArr2[0]);
                com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr[0] == java.lang.Object.class);
                this.b = com.bykv.vk.openvk.preload.a.b.a.a(typeArr2[0]);
                this.f1618a = java.lang.Object.class;
                return;
            }
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr[0]);
            com.bykv.vk.openvk.preload.a.b.a.e(typeArr[0]);
            this.b = null;
            this.f1618a = com.bykv.vk.openvk.preload.a.b.a.a(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.f1618a};
        }

        @Override // java.lang.reflect.WildcardType
        public final java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.b;
            return type != null ? new java.lang.reflect.Type[]{type} : com.bykv.vk.openvk.preload.a.b.a.f1615a;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && com.bykv.vk.openvk.preload.a.b.a.a(this, (java.lang.reflect.WildcardType) obj);
        }

        public final int hashCode() {
            java.lang.reflect.Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1618a.hashCode() + 31);
        }

        public final java.lang.String toString() {
            if (this.b != null) {
                return "? super " + com.bykv.vk.openvk.preload.a.b.a.c(this.b);
            }
            return this.f1618a == java.lang.Object.class ? "?" : "? extends " + com.bykv.vk.openvk.preload.a.b.a.c(this.f1618a);
        }
    }
}
