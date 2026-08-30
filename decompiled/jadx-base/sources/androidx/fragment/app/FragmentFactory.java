package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentFactory {
    private static final androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> sClassCacheMap = new androidx.collection.SimpleArrayMap<>();

    private static java.lang.Class<?> loadClass(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.ClassNotFoundException {
        androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> simpleArrayMap = sClassCacheMap;
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>> simpleArrayMap2 = simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new androidx.collection.SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        java.lang.Class<?> cls = simpleArrayMap2.get(str);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        simpleArrayMap2.put(str, cls2);
        return cls2;
    }

    static boolean isFragmentClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return androidx.fragment.app.Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static java.lang.Class<? extends androidx.fragment.app.Fragment> loadFragmentClass(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return loadClass(classLoader, str);
        } catch (java.lang.ClassCastException e) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (java.lang.ClassNotFoundException e2) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (java.lang.InstantiationException e2) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new androidx.fragment.app.Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
