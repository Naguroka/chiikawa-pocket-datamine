package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", "", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "[Ljava/lang/reflect/Type;", "equals", "", "other", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, kotlin.reflect.TypeImpl {
    private final java.lang.reflect.Type ownerType;
    private final java.lang.Class<?> rawType;
    private final java.lang.reflect.Type[] typeArguments;

    public ParameterizedTypeImpl(java.lang.Class<?> rawType, java.lang.reflect.Type type, java.util.List<? extends java.lang.reflect.Type> typeArguments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawType, "rawType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.rawType = rawType;
        this.ownerType = type;
        this.typeArguments = (java.lang.reflect.Type[]) typeArguments.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.rawType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public java.lang.String getTypeName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.reflect.Type type = this.ownerType;
        if (type != null) {
            sb.append(kotlin.reflect.TypesJVMKt.typeToString(type));
            sb.append("$");
            sb.append(this.rawType.getSimpleName());
        } else {
            sb.append(kotlin.reflect.TypesJVMKt.typeToString(this.rawType));
        }
        java.lang.reflect.Type[] typeArr = this.typeArguments;
        if (!(typeArr.length == 0)) {
            kotlin.collections.ArraysKt.joinTo(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) != 0 ? "" : ">", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1.INSTANCE);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.rawType, parameterizedType.getRawType()) && kotlin.jvm.internal.Intrinsics.areEqual(this.ownerType, parameterizedType.getOwnerType()) && java.util.Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.rawType.hashCode();
        java.lang.reflect.Type type = this.ownerType;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ java.util.Arrays.hashCode(getActualTypeArguments());
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
