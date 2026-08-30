package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final java.lang.Object zza;

    private ObjectWrapper(java.lang.Object obj) {
        this.zza = obj;
    }

    public static <T> T unwrap(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof com.google.android.gms.dynamic.ObjectWrapper) {
            return (T) ((com.google.android.gms.dynamic.ObjectWrapper) iObjectWrapper).zza;
        }
        android.os.IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        java.lang.reflect.Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new java.lang.IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (java.lang.NullPointerException e2) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(T t) {
        return new com.google.android.gms.dynamic.ObjectWrapper(t);
    }
}
