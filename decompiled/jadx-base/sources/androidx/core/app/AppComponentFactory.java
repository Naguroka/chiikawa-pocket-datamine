package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class AppComponentFactory extends android.app.AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final android.app.Activity instantiateActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.app.Activity) androidx.core.app.CoreComponentFactory.checkCompatWrapper(instantiateActivityCompat(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Application instantiateApplication(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.app.Application) androidx.core.app.CoreComponentFactory.checkCompatWrapper(instantiateApplicationCompat(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.content.BroadcastReceiver) androidx.core.app.CoreComponentFactory.checkCompatWrapper(instantiateReceiverCompat(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.content.ContentProvider) androidx.core.app.CoreComponentFactory.checkCompatWrapper(instantiateProviderCompat(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Service instantiateService(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        return (android.app.Service) androidx.core.app.CoreComponentFactory.checkCompatWrapper(instantiateServiceCompat(classLoader, str, intent));
    }

    public android.app.Application instantiateApplicationCompat(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        try {
            return (android.app.Application) java.lang.Class.forName(str, false, classLoader).asSubclass(android.app.Application.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Couldn't call constructor", e);
        }
    }

    public android.app.Activity instantiateActivityCompat(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        try {
            return (android.app.Activity) java.lang.Class.forName(str, false, classLoader).asSubclass(android.app.Activity.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Couldn't call constructor", e);
        }
    }

    public android.content.BroadcastReceiver instantiateReceiverCompat(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        try {
            return (android.content.BroadcastReceiver) java.lang.Class.forName(str, false, classLoader).asSubclass(android.content.BroadcastReceiver.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Couldn't call constructor", e);
        }
    }

    public android.app.Service instantiateServiceCompat(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        try {
            return (android.app.Service) java.lang.Class.forName(str, false, classLoader).asSubclass(android.app.Service.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Couldn't call constructor", e);
        }
    }

    public android.content.ContentProvider instantiateProviderCompat(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        try {
            return (android.content.ContentProvider) java.lang.Class.forName(str, false, classLoader).asSubclass(android.content.ContentProvider.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException("Couldn't call constructor", e);
        }
    }
}
