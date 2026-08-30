package com.unity3d.services.core.reflection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class GenericListenerProxy implements java.lang.reflect.InvocationHandler {
    public abstract java.lang.Class<?> getProxyClass() throws java.lang.ClassNotFoundException;

    public java.lang.Object getProxyInstance() throws java.lang.ClassNotFoundException {
        return java.lang.reflect.Proxy.newProxyInstance(getProxyClass().getClassLoader(), new java.lang.Class[]{getProxyClass()}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        return method.invoke(this, objArr);
    }
}
